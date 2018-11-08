package com.example.ms.autostatuslt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DuomenysListAdapter extends RecyclerView.Adapter<DuomenysListAdapter.DuomenysViewHolder> {

    class DuomenysViewHolder extends RecyclerView.ViewHolder {
        private final TextView DuomenysItemView;

        private DuomenysViewHolder(View itemView) {
            super(itemView);
            DuomenysItemView = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater mInflater;
    private List<Duomenys> mDuomenys; // Cached copy of words

    DuomenysListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public DuomenysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new DuomenysViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(DuomenysViewHolder holder, int position) {
        if (mDuomenys != null) {
            Duomenys current = mDuomenys.get(position);
            holder.DuomenysItemView.setText(current.getDuomenys());
        } else {
            // Covers the case of data not being ready yet.
            holder.DuomenysItemView.setText("Nera duomenu");
        }
    }

    void setDuomenys(List<Duomenys> duomenys) {
        mDuomenys = duomenys;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (mDuomenys != null)
            return mDuomenys.size();
        else return 0;
    }
}