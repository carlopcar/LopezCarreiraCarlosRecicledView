package com.example.myapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.model.entities.Personaje
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // LayoutManager layoutManager = new LinearLayoutManager(this)
        val layoutManager = LinearLayoutManager(this)



        val p = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        val p2 = Personaje(0, "Samwell", "Tarly", "Samwell Tarly", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        val p3 = Personaje(0, "Jon", "Snow", "Jon Snow", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        val p4 = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")
        val p5 = Personaje(0, "Daenerys", "Targaryen", "Mother of Dragons", "House Targaryen", "https://thronesapi.com/assets/images/daenerys.jpg")

        val listaPersonajesGot = listOf(p , p2 , p3 ,p4 ,p5)
    }
}