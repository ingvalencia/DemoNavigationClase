package com.gvalencia.demonavigationclase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation




class inicioFragmento : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio_fragmento, container, false)
    }

    //UNa vez que se termina de ejecutar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button4).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_inicioFragmento_to_primerFragmento)
        }

        view.findViewById<Button>(R.id.button5).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_inicioFragmento_to_segundoFragmento)
        }

    }


}