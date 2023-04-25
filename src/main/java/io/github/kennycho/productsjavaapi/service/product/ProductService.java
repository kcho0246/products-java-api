package io.github.kennycho.productsjavaapi.service.product;

import java.math.BigDecimal;
import java.util.Optional;

import io.github.kennycho.productsjavaapi.dto.model.product.ProductDTO;
import io.github.kennycho.productsjavaapi.entity.product.ProductEntity;
import io.github.kennycho.productsjavaapi.exception.RecordNotFoundException;

/***
 * Product service interface
 *
 *
 * @author 
 *
 */
public interface ProductService {
    
    
    /**
     * Find all products
     * 
     * @author 
     *
     * @return Iterable<ProductEntity>
     */
    Iterable<ProductEntity> findAll();
    
    /**
     * Find product by id 
     * 
     * @author 
     *
     * @param id Product id
     * @return Iterable<ProductEntity>
     */
    Optional<ProductEntity> findById(String id);
    
    /**
     * Find products by criteria
     * 
     * @author 
     *
     * @param expression product name or description
     * @param minPrice product min price
     * @param maxPrice product max price
     * @return Iterable<ProductEntity> 
     */
    Iterable<ProductEntity> findByCriteria(String expression, BigDecimal minPrice, BigDecimal maxPrice);

    /**
     * Add a product
     * 
     * @author
     *
     * @param dto product data 
     * @return ProductEntity saved
     */
    ProductEntity save(ProductDTO dto);
    
    /***
     * Update a product 
     * 
     * @author 
     *
     * @param product product data
     * @param id product id
     * @return ProductEntity saved
     * @throws RecordNotFoundException Product not found
     */
    ProductEntity save(ProductDTO product, String id) throws RecordNotFoundException;
    
    /**
     * Delete a product
     * 
     * @author 
     *
     * @param id product id
     * @throws RecordNotFoundException Product not found
     */
    void delete(String id) throws RecordNotFoundException;
    
    
    
}
