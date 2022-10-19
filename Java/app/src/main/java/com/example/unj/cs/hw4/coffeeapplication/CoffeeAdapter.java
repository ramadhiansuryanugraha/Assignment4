package com.example.unj.cs.hw4.coffeeapplication;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.unj.cs.hw4.coffeeapplication.Model.ItemList;

import java.util.ArrayList;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    Context context;
    ArrayList<ItemList> arrayList = new ArrayList<>();

    public CoffeeAdapter(Context context, ArrayList<ItemList> arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.rowName.setText(arrayList.get(position).getRowName());
        holder.rowImage.setImageResource(arrayList.get(position).getRowImage());
        holder.descriptions.setText(arrayList.get(position).getDescriptions());
        holder.fulldescription.setText(arrayList.get(position).getFulldescription());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(context, "This is"+ position, Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, Description_Activity.class);
                intent.putExtra("imageDescription", arrayList.get(position).getRowImage());
                intent.putExtra("titleDescription", arrayList.get(position).getRowName());
                intent.putExtra("descDescription", arrayList.get(position).getDescriptions());
                intent.putExtra("fullDescription", arrayList.get(position).getFulldescription());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView rowImage;
        TextView rowName;
        TextView descriptions;
        TextView fulldescription;
        CardView layout;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rowName = itemView.findViewById(R.id.textView1);
            rowImage = itemView.findViewById(R.id.imageView);
            layout = itemView.findViewById(R.id.cardview_layout);
            descriptions = itemView.findViewById(R.id.textView2);
            fulldescription = itemView.findViewById(R.id.fulldescription);
        }
    }

}