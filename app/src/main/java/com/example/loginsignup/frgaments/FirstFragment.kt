package com.example.loginsignup.frgaments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.loginsignup.R
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val series = LineGraphSeries(arrayOf(
                DataPoint(1.0,2.0),
                DataPoint(2.0,1.0),
                DataPoint(3.0,1.0),
                DataPoint(4.0,2.0),
                DataPoint(5.0,3.0),
                DataPoint(6.0,2.0),
                DataPoint(7.0,4.0)
            )
        )
        view.graphView.title = "My Graph"
        view.graphView.titleColor = R.color.purple_700
        view.graphView.titleTextSize = 20f
        view.graphView.addSeries(series)
        return view
    }
}