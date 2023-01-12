package com.tubes;

public class Transaction{
    private String namapel;
    private String total;

    public Transaction() {
    }

    public Transaction(String namapel, String total) {
        this.namapel = namapel;
        this.total = total;
    }

    public String getNamapel() {
        return namapel;
    }

    public void setNamapel(String namapel) {
        this.namapel = namapel;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
