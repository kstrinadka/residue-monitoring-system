package kstrinadka.residue_monitoring_system.system_reset;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Продукты")
public class SystemResetController {

    @Autowired
    SystemResetService systemResetService;


    /**
     *  Сбрасывает значение количества всех товаров к изначальному состоянию
     * (остаток, количестов проданного, out of stock)
     */
    @PutMapping("/all")
    @Operation(summary = "Сбросить значение количества товара всех товаров к изначальному состоянию")
    public List<ProductDto> resetAllProductsQuantity() {
        return systemResetService.resetAllProductsQuantity();
    }

}
