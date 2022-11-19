package MyGroupSolution.TableCreation.entity;


import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Stack;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    @Column(name = "zip_code")
    private String zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "state_id")
    State state;
}
