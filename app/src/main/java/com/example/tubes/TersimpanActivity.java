package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TersimpanActivity extends AppCompatActivity {

    public ImageButton btnCari;
    public ImageButton btnLokasi;
    public ImageButton btnProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tersimpan);

        btnCari= (ImageButton)findViewById(R.id.cari);
        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCari = new Intent(TersimpanActivity.this,HomeActivity.class);
                startActivity(iCari);
            }
        });

        btnLokasi= (ImageButton) findViewById(R.id.lokasi);
        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLokasi = new Intent(TersimpanActivity.this,LokasiActivity.class);
                startActivity(iLokasi);
            }
        });

        btnProfil= (ImageButton) findViewById(R.id.profil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iProfil = new Intent(TersimpanActivity.this,ProfilActivity.class);
                startActivity(iProfil);
            }
        });
    }
}
