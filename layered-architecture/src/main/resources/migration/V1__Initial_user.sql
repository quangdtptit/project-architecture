CREATE TABLE "user"(
    user_id  bigserial PRIMARY KEY,
    email varchar(100) NOT NULL UNIQUE ,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL
);