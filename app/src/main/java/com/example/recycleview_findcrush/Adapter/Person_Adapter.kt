package com.example.recycleview_findcrush.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview_findcrush.Model.Person
import com.example.recycleview_findcrush.R
import kotlinx.android.synthetic.main.person_item.view.*

class FindCrushAdapter(var personList:ArrayList<Person>) : RecyclerView.Adapter<FindCrushAdapter.FindCrashViewHolder>() {
    inner class FindCrashViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindFindCrash(findCrash: Person) {
            itemView.prof_pic.setImageResource(findCrash.profilePicture)
            itemView.txt_name.text=findCrash.name
            itemView.txt_post_status.text=findCrash.postStatus
            itemView.posted_time.text=findCrash.postTime
            itemView.uploadImage.setImageResource(findCrash.postImage)
            itemView.txt_love.text=findCrash.love
            itemView.txt_comment.text=findCrash.comment
            itemView.txt_share.text=findCrash.share
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FindCrashViewHolder {
        return FindCrashViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.person_item,parent,false))
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: FindCrashViewHolder, position: Int) {
        holder.bindFindCrash(personList[position])
    }
}