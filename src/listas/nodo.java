package listas;
public class nodo 
{
    private int dato;
    nodo siguiente;
    nodo(int valor)
    {
        this.dato = valor;
        siguiente = null;
    }
    public int getDato()
    {
        return this.dato;
    }
}
