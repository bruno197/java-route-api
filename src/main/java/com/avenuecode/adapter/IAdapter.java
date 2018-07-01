package com.avenuecode.adapter;

import com.avenuecode.model.RouteDTO;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Set;

public interface IAdapter<T, K> {
    ModelMapper modelMapper = new ModelMapper();

    public T toEntity(K dto);
    public Set<T> toEntityList(List<K> dtoList);
    public K toDTO(T entity);
    public List<K> toDTOList(List<T> entityList);
}
