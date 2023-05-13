package kstrinadka.residue_monitoring_system.model;


import kstrinadka.residue_monitoring_system.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedSourcePolicy = ReportingPolicy.ERROR, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductMapper {

    // сущность -> DTO
    @Mapping(target = "typeId", source = "type.id")
    ProductDto productToDto(Product product);
    List<ProductDto> productsToDtos(List<Product> products);

    // DTO -> сущность
    @Mapping(target = "type.id", source = "typeId")
    Product dtoToProduct(ProductDto dto);
    List<Product> dtosToProducts(List<ProductDto> dtos);

}
