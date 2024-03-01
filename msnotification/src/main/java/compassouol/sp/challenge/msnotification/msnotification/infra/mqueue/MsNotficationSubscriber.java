package compassouol.sp.challenge.msnotification.msnotification.infra.mqueue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import compassouol.sp.challenge.msnotification.msnotification.entity.DadosUserSistema;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MsNotficationSubscriber {

    private final MongoTemplate mongoTemplate;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void receberSolicitacao(@Payload String mensagem) throws JsonProcessingException {

        var mapper = new ObjectMapper();
       DadosUserSistema dados =  mapper.readValue(mensagem, DadosUserSistema.class);

        System.out.println(dados.toString());

        mongoTemplate.save(dados);
    }
}
