package kstrinadka.residue_monitoring_system;


import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {



    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public MainService(ProductRepository productRepository,
                       ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllProducts() {
        return productMapper.productsToDtos(productRepository.findAll());
    }

    public List<ProductDto> getAllOutOdfStockProducts() {
        return productMapper.productsToDtos(productRepository.finAllOutOfStock());
    }
}
