package com.agender.app.modules.forum.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.agender.app.R
import com.agender.app.databinding.RowForumBinding
import com.agender.app.modules.forum.`data`.model.ForumRowModel
import kotlin.Int
import kotlin.collections.List

class ForumAdapter(
  var list: List<ForumRowModel>
) : RecyclerView.Adapter<ForumAdapter.RowForumVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowForumVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_forum,parent,false)
    return RowForumVH(view)
  }

  override fun onBindViewHolder(holder: RowForumVH, position: Int) {
    val forumRowModel = ForumRowModel()
    // TODO uncomment following line after integration with data source
    // val forumRowModel = list[position]
    holder.binding.forumRowModel = forumRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ForumRowModel>) {
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
      item: ForumRowModel
    ) {
    }
  }

  inner class RowForumVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowForumBinding = RowForumBinding.bind(itemView)
  }
}
