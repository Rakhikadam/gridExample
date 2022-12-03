package com.softhub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.mobile_list);
        String[] array = new String[]{"asa","addd","fsa"};
        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,R.id.testview2,array);
        listView.setAdapter(adapter);
    }
}