package yakov.com.example.coderswag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.adapters.CategoryRecycleAdapter
import yakov.com.example.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListVIew.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListVIew.layoutManager = layoutManager
        categoryListVIew.setHasFixedSize(true)
    }
}
