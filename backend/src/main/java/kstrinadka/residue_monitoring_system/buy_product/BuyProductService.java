package kstrinadka.residue_monitoring_system.buy_product;


import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.Product;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BuyProductService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public BuyProductService(ProductRepository productRepository,
                       ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    @Transactional
    public ResponseEntity<ProductDto> tryToBuyProduct(String item_number, Long quantity) {

        Product product = productRepository.getProductByItemNumber(item_number);
        HttpStatus httpStatus = HttpStatus.OK;

        // Если товар не найден
        if (product == null) {
            httpStatus = HttpStatus.NOT_FOUND;
            return new ResponseEntity<>(productMapper.productToDto(product), httpStatus);
        }

        // операция совершена успешно. Покупатель купил сколько хотел товара
        if (product.getRest() >= quantity) {
            product.setSoldQuantity(product.getSoldQuantity() + quantity);
            product.setRest(product.getRest() - quantity);
            productRepository.save(product);
            return new ResponseEntity<>(productMapper.productToDto(product), httpStatus);
        }
        else {
            // не хватает товара);
            product.setOutOfStock(product.getOutOfStock() + quantity);
            productRepository.save(product);
            httpStatus = HttpStatus.CONFLICT;
            return new ResponseEntity<>(productMapper.productToDto(product), httpStatus);
        }
    }
}
