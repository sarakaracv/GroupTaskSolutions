package MyGroupSolution.TableCreation.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "invoice_product")
public class InvoiceProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String profit;
    private String quantity;


     @JoinColumn(name = "invoice_id")
     @ManyToOne(fetch = FetchType.LAZY)
     Invoice invoice;
     @JoinColumn(name = "product_id")
     @ManyToOne(fetch= FetchType.LAZY)
     Product product;


}
