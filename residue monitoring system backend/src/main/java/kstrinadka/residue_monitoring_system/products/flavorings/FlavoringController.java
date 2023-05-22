package kstrinadka.residue_monitoring_system.products.flavorings;


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
@RequestMapping("/flavoring")
@Tag(name = "Освежители воздуха", description = "Работа с освежителями воздуха")
public class FlavoringController {


    @Autowired
    FlavoringService flavoringService;


    /**
     * @return - Перечень всех освежителей воздуха
     */
    @GetMapping(path = "/all")
    @Operation(summary = "Получить список всех освежителей воздуха")
    public List<ProductDto> getAllFlavorings() {
        return flavoringService.getAllFlavorings();
    }

}
