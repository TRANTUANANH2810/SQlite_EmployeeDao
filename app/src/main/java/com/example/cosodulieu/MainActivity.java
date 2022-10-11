package com.example.cosodulieu;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.cosodulieu.SQlite.DbHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DbHelper dbHelper = new DbHelper(this);
        SQLiteDatabase Database = dbHelper.getReadableDatabase();
        Database.close();

    }
}