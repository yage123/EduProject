package com.gyf.backoffice.service;

import com.gyf.backoffice.model.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> findAllItems();
    public Items findById(Integer id);
    public void saveOrUpdate(Items items);
    public void deleteById(Integer id);
}
