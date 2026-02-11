# 📚 HQsWiki

Sistema completo para gerenciamento de Histórias em Quadrinhos (HQs), desenvolvido com **Spring Boot**, utilizando arquitetura em camadas, DTOs, MapStruct e banco de dados H2.

O projeto permite cadastrar, listar, buscar, atualizar e remover HQs, incluindo múltiplos autores e personagens.

---

## 🚀 Tecnologias Utilizadas

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* MapStruct
* Maven
* Thymeleaf

---

## 📌 Funcionalidades

* ✅ Criar HQ
* ✅ Listar HQs
* ✅ Buscar HQ por ID
* ✅ Buscar HQ por título
* ✅ Atualizar HQ
* ✅ Remover HQ
* ✅ Cadastro de múltiplos autores
* ✅ Cadastro de múltiplos personagens
* ✅ Interface Web com Thymeleaf
* ✅ Separação entre RequestDTO e ResponseDTO
* ✅ Mapeamento automático com MapStruct

---

## 🏗 Arquitetura

O projeto segue arquitetura em camadas:

* **Controller** → Responsável pelas requisições HTTP
* **Service** → Regras de negócio
* **Repository** → Persistência de dados
* **Model (Entity)** → Representação das tabelas
* **DTOs** → Transferência de dados
* **Mapper (MapStruct)** → Conversão entre Model e DTO

---

## 📂 Estrutura de Diretórios

```
src/main/java
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── dto
 └── mapper
```

```
src/main/resources
 ├── templates
 ├── static
 └── application.properties
```

---

# ⚙️ Configuração de Variáveis de Ambiente

O projeto utiliza variáveis de ambiente para configurar o banco de dados, facilitando futuras migrações para MySQL ou uso com Docker.

---

## 📁 Criar arquivo `.env`

Na raiz do projeto, crie um arquivo:

```
.env
```

### Exemplo usando H2:

```
DB_URL=jdbc:h2:mem:testdb
DB_USERNAME=sa
DB_PASSWORD=
```

---

## 📝 Configurar `application.properties`

Arquivo:

```
src/main/resources/application.properties
```

Conteúdo:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

---
#video explicando melhor como configurar variaveis de ambiente:
https://youtu.be/GyaE1-vbjf4?si=aY5hJ3Dbx1UGtGNI

# ▶️ Como Executar o Projeto(Intellig Idea recomendado)

1. Configure o arquivo `.env`
2. Execute o comando:

```bash
mvn spring-boot:run
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

Console do banco H2:

```
http://localhost:8080/h2-console
```

---

# 🐬 Configuração para MySQL (Opcional)

Altere o `.env`:

```
DB_URL=jdbc:mysql://localhost:3306/hqdb
DB_USERNAME=root
DB_PASSWORD=suaSenha
```

Adicione a dependência no `pom.xml`:

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
</dependency>
```

---

# 📌 Endpoints Principais (API REST)

| Método | Endpoint     | Descrição     |
| ------ | ------------ | ------------- |
| POST   | /comics      | Criar HQ      |
| GET    | /comics      | Listar HQs    |
| GET    | /comics/{id} | Buscar por ID |
| PUT    | /comics/{id} | Atualizar     |
| DELETE | /comics/{id} | Remover       |

---

# 🖥 Interface Web

A aplicação também possui interface construída com **Thymeleaf**, permitindo:

* Visualizar HQs em formato de cards
* Buscar por título
* Ver detalhes
* Editar HQ
* Criar novas HQs

---

# 🔮 Melhorias Futuras

* Implementação de Spring Security
* Autenticação e autorização
* Dockerização da aplicação
* Integração com MySQL em produção
* Documentação com Swagger/OpenAPI

---

# 📄 Licença

Projeto desenvolvido para fins educacionais e portfólio.

