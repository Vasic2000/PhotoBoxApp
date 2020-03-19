package cz.vasic2000.photoBoxApp.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cz.vasic2000.photoBoxApp.R


class SitiesAdapter(var dataList: List<String>?) : RecyclerView.Adapter<SitiesAdapter.MyViewHolder>() {
    private var list: List<String>? = dataList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(view, list)
    }

    override fun onBindViewHolder(myViewHolder: MyViewHolder, position: Int) {
        myViewHolder.bind(position)
    }

    override fun getItemCount(): Int {
        return list!!.size
    }

    class MyViewHolder(itemView: View, var dataList: List<String>?) :
        RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.text_view)
        private val imageView: ImageView = itemView.findViewById(R.id.image_view)
        fun bind(position: Int) {
            textView.text = dataList?.get(position)
            when (position % 5) {
                0 -> imageView.setImageResource(R.drawable.como)
                1 -> imageView.setImageResource(R.drawable.mytishchi)
                2 -> imageView.setImageResource(R.drawable.moscow)
                3 -> imageView.setImageResource(R.drawable.venice)
                4 -> imageView.setImageResource(R.drawable.prague)

            }
        }
    }
}