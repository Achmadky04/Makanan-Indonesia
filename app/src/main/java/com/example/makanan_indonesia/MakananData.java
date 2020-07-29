package com.example.makanan_indonesia;

import java.util.ArrayList;

public class MakananData {
    private static String[] makananNames = {
            "Soto Betawi",
            "Sate Lilit",
            "Sate Padang",
            "Ayam Woku",
            "Soto Banjar",
            "Papeda",
            "Gudeg",
            "Coto Makassar",
            "Kerak Telor",
            "Nasi Liwet"
    };

    private static String[] makananDetails = {
            "Soto betawi merupakan salah satu warisan kuliner nusantara yang patut dijaga keberadaannya. Soto ini merupkan soto yang berasal dari Kota Jakarta",
            "dalam bahasa Bali dan Indonesia berarti \"membungkus\", seperti wujud asli sate lilit yang memang dililitkan pada tusuk sate yang tebal dan lebar dari sate biasanya yang terbuat dari batang serai atau bambu.",
            "memiliki ciri bumbu yang kental dengan warna kemerahan. Warna merah ini berasal dari penggunaan cabai yang banyak. Tak heran kalau rasanya juga pedas.",
            "Woku adalah bumbu makanan a'la Manado, provinsi Sulawesi Utara, Indonesia, yang terbuat dari berbagai macam bumbu dan biasa digunakan untuk memasak daging",
            "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih.",
            "Papeda adalah makanan berupa bubur sagu khas Maluku dan Papua yang biasanya disajikan dengan ikan tongkol atau mubara yang dibumbui dengan kunyit.",
            "makanan khas Provinsi Yogyakarta dan Jawa Tengah yang terbuat dari nangka muda yang dimasak dengan santan.",
            "Coto makassar atau coto mangkasara adalah makanan tradisional Makassar, Sulawesi Selatan.Makanan ini terbuat dari jeroan sapi yang direbus dalam waktu yang lama.",
            "Kerak telur adalah makanan asli daerah Jakarta (Betawi), dengan bahan-bahan beras ketan putih, telur ayam, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.",
            "makanan khas kota Solo dan merupakan kuliner asli daerah Baki, Kabupaten Sukoharjo. Nasi liwet adalah nasi gurih (dimasak dengan kelapa) mirip nasi uduk, yang disajikan dengan sayur labu siam, suwiran ayam (daging ayam dipotong kecil-kecil) dan areh (semacam bubur gurih dari kelapa)."
    };

    private static int[] makananImages = {
            R.drawable.soto_betawi,
            R.drawable.sate_lilit,
            R.drawable.sate_padang,
            R.drawable.ayam_woku,
            R.drawable.soto_banjar,
            R.drawable.papeda,
            R.drawable.gudeg,
            R.drawable.coto_makasar,
            R.drawable.kerak_telor,
            R.drawable.nasi_liwet
    };

    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < makananNames.length; position++) {
            Makanan makanan = new Makanan();
            makanan.setName(makananNames[position]);
            makanan.setDetail(makananDetails[position]);
            makanan.setPhoto(makananImages[position]);
            list.add(makanan);
        }
        return list;
    }
}
