<hr>
<p align="center">
   <img src="https://github.com/renatof4rias/spring-project-delivery/assets/123312837/9d22b8f3-d623-48db-acc5-b7e80cc608dc" #vitrinedev/>
</p>
<hr>
<h1 align="center"> Post e Comentários </h1>

## Descrição do projeto 

<p align="justify">
Delivery é uma aplicação backend de uma API REST.

A aplicação consiste em um sistemas simples de Post e Comentários com o objetivo de estudos e prática de CRUD com a utilização do Spring Framework em uma aplicação de um API REST. 

 <strong>Ideia do Projeto é retirada do workshop Semana DevSuperior com o Professor Nélio Alves</strong>.
</p>
<h1 align="center"> Tecnologias Utilizadas </h1>

## Back end

- Java 
- Spring Boot
- JPA / Hibernate
- Maven
- MVC
<h1 align="center"> Como execurtar o projeto </h1>

## Back end  
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:renatof4rias/spring-project-user

# entrar na pasta do projeto back end
cd user

# executar o projeto
./mvnw spring-boot:run
```

<h1 align="center"> Como testar o projeto </h1>
Pré-requisitos: Postman

```bash
#END POINTS
[GET] /posts #Busca todos os post cadastradados.
[GET] /users #Busca todos os usuários cadastrados.
[GET] /user/{id} #Busca um usuário específico.
```
Observações 
```bash
#Método [GET] /user/{id} necesita de um "id" como parâmetro.
Exemplo de Retorno: 
{
        "Name": " Nome do Usuário",
        "id": "id de referencia ao usuário",
        "longitude": -46.656139,
        "products": [
            {
                "id": 2
            },
            {
                "id": 5
            }
        ]
}

```
# Autor
Renato Gonçalves Farias

https://www.linkedin.com/in/renatof4rias/

renatof4rias@gmail.com

