package compassouol.sp.challenge.msnotification.msnotification.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "msnotificationcollection")
public class DadosUserSistema {
    @Id
    private String id;
    private String email;
    private String event;
    private Date data;
}