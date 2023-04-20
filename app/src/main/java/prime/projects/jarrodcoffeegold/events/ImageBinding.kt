package prime.projects.jarrodcoffeegold.events

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object ImageBinding {
    @JvmStatic @BindingAdapter("imageUrl")
    fun loadImage(view: ImageView, url: String?){
        Picasso.get().load(url).into(view)
    }
}

