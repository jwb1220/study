package com.example.a79809.jstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.a79809.jstudy.utils.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recy_view)
    RecyclerView recyView;
    private List<String> list = new ArrayList<>();
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        StatusBarUtil.setTransparent(MainActivity.this);
        initRecy();
    }

    public void initRecy() {
        adapter = new MainAdapter(this, mockData());
        recyView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyView.setAdapter(adapter);
    }

    public List<String> mockData() {
        list.add("哈哈");
        list.add("嘿嘿");
        return list;
    }

}
