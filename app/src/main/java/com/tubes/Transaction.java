package com.tubes;

import java.io.Serializable;

public class Transaction extends com.google.firebase.database.Transaction implements Serializable {
    private String namapel;
    private String total;

    public Transaction(String s){}

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
