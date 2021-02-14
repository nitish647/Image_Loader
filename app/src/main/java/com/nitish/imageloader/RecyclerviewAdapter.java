package com.nitish.imageloader;


import android.content.Context;
import android.net.Uri;
import android.opengl.EGLImage;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyviewHolder>  {

    ArrayList name , image;
    Context context;

    public RecyclerviewAdapter(Context context, ArrayList mimage)
    {
        this.image = mimage;

        this.context = context;
    }
    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_items,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyviewHolder holder, final int position) {
        //loading the image with glide
        Glide.with(context).load(String.valueOf(image.get(position))).into(holder.imageView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // if the image is not loaded for 5 seconds then the first image will be shown on that imageview
                if(holder.imageView.getDrawable() == null)
                {
                    Glide.with(context).load(R.drawable.number1_1).into(holder.imageView);

                }

            }
        }, 5000);


    }

    @Override
    public int getItemCount() {
        return image.size();
    }
    public static class  MyviewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;


        public MyviewHolder(@NonNull View itemView) {

            super(itemView);
imageView = (ImageView)itemView.findViewById(R.id.imageview);
        }
    }
}
