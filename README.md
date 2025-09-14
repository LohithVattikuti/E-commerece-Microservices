# E-commerce Microservices Platform

## Overview
This is a modern e-commerce platform built using microservices architecture with Spring Boot. The platform is designed to be scalable, maintainable, and highly available, following best practices in microservices design patterns.

## Architecture
The application is built using a microservices architecture with the following key components:

- **Catalog Service**: Manages product inventory and details
- **Order Service**: Handles order processing and management

Each service is independently deployable and maintainable, communicating through REST APIs.

## Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

## Services Description

### Catalog Service
- Product management
- Inventory tracking
- Product search and filtering
- REST API for product operations

### Order Service
- Order processing
- Order status management
- Order history
- Integration with catalog service

## Setup Instructions
```bash
docker compose up --build
# catalog runs on :8081, order on :8082
```
