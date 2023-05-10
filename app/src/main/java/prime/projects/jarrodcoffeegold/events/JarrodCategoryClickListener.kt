package prime.projects.jarrodcoffeegold.events

import prime.projects.jarrodcoffeegold.data.JarrodMenuItem

interface JarrodCategoryClickListener {
    fun onMenuItemClicked(jarrodMenuItem: JarrodMenuItem)
}