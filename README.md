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

![Estrutura do Projeto](imagens/Estrutura-do-Projeto.png)


## 🗃️ Banco de Dados

- **Tipo:** H2 (em memória)
- **Console Web:** `http://localhost:8081/h2-console`
- **JPA + Hibernate** geram o schema automaticamente a partir da entidade `Produto`.

![Estrutura do Projeto](imagens/properties.png)



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

![Estrutura do Projeto](imagens/Dados.png)



## 📷 Telas

- Lista de produtos
![Estrutura do Projeto](imagens/Lista-de-Produtos.png)
- Formulário de cadastro e edição
![Estrutura do Projeto](imagens/Cadastro-de-Produto.png)
- Mensagens de validação e sucesso
![Estrutura do Projeto](imagens/Mensagem-de-sucesso.png)
![Estrutura do Projeto](imagens/Mensagem-de-validação.png)

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

## Dependências no pom.xml

```java
<dependencies>
    <!-- Spring Data JPA para persistência de dados -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- Spring Boot Starter Thymeleaf para renderização de templates -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    
    <!-- Spring Boot Starter Web para criar a aplicação web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    
    <!-- Spring Boot DevTools para otimizações durante o desenvolvimento -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    
    <!-- Banco de dados H2 (em memória, usado para testes e desenvolvimento) -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    
    <!-- Spring Boot Starter Test para testes unitários -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    
    <!-- Spring Boot Starter Validation para validações de dados -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
</dependencies>
```

## 👨‍💻 Autores

Francisco, Suene e Danilo