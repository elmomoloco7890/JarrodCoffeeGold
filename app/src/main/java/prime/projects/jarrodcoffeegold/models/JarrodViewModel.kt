package prime.projects.jarrodcoffeegold.models

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel

class JarrodViewModel: ViewModel() {



    //adding this method for making code more readable.
    fun getToastMessages(context: Context, message: String, toastType: Int){
        Toast.makeText(context, message, toastType).show()
    }

}