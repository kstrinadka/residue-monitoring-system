package kstrinadka.residue_monitoring_system.buy_product;


import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.stereotype.Service;



@Service
public class BuyProductService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public BuyProductService(ProductRepository productRepository,
                       ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public ProductDto tryToBuyProduct(Long item_number) {
        return null;
    }
}
