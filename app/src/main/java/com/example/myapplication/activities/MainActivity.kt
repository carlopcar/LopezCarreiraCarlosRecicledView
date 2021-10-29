package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.adapters.ListaPersonajesAdapter
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.model.dao.PersonajesDaoMockImpl

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflo las vistas
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Obtengo los datos de los personajes
        val personajesDao = PersonajesDaoMockImpl()
        val listaPersonajes = personajesDao.getTodos()

        //Creo los componentes que necesita el ReciclerView con todos sus personajes
        // LayoutManager layoutManager = new LinearLayoutManager(this) ---SEGUIDOS
        //En lugar de LinearLayoutManager tambien hay GridLayoutManager ---EN CUADRICULA
        val layoutManager = LinearLayoutManager(this)
        val adapter = ListaPersonajesAdapter(listaPersonajes)

        //Asocio el RecyclerView con sus componentes
        binding.rvListaPersonajes.adapter = adapter
        binding.rvListaPersonajes.layoutManager = layoutManager
    }
}