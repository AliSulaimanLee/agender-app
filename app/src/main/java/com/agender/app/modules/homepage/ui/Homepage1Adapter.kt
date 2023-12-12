package com.agender.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agender.app.R
import com.agender.app.databinding.RowHomepage1Binding
import com.agender.app.modules.homepage.`data`.model.Homepage1RowModel
import kotlin.Int
import kotlin.collections.List

class Homepage1Adapter(
  var list: List<Homepage1RowModel>
) : RecyclerView.Adapter<Homepage1Adapter.RowHomepage1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomepage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_homepage1,parent,false)
    return RowHomepage1VH(view)
  }

  override fun onBindViewHolder(holder: RowHomepage1VH, position: Int) {
    val homepage1RowModel = Homepage1RowModel()
    // TODO uncomment following line after integration with data source
    // val homepage1RowModel = list[position]
    holder.binding.homepage1RowModel = homepage1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Homepage1RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Homepage1RowModel
    ) {
    }
  }

  inner class RowHomepage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHomepage1Binding = RowHomepage1Binding.bind(itemView)
    init {
      binding.linearColumnrectanglesixTwo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Homepage1RowModel())
      }
    }
  }
}
