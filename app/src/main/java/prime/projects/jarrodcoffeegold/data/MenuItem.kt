package prime.projects.jarrodcoffeegold.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MenuItem(
    val id: String ?= null,
    val menuItem: String ?= null,
    val price1: Double ?= null,
    val price2: Double ?= null,
    val price3: Double ?= null,
    val size1: String ?= null,
    val size2: String ?= null,
    val size3: String ?= null
): Parcelable