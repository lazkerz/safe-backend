package com.example.aplikasisafe.potensi

import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aplikasisafe.R
import com.example.aplikasisafe.adapters.KegiatanAdapter
import com.example.aplikasisafe.databinding.FragmentKegiatanBinding
import com.example.aplikasisafe.model.KegiatanModel


class KegiatanFragment : Fragment() {
    private lateinit var _binding: FragmentKegiatanBinding
    private lateinit var adapter: KegiatanAdapter

    private val binding get() = _binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKegiatanBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setKegiatanAdapter()
    }

    private fun setKegiatanAdapter() {
        val dataList: MutableList<KegiatanModel> = mutableListOf()

        lomba().forEachIndexed { index, lomba ->
            dataList.add(KegiatanModel (imglomba()[index], lomba))
        }


        trend().forEachIndexed { index, trend ->
            dataList.add(KegiatanModel (imgtrend()[index], trend))
        }
        Log.d("ISI DATANYA ", dataList.toString())
        adapter = KegiatanAdapter(dataList, requireContext())
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyleview.layoutManager = layoutManager

        val spacedItems = setOf(0,1,2)
        val customSpaceItemDecoration = CustomSpaceItemDecoration(
            resources.getDimensionPixelSize(R.dimen.item_horizontal_spacing),
            spacedItems
        )
        binding.recyleview.addItemDecoration(customSpaceItemDecoration)
        binding.recyleview.adapter = adapter
    }

    private fun lomba(): Array<String> = resources.getStringArray(R.array.lomba)

    private fun imglomba(): List<Int> = listOf(
        R.drawable.lomba,
        R.drawable.lomba2,
        R.drawable.lomba3,
    )

    private fun trend(): Array<String> = resources.getStringArray(R.array.trend)

    private fun imgtrend(): List<Int> = listOf(
        R.drawable.trend2,
        R.drawable.trend1,
        R.drawable.trend,
    )
    class CustomSpaceItemDecoration(private val spacing: Int, private val spacedItems: Set<Int>) :
        RecyclerView.ItemDecoration() {

        override fun getItemOffsets(
            outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
        ) {
            val position = parent.getChildAdapterPosition(view)
            if (spacedItems.contains(position)) {
                outRect.right = spacing
            }
        }
    }
}