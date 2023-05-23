package kstrinadka.residue_monitoring_system.products.windowsills;


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
@RequestMapping("/windowsill")
@Tag(name = "Подоконники", description = "Работа с подоконниками")
public class WindowsillController {

    @Autowired
    WindowsillService windowsillService;

    /**
     * @return - Перечень всех подоконников
     */
    @GetMapping(path = "/all")
    @Operation(summary = "Получить список всех подоконников")
    public List<ProductDto> getAllWindowsills() {
        return windowsillService.getAllWindowsills();
    }
}
