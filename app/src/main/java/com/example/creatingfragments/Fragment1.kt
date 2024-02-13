package com.example.creatingfragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context,
            "onAttach() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,
            "onCreate() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context,
            "onCreateView() method has been called",
            Toast.LENGTH_SHORT
        ).show()

        return inflater.inflate(R.layout.fragment_1, container, false)

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context,
            "onStart() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context,
            "onResume() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(context,
            "onPause() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context,
            "onStop() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context,
            "onDestroyView() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,
            "onDestroy() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context,
            "onDetach() method has been called",
            Toast.LENGTH_SHORT
        ).show()
    }

}