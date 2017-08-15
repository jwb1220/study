package com.example.a79809.jstudy;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by 79809 on 2017/8/15.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {


    private Context context;
    private List<String> list;

    public MainAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MainHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainHolder(LayoutInflater.from(context).inflate(R.layout.recy_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MainHolder holder, final int position) {
        holder.tvNumber.setText(position + 1 + "");
        holder.tvTitle.setText(list.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list != null && list.size() > 0 ? list.size() : 0;
    }

    public void onViewClick(int position) {
        Log.d("jiawenbin", position + "");
    }

    class MainHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_number)
        TextView tvNumber;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.card_view)
        CardView cardView;

        public MainHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
