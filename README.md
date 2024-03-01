Microservice Notificação


Descrição
O microserviço recebe mensagens de operações que ocorrem no microserviço de usuário, as mensagens são coletadas em uma fila que está configurada no RabbitMQ.

Desenvolvido por
Luiz Henrique Brandâo Dias

O que é necessário para o funcionamento?
Java 17
Banco de dados MongoDB
Spring Boot
RabbitMQ
Como utilizar?
Primeiro clone o repositório:
git clone https://github.com/Luizh97/MS-NOTIFICATION-COMPASS-CHALLENGE-3.git

O banco de dados deve ser configurado na pasta application.properties.

Aplicação pronta para ser executada


Dificuldades:
A dificuldade foi configurar o RabbitMQ e escutar as mensagens no microserviço. Após isso, o desenvolvimento seguiu normalmente. Faltaram testes e documentação.
