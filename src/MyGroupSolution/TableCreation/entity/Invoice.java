package MyGroupSolution.TableCreation.entity;


import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "invoice")
public class Invoice {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name = "invoice_date")
    private LocalDateTime invoiceDate;
    @Column(name = "invoice_number")
    private int invoiceNumber;
    @Column(name = "invoice_type")
    private String type;

    @JoinColumn(name = "client_id")
    @ManyToOne(fetch = FetchType.LAZY)
    Client client;

}
