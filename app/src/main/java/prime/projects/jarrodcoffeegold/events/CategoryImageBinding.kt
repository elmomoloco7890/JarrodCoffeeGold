package prime.projects.jarrodcoffeegold.events

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object CategoryImageBinding {
    @JvmStatic @BindingAdapter("categoryUrl")
    fun loadImage(imageView: ImageView?, url: String){
        Glide.with(imageView!!).load(url).into(imageView)
    }
}