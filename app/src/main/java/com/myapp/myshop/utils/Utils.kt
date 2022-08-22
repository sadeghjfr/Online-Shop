package com.myapp.myshop.utils

import com.myapp.myshop.data.model.Banner
import java.util.*

object Utils {

    lateinit var banners: ArrayList<Banner>

    fun getBanners(){

        val pic1 = "https://tarahilogo.com/wp-content/uploads/2020/12/shop-banner-design-3_1-300x156.jpg"
        val pic2 = "http://agerin.ir/images/resume/timevision/man.jpg"
        val pic3 = "http://agerin.ir/images/resume/timevision/2.jpg"

        val link1 = "http://shahreonline.com/"
        val link2 = "https://www.instagram.com/sadegh.jaff/"

        val banner1 = Banner(1,pic1,true,link1,0)
        val banner2 = Banner(2,pic2,false,link2,1)
        val banner3 = Banner(3,pic3,true,link2,0)

        banners = ArrayList()
        banners.add(banner1)
        banners.add(banner2)
        banners.add(banner3)
    }

}