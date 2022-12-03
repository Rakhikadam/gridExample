package com.softhub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainGrid2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid2);
        GridView gridView=findViewById(R.id.grid);
        List<user3>list=new ArrayList<>();
        user3 user =new user3("aaa","23","aaa@gmail.com");
        list.add(user);
        user3 user2=new user3("BBB","23","BBB@gmail.com");
        list.add(user2);
        user3 user4=new user3("ccc","25","ccc@gmail.com");
        list.add(user4);
        user3 user5=new user3("DDD","30","DDD@gmail.com");
        list.add(user5);
        user3 user6=new user3("xyz","40","xyz@gmail.com");
        list.add(user6);
        GridAdpter adpter=new GridAdpter(list);
        gridView.setAdapter(adpter);

    }
    class GridAdpter extends BaseAdapter{
        List<user3> list;
        public GridAdpter(List<user3> list) {
            this.list=list;
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
            View ABC= LayoutInflater.from(MainGrid2.this).inflate(R.layout.grid_layout_file,parent,false);
            TextView textView1=ABC.findViewById(R.id.testview1);
            TextView textView2=ABC.findViewById(R.id.testview2);
            TextView textView3=ABC.findViewById(R.id.testview3);



            ABC.findViewById(R.id.testview2);
            ABC.findViewById(R.id.testview3);
            ABC.findViewById(R.id.testview3);
            textView1.setText(list.get(position).getEmail());
            textView2.setText(list.get(position).getAge());
            textView3.setText(list.get(position).getName());

            return ABC;
        }
    }

}