package compassouol.sp.challenge.msnotification.msnotification.infra.mqueue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MsNotficationSubscriber {

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receberSolicitacao(@Payload String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}
