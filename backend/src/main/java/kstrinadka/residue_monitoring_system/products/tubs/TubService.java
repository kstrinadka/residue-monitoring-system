package kstrinadka.residue_monitoring_system.products.tubs;

import kstrinadka.residue_monitoring_system.Constants;
import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TubService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public TubService(ProductRepository productRepository,
                       ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }


    public List<ProductDto> getAllTubs() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.TUB_CATEGORY_id));
    }
}
