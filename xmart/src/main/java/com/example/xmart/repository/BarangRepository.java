package com.example.xmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.xmart.entity.Barang;

public interface BarangRepository extends JpaRepository<Barang, String> {

}