package com.example.xmart.service;


import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.xmart.entity.Transaksi;
import com.example.xmart.entity.TransaksiSplit;
import com.example.xmart.excaption.ResourceNotFoundException;
import com.example.xmart.repository.TransaksiRepository;
import com.example.xmart.repository.TransaksiSplitRepository;


@Service
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private TransaksiSplitRepository transaksiSplitRepository;

    public Transaksi findById(String id) {
        return transaksiRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transaksi dengan id " + id + " tidak ditemukan"));
    }

    public List<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    public List<TransaksiSplit> findAllTransaksiSplit() {
        return transaksiSplitRepository.findAllTransaksiSplit();
    }

    public Transaksi create(Transaksi transaksi) {
        transaksi.setId(UUID.randomUUID().toString());
        return transaksiRepository.save(transaksi);
    }

    public Transaksi edit(Transaksi transaksi) {
        return transaksiRepository.save(transaksi);
    }

    public void deleteById(String id) {
        transaksiRepository.deleteById(id);
    }
}