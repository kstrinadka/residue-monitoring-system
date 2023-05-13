package kstrinadka.residue_monitoring_system.buy_product;


import kstrinadka.residue_monitoring_system.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
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
     * Пытается купить товар, если есть указанное количество в остатке
     * Если нет столько товара, то вернет этот товар и в нем написано количестов на остатке
     * не хватило => написать на фронте сколько осталось
     */
    @PutMapping("/try/{item_number}")
    public ProductDto tryToBuyProduct(@PathVariable Long item_number) {
        return buyProductService.tryToBuyProduct(item_number);
    }




}
