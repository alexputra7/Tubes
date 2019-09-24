package com.example.tubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.app.Activity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static android.text.TextUtils.isEmpty;

public class CreateInfo extends AppCompatActivity {

    public ImageButton backProfil;
    // variable yang merefers ke Firebase Realtime Database
    public DatabaseReference database;

    // variable fields EditText dan Button
    public Button btnSimpan;
    public EditText mNamaRM, mPromo, mBerlaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_info);

        mNamaRM= (EditText) findViewById(R.id.namaWarung);
        mPromo= (EditText)findViewById(R.id.ketPromo);
        mBerlaku= (EditText)findViewById(R.id.masaBerlaku);
        btnSimpan= (Button)findViewById(R.id.simpan);
        backProfil= (ImageButton)findViewById(R.id.backProfil);
        backProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iBack = new Intent(CreateInfo.this,ProfilActivity.class);
                startActivity(iBack);
            }
        });

        // mengambil referensi ke Firebase Database
        database = FirebaseDatabase.getInstance().getReference();
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isEmpty(mNamaRM.getText().toString()) && !isEmpty(mPromo.getText().toString()) && !isEmpty(mBerlaku.getText().toString()))
                    submitPromo(new Diskon(mNamaRM.getText().toString(), mPromo.getText().toString(), mBerlaku.getText().toString()));
                else
                    Snackbar.make(findViewById(R.id.simpan), "Data barang tidak boleh kosong", Snackbar.LENGTH_LONG).show();

                InputMethodManager imm = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(
                        mNamaRM.getWindowToken(), 0);
            }
        });
    }

    private void submitPromo(Diskon diskon) {
        /**
         * Ini adalah kode yang digunakan untuk mengirimkan data ke Firebase Realtime Database
         * dan juga kita set onSuccessListener yang berisi kode yang akan dijalankan
         * ketika data berhasil ditambahkan
         */
        database.child("promo").push().setValue(diskon).addOnSuccessListener(this, new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                mNamaRM.setText("");
                mPromo.setText("");
                mBerlaku.setText("");
                Snackbar.make(findViewById(R.id.simpan), "Data berhasil ditambahkan", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    public static Intent getActIntent(Activity activity) {
        // kode untuk pengambilan Intent
        return new Intent(activity, CreateInfo.class);
    }
}
