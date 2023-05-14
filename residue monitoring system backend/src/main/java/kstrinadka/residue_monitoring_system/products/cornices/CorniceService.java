package kstrinadka.residue_monitoring_system.products.cornices;

import kstrinadka.residue_monitoring_system.Constants;
import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorniceService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Autowired
    public CorniceService(ProductRepository productRepository,
                      ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public List<ProductDto> getAllCornices() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.CORNICE_CATEGORY_ID));
    }
}
