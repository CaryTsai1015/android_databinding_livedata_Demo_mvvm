package com.example.mvvmtest.View

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavAction
import androidx.navigation.Navigation
import com.example.mvvmtest.R
import kotlinx.android.synthetic.main.fragment_page_1.button_1
import kotlinx.android.synthetic.main.fragment_page_2.*
import kotlinx.android.synthetic.main.fragment_page_3.*



class MainPage1Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_page_1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        button_1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPage1Fragment_to_mainPage2Fragment)
        }
    }
}

class MainPage2Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page_2, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_1.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_mainPage2Fragment_to_mainPage3Fragment)

        }

        button_2.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_mainPage2Fragment_to_mainPage1Fragment)


        }
    }
}

class MainPage3Fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page_3, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        button1.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_mainPage3Fragment_to_mainPage2Fragment)

        }
    }
}