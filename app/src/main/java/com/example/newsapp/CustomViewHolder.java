package com.example.newsapp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.databinding.HeadlineListItemsBinding;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    HeadlineListItemsBinding binding;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        binding = HeadlineListItemsBinding.bind(itemView);

    }
}
