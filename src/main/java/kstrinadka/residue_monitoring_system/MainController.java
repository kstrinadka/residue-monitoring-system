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

// эти три показателя можно на фронте считать через предыдущий верхний метод!
    /**
     * - нет кнопки
     * - не проверено
     * @return - Сколько магазин заработал
     */
    @GetMapping(path = "/earnings")
    public List<ProductDto> getAllEarning() {
        return mainService.getAllEarning();
    }

    /**
     * - нет кнопки
     * - не проверено
     * @return - Сколько магазин потерял на out of stock
     */
    @GetMapping(path = "/losses")
    public List<ProductDto> getAllLosses() {
        return mainService.getAllLosses();
    }


    /**
     * - нет кнопки
     * - не проверено
     * potential profit
     * @return - Сколько магазин мог бы заработать, если бы не было out of stock
     */
    @GetMapping(path = "/cornices/all")
    public List<ProductDto> getPotentialProfit() {
        return mainService.getPotentialProfit();
    }

}
