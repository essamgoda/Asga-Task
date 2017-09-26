package com.essam.asga_task.view.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.essam.asga_task.R;
import com.essam.asga_task.model.Datum;
import com.essam.asga_task.model.Product;
import com.essam.asga_task.model.ProductDetails;
import com.essam.asga_task.presenter.ProductPresenter;
import com.essam.asga_task.util.NetworkUtility;
import com.google.gson.JsonObject;
import com.squareup.picasso.Picasso;

public class ProductDetailsActivity extends AppCompatActivity implements ProductPresenter.ProductPresenterListener {
    ProductPresenter productPresenter;
    ImageView img_product_image;
    TextView txt_title, txt_price, txt_quantity, txt_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        initViews();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String ID = extras.getString("ID");
            JsonObject object = new JsonObject();
            try {
                object.addProperty("productID", ID);

                if (NetworkUtility.isConnected(ProductDetailsActivity.this)) {
                    productPresenter = new ProductPresenter(this, this);
                    productPresenter.getProductDetails(object);
                } else {
                    Toast.makeText(ProductDetailsActivity.this, "Check Internet Connection", Toast.LENGTH_LONG).show();
                }
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(ProductDetailsActivity.this, "Error", Toast.LENGTH_LONG).show();
            }
        }else {
            Toast.makeText(ProductDetailsActivity.this, "Error", Toast.LENGTH_LONG).show();
        }

    }

    private void initViews() {
        img_product_image = (ImageView) findViewById(R.id.img_product_image);
        txt_title = (TextView) findViewById(R.id.txt_title);
        txt_price = (TextView) findViewById(R.id.txt_price);
        txt_quantity = (TextView) findViewById(R.id.txt_quantity);
        txt_category = (TextView) findViewById(R.id.txt_category);
    }


    @Override
    public void productsReady(Product products) {

    }

    @Override
    public void productDetailsReady(ProductDetails products) {
        if (products.getStatusCode() == 200) {
            if (products.getData() != null) {
                Datum product = products.getData();
                txt_title.setText(product.getName());
                txt_price.setText(String.valueOf(product.getPrice()));
                txt_quantity.setText(String.valueOf(product.getQuantityInStock()));
                txt_category.setText(product.getCategoryName());
                try {
                    Picasso.with(ProductDetailsActivity.this).load(product.getImage()).into(img_product_image);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            Toast.makeText(this, products.getMsg(), Toast.LENGTH_LONG).show();
        }
    }
}
