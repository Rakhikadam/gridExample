package com.softhub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ListView listViewt = findViewById(R.id.grid);
        List<user2> list = new ArrayList<>();
        user2 user =new user2("rakhi","24","rakhi@gmail.com",R.drawable.image);
        list.add(user);
        user2 user1=new user2("abc","23","abc@gmail.com");
        list.add(user1);
        GridAdapter adapter=new GridAdapter(list);
        listViewt.setAdapter(adapter);
    }
    class GridAdapter extends BaseAdapter{
        List<user2> list;
        public GridAdapter(List<user2> list) {
           this.list= list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View ABC = LayoutInflater.from(MainActivity7.this).inflate(R.layout.user2_layout,parent,false);
            ImageView imageView= ABC.findViewById(R.id.image);
            imageView.setImageResource(list.get(position).getImagepath());
            return ABC;
        }
    }
}