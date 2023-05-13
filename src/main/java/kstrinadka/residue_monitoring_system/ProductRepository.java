package kstrinadka.residue_monitoring_system;


import kstrinadka.residue_monitoring_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    /**
     * -- Получить перечень товаров по категории
     */
    @Query(value = """
            SELECT pr.*
            FROM products pr
            WHERE type_id = :type_id
            ORDER BY pr.name;\s""", nativeQuery = true)
    List<Product> getAllProductsByCategory(@Param("type_id") Long type_id);

    /**
     * -- Получить перечень товаров по категории
     */
    @Query(value = """
            SELECT pr.*
            FROM products pr
            WHERE item_number = :item_number""", nativeQuery = true)
    Product getAllProductsByItemNumber(@Param("item_number") String item_number);


}
