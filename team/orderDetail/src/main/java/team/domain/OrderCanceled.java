package team.domain;

import team.infra.AbstractEvent;
import lombok.Data;
import java.util.Date;

@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long customerId;
    private String productName;
    private Float productPrice;
    private Float orderTotalPrice;
    private String orderStatus;
    private Date orderDate;
    private String customerAddr;
    private String customerTel;
}
