package com.example.api2.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.api2.Models.ModelComments;
import com.example.api2.databinding.ItemCommentBinding;

import java.util.List;

public class AdapterComments extends RecyclerView.Adapter<AdapterComments.Holder> {
    private List<ModelComments> commentList;

    public void setCommentList(List<ModelComments> commentList) {
        this.commentList = commentList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCommentBinding binding = ItemCommentBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new Holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.bind(commentList.get(position));
    }

    @Override
    public int getItemCount() {
        return commentList != null ? commentList.size() : 0;
    }

    class Holder extends RecyclerView.ViewHolder {
        ItemCommentBinding binding;
        public Holder(ItemCommentBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        public void bind(ModelComments comments) {
            binding.tvTitle.setText(comments.getEmail());
            binding.tvBody.setText(comments.getBody());
        }

    }

}
