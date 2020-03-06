package com.example.recycleview_findcrush.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview_findcrush.Adapter.FindCrushAdapter
import com.example.recycleview_findcrush.Model.Person
import com.example.recycleview_findcrush.R
import kotlinx.android.synthetic.main.fragment_person.view.*

/**
 * A simple [Fragment] subclass.
 */
class PersonFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var FindCrushArray=ArrayList<Person>()
        FindCrushArray.add(Person(R.drawable.post_malone,"Post_Malone","Posted","4h",R.drawable.post_malone_show,"10K","4500","2.5K"))
        FindCrushArray.add(Person(R.drawable.taylor_swift,"Taylor_Swift","Posted","2h",R.drawable.taylor_show,"15K","7000","10K"))
        var findCrushAdapter=FindCrushAdapter(FindCrushArray)
        var root=inflater.inflate(R.layout.fragment_person, container, false)
        root.recyclerView.layoutManager= LinearLayoutManager(context)
        root.recyclerView.adapter=findCrushAdapter
        // Inflate the layout for this fragment
        return root
    }

}
