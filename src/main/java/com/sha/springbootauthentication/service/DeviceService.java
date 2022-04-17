package com.sha.springbootauthentication.service;

import com.sha.springbootauthentication.model.Device;

import java.util.List;

public interface DeviceService
{
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
