package com.ecommerce.project1.orders;


import com.ecommerce.project1.models.order;
import com.ecommerce.project1.service.products_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

@RequestMapping ("/varuthini_fullstack_uber")

public class ordercontroller {
    @GetMapping
       public String orders(){
          return "Hello World";
    }

    products_service prd = new products_service();

    @GetMapping("/orderslist")
    public ArrayList<order> ordList(){
        return prd.getPro();
    }
    @GetMapping("/{id}")
    public order getid(@PathVariable long id){
        return prd.getOrder(id);
    }
}