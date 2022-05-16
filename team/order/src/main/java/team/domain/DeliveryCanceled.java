package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;
@Data
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String orderStatus;
    private String customerAddr;
    private String customerTel;
    private String customerId;
    private Long deliveryId;

}

