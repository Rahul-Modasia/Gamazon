package com.example.jon_snow.gamazon.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.jon_snow.gamazon.Models.Categories
import com.example.jon_snow.gamazon.R

class CategoryAdapter(val context:Context,val categories:List<Categories>):BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val viewHolder:ViewHolder
        if(convertView==null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            viewHolder= ViewHolder()
            viewHolder.categoryName = categoryView.findViewById(R.id.categoryName)
            viewHolder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            categoryView.tag=viewHolder
        }
        else
        {
            viewHolder = convertView.tag as ViewHolder
            categoryView = convertView

        }

            val category = categories[position]
            viewHolder.categoryName?.text = category.title
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            viewHolder.categoryImage?.setImageResource(resourceId)

            return categoryView


    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }
    private class ViewHolder
    {
        var categoryName:TextView?=null
        var categoryImage:ImageView?=null
    }
}