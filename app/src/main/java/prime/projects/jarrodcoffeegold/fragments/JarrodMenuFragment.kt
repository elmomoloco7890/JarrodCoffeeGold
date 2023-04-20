package prime.projects.jarrodcoffeegold.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import prime.projects.jarrodcoffeegold.R
import prime.projects.jarrodcoffeegold.adapters.JarrodMenuAdapter
import prime.projects.jarrodcoffeegold.databinding.FragmentJarrodMenuBinding


class JarrodMenuFragment : Fragment() {

    private var binding: FragmentJarrodMenuBinding?= null

    private lateinit var adapter: JarrodMenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val jarrodMenuBinding = FragmentJarrodMenuBinding.inflate(inflater, container, false)
        binding = jarrodMenuBinding
        return jarrodMenuBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = JarrodMenuAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}