package com.example.bnfg.gpsbanking;

/**
 * Created by BNFG on 20/07/2017.
 */

public class Choice {
    private int idagence = 1;
    private int idgab = 2;
    private int idtpe = 3;
    private int idflash_transfer = 4;
    private int idmoney_gram = 6;
    private int idsmall_world = 5;


    public Choice() {
    }

    public int getIdagence() {
        return idagence;
    }

    public void setIdagence(int idagence) {
        this.idagence = idagence;
    }

    public int getIdgab() {
        return idgab;
    }

    public void setIdgab(int idgab) {
        this.idgab = idgab;
    }

    public int getIdtpe() {
        return idtpe;
    }

    public void setIdtpe(int idtpe) {
        this.idtpe = idtpe;
    }

    public int getIdmoney_gram() {
        return idmoney_gram;
    }

    public void setIdmoney_gram(int idmoney_gram) {
        this.idmoney_gram = idmoney_gram;
    }

    public int getIdsmall_world() {
        return idsmall_world;
    }

    public void setIdsmall_world(int idsmall_world) {
        this.idsmall_world = idsmall_world;
    }

    public int getIdflash_transfer() {
        return idflash_transfer;
    }

    public void setIdflash_transfer(int idflash_transfer) {
        this.idflash_transfer = idflash_transfer;
    }
}
