package com.gyf.backoffice.impl;

import com.gyf.backoffice.mapper.ItemsMapper;
import com.gyf.backoffice.model.Items;
import com.gyf.backoffice.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService{
    @Autowired
    public ItemsMapper itemsMapper;
    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findById(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items) {
        if(items.getId()==null){
            itemsMapper.insert(items);
        }else{
            itemsMapper.updateByPrimaryKeySelective(items);
        }
    }

    @Override
    public void deleteById(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
