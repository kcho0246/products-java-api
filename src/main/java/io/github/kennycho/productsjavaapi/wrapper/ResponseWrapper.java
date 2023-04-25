package io.github.kennycho.productsjavaapi.wrapper;

import org.modelmapper.ModelMapper;

/**
 * Generic response json
 *
 *
 * @author kennycho
 *
 * @param <T>
 */
public class ResponseWrapper<T> {
    /***
     * Return objet wrapper with the entity values
     * 
     * @author kennycho
     *
     * @param entity
     * @return
     */
    public ResponseWrapper<T> convert(T entity) {
	new ModelMapper().map(entity, this);
	return this;
    }    
}
