package com.example.koreanactor


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mysubmissionapp.Actors

class ListActorAdapter(private val listActor: ArrayList<Actors>) :
    RecyclerView.Adapter<ListActorAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_actor, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val actor = listActor[position]

        Glide.with(holder.itemView.context)
            .load(actor.photo)
            .apply(RequestOptions().override(200, 200))
            .into(holder.imgPhoto)
        holder.tvName.text = actor.name
        holder.tvDetail.text = actor.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listActor[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listActor.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Actors)
    }
}