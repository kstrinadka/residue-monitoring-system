package kstrinadka.residue_monitoring_system.system_reset;


import kstrinadka.residue_monitoring_system.Constants;
import kstrinadka.residue_monitoring_system.ProductRepository;
import kstrinadka.residue_monitoring_system.dto.ProductDto;
import kstrinadka.residue_monitoring_system.model.Product;
import kstrinadka.residue_monitoring_system.model.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SystemResetService {


    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Autowired
    public SystemResetService(ProductRepository productRepository,
                       ProductMapper productMapper) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }



    public List<ProductDto> resetAllProductsQuantity() {
        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.addAll(this.resetAllCornices());
        productDtoList.addAll(this.resetAllFlavorings());
        productDtoList.addAll(this.resetAllHats());
        productDtoList.addAll(this.resetAllMoldings());
        productDtoList.addAll(this.resetAllTubs());
        productDtoList.addAll(this.resetAllWindowsills());
        return productDtoList;
    }

    /**
     * 1) Получаем артикул конкретного карниза (ключ в мапе) и количество по-умолчанию этого карниза (значение в мапе)
     * 2) Устанавливаем в этот карниз в базе данных количество (остаток) по-умолчанию
     * 3) Добавляем этот карниз в список, который вернется из метода, когда обработаем все карнизы.
     * - остальные методы работают аналогично
     */
    private List<ProductDto> resetAllCornices() {
        Map<String, Long> cornicesMap = Constants.CORNICE_INITIAL_QUANTITY_MAP;
        List<ProductDto> cornicesList = new ArrayList<>();
        for (Map.Entry<String, Long> cornice: cornicesMap.entrySet()) {
            Product currentCornice = productRepository.getAllProductsByItemNumber(cornice.getKey());
            currentCornice.setRest(cornice.getValue());
            currentCornice.setOutOfStock(Constants.DEFAULT_OUT_OF_STOCK_VALUE);
            productRepository.save(currentCornice);
            cornicesList.add(productMapper.productToDto(currentCornice));
        }
        return cornicesList;
    }

    private List<ProductDto> resetAllFlavorings() {
        Map<String, Long> flavoringsMap = Constants.FLAVORING_INITIAL_QUANTITY_MAP;
        List<ProductDto> flavoringsList = new ArrayList<>();
        for (Map.Entry<String, Long> flavoring: flavoringsMap.entrySet()) {
            Product currentFlavoring = productRepository.getAllProductsByItemNumber(flavoring.getKey());
            currentFlavoring.setRest(flavoring.getValue());
            currentFlavoring.setOutOfStock(Constants.DEFAULT_OUT_OF_STOCK_VALUE);
            productRepository.save(currentFlavoring);
            flavoringsList.add(productMapper.productToDto(currentFlavoring));
        }
        return flavoringsList;
    }

    private List<ProductDto> resetAllHats() {
        Map<String, Long> hatsMap = Constants.HAT_INITIAL_QUANTITY_MAP;
        List<ProductDto> hantsList = new ArrayList<>();
        for (Map.Entry<String, Long> hat: hatsMap.entrySet()) {
            Product currentHat = productRepository.getAllProductsByItemNumber(hat.getKey());
            currentHat.setRest(hat.getValue());
            currentHat.setOutOfStock(Constants.DEFAULT_OUT_OF_STOCK_VALUE);
            productRepository.save(currentHat);
            hantsList.add(productMapper.productToDto(currentHat));
        }
        return hantsList;
    }

    private List<ProductDto> resetAllMoldings() {
        Map<String, Long> moldingsMap = Constants.MOLDING_INITIAL_QUANTITY_MAP;
        List<ProductDto> moldingsList = new ArrayList<>();
        for (Map.Entry<String, Long> molding: moldingsMap.entrySet()) {
            Product currentMolding = productRepository.getAllProductsByItemNumber(molding.getKey());
            currentMolding.setRest(molding.getValue());
            currentMolding.setOutOfStock(Constants.DEFAULT_OUT_OF_STOCK_VALUE);
            productRepository.save(currentMolding);
            moldingsList.add(productMapper.productToDto(currentMolding));
        }
        return moldingsList;
    }

    private List<ProductDto> resetAllTubs() {
        Map<String, Long> tubsMap = Constants.TUB_INITIAL_QUANTITY_MAP;
        List<ProductDto> tubsList = new ArrayList<>();
        for (Map.Entry<String, Long> tub: tubsMap.entrySet()) {
            Product currentTub = productRepository.getAllProductsByItemNumber(tub.getKey());
            currentTub.setRest(tub.getValue());
            currentTub.setOutOfStock(Constants.DEFAULT_OUT_OF_STOCK_VALUE);
            productRepository.save(currentTub);
            tubsList.add(productMapper.productToDto(currentTub));
        }
        return tubsList;
    }

    private List<ProductDto> resetAllWindowsills() {
        Map<String, Long> windowsillMap = Constants.WINDOWSILL_INITIAL_QUANTITY_MAP;
        List<ProductDto> windowsillList = new ArrayList<>();
        for (Map.Entry<String, Long> windowsill: windowsillMap.entrySet()) {
            Product currentWindowsill = productRepository.getAllProductsByItemNumber(windowsill.getKey());
            currentWindowsill.setRest(windowsill.getValue());
            currentWindowsill.setOutOfStock(Constants.DEFAULT_OUT_OF_STOCK_VALUE);
            productRepository.save(currentWindowsill);
            windowsillList.add(productMapper.productToDto(currentWindowsill));
        }
        return windowsillList;
    }
}
