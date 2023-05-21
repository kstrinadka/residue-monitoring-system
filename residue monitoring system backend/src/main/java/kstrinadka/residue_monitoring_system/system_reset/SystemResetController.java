package kstrinadka.residue_monitoring_system.system_reset;


import kstrinadka.residue_monitoring_system.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Для сбрасывания количества товара к начальным значениям
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/reset")
public class SystemResetController {

    @Autowired
    SystemResetService systemResetService;


    /**
     *  Сбрасывает значение количества всех товаров к изначальному состоянию
     * (остаток, количестов проданного, out of stock)
     */
    @PutMapping("/all")
    public List<ProductDto> resetAllProductsQuantity() {
        return systemResetService.resetAllProductsQuantity();
    }

}
