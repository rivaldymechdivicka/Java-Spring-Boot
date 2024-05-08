package com.example.xmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.xmart.entity.Transaksi;

public interface TransaksiRepository extends JpaRepository<Transaksi, String >{
    
}
