package br.com.alex.whatsappstudy.presentation.chatlist.adapter

import android.os.Build
import android.os.Handler
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.common.DATE_MASK_FORMAT
import br.com.alex.whatsappstudy.common.onSingleClick
import br.com.alex.whatsappstudy.core.BaseViewHolder
import br.com.alex.whatsappstudy.data.model.Chat
import com.bumptech.glide.Glide
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ChatListAdapter(viewGroup: ViewGroup) :
    BaseViewHolder<Chat>(R.layout.chat_list_item_view, viewGroup) {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun bind(item: Chat) {

        val pattern = DateTimeFormatter.ofPattern(DATE_MASK_FORMAT)
        val localDateTime = LocalDateTime.parse(item.messages?.first()?.publishedAt, pattern)

        itemView.findViewById<TextView>(R.id.tv_chat_list_name).text = item.author
        itemView.findViewById<TextView>(R.id.tv_chat_list_message).text = item.messages?.first()?.text
        itemView.findViewById<TextView>(R.id.tv_chat_list_message_time).text =
            itemView.context.getString(
                R.string.message_date_time,
                localDateTime.hour,
                localDateTime.minute
            )

        Glide
            .with(itemView.context)
            .load(item.urlToImage)
            .centerCrop()
            .into(itemView.findViewById(R.id.iv_chat_list_image))
    }

    override fun onItemClick(onClick: View.OnClickListener) {
        itemView.setOnClickListener {
            onClick.onClick(it)

        }
    }
}