/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablas;

/**
 *
 * @author Usuario
 */
public class Nodo
{

    private int valor;
    public Nodo aptSiguiente;

    public Nodo(int valor)
    {
        this.valor = valor;
        this.aptSiguiente = aptSiguiente;
    }

    public Nodo(int valor,
            Nodo N)
    {
        this.valor = valor;
        this.aptSiguiente = N;
    }

    public int getValor()
    {
        return valor;
    }

    public void setValor(int valor)
    {
        this.valor = valor;
    }

    public Nodo getAptSiguiente()
    {
        return aptSiguiente;
    }

    public void setAptSiguiente(Nodo aptSiguiente)
    {
        this.aptSiguiente = aptSiguiente;
    }

}
