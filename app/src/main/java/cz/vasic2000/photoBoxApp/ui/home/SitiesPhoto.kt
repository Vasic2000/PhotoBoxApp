package cz.vasic2000.photoBoxApp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cz.vasic2000.photoBoxApp.R

class SitiesPhoto : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_sities_photos, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        val layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        //        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.layoutManager = layoutManager
        val data = Data()
        val myAdapter = SitiesAdapter(data.getDataList())
        recyclerView.adapter = myAdapter
        return view
    }
}


