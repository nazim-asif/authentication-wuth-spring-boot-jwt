package com.sha.springbootauthentication.repository;

import com.sha.springbootauthentication.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeviceRepository extends JpaRepository<Device, Long>
{
}
