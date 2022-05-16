package team.domain;

import team.domain.*;
import team.infra.AbstractEvent;
import java.util.Date;
import lombok.Data;

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

    public OrderCanceled(){
        super();
    }
}
