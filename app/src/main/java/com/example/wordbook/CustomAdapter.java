package com.example.wordbook;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private String[][] localDataSet;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getEnglish().setText(localDataSet[0][position]);
        holder.getHangul().setText(localDataSet[1][position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public CustomAdapter(String[][] dataSet){
        localDataSet = dataSet;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView english;
        private final TextView hangul;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            english=(TextView) itemView.findViewById(R.id.english);
            hangul=(TextView) itemView.findViewById(R.id.hangul);
        }

        public TextView getEnglish(){
            return english;
        }

        public TextView getHangul(){
            return hangul;
        }
    }
}
