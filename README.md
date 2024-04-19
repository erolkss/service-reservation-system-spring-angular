# Service Reservation System
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

## Sobre o projeto

Aplicação Full Stack com Spring Boot (Java) e Angular (TS). O projeto é um sistema de reserva de serviços em geral como por exemplo, um chaveiro, encanador, carpinteiro, etc.. O cliente solicita um serviço e a empresa responsável pelo serviço julga se aceita ou não o pedido.


## Índice
- [Detalhes da Aplicação](#detalhes-da-aplicação)
- [Tecnologias Usadas](#tecnologias-usadas)
- [Instalação](#instalação)
- [Configuração](#configuração)
- [Autor e Contato](#autor-e-contato)



## Detalhes da Aplicação
- A aplicação possui dois tipos de usuários **COMPANY** e **CLIENT**.
- A autenticação do usuário é via Bearer Token


### INICIO
Temos a tela de **Register** que possibilita fazer o cadastro de um  novo 'client'/cliente ou 'company'/empresa..

![](./service_booking_system_web/src/assets/images/2%20-%20register.png)

Tela de **Login** onde o usuário deve informar o e-mail e sua senha.

![](./service_booking_system_web/src/assets/images/1-%20login.png)


### PERFIL CLIENT

A primeira página é o **Dashboard** onde apresenta os serviços disponíveis. Você pode procurar um serviço pelo nome. Temos a opção **view** que permite fazer uma reserva do serviço. Selecionando a data em que deseja o serviço.

![](./service_booking_system_web/src/assets/images/3%20-%20dashboard%20-%20client.png)



A segunda opção do menu é a **Bookings/Reservas** onde ela mostra as reservas que você solicitou e seu status. Tendo a opção de fazer uma avaliação do serviço com o botão **Review'/Avaliação**.

![](./service_booking_system_web/src/assets/images/3.1%20-%20bookings%20-%20client.png)
![](./service_booking_system_web/src/assets/images//3.3%20-%20review%20-%20service%20-%20client.png)


### PERFIL COMPANY

A primeira página é o **Dashboard** onde apresenta as reservas de serviços que foram solicitadas, com a opção de **Approved/Aprovar** ou **Reject/Rejeitar** o serviço.

![](./service_booking_system_web/src/assets/images/4%20-%20dashboard%20-%20company.png)

A segunda opção do menu é **Post Ad/Cadastro de serviço** onde a empresa pode cadastrar um serviço que ela presta.

![](./service_booking_system_web/src/assets/images/4.1%20-%20PosAd%20-%20company.png)

A terceira opção é a **Ads** onde é mostrado os serviços que sua empresa presta e estão ativos. Opção de **Update'/Editar** e **Delete/Excluir** um serviço

![](./service_booking_system_web/src/assets/images/4.2%20-%20Ads%20-%20company.png)

Tela de **Update'/Editar**

![](./service_booking_system_web/src/assets/images/4.3%20-%20update%20-%20service%20-%20company.png)

&nbsp;



&nbsp;


## Tecnologias Usadas

### Backend: 
- Java 17
- Spring Boot (3.2.4)
- Spring Web
- JPA/Hibernate
- Spring Security 
- JSON Web Token
- Lombok

### Frontend: 

- TypeScript (5.4.5)
- Angular 17 (No standalone)
- HTML
- SCSS

### Dados

- MySQL




&nbsp;



&nbsp;


## Instalação 
### Pré-requisitos

- Java 17
- Angular 17
- Pré-requisitos: Banco de Dados MySQL

&nbsp;



&nbsp;

## Configuração

### Banco de Dados

```
Nessa aplicação foi usado o MySQL, mas você pode usar qualquer outro Banco Dados SQL. Você terá que configurar somente o Drive no Spring e a credencial para acessar o seu Banco de dados.

# Criar o Banco de dados
CREATE DATABASE service_booking_system_db;

# Alterar a configuração de conexão no arquivo 'application.yml' para o seu Banco de Dados:
url: jdbc:mysql://localhost:3306/service_booking_system_db
username: root
password: root@pass
```

### Backend

```
# clonar repositório
git clone https://github.com/erolkss/service-reservation-system-spring-angular.git

# entrar na pasta do projeto back end
cd service_booking_system

# executar o projeto
./mvnw spring-boot:run
```

### Frontend

```
# clonar repositório
git clone https://github.com/erolkss/service-reservation-system-spring-angular.git

# entrar na pasta do projeto Frontend
cd service_booking_system_web


# instalar dependências
npm install

# executar o projeto
ng serve | npm start

```

&nbsp;



&nbsp;
## Autor e Contato
Lucas Eduardo Lima -  [LinkedIn](https://www.linkedin.com/in/lucaserolima)

Para enviar feedback ou entrar em contato, por favor, envie um e-mail para `lucaserolima@gmail.com`.
