package kstrinadka.residue_monitoring_system.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductFrontDto {
    private Long id;
    private String item_number;
    private String name;
    private Long rest;
    private Long typeId;
    private Long cost;
    private Long outOfStock;
    private Long soldQuantity;
}
