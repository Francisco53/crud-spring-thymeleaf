# Projeto CRUD com Spring Boot e Thymeleaf

## 🎯 Objetivo

Este projeto tem como objetivo demonstrar a criação de uma **baseline** para uma aplicação web com **Spring Boot**, **Thymeleaf** e banco de dados **H2 em memória**, com um CRUD funcional para a entidade `Produto`.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas

- Java 17
- Spring Boot 3.x
- Thymeleaf
- H2 Database (em memória)
- Spring Data JPA
- Maven
- Git e GitHub
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```plaintext
crud/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.crud.crud/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── CrudApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       │   ├── index.html
│   │       │   └── produto/
│   │       │       ├── listar.html
│   │       │       └── form.html
│   │       └── application.properties
│   └── test/
│       └── java/...
├── pom.xml
└── README.md
```

---

## 🗃️ Banco de Dados

- **Tipo:** H2 (em memória)
- **Console Web:** `http://localhost:8081/h2-console`
- **JPA + Hibernate** geram o schema automaticamente a partir da entidade `Produto`.

---

## 📄 Entidade

```java
@Entity
public class Produto {
    @Id @GeneratedValue
    private Long id;

    @NotBlank
    private String nome;

    @NotNull
    @DecimalMin("0.01")
    private BigDecimal preco;
}
```

---

## 🧪 Dados Iniciais

A aplicação carrega alguns produtos automaticamente ao iniciar, via `CommandLineRunner`.

---

## 📷 Telas

- Lista de produtos
- Formulário de cadastro e edição
- Mensagens de validação e sucesso

---

## 📌 Controle de Versão

- Repositório Git hospedado no GitHub.
- Branch principal: `main`
- Commits organizados por etapa do desenvolvimento.

---

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/crud-spring-thymeleaf.git
```

2. Execute com Maven:
```bash
./mvnw spring-boot:run
```

3. Acesse:
- CRUD: `http://localhost:8081/produtos`
- H2 Console: `http://localhost:8081/h2-console`

---

## 👨‍💻 Autor

Francisco, Suene e Danilo