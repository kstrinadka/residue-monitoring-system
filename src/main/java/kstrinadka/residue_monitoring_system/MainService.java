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


    public List<ProductDto> getAllHats() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.HAT_CATEGORY_ID));
    }

    public List<ProductDto> getAllCornices() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.CORNICE_CATEGORY_ID));
    }

    public List<ProductDto> getAllMoldings() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.MOLDING_CATEGORY_ID));
    }

    public List<ProductDto> getAllFlavorings() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.FLAVORING_CATEGORY_id));
    }

    public List<ProductDto> getAllTubs() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.TUB_CATEGORY_id));
    }

    public List<ProductDto> getAllWindowsills() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.WINDOWSILL_CATEGORY_id));
    }

    public List<ProductDto> getAllProducts() {
        return productMapper.productsToDtos(productRepository.findAll());
    }
}
