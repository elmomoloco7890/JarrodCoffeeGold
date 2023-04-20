package prime.projects.jarrodcoffeegold.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import prime.projects.jarrodcoffeegold.data.JarrodHomeItem
import prime.projects.jarrodcoffeegold.databinding.JarrodHomeItemsBinding

class JarrodHomeAdapter(
    private val context: Context,
    private val list: ArrayList<JarrodHomeItem>
    ): RecyclerView.Adapter<JarrodHomeAdapter.JarrodHomeViewHolder>() {

        private lateinit var binding: JarrodHomeItemsBinding

        class JarrodHomeViewHolder(private var jarrodHomeItems: JarrodHomeItemsBinding):RecyclerView.ViewHolder(jarrodHomeItems.root){
            fun bind(currentItems: JarrodHomeItem){
                jarrodHomeItems.jarrodHomeItems = currentItems
                jarrodHomeItems.executePendingBindings()
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JarrodHomeViewHolder {
        val inflater = LayoutInflater.from(context)
        val jarrodHomeItemBinding = JarrodHomeItemsBinding.inflate(inflater, parent, false)
        binding = jarrodHomeItemBinding
        return JarrodHomeViewHolder(jarrodHomeItemBinding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: JarrodHomeViewHolder, position: Int) =
        holder.bind(list[position])
}