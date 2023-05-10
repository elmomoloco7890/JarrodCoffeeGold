package prime.projects.jarrodcoffeegold.events

import prime.projects.jarrodcoffeegold.data.MenuItem

interface JarrodMenuClickListener {
    fun onItemClicked(menuItem: MenuItem)
}