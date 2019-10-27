package com.gyf.backoffice.web.controller;

import com.gyf.backoffice.model.Customer;
import com.gyf.backoffice.model.Items;
import com.gyf.backoffice.service.ItemsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("list")
    public String list(Model model){
        //查数据
        List<Items> itemsList=itemsService.findAllItems();
        //存数据
        model.addAttribute("itemList",itemsList);
        return "items/list";
    }
    @RequestMapping("save")
    public String save(){
        //创建商品
        Items items=new Items();
        items.setName("iphone");
        int f=(int) 7000.00f;
        items.setId(f);
        items.setCreatetime(new Date());
        items.setDetail("好");
       //保存数据
         itemsService.saveOrUpdate(items);
        System.out.println(items);
        return "items/list";
    }
    @RequestMapping("delete")
    public String delete(Integer id,Model model){
        itemsService.deleteById(id);
        return "forward:list.do";
    }
    @RequestMapping("edit")
    public String edit(Integer id,Model model){
        System.out.println(id);
        Items item = itemsService.findById(id);
        if(item!=null){
            model.addAttribute("item",item);
        }
        return "items/edit";
    }
    @RequestMapping("update")
    public String update(Items items,Model model){
        items.setCreatetime(new Date());
        itemsService.saveOrUpdate(items);
        return "forward:list.do";
    }
    @RequestMapping("add")
    public String add(Model model){
        return "items/add";
    }
    @RequestMapping("adds")
    public String adds(Items items, Model model){
        System.out.println("请大声说出我的名字         "+items.getName());
        items.setCreatetime(new Date());
        itemsService.saveOrUpdate(items);
        return "forward:list.do";
    }
    @RequestMapping("register")
    public String regi(){
        return "items/register";
    }

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("myname","巢传维没什么文化");
        return "items/hello";
    }
}
