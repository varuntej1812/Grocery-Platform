# Grocery Ordering Platform (Microservices Project)

## ✅ Overview
A microservices-based grocery ordering platform built with:
- Spring Boot (6 services)
- PostgreSQL (per service)
- Firebase Authentication
- Spring Cloud Gateway & Config Server
- Docker & Docker Compose

---

## 🧱 Microservices

| Service         | Port  | Description                  |
|----------------|-------|------------------------------|
| API Gateway     | 8080  | Routes to all microservices |
| User Service    | 8081  | Firebase JWT + user profile |
| Product Service | 8082  | Grocery catalog              |
| Cart Service    | 8083  | User cart management         |
| Order Service   | 8084  | Place/view orders            |
| Config Server   | 8888  | Centralized config           |

---

## 🐳 Run with Docker

```bash
docker-compose up --build
