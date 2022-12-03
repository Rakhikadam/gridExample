package com.softhub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class GridViewExample extends AppCompatActivity {
    List<Drawable> imagelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_example);
        ListView view = findViewById(R.id.grid);
        List<User> list = new ArrayList<>();
        imagelist.add(getResources().getDrawable(R.drawable.ic_launcher_background));
        User user1 = new User("pankaj", "29", "pankaj@gmail.com", "16/10/1993", "B.SC.IT");
        list.add(user1);
        User user2 = new User("Rakhi", "24", "rakhi@gmail.com", "19/07/1998", "B.SC.IT");
        list.add(user2);
        User user3 = new User("pruthvi", "26", "pruthvi@gmail.com", "06/12/1997", "BE -ext");
        list.add(user3);
        User user4 = new User("pruthvi", "26", "pruthvi@gmail.com", "06/12/1997", "BE -ext");
        list.add(user4);
        User user5 = new User();
        user5.setName("avinash");
        user5.setAge("");
        GridAdapter adapter = new GridAdapter(list);

        view.setAdapter(adapter);


    }

    class GridAdapter extends BaseAdapter {
        List<User> list1;

        public GridAdapter(List<User> list) {
            list1 = list;
        }


        @Override
        public int getCount() {
            return list1.size();
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
            View view = LayoutInflater.from(GridViewExample.this).inflate(R.layout.grid_row, parent, false);
            ImageView imageView = view.findViewById(R.id.image);
            TextView textView2 = view.findViewById(R.id.text2);
            TextView textView1 = view.findViewById(R.id.text1);
            String email = list1.get(position).getEmail();
            textView1.setText(email);
            String name = list1.get(position).getName();
            textView2.setText(name);

            return view;
        }
    }
}
