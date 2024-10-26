package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityCategory;

    @Column(nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private int securityQuantity;

    // Default constructor
    protected Security() {}

    // Parameterized constructor
    public Security(Portfolio portfolio, String securityName, String securityCategory,
                    LocalDate purchaseDate, float purchasePrice, int securityQuantity) {
        this.portfolio = portfolio;
        this.securityName = securityName;
        this.securityCategory = securityCategory;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.securityQuantity = securityQuantity;
    }

    // Getters and Setters
    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getSecurityQuantity() {
        return securityQuantity;
    }

    public void setSecurityQuantity(int securityQuantity) {
        this.securityQuantity = securityQuantity;
    }
}
