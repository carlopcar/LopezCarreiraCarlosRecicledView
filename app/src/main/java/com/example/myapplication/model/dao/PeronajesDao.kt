package com.example.myapplication.model.dao

import com.example.myapplication.model.entities.Personaje

interface PeronajesDao {

    //public List <Personaje> getTodos/getAll/obtenerTodos();

    fun getTodos(): List<Personaje>


}