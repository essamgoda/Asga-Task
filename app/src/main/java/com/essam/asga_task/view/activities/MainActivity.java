package com.essam.asga_task.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.essam.asga_task.R;
import com.essam.asga_task.model.Product;
import com.essam.asga_task.model.ProductDetails;
import com.essam.asga_task.presenter.ProductPresenter;
import com.essam.asga_task.util.NetworkUtility;
import com.essam.asga_task.view.adapter.productsAdapter;

public class MainActivity extends AppCompatActivity implements ProductPresenter.ProductPresenterListener {
    RecyclerView recyclerView;
    ProductPresenter productPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        if (NetworkUtility.isConnected(MainActivity.this)) {
            productPresenter = new ProductPresenter(this, this);
            productPresenter.getProducts();
        } else {
            Toast.makeText(MainActivity.this, "Check Internet Connection", Toast.LENGTH_LONG).show();
        }
    }

    void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.products);
        GridLayoutManager GridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        recyclerView.setLayoutManager(GridLayoutManager);
    }

    @Override
    public void productsReady(Product products) {
        if (products.getStatusCode() == 200) {
            if (products.getData() != null) {
                productsAdapter adapter = new productsAdapter(products.getData(), MainActivity.this);
                recyclerView.setAdapter(adapter);
            }
        } else {
            Toast.makeText(this, products.getMsg(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void productDetailsReady(ProductDetails products) {

    }
}
