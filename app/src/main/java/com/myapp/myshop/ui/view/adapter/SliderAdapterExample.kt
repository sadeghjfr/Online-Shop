package com.myapp.myshop.ui.view.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.myapp.myshop.R
import com.myapp.myshop.data.model.Banner
import com.smarteist.autoimageslider.SliderViewAdapter
import com.squareup.picasso.Picasso
import java.util.*

class SliderAdapterExample(context: Context) :
    SliderViewAdapter<SliderAdapterExample.SliderAdapterVH>() {

    private val context: Context
    private var mBanners: MutableList<Banner> = ArrayList()

    fun renewItems(banners: MutableList<Banner>) {
        mBanners = banners
        notifyDataSetChanged()
    }

    fun deleteItem(position: Int) {
        mBanners.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItem(banner: Banner) {
        mBanners.add(banner)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterVH {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.image_slider_layout_item, null)
        return SliderAdapterVH(inflate)
    }

    override fun onBindViewHolder(viewHolder: SliderAdapterVH, position: Int) {

        val banner: Banner = mBanners[position]
        Picasso.get().load(banner.imageUrl).into(viewHolder.imgBanner);

        viewHolder.itemView.setOnClickListener {

            if (banner.isLink){

                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(banner.link)
                context.startActivity(intent)
            }

            else{

                Toast.makeText(context,"No Link",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getCount(): Int {
        //slider view count could be dynamic size
        return mBanners.size
    }

    inner class SliderAdapterVH(itemView: View) : ViewHolder(itemView) {

        var imgBanner = itemView.findViewById<ImageView>(R.id.imgBanner)
    }

    init {
        this.context = context
    }
}