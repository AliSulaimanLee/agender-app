package com.agender.app.modules.iphone14promaxeight.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agender.app.R
import com.agender.app.databinding.RowGridrectanglesixTwoBinding
import com.agender.app.modules.iphone14promaxeight.`data`.model.GridrectanglesixTwoRowModel
import kotlin.Int
import kotlin.collections.List

class GridrectanglesixTwoAdapter(
  var list: List<GridrectanglesixTwoRowModel>
) : RecyclerView.Adapter<GridrectanglesixTwoAdapter.RowGridrectanglesixTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridrectanglesixTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridrectanglesix_two,parent,false)
    return RowGridrectanglesixTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowGridrectanglesixTwoVH, position: Int) {
    val gridrectanglesixTwoRowModel = GridrectanglesixTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val gridrectanglesixTwoRowModel = list[position]
    holder.binding.gridrectanglesixTwoRowModel = gridrectanglesixTwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridrectanglesixTwoRowModel>) {
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
      item: GridrectanglesixTwoRowModel
    ) {
    }
  }

  inner class RowGridrectanglesixTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridrectanglesixTwoBinding = RowGridrectanglesixTwoBinding.bind(itemView)
  }
}
