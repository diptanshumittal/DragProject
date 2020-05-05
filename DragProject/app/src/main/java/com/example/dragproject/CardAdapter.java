package com.example.dragproject;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewAdapter> {
    TripModel mdata;
    Context mContext;
    public CardAdapter(Context mContext) {
        this.mContext = mContext;
        mdata = new TripModel();
    }
    @NonNull
    @Override
    public CardAdapter.CardViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.activity_cards,viewGroup,false);
        return new CardViewAdapter(layout);
    }
    @Override
    public void onBindViewHolder(@NonNull CardAdapter.CardViewAdapter cardViewHolder, int position) {
        cardViewHolder.btn.setText(mdata.getCards().get(position).getData());
        if(position==0){
            cardViewHolder.btn.setBackground(Drawable.createFromPath("#507dff"));
        }
        else if(position==1){
            cardViewHolder.btn.setBackground(Drawable.createFromPath("#edaf02"));
        }
        else{
            cardViewHolder.btn.setBackground(Drawable.createFromPath("#ff4c4c"));
        }
    }
    @Override
    public int getItemCount() {
        return mdata.getCards().size();
    }
    public class CardViewAdapter extends RecyclerView.ViewHolder {
        Button btn ;
        RelativeLayout container;
        public CardViewAdapter(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.btn_payment_status);
            container = itemView.findViewById(R.id.container);
        }
    }
}

