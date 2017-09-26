package com.essam.asga_task.presenter;

import android.content.Context;
import android.widget.Toast;

import com.essam.asga_task.model.Product;
import com.essam.asga_task.model.ProductDetails;
import com.essam.asga_task.service.ProductService;
import com.essam.asga_task.view.customview.ProgressDialog;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Essam on 9/26/2017.
 */

public class ProductPresenter {
    private final Context context;
    private final ProductPresenterListener mListener;
    private final ProductService productService;

    public interface ProductPresenterListener {
        void productsReady(Product products);
        void productDetailsReady(ProductDetails products);
    }

    public ProductPresenter(ProductPresenterListener listener, Context context) {
        this.mListener = listener;
        this.context = context;
        this.productService = new ProductService();
    }

    public void getProducts() {
        try {
            ProgressDialog.getInstance().show(context);
        }catch (Exception e){
            e.printStackTrace();
        }
        productService.getAPI().getProductByCatId("9").enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                try {
                    ProgressDialog.getInstance().dismiss();
                }catch (Exception e){
                    e.printStackTrace();
                }

                if (response != null && response.body() != null)
                    mListener.productsReady(response.body());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                try {
                    ProgressDialog.getInstance().dismiss();
                }catch (Exception e){
                    e.printStackTrace();
                }

                t.printStackTrace();
                if (context != null)
                    Toast.makeText(context, "Error", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void getProductDetails(JsonObject productID) {
        try {
            ProgressDialog.getInstance().show(context);
        }catch (Exception e){
            e.printStackTrace();
        }
        productService.getAPI().getProductsDetails(productID).enqueue(new Callback<ProductDetails>() {
            @Override
            public void onResponse(Call<ProductDetails> call, Response<ProductDetails> response) {
                try {
                    ProgressDialog.getInstance().dismiss();
                }catch (Exception e){
                    e.printStackTrace();
                }

                if (response != null && response.body() != null)
                    mListener.productDetailsReady(response.body());
            }

            @Override
            public void onFailure(Call<ProductDetails> call, Throwable t) {
                try {
                    ProgressDialog.getInstance().dismiss();
                }catch (Exception e){
                    e.printStackTrace();
                }

                t.printStackTrace();
                if (context != null)
                    Toast.makeText(context, "Error", Toast.LENGTH_LONG).show();
            }
        });
    }
}
