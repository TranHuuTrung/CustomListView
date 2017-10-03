package com.example.admin.customlistview;

import android.media.Image;

/**
 * Created by Admin on 10/3/2017.
 */

public class Item {
    private int avatar;
    private String noidung;

    public Item(int avatar, String noidung) {
        this.avatar = avatar;
        this.noidung = noidung;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
