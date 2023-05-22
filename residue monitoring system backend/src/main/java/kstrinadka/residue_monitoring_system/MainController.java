package kstrinadka.residue_monitoring_system;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/main")
@Tag(name = "Продукты", description = "Основные методы")
public class MainController {

    @Autowired
    MainService mainService;

    /**
     * @return - Перечень всех продуктов
     */
    @GetMapping(path = "/all")
    @Operation(summary = "Получить свисок всех продуктов")
    public List<ProductDto> getAllProducts() {
        return mainService.getAllProducts();
    }

    /**
     * @return - Перечень всех продуктов, у которых out of stock > 0
     */
    @GetMapping(path = "/all/outofstock")
    @Operation(summary = "Получить перечень всех продуктов, у который out of stock > 0")
    public List<ProductDto> getAllOutOdfStockProducts() {
        return mainService.getAllOutOdfStockProducts();
    }
}
