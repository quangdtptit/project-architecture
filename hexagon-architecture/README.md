# HEXAGONAL ARCHITECTURE (PORT & ADAPTER)
- Hexagonal Architecture = Core (Domain + Use Case) + Adapter
```angular2html
domain
 ├── model
 ├── port
 │   ├── in
 │   └── out
 └── use-case
adapter
 ├── in
 │   ├── event (Consumer)
 │   └── rest (Controller)
 └── out
     ├── persistence (Database)
     ├── message-queue (Kafka, RabbitMQ)
     ├── cache (Redis)
     └── client (Rest)
```

```angular2html
[ REST Controller ]
        |
 (Inbound Adapter)
        |
     [ PORT ]
        |
====== CORE ======
  |  Business   |
  |    Logic    |
==================
        |
     [ PORT ]
        |
(Outbound Adapter)
        |
    [ Database ]

```