package com.essam.asga_task.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.essam.asga_task.R;
import com.essam.asga_task.model.Datum;
import com.essam.asga_task.view.activities.ProductDetailsActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Essam on 9/26/2017.
 */

public class productsAdapter extends RecyclerView.Adapter<productsAdapter.PostsViewHolder> {
    List<Datum> products;
    Context Con;

    public productsAdapter(List<Datum> products, Context con) {
        this.products = products;
        Con = con;
    }

    @Override
    public void onBindViewHolder(PostsViewHolder holder, final int position) {

        final Datum product = products.get(position);
        holder.txt_title.setText(product.getName());
        holder.txt_material.setText(product.getMaterial());
        holder.txt_quantity.setText(String.valueOf(product.getQuantityInStock()));
        try {
            Picasso.with(Con).load(product.getImage()).into(holder.img_product_image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Con, ProductDetailsActivity.class);
                intent.putExtra("ID", String.valueOf(product.getId()));
                Con.startActivity(intent);
            }
        });
    }

    @Override
    public PostsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item, parent, false);
        return new PostsViewHolder(view);
    }

    @Override
    public int getItemCount() {
         return products.size();

    }


    public class PostsViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_title, txt_material, txt_quantity;
        public ImageView img_product_image;

        CardView card;

        public PostsViewHolder(View v) {
            super(v);
            txt_title = (TextView) v.findViewById(R.id.txt_title);
            img_product_image = (ImageView) v.findViewById(R.id.img_product_image);
            txt_material = (TextView) v.findViewById(R.id.txt_material);
            txt_quantity = (TextView) v.findViewById(R.id.txt_quantity);

            card = (CardView) v.findViewById(R.id.card);
        }
    }

}