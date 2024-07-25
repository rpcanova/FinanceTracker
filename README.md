# FinanceTracker
FinanceTracker é uma aplicação backend simples desenvolvida com Spring Boot e MySQL, projetada para gerenciar transações financeiras. Este projeto demonstra habilidades em desenvolvimento backend, incluindo operações CRUD e integração com um banco de dados relacional.

## Funcionalidades
- **Criar Transação**: Adicionar uma nova transação financeira.
- **Listar Transações**: Visualizar todas as transações cadastradas.
- **Detalhar Transação**: Ver detalhes de uma transação específica por ID.
- **Atualizar Transação**: Atualizar as informações de uma transação existente.
- **Deletar Transação**: Remover uma transação do sistema.

## Tecnologias Utilizadas
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Data JPA**: Abstração de persistência que facilita o acesso a dados em aplicações Spring.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.

## Configuração e Execução
### Pré-requisitos
- Java 11 ou superior
- Maven
- MySQL

### Configuração do Banco de Dados
Certifique-se de ter um banco de dados MySQL em execução e crie um banco de dados chamado financetracker. Atualize o arquivo application.properties com suas credenciais do MySQL:

`spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/financetracker
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver`

### Execução da Aplicação
1.Clone o repositório:
`git clone https://github.com/rpcanova/finance-tracker.git
cd finance-tracker-backend`

2. Compile e execute a aplicação usando Maven:
`mvn spring-boot:run`

3. A aplicação estará disponível em `http://localhost/8080`.

## Endpoints da API
- **POST `/api/transaction`**: Criar uma nova transação.
- **GET `/api/transactions`**: Listar todas as transações.
- **GET `/api/transaction/{id}`**: Obter uma transação por ID.
- **PUT `/api/transaction/{id}`**: Atualizar uma transação por ID.
- **DELETE `/api/transaction/{id}`**: Deletar uma transação por ID.

## Exemplo de Requisição
### Criar Transação
Endpoint: `POST /api/transaction`

Body:

`
{
    "description": "Grocery shopping",
    "amount": 150.75,
    "type": "EXPENSE",
    "category": "Food"
}
`

### Listar Transações
Endpoint: `GET /api/transactions`

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.
