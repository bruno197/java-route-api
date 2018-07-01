package com.avenuecode.service;

import java.util.List;

public interface IService<T> {
    List<T> getAll();

    T getById(Long id);

    T saveOrUpdate(T data);

    void delete(Long id);
}
