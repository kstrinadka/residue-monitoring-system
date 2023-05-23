package kstrinadka.residue_monitoring_system.products.hats;


import kstrinadka.residue_monitoring_system.Constants;
import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HatService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Autowired
    public HatService(ProductRepository productRepository,
                      ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }


    public List<ProductDto> getAllHats() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.HAT_CATEGORY_ID));
    }

}
