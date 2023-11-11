package br.com.alex.whatsappstudy.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.alex.whatsappstudy.R

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

class YellowView(viewGroup: ViewGroup) : BaseViewHolder<User>(R.layout.chats_item_view, viewGroup) {

    override fun bind(item: User) {
        itemView.findViewById<TextView>(R.id.tv_chat_list_name).text = item.name
        itemView.findViewById<TextView>(R.id.tv_chat_list_message).text = item.email
    }
}

data class User(
    val name: String,
    val email: String
)