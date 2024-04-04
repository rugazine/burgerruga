package com.example.burgerruga;

public class DataItem {
    String nama;
    String rating;
    int gambar;

    public DataItem(String nama, String rating, int gambar) {
        this.nama = nama;
        this.rating = rating;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }



}
