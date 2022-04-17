package com.sha.springbootauthentication.repository.projection;

import com.sha.springbootauthentication.model.DeviceType;

import java.time.LocalDateTime;


public interface PurchaseItem
{
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
