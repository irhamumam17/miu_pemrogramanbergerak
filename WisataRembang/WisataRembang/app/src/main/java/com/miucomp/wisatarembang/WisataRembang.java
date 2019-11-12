package com.miucomp.wisatarembang;

import android.os.Parcel;
import android.os.Parcelable;

public class WisataRembang {
    private String namaW;
    private String lokasiW;
    private String hargaW;
    private int fotoW;

    public String getDetailW() {
        return detailW;
    }

    public void setDetailW(String detailW) {
        this.detailW = detailW;
    }

    private String detailW;

    public String getNamaW() {
        return namaW;
    }

    public void setNamaW(String namaW) {
        this.namaW = namaW;
    }

    public String getLokasiW() {
        return lokasiW;
    }

    public void setLokasiW(String lokasiW) {
        this.lokasiW = lokasiW;
    }

    public String getHargaW() {
        return hargaW;
    }

    public void setHargaW(String hargaW) {
        this.hargaW = hargaW;
    }

    public int getFotoW() {
        return fotoW;
    }

    public void setFotoW(int fotoW) {
        this.fotoW = fotoW;
    }

    private WisataRembang(Parcel in){
        this.namaW = in.readString();
        this.lokasiW = in.readString();
        this.hargaW = in.readString();
        this.detailW = in.readString();
        this.fotoW = in.readInt();
    }


    public int describeContents(){
        return 0;
    }
    WisataRembang(){

    }
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.namaW);
        parcel.writeString(this.lokasiW);
        parcel.writeString(this.hargaW);
        parcel.writeString(this.detailW);
        parcel.writeInt(this.fotoW);
    }
//
    public static final Parcelable.Creator<WisataRembang> WISATA_REMBANG_CREATOR = new Parcelable.Creator<WisataRembang>(){

        @Override
        public WisataRembang createFromParcel(Parcel source) {
            return new WisataRembang(source);
        }

        @Override
        public WisataRembang[] newArray(int i) {
            return new WisataRembang[i];
        }
    };
}
