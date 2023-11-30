package br.com.alex.whatsappstudy.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.data.model.News
import br.com.alex.whatsappstudy.data.model.NewsResponse

class BaseAdapter<T: BaseViewHolder<U>, U>(private val viewHolderLauncher: (ViewGroup) -> T) : RecyclerView.Adapter<T>() {

    var items: MutableList<U> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): T {
        return viewHolderLauncher(parent)
    }

    override fun onBindViewHolder(holder: T, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

abstract class BaseViewHolder<U>(layout: Int, viewGroup: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(viewGroup.context).inflate(layout, viewGroup, false)
) {

    abstract fun bind(item: U)
}