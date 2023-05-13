package kstrinadka.residue_monitoring_system.model;


import jakarta.persistence.*;
import lombok.*;

/**
 * Сущность товара
 */
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String item_number;

    private String name;

    private Long rest;

    @ManyToOne
    @JoinColumn (name = "type_id", referencedColumnName = "id", nullable = false)
    private ProductType type;
}
