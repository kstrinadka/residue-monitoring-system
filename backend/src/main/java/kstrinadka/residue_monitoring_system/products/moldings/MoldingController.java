package kstrinadka.residue_monitoring_system.products.moldings;

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
@RequestMapping("/moldings")
@Tag(name = "Молдинги", description = "Работа с молдингами")
public class MoldingController {


    @Autowired
    MoldingService moldingService;


    /**
     * @return - Перечень всех молдингов
     */
    @GetMapping(path = "/all")
    @Operation(summary = "Получить список всех молдингов")
    public List<ProductDto> getAllMoldings() {
        return moldingService.getAllMoldings();
    }
}
