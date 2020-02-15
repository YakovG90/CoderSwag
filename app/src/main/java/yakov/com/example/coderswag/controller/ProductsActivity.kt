package yakov.com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
