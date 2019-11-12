package com.miucomp.myrecycleview2;

import java.util.ArrayList;

public class HmjData {
    public static String[][] dataHmj=new String[][]{
            {"0","HMJ Elektro","Himpunan Mahasiswa Elektro Terdiri dari 5 Program Studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D4 Teknik Telekomunikasi, D4 Teknik Telekomunikasi","https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ Mesin","Himpunan Mahasiswa Mesin Terdiri dari 4 Program Studi yaitu D3 Teknik Mesin, D3 Konversi Energi, D4 Teknik Mesin, D4 Teknik Pembangkit Energi","https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"2","HMJ Sipil","Himpunan Mahasiswa Sipil Terdiri dari 4 Program Studi yaitu D3 Konstruksi Sipil, D3 Konstruksi Gedung, D4 Perancangan Jalan dan Jembatan, D4 Perawatan dan Perbaikan Gedung","https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"3","HMJ Administrasi Bisnis","Himpunan Mahasiswa Administrasi Bisnis Terdiri dari 4 Program Studi yaitu D3 Administrasi Bisnis, D4 Administrasi Bisnis, D4 Manajemen Bisnis Internasional, D3 Manajemen Pemasaran","https://i.postimg.cc/pLYvD1Z4/hmab.jpg"},
            {"4","HMJ Akuntansi","Himpunan Mahasiswa Akuntansi Terdiri dari 4 Program Studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknik Listrik, D4 Teknik Telekomunikasi, D4 Teknik Telekomunikasi","https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData:dataHmj){
            Hmj hmj = new Hmj();
            hmj.setId(Integer .parseInt(aData[0]));
            hmj.setNama(aData[1]);
            hmj.setDeskripsi(aData[2]);
            hmj.setFoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}