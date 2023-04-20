package prime.projects.jarrodcoffeegold.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import prime.projects.jarrodcoffeegold.R
import prime.projects.jarrodcoffeegold.adapters.JarrodHomeAdapter
import prime.projects.jarrodcoffeegold.data.JarrodHome
import prime.projects.jarrodcoffeegold.databinding.FragmentJarrodHomeBinding
import java.io.IOException
import java.nio.charset.Charset


class JarrodHomeFragment : Fragment() {

    private var binding: FragmentJarrodHomeBinding ?=null

    private lateinit var adapter: JarrodHomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val jarrodHomeBinding = FragmentJarrodHomeBinding.inflate(inflater, container, false)
        binding = jarrodHomeBinding
        return jarrodHomeBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jsonString = getHomeData()!!
        val gson = Gson()
        val homeImages = gson.fromJson(jsonString, JarrodHome::class.java)
        adapter = JarrodHomeAdapter(requireActivity(), homeImages)
        binding?.apply {
            jarrodHomeFragment = this@JarrodHomeFragment
            jarrodHomeAdapter = adapter
        }
    }

    private fun getHomeData(): String? {
        val json: String?
        val charset: Charset = Charsets.UTF_8
        try{
            val homeImagesJSONFile = resources.openRawResource(R.raw.jarrod_home_images)
            val size = homeImagesJSONFile.available()
            val buffer = ByteArray(size)
            homeImagesJSONFile.read(buffer)
            homeImagesJSONFile.close()
            json = String(buffer, charset)
        } catch (e: IOException){
            e.printStackTrace()
            return null
        }
        return json
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}