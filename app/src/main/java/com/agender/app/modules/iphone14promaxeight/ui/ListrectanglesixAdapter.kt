package com.agender.app.modules.iphone14promaxeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agender.app.R
import com.agender.app.databinding.RowListrectanglesixBinding
import com.agender.app.modules.iphone14promaxeight.`data`.model.ListrectanglesixRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglesixAdapter(
  var list: List<ListrectanglesixRowModel>
) : RecyclerView.Adapter<ListrectanglesixAdapter.RowListrectanglesixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglesixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglesix,parent,false)
    return RowListrectanglesixVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglesixVH, position: Int) {
    val listrectanglesixRowModel = ListrectanglesixRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglesixRowModel = list[position]
    holder.binding.listrectanglesixRowModel = listrectanglesixRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectanglesixRowModel>) {
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
      item: ListrectanglesixRowModel
    ) {
    }
  }

  inner class RowListrectanglesixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglesixBinding = RowListrectanglesixBinding.bind(itemView)
  }
}
