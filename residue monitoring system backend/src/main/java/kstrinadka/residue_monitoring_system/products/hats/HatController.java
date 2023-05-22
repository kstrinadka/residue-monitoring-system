package kstrinadka.residue_monitoring_system.products.hats;

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
@RequestMapping("/hats")
@Tag(name = "Шляпы", description = "Работа со шляпами")
public class HatController {

    @Autowired
    HatService hatService;


    /**
     * @return - Перечень всех шляп
     */
    @GetMapping(path = "/all")
    @Operation(summary = "Получить список всех шапок")
    public List<ProductDto> getAllHats() {
        return hatService.getAllHats();
    }

}
