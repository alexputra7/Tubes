package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LokasiActivity extends AppCompatActivity {

    public ImageButton btnCari;
    public ImageButton btnTersimpan;
    public ImageButton btnProfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        btnCari= (ImageButton)findViewById(R.id.cari);
        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCari = new Intent(LokasiActivity.this,HomeActivity.class);
                startActivity(iCari);
            }
        });

        btnTersimpan= (ImageButton) findViewById(R.id.tersimpan);
        btnTersimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTersimpan = new Intent(LokasiActivity.this,TersimpanActivity.class);
                startActivity(iTersimpan);
            }
        });

        btnProfil= (ImageButton) findViewById(R.id.profil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iProfil = new Intent(LokasiActivity.this,ProfilActivity.class);
                startActivity(iProfil);
            }
        });
    }
}
