package com.softhub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ListView listView = findViewById(R.id.mobile_list);
        String[]array = new String[]{"aaa","bbb","ccc","sdaa","dad","ddddd"};
        ArrayAdapter adapter = new ArrayAdapter(MainActivity5.this,android.R.layout.simple_list_item_1,array);
        listView.setAdapter(adapter);
    }
}