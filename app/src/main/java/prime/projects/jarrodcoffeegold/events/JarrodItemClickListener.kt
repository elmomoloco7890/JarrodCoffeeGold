package prime.projects.jarrodcoffeegold.events

import prime.projects.jarrodcoffeegold.data.JarrodMenuItem

interface JarrodItemClickListener {
    fun onMenuItemClicked(jarrodMenuItem: JarrodMenuItem)
}