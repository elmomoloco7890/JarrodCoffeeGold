package prime.projects.jarrodcoffeegold.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import prime.projects.jarrodcoffeegold.R
import prime.projects.jarrodcoffeegold.databinding.FragmentJarrodCategoryBinding


class JarrodCategoryFragment : Fragment() {

    private var binding: FragmentJarrodCategoryBinding ?= null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jarrod_category, container, false)
    }


}