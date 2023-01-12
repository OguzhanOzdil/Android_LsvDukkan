package com.ozzyozdil.lsvdukkan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ozzyozdil.lsvdukkan.R;

public class MainActivity extends AppCompatActivity {

    public static TextView puan;
    NavDirections action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puan_Hesapla();

    }

    public void puan_Hesapla(){

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.ozzyozdil.lsvdukkan", MODE_PRIVATE);
        String puanShared = sharedPreferences.getString("puanstr", "Puan: 0");
        puan = findViewById(R.id.txt_Puan);
        puan.setText(puanShared);

    }
}