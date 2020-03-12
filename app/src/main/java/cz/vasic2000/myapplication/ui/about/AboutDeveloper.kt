package cz.vasic2000.myapplication.ui.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import cz.vasic2000.myapplication.R

class AboutDeveloper : Fragment() {

    companion object {
        fun newInstance() = AboutDeveloper()
    }

    private lateinit var viewModel: AboutDeveloperViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.about_developer_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AboutDeveloperViewModel::class.java)

    }

}
