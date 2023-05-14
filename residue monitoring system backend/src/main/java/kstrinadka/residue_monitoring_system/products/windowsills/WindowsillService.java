package kstrinadka.residue_monitoring_system.products.windowsills;

import kstrinadka.residue_monitoring_system.Constants;
import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WindowsillService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public WindowsillService(ProductRepository productRepository,
                       ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }


    public List<ProductDto> getAllWindowsills() {
        return productMapper.productsToDtos(productRepository.getAllProductsByCategory(Constants.WINDOWSILL_CATEGORY_id));
    }
}
