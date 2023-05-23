package kstrinadka.residue_monitoring_system.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Сущность типа товара (категории)
 */
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "categories")
@Getter
@Setter
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String categoryname;
}
