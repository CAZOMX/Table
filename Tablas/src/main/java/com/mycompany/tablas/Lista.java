/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tablas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Lista
{

    public Nodo lista;
    private int cantNodos;

    public Lista()
    {
        this.lista = null;
        this.cantNodos = 0;
    }

    public Nodo getLista()
    {
        return lista;
    }

    public void setLista(Nodo lista)
    {
        this.lista = lista;
    }

    public int getCantNodos()
    {
        return cantNodos;
    }

    public void setCantNodos(int cantNodos)
    {
        this.cantNodos = cantNodos;
    }

    public void agregarNodo(int v)
    {
        Nodo nuevo = new Nodo(v,
                null);
        if (lista == null)
        {
            lista = nuevo;

        } else
        {
            Nodo aux = lista;
            while (aux.aptSiguiente != null)
            {
                aux = aux.aptSiguiente;
            }
            aux.aptSiguiente = nuevo;
        }
        cantNodos++;
    }

    public int[] imprimirLista()
    {
        Nodo aux = lista;
        int[] arreglo = new int[cantNodos];
        int j = 0;
        int i = 1;
        if (lista == null)
        {
            JOptionPane.showMessageDialog(null,
                    "lista Vacia.");

        } else
        {
            while (aux != null)
            {
                arreglo[j] = aux.getValor();
                aux = aux.aptSiguiente;
                i++;
                j++;
            }
        }
        return arreglo;
    }

}
