package com.example.seminar3

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class KakaoTalkRoomRecyclerViewAdapter {

    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val title : TextView = itemView.findViewById(R.id.tv_rv_item_board_title) as TextView
        val content : TextView = itemView.findViewById(R.id.tv)
    }
}