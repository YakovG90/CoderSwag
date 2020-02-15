package yakov.com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product_detail.*
import kotlinx.android.synthetic.main.product_list_item.*
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.model.Product
import yakov.com.example.coderswag.utilities.EXTRA_PRODUCT

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var product: Product

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PRODUCT, product)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        product = savedInstanceState.getParcelable(EXTRA_PRODUCT)!!
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        product = intent.getParcelableExtra(EXTRA_PRODUCT) as Product

        val resourceId = resources.getIdentifier(
            product.image,
            "drawable",
            this.packageName)

        productDetailImageView.setImageResource(resourceId)
        productDetailDescView.text = product.title
        productDetailPriceVIew.text = product.price
    }
}
