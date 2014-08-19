/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author janeth
 */
public class Nodo {
  private Object dato;
  private Nodo siguiente;
public Nodo(){
    this.dato=null;
    this.siguiente=null;
}
public Nodo(Object inputData)
{
    this.dato=inputData;
    this.siguiente=null;
}
public void establecedato(Object datos)
{
    this.dato=datos;
}
public Object obtenerdato()
{
    return dato;
}
public void establecenodo(Nodo nodo)
{
    this.siguiente=nodo;
}
public Nodo obtenersiguiente()
{
    return siguiente;
}
  
}
