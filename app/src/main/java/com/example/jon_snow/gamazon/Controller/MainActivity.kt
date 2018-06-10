package com.example.jon_snow.gamazon.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.jon_snow.gamazon.Adapter.CategoryAdapter
import com.example.jon_snow.gamazon.Models.Categories
import com.example.jon_snow.gamazon.R
import com.example.jon_snow.gamazon.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter=adapter;

    }
}
