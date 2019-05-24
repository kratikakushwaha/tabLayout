package com.example.tablayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class programmingAdaptar extends RecyclerView.Adapter<programmingAdaptar.programmingViewHolder> {
    private String[] data;
    private Context context;

    public programmingAdaptar(String[] data, Context context) {
        this.data = data;
         this.context=context;
    }

    @NonNull
    @Override
    public programmingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item, viewGroup, false);
        return new programmingViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    @Override
    public void onBindViewHolder(@NonNull programmingViewHolder programmingViewHolder, final int i) {

        String title = data[i];
        programmingViewHolder.textView.setText(title);
          programmingViewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(context, "you clicked" +i, Toast.LENGTH_SHORT).show();
              }
          });

    }

    public class programmingViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        LinearLayout  linearLayout;

        public programmingViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img);
            textView = itemView.findViewById(R.id.text1);
           linearLayout=itemView.findViewById(R.id.click);


        }
    }
}
