package com.example.pesonacandi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class KuisPilihanGanda extends AppCompatActivity {

    TextView Skor1, Soal1;
    RadioGroup PilihanJawaban0;
    RadioButton Jawaban10, Jawaban20, Jawaban30;
    Button Submit1;
    int skor=0;
    int arr;
    int x;
    String jawaban;

    SoalPilihanGanda soalPG = new SoalPilihanGanda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_pilihan_ganda);

        Skor1 = (TextView) findViewById(R.id.Skor);
        Soal1 = (TextView) findViewById(R.id.Soal);
        PilihanJawaban0 = (RadioGroup) findViewById(R.id.PilihanJawaban);
        Jawaban10 = (RadioButton) findViewById(R.id.Jawaban1);
        Jawaban20 = (RadioButton) findViewById(R.id.Jawaban2);
        Jawaban30 = (RadioButton) findViewById(R.id.Jawaban3);
        Submit1 = (Button) findViewById(R.id.Submit);

        Skor1.setText(""+skor);
        setKonten();

        Submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cekJawaban();
            }
        });
    }

    public void setKonten(){
        PilihanJawaban0.clearCheck();
        arr = soalPG.pertanyaan.length;
        if(x >= arr){
            String jumlahSkor = String.valueOf(skor);
            Intent i = new Intent(KuisPilihanGanda.this, HasilSkoring.class);
            i.putExtra("skorAkhir",jumlahSkor);
            i.putExtra("activity","PilihanGanda");
            startActivity(i);
        }else{
            Soal1.setText(soalPG.getPertanyaan(x));
            Jawaban10.setText(soalPG.getPilihanJawaban1(x));
            Jawaban20.setText(soalPG.getPilihanJawaban2(x));
            Jawaban30.setText(soalPG.getPilihanJawaban3(x));
            jawaban = soalPG.getJawabanBenar(x);

        }
        x++;
    }

    public void cekJawaban(){
        if(Jawaban10.isChecked()){
            if(Jawaban10.getText().toString().equals(jawaban)){
                skor = skor + 10;
                Skor1.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                Skor1.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(Jawaban20.isChecked()){
            if(Jawaban20.getText().toString().equals(jawaban)){
                skor = skor + 10;
                Skor1.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                Skor1.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else if(Jawaban30.isChecked()){
            if(Jawaban30.getText().toString().equals(jawaban)){
                skor = skor + 10;
                Skor1.setText(""+skor);
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show();
                setKonten();
            }else{
                Skor1.setText(""+skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        }else{
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
    }
}

