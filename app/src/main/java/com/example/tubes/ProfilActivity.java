package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class ProfilActivity extends AppCompatActivity {

    public ImageButton btnCari, btnTersimpan, btnLokasi;
    public Button btnLogout, btnTambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        btnCari= (ImageButton)findViewById(R.id.cari);
        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iCari = new Intent(ProfilActivity.this,HomeActivity.class);
                startActivity(iCari);
            }
        });

        btnTersimpan= (ImageButton) findViewById(R.id.tersimpan);
        btnTersimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTersimpan = new Intent(ProfilActivity.this,TersimpanActivity.class);
                startActivity(iTersimpan);
            }
        });

        btnLokasi= (ImageButton) findViewById(R.id.lokasi);
        btnLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLokasi = new Intent(ProfilActivity.this,LokasiActivity.class);
                startActivity(iLokasi);
            }
        });

        btnLogout= (Button) findViewById(R.id.logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent iLogin = new Intent(ProfilActivity.this,LoginActivity.class);
                startActivity(iLogin);
            }
        });

        btnTambah= (Button) findViewById(R.id.tambahInfo);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iTambahInfo = new Intent(ProfilActivity.this,CreateInfo.class);
                startActivity(iTambahInfo);
            }
        });
    }
}
