package com.example.dts_t_2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dts_t_2.Contact
import com.example.dts_t_2.R

/**
 * A simple [Fragment] subclass.
 */
class Dashboard : Fragment() {
    lateinit var listContact: List<Contact>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }


}


