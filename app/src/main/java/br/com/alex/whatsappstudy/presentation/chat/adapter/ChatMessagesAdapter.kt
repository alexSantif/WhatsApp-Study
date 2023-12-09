package br.com.alex.whatsappstudy.presentation.chat.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.core.BaseViewHolder
import br.com.alex.whatsappstudy.data.model.Chat
import com.bumptech.glide.Glide

class ChatMessagesAdapter(viewGroup: ViewGroup):
    BaseViewHolder<Chat>(R.layout.chat_message_item_view, viewGroup) {

    override fun bind(item: Chat) {
        itemView.findViewById<TextView>(R.id.tv_chat_message_name).text = item.author
        itemView.findViewById<TextView>(R.id.tv_chat_message).text = item.messages?.first()?.text

        Glide
            .with(itemView.context)
            .load(item.urlToImage)
            .centerCrop()
            .into(itemView.findViewById(R.id.iv_chat_message_image))
    }

    override fun onItemClick(onClick: View.OnClickListener) {
        TODO("Not yet implemented")
    }
}