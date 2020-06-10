package com.example.pesonacandi;

public class SoalPilihanGanda {


        public String pertanyaan[] = {
                "apakah candi kidal merupakan peninggalan dinasti singhasari ?",
                "Apa fungsi candi kidal ?",
                "Peninggalan Kerajaan apakah Candi Kidal ?",
                "Siapakah Raja Anusapati ?",
                "Apakah candi kidal merupakan peninggalan jawa barat ?",
                "Batu apa yang digunakan pada candi kidal?",
                "Dimanakah arca Siwa disimpan ?",
                "Di Kota apakah Candi Kidal berada ?",
                "apa nama Arca yang seharusnya berada di candi Kidal ?",
                "Raja dari Kerajaan manakah yang disemayamkan di Candi Kidal ?",
        };

        private String pilihanJawaban[][] = {
                {"Iya","Bisa jadi","Tidak"},
                {"tempat rekreasi","Persemayaman Raja Anusapati","makam Raja"},
                {"kerajaan Tarumanegara","Kerajaan Majapahit","Kerajaan Singhasari"},
                {"Raja Ketiga Majapahit","Raja Kedua Kerajaan Singhasari","Pendiri Kerajaan Singhasari"},
                {"Bisa jadi","Bukan","Iya"},
                {"Batu Alam","Batu Kapur","Batu Andesit"},
                {"Museum Brawijaya","Royal Tripical Institute Amsterdam","Candi Kidal"},
                {"Jakarta","Surabaya","Malang"},
                {"Arca Siwa","Arca Ken dedes","Arca Prajnaparamita"},
                {"Kerajaan Samudera Pasai","Kerajaan Singhasari","Kerajaan Majapahit"},
        };

        private String jawabanBenar[] = {
                "Iya",
                "Persemayaman Raja Anusapati",
                "Kerajaan Singhasari",
                "Raja Kedua Kerajaan Singhasari",
                "Bukan",
                "Batu Andesit",
                "Royal Tripical Institute Amsterdam",
                "Malang",
                "Arca Siwa",
                "Kerajaan Singhasari",
        };

        public String getPertanyaan(int x){
            String soal = pertanyaan[x];
            return soal;
        }

        public String getPilihanJawaban1(int x){
            String jawaban1 = pilihanJawaban[x][0];
            return jawaban1;
        }

        public String getPilihanJawaban2(int x){
            String jawaban2 = pilihanJawaban[x][1];
            return jawaban2;
        }

        public String getPilihanJawaban3(int x){
            String jawaban3 = pilihanJawaban[x][2];
            return jawaban3;
        }

        //membuat getter untuk mengambil jawaban benar
        public String getJawabanBenar(int x){
            String jawaban = jawabanBenar[x];
            return jawaban;
        }
}
