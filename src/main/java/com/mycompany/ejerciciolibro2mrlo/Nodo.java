/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciolibro2mrlo;

/**
 *
 * @author Hermes
 */
public class Nodo
{
int dato;
Nodo enlace;
public Nodo(int x)
{
 dato = x;
 enlace = null;
}
public Nodo(int x, Nodo n)
{
 dato = x;
 enlace = n;
}
public int getDato()
{
 return dato;
}
public Nodo getEnlace()
{
 return enlace;
}
public void setEnlace(Nodo enlace)
{
 this.enlace = enlace;
}
} 