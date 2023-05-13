package kstrinadka.residue_monitoring_system.products.moldings;

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
public class MoldingController {


    @Autowired
    MoldingService moldingService;


    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех молдингов
     */
    @GetMapping(path = "/all")
    public List<ProductDto> getAllMoldings() {
        return moldingService.getAllMoldings();
    }
}
