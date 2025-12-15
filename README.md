# Helpdesk-Springboot

Este proyecto es una **API REST desarrollada con Spring Boot** para la gestión de **usuarios, incidencias y comentarios**.  
Permite realizar operaciones CRUD completas utilizando **JSON** como formato de intercambio de datos.

---

## 📌 Funcionalidades

- Gestión de usuarios
- Gestión de incidencias
- Gestión de comentarios
- Operaciones CRUD (Create, Read, Update, Delete)
- Relaciones entre entidades
- Actualización parcial mediante PUT
- Uso de Gitflow para control de versiones

---

## 🛠️ Tecnologías utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- Base de datos relacional
- JSON

---

## 📦 Estructura del proyecto

El proyecto sigue una arquitectura por capas:

- **Controller**: gestiona las peticiones HTTP
- **Service**: contiene la lógica de negocio
- **Repository**: acceso a datos con JPA
- **Model**: entidades de la base de datos

---

## 🔄 Control de versiones

Se ha utilizado el flujo de trabajo **Gitflow**, trabajando principalmente con las ramas:

- `feature`
- `develop`
- `release`
- `main`

El lanzamiento de la versión **v1.0** se ha realizado mediante una rama `release/1.0` y su posterior fusión en `main`.

---

## ▶️ Ejecución del proyecto

1. Clonar el repositorio
2. Importarlo como proyecto Maven
3. Configurar la base de datos en `application.properties`
4. Ejecutar la aplicación
5. Probar los endpoints con Postman o herramienta similar

---

## 📚 Autor

Proyecto desarrollado como práctica de aprendizaje de desarrollo backend con Spring Boot.
