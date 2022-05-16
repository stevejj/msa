package team.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="OrderDetails_table")
@Data
public class OrderDetails {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long orderId;
        private String orderStatus;
        private String payStatus;
        private Double payAmount;
        private String productName;
        private Double totalPrice;


}