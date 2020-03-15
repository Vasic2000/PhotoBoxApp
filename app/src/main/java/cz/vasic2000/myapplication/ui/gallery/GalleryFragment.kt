package cz.vasic2000.myapplication.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import cz.vasic2000.myapplication.R

class GalleryFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val progress : ProgressBar = view!!.findViewById(R.id.progressBar)
        val textView : TextView = view!!.findViewById(R.id.text_gallery)

        textView.text = "Try to find images in this phone"
        progress.visibility = View.VISIBLE
//
//        Thread.sleep(1500)
//
//        progress.visibility = View.GONE
        textView.text = "No images"
    }
}
