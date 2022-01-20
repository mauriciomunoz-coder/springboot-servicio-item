package com.formacionbdi.springboot.app.item.models.service;

import com.formacionbdi.springboot.app.item.models.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemService {

    public List<Item> findAll();

    public Item findById(Long id, Integer cantidad);
}
