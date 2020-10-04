package com.example.dts_t_2

import android.content.Context
import android.widget.Toast

object lib {
    fun toast(context: Context,message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}