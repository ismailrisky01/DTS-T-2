package com.example.dts_t_2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dts_t_2.*
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item.view.*


class MainAdapter(val contact: ArrayList<Contact>) : RecyclerView.Adapter<ViewHolder>() {
    val data = listOf("Ismail", "Risky", "Rahmansyah")
    override fun getItemCount(): Int {
        return contact.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val callItem = layoutInflater.inflate(R.layout.item, parent, false)
        return ViewHolder(callItem)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contactPositio = contact.get(position)
        holder.itemView.txtName.text = contactPositio.name
        holder.itemView.txtPhone.text = contactPositio.phone
        val imageUrl = holder.itemView.imgAvatar
        Picasso.get().load(contactPositio.imageurl).into(imageUrl)
        Picasso.get().setLoggingEnabled(true)



    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view)