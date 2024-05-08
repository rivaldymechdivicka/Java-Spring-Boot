package com.example.xmart.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transaksi implements Serializable {

    @Id
    private String id;
    private String qrCode;
    private String rfid;
    private BigDecimal hargaSatuan;
    private Integer jumlah;
    @Column(nullable = false)
    private LocalDateTime waktuPesan;
    
}
