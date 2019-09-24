package com.example.tubes;

import com.google.firebase.database.IgnoreExtraProperties;
import java.io.Serializable;

@IgnoreExtraProperties
public class Diskon implements Serializable{
    private String namaRM, promo, berlaku, key;

    public Diskon(){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNamaRM(){
        return namaRM;
    }

    public void setNamaRM(String namaRM) {
        this.namaRM = namaRM;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getBerlaku() {
        return berlaku;
    }

    public void setBerlaku(String berlaku) {
        this.berlaku = berlaku;
    }

    @Override
    public String toString() {
        return " "+namaRM+"\n" +
                " "+promo +"\n" +
                " "+berlaku;
    }

    public Diskon(String nm, String prm, String brlk){
        namaRM = nm;
        promo = prm;
        berlaku = brlk;
    }
}
