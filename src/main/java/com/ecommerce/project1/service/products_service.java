package com.ecommerce.project1.service;

import com.ecommerce.project1.models.order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class products_service {
     ArrayList<order> pro = new ArrayList<order>();
     order order1 = new order();
     order order2 = new order();
     order order3 = new order();
     public products_service() {
         order1.setOrder_id(1);
         order1.setOrder_name("amazonparcel");
         pro.add(order1);
         order2.setOrder_id(2);
         order2.setOrder_name("flipkartparcel");
         pro.add(order2);
         order3.setOrder_id(3);
         order3.setOrder_name("ebayparcel");
         pro.add(order3);
     }
     public ArrayList<order> getPro() {
         return pro;
     }
     public order getOrder(long id) {
         for(order odr : pro){
             if(odr.getOrder_id() == id){
                 return odr;
             }
         }
         return null;
     }
}



