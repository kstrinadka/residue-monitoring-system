package kstrinadka.residue_monitoring_system.products.cornices;


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
@RequestMapping("/cornices")
@Tag(name = "Карнизы", description = "Работа с карнизами")
public class CorniceController {

    @Autowired
    CorniceService corniceService;


    /**
     * @return - Перечень всех карнизов
     */
    @GetMapping(path = "/all")
    @Operation(summary = "Получить перечень всех карнизов")
    public List<ProductDto> getAllCornices() {
        return corniceService.getAllCornices();
    }

}
