package com.example.mascota.services;

import java.util.List;

public interface BaseService<E> {
    public List<E> finalAll() throws Exception;
    public E findById(Long id) throws Exception;
    public E save (E Entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
