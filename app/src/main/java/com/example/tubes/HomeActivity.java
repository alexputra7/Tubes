package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    public ImageButton btnTersimpan, btnLokasi, btnProfil;
    public Button btnMakanSiang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnTersimpan= (ImageButton) findViewById(R.id.tersimpan);
        btnTersimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTersimpan = new Intent(HomeActivity.this,TersimpanActivity.class);
                startActivity(iTersimpan);
            }
        });

        btnLokasi= (ImageButton) findViewById(R.id.lokasi);
        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLokasi = new Intent(HomeActivity.this,LokasiActivity.class);
                startActivity(iLokasi);
            }
        });

        btnProfil= (ImageButton) findViewById(R.id.profil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iProfil = new Intent(HomeActivity.this,ProfilActivity.class);
                startActivity(iProfil);
            }
        });


        btnMakanSiang = findViewById(R.id.makansiang);
        btnMakanSiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent (HomeActivity.this, FirebaseReadActivity.class));
            }
        });

    }
}
