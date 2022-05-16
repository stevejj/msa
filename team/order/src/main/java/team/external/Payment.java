package team.external;

import lombok.Data;
import java.util.Date;
@Data
public class Payment {

    private Long id;
    private Long orderId;
    private String payStatus;
    private Double payAmount;


}
