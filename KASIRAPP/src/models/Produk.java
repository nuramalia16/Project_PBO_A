///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package models;
//
///**
// *
// * @author ACER
// */
public class Produk {
    private int id;
    private String name;
    private long price;
    private int stock;
    
    public Produk(int id, String name, long price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
//   private int id;
//    private String name;
//    private long harga;
//    private int jumlah;
//    
//    public Produk(int id, String name, long price, int stock) {
//        this.id = id;
//        this.name = name;
//        this.harga = harga;
//        this.jumlah = jumlah;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public long getHarga() {
//        return harga;
//    }
//
//    public void setHarga(long harga) {
//        this.harga = harga;
//    }
//
//    public int getJumlah() {
//        return jumlah;
//    }
//
//    public void setJumlah(int jumlah) {
//        this.jumlah = jumlah;
//    }
//    
}
