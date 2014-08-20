/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author janeth
 */

public class arraylist {
    private int size;
    private int Maxsize;
    private int[]lista;
public arraylist()
{
    this.size=0;
    this.lista=new int[10];   
}
public arraylist(int Max)
{
    this.size=0;
    this.Maxsize=Max;
    this.lista=new int[Max];
}
public void agregarele(int e)
{
 if(this.size<this.Maxsize)
 {
     this.lista[this.size]=e;
     this.size++;
 } 
 else
 {
     throw new Error("Lista fuera de rango");  
}
 
}
public int getsize()
{
    return this.size;
}
public int devuelvedig(int ind)
{
    if(ind>=this.size)
    {
      throw new Error("Indice no válido"); 
    }
    else
    {
        return this.lista[ind];
    }
}
public void delete(int n)
{
  int i=0;
  while(i<this.size)
  {
      if (this.lista[i]==n)
  {
      this.lista[i]=0;
      
  }
      else
      {
          ++i;
      }
}
  
}
public boolean verficalistallena()
{
    int indice=0;
    while(indice<this.Maxsize)
    {
        if(this.lista[indice]!=0)
        {
            indice++;
        }
        else
        {
            if(this.lista[indice]==0)
            {
                return true;
            }
        }
    }
    return false;
}
public void inserteleposicion(int i,int ele)
{
    int pos=i;
    int tamaño=this.size;
    if (this.verficalistallena()!=true)
    {
        throw new Error("lista llena");
    }
    else
    {
        while(tamaño>i)
        {
            this.lista[tamaño]=this.lista[tamaño-1];
            --tamaño;
        }
        this.lista[pos]=ele;
    }
}


public void imprimir()
{ 
   int ind=0;
   while(ind<this.Maxsize)
   {
       System.out.println(this.lista[ind]);
       ++ind;    
   }
}

    
}
