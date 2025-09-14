# E-Commerce Microservices (Java + Spring Boot + PostgreSQL)

Backend-heavy microservices demo with two services (`catalog-service`, `order-service`) and PostgreSQL via Docker Compose.
- REST APIs (CRUD for products, order skeleton)
- JPA + PostgreSQL
- Ready for AWS ECS/EKS or Elastic Beanstalk
- Add API Gateway/Service Discovery later

## Quick start
```bash
docker compose up --build
# catalog runs on :8081, order on :8082
```
