# Projeto do Módulo - Explorando Padrões de Projetos na Prática com Java e Spring Boot.

## Descrição

Projeto desenvolvido durante o módulo: Explorando Padrões de Projetos na Pratica com Java e Spring Boot, do Bootcamp [Java AI Powered](https://www.dio.me/bootcamp/coding-future-tonnie-java-ai-powered).

## Desafio

Agora é a sua hora de brilhar! Crie uma solução que
explore o conceito de Padrões de Projeto na prática.
Para isso, você pode reproduzir um dos projetos que
criamos durante as aulas ou, caso se sinta preparado,
desenvolver uma nova ideia do zero ;-)

**Dica**: Além dos projetos/repositórios que criamos para este desafio, caso queira
explorar novos padrões de projeto digite no Google: "java design patterns github"
ou "java design patterns examples". Com isso, você conhecerá novos padrões e
implementações de referência que podem ajudá-lo a dominar esse tema!

## Tecnologias

![Java](https://img.shields.io/badge/java_17-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring_boot_3-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![H2DATABASE](https://img.shields.io/badge/h2database-%2348acbf.svg?style=for-the-badge&logoColor=white)

## Padrões de Projeto abordados

- **Singleton**: O padrão Singleton é adotado automaticamente pelo Spring Boot para gerenciar beans. Ele garante que apenas uma instância de um bean seja criada e mantida em todo o contexto da aplicação, promovendo o reuso e a eficiência de recursos.
- **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. A estratégia permite que o algoritmo varie independentemente dos clientes que o utilizam.
- **Facade**: O padrão Facade é usado para simplificar a interação com sistemas complexos, oferecendo uma interface simplificada para um conjunto de interfaces em um subsistema. No Spring Boot, pode ser implementado por meio de serviços que agregam lógicas de negócio complexas, tornando-as mais acessíveis e simplificadas para os consumidores.
- **DTO (Data Transfer Object)**: DTOs são usados no Spring Boot para transferir dados entre diferentes camadas da aplicação, especialmente útil em APIs REST. Eles ajudam a separar a modelagem de domínio da lógica de transferência de dados, simplificando a comunicação e melhorando a segurança dos dados.
- **Builder**: O padrão Builder é útil no Spring Boot para a criação de objetos complexos, permitindo a construção passo a passo de um objeto e facilitando a leitura do código. É particularmente vantajoso quando um objeto tem múltiplos parâmetros, alguns dos quais podem ser opcionais, promovendo uma inicialização mais clara e segura.

## Endpoints

Após baixar e executar o projeto, você pode acessar a documentação dos endpoints através do Swagger, acessando a URL: 
```http 
http://localhost:8080/swagger-ui.html
```

![Endpoints-swagger](img/swagger.png)