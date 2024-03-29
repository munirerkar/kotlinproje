package com.example.yemektariflerisqlite

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_tarif.*

class ListeFragment : Fragment() {

    var yemekIsmiListesi = ArrayList<String>()
    var yemekIdListtesi = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liste, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sqlVeriAlma()
    }
    fun sqlVeriAlma(){
        activity?.let {
            val database = it.openOrCreateDatabase("Yemekler",Context.MODE_PRIVATE,null)
            val cursor = database.rawQuery("SELECT * FROM yemekler",null)
            val yemekIsmiIndex = cursor.getColumnIndex("yemekismi")
            val yemekIdIndex = cursor.getColumnIndex("id")
            yemekIsmiListesi.clear()
            yemekIdListtesi.clear()
            while (cursor.moveToNext()){
                yemekIsmiListesi.add(cursor.getString(yemekIsmiIndex))
                yemekIdListtesi.add(cursor.getInt(yemekIdIndex))
            }
            cursor.close()
        }
    }

}