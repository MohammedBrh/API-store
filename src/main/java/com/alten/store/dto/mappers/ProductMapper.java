package com.alten.store.dto.mappers;

import com.alten.store.dto.ProcductDto;
import com.alten.store.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProcductDto toProductDto(Product product);

    Product toProduct(ProcductDto productDto);
}