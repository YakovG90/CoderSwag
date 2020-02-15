package yakov.com.example.coderswag.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.adapters.CategoryRecycleAdapter
import yakov.com.example.coderswag.services.DataService
import yakov.com.example.coderswag.utilities.EXTRA_CATEGORY

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListVIew.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListVIew.layoutManager = layoutManager
        categoryListVIew.setHasFixedSize(true)


    }
}
