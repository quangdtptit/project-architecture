package com.example.architecture.hexagon.adapter.repository.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.util.StringUtils;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseSpecification<T> {
    protected List<Predicate> predicates = new ArrayList();

    public BaseSpecification() {
    }

    protected void addLikePredicateIfNotNull(String value, String fieldName, CriteriaBuilder cb, Root<T> root) {
        if (StringUtils.hasText(value)) {
            this.predicates.add(cb.like(cb.lower(root.get(fieldName)), "%" + value.toLowerCase() + "%"));
        }

    }

    protected void addEqualPredicateIfNotNull(Object value, String fieldName, CriteriaBuilder cb, Root<T> root) {
        if (value != null) {
            if (value instanceof String) {
                String str = (String)value;
                if (!StringUtils.hasText(str)) {
                    return;
                }
            }

            this.predicates.add(cb.equal(root.get(fieldName), value));
        }
    }

    protected void addDateRangePredicates(Instant from, Instant to, String fieldName, CriteriaBuilder cb, Root<T> root) {
        if (from != null) {
            this.predicates.add(cb.greaterThanOrEqualTo(root.get(fieldName), from));
        }

        if (to != null) {
            this.predicates.add(cb.lessThanOrEqualTo(root.get(fieldName), to));
        }

    }

    protected void addSearchTermPredicates(String searchTerm, List<String> fields, CriteriaBuilder cb, Root<T> root) {
        if (StringUtils.hasText(searchTerm)) {
            List<Predicate> searchPredicates = new ArrayList();
            String searchValue = "%" + searchTerm.toLowerCase() + "%";

            for(String field : fields) {
                if (field.contains(".")) {
                    String[] parts = field.split("\\.");
                    searchPredicates.add(cb.like(cb.lower(root.get(parts[0]).get(parts[1])), searchValue));
                } else {
                    searchPredicates.add(cb.like(cb.lower(root.get(field)), searchValue));
                }
            }

            if (!searchPredicates.isEmpty()) {
                this.predicates.add(cb.or((Predicate[])searchPredicates.toArray(new Predicate[0])));
            }
        }

    }

    protected void addInPredicateIfNotEmpty(List<?> values, String fieldName, Root<T> root) {
        if (values != null && !values.isEmpty()) {
            this.predicates.add(root.get(fieldName).in(values));
        }

    }

    protected Predicate[] getPredicatesArray() {
        return (Predicate[])this.predicates.toArray(new Predicate[0]);
    }

    protected void clearPredicates() {
        this.predicates.clear();
    }
}
