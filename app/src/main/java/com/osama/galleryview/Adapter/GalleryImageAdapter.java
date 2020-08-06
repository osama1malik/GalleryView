package com.osama.galleryview.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.osama.galleryview.Model.GalleryImageModel;
import com.osama.galleryview.R;

import java.io.File;
import java.util.ArrayList;

public class GalleryImageAdapter extends RecyclerView.Adapter<GalleryImageAdapter.ViewHolder> {

    private Context context;
    private ArrayList<GalleryImageModel> model;

    public GalleryImageAdapter(Context context, ArrayList<GalleryImageModel> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_image_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context)
                .load("file://" + model.get(position).getDateTime())
                .skipMemoryCache(false)
                .into(holder.imageView);
        holder.imageName.setText(model.get(position).getImageName());
        holder.imageDate.setText(model.get(position).getImagePath());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView imageName, imageDate;

        public ViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.imageView);
            imageName = v.findViewById(R.id.imageName);
            imageDate = v.findViewById(R.id.imageDate);

        }
    }
}
