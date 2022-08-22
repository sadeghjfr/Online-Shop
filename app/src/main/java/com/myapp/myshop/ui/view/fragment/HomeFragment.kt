package com.myapp.myshop.ui.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myapp.myshop.R
import com.myapp.myshop.ui.view.adapter.SliderAdapterExample
import com.myapp.myshop.utils.Utils.banners
import com.myapp.myshop.utils.Utils.getBanners
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class HomeFragment : Fragment() {

    lateinit var sliderView:SliderView;

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        sliderView = view.findViewById(R.id.bannerSlider)

        setupBanners()

        return view
    }

    private fun setupBanners(){

        val item = SliderAdapterExample(requireContext())

        getBanners() // fake banners for now.
        for (i in banners)
            item.addItem(i)

        sliderView.setSliderAdapter(item)
        sliderView.setIndicatorAnimation(IndicatorAnimationType.SWAP); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.startAutoCycle();
    }

}