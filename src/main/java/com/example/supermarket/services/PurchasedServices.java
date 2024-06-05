package com.example.supermarket.services;

import com.example.supermarket.models.*;
import com.example.supermarket.respository.ProductRepository;
import com.example.supermarket.respository.QuantityRepository;
import com.example.supermarket.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchasedServices {
    @Autowired
    com.example.supermarket.repository.PurchasedRepository purchasedRepository;

    @Autowired
    QuantityRepository quantityRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProductRepository productRepository;

    public List<PurchasedModel> getAllPurchased(Long userID){
        return purchasedRepository.findByUser(userID);
    }

    public  List<PurchasedModel> getAllPurchases(){
        return purchasedRepository.findAll();
    }

    public String createPurchased(CartModel cartModel){

        return "Purchase created";
    }
}

