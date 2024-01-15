package com.example.vms.services;

import com.example.vms.models.Badge;
import com.example.vms.repositories.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    // Get All Badges
    public List<Badge> findAll() {
        return badgeRepository.findAll();
    }
}
