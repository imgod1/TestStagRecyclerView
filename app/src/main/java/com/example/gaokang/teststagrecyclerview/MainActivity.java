package com.example.gaokang.teststagrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private List<Integer> image_list;
    private MyStagAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        image_list = new ArrayList<>();
        adapter = new MyStagAdapter(this,image_list);
        recyclerview.setAdapter(adapter);
        image_list.add(R.mipmap.image0);
        image_list.add(R.mipmap.image1);
        image_list.add(R.mipmap.image2);
        image_list.add(R.mipmap.image3);
        image_list.add(R.mipmap.image4);
        image_list.add(R.mipmap.image5);
        image_list.add(R.mipmap.image6);
        image_list.add(R.mipmap.image7);
        image_list.add(R.mipmap.ic_launcher);
        image_list.add(R.mipmap.bg);
        adapter.notifyDataSetChanged();
    }

    private void initView() {
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    }
}
