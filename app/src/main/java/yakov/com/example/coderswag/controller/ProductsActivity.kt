package yakov.com.example.coderswag.controller

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_products.*
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.adapters.ProductsAdapter
import yakov.com.example.coderswag.model.Product
import yakov.com.example.coderswag.services.DataService
import yakov.com.example.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType ?: ""))
        productListVIew.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp

        if (screenSize > 720) {
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListVIew.layoutManager = layoutManager
        productListVIew.setHasFixedSize(true)
    }
}
