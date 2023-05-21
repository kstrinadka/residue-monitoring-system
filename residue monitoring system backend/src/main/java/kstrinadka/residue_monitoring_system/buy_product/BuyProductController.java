package kstrinadka.residue_monitoring_system.buy_product;


import kstrinadka.residue_monitoring_system.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/**
 * Контроллер для покупки товара и записи количества потенциально непроданного товара (out of stock number)
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/buy")
public class BuyProductController {

    @Autowired
    BuyProductService buyProductService;


    /**
     *  Пытается купить товар, если есть указанное количество в остатке
     *  Если нет столько товара, то купить не получится и в поле out of stock добавится то количество,
     * которое хотел купить покупатель
     */
    @PutMapping("/trytobuy")
    public ResponseEntity<ProductDto> tryToBuyProduct(@RequestParam String item_number, @RequestParam Long quantity) {
        return buyProductService.tryToBuyProduct(item_number, quantity);
    }




}
