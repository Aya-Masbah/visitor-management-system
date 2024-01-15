package com.example.vms.services;

import com.example.vms.models.Host;
import com.example.vms.repositories.HostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostService {

    @Autowired
    private HostRepository hostRepository;

    // Get All Hosts
    public List<Host> findAll() {
        return hostRepository.findAll();
    }
}
