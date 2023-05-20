package kstrinadka.residue_monitoring_system;

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
public class MainController {


    @Autowired
    MainService mainService;


    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех шляп
     */
    @GetMapping(path = "/all")
    public List<ProductDto> getAllProducts() {
        return mainService.getAllProducts();
    }

    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех шляп
     */
    @GetMapping(path = "/all/outofstock")
    public List<ProductDto> getAllOutOdfStockProducts() {
        return mainService.getAllOutOdfStockProducts();
    }
}
