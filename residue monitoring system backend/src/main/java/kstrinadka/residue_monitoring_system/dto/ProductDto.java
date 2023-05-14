package kstrinadka.residue_monitoring_system.dto;


import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * A DTO for the {@link kstrinadka.residue_monitoring_system.model.Product} entity
 */
@Data
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String item_number;
    private String name;
    private Long rest;
    private Long typeId;
    private Long cost;
    private Long outOfStock;
    private Long soldQuantity;
}
