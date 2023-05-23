package kstrinadka.residue_monitoring_system.buy_product;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Продукты", description = "Методы для работы с продуктами")
public class BuyProductController {

    @Autowired
    BuyProductService buyProductService;


    /**
     *  Пытается купить товар, если есть указанное количество в остатке
     *  Если нет столько товара, то купить не получится и в поле out of stock добавится то количество,
     * которое хотел купить покупатель
     */
    @PutMapping("/trytobuy")
    @Operation(summary = "Покупка товара, если есть указанное количество в остатке")
    public ResponseEntity<ProductDto> tryToBuyProduct(
            @Parameter(description = "Номер товара")
            @RequestParam String item_number,
            @Parameter(description = "Количество товара")
            @RequestParam Long quantity) {
        return buyProductService.tryToBuyProduct(item_number, quantity);
    }




}
