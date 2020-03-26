package com.almarone.whatsapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.almarone.whatsapp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference firebaseReferencia = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //firebaseReferencia.child("pontos").setValue(100);
    }
}
