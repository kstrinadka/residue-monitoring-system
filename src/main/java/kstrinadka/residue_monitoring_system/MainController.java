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
    @GetMapping(path = "/hats/all")
    public List<ProductDto> getAllHats() {
        return mainService.getAllHats();
    }


    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех карнизов
     */
    @GetMapping(path = "/cornices/all")
    public List<ProductDto> getAllCornices() {
        return mainService.getAllCornices();
    }

    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех молдингов
     */
    @GetMapping(path = "/moldings/all")
    public List<ProductDto> getAllMoldings() {
        return mainService.getAllMoldings();
    }

    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех освежителей воздуха
     */
    @GetMapping(path = "/flavoring/all")
    public List<ProductDto> getAllFlavorings() {
        return mainService.getAllFlavorings();
    }

    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех бадей
     */
    @GetMapping(path = "/tub/all")
    public List<ProductDto> getAllTubs() {
        return mainService.getAllTubs();
    }

    /**
     * - нет кнопки
     * - не проверено
     * @return - Перечень всех подоконников
     */
    @GetMapping(path = "/windowsill/all")
    public List<ProductDto> getAllWindowsills() {
        return mainService.getAllWindowsills();
    }

}
