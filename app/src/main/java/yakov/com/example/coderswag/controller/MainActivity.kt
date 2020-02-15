package yakov.com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import yakov.com.example.coderswag.R
import yakov.com.example.coderswag.adapters.CategoryAdapter
import yakov.com.example.coderswag.model.Category
import yakov.com.example.coderswag.services.DataService

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListVIew.adapter = adapter
    }
}
