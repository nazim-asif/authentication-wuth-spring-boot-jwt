package com.sha.springbootauthentication.service;

import com.sha.springbootauthentication.model.Purchase;
import com.sha.springbootauthentication.repository.projection.PurchaseItem;

import java.util.List;


public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
