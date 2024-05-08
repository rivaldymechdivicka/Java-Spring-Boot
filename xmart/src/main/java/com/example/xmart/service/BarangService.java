package com.example.xmart.service;

import java.util.UUID;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.xmart.entity.Barang;
import com.example.xmart.excaption.ResourceNotFoundException;
import com.example.xmart.repository.BarangRepository;

@Service
public class BarangService {
    @Autowired
    private BarangRepository barangRepository;

    public Barang findById(String id) {
        return barangRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Barang dengan RFID " + id + " tidak ditemukan"));
    }

    public List<Barang> findAll() {
        return barangRepository.findAll();
    }

    public Barang create(Barang barang) {
        barang.setRfid(UUID.randomUUID().toString());
        return barangRepository.save(barang);
    }

    public Barang edit(Barang barang) {
        return barangRepository.save(barang);
    }

    public void deleteById(String id) {
        barangRepository.deleteById(id);
    }
}