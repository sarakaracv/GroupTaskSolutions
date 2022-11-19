package MyGroupSolution.TableCreation.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "category_id")
    Category category;


}
