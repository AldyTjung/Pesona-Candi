package com.example.pesonacandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class KuisEssay extends AppCompatActivity {

    TextView Skor20,Soal20;
    ImageView Gambar1;
    EditText Jawaban00;
    Button Submit20;
    int x=0;
    int arr;
    int skor;
    String jawaban;

    SoalEssay essay = new SoalEssay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_essay);

        Skor20 = (TextView) findViewById(R.id.Skor2);
        Soal20 = (TextView) findViewById(R.id.Soal2);
        Gambar1 = (ImageView) findViewById(R.id.Gambar);
        Jawaban00 = (EditText) findViewById(R.id.Jawaban);
        Submit20 = (Button) findViewById(R.id.Submit2);

        setKonten();

        Submit20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }

    public void setKonten(){
        Jawaban00.setText(null);
        arr = essay.pertanyaan.length;
        if(x >= arr){
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(KuisEssay.this, HasilSkoring.class);
            i.putExtra("skorAkhir2",jumlahSkor);
            i.putExtra("activity","Essay");
            startActivity(i);
        }else{
            //setting text dengan mengambil text dari method getter di kelas SoalEssay
            Soal20.setText(essay.getPertanyaan(x));
            ubahGambar();
            jawaban = essay.getJawabanBenar(x);
        }
        x++;
    }

    public void ubahGambar(){
        Resources res = getResources();
        String mPhoto = essay.getStringGambar(x);
        int resID = res.getIdentifier(mPhoto, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        Gambar1.setImageDrawable(drawable);
    }

    public void cekJawaban(){
        if(!Jawaban00.getText().toString().isEmpty()){
            if(Jawaban00.getText().toString().equalsIgnoreCase(jawaban)){
                skor = skor + 10;
                Skor20.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                Skor20.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            Toast.makeText(this, "Isikan jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}

