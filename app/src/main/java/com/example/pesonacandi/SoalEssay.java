package com.example.pesonacandi;

public class SoalEssay {

    public String pertanyaan[] = {
            "dimanakah letak candi kidal ?",
            "Apa material utama candi kidal?",
            "kapan raja anusapati wafat ?",
            "apa arti relief garudeya ?",
            "kapan candi kidal didirikan ?",
            "siapa raja kedua dari kerajaan singhasari ?",
            "negara manakah yang menemukan Candi Kidal?",
            "kapan Candi Kidal ditemukan ?",
            "Apa nama relief pada candi kidal ?",
            "Kapan relief tersebut dilakukan rekonstruksi ?"

    };

    private String image[] = {
            "petabuta",
            "batuandesit",
            "kapan",
            "arti",
            "when",
            "raja",
            "bendera",
            "waktu",
            "garudeya",
            "images",
    };

    private String jawabanBenar[] = {

            "Desa Rejokidal",
            "Batu Andesit",
            "1248M",
            "Pembebasan Perbudakan",
            "1260M",
            "Raja Anusapati",
            "Belanda",
            "Tahun 1925",
            "Garudeya",
            "Tahun 1990",

    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }


    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
