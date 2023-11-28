package br.com.alex.whatsappstudy.presentation.chatlist.adapter

import android.os.Build
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.data.model.News
import br.com.alex.whatsappstudy.presentation.BaseViewHolder
import com.bumptech.glide.Glide
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class ChatListAdapter(viewGroup: ViewGroup) : BaseViewHolder<News>(R.layout.chats_item_view, viewGroup) {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun bind(item: News) {

        val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'")
        val localDateTime = LocalDateTime.parse(item.publishedAt, pattern)
        println(">>>> " + localDateTime)

        itemView.findViewById<TextView>(R.id.tv_chat_list_name).text = item.source?.name
        itemView.findViewById<TextView>(R.id.tv_chat_list_message).text = item.title
        itemView.findViewById<TextView>(R.id.tv_chat_list_message_time).text = "${localDateTime.hour}:${localDateTime.minute}"

        Glide
            .with(itemView.context)
            .load(item.urlToImage)
            .centerCrop()
            .into(itemView.findViewById(R.id.iv_chat_list_image))
    }
}