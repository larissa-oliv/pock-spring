# Pock Spring App

## Descrição

Este é um projeto de exemplo utilizando Spring Boot para criar uma API simples. A API possui endpoints para retornar uma mensagem de "Hello World" e para receber um objeto `User` via POST.

## Requisitos

- JDK 17
- Maven 3.6.3 ou superior

## Configuração do Projeto

1. Clone o repositório:

   ```sh
   git clone https://github.com/larissa-oliv/pock-spring-app.git
   cd pock-spring-app
   ```

2. Compile o projeto:

   ```sh
   mvn clean install
   ```

3. Execute a aplicação:

   ```sh
   mvn spring-boot:run
   ```

## Endpoints

### GET /hello-world

Retorna uma mensagem de "Hello World".

**Resposta:**

```json
{
  "message": "Hello World Larissa"
}
```

### POST /hello-world

Recebe um objeto `User` e retorna uma mensagem personalizada.

**Requisição:**

```json
{
  "name": "Seu Nome"
}
```

**Resposta:**

```json
{
  "message": "Hello Word Seu Nome"
}
```

## Estrutura do Projeto

- `src/main/java/com/larissa/pock_spring_app/controller/HelloWordController.java`: Controlador que define os endpoints da API.
- `src/main/java/com/larissa/pock_spring_app/domain/User.java`: Classe de domínio `User`.
- `src/main/java/com/larissa/pock_spring_app/service/HelloWordService.java`: Serviço que contém a lógica de negócio.
- `src/main/java/com/larissa/pock_spring_app/PockSpringAppApplication.java`: Classe principal que inicia a aplicação Spring Boot.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.0
- Maven

```
