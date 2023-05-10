package prime.projects.jarrodcoffeegold.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class JarrodMenuItem(
    val category: String ?= null,
    val id: String ?= null,
    val imageURL: String?=null,
    val menuItems: List<MenuItem>
) : Parcelable