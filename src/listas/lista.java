package listas;

public class lista 
{
    private int tamanio = 0;
    private nodo primero;
    private nodo aux;
    
    lista()
    {
        primero = null;
    }
    
    public void mostrarElementosInv()
    {
        inverso(primero);
    }
    
    private void inverso(nodo primero)
    {
        if(primero==null)
            return;
        else
            inverso(primero.siguiente);
        
        System.out.println(primero.getDato());
    }
    
    public void insertarFinal(int dato)
    {
        nodo temp = new nodo(dato);
        nodo ultimo = primero;
        while(ultimo.siguiente!=null)
        {
            //System.out.println(ultimo.getDato());
            ultimo = ultimo.siguiente;
        }
        ultimo.siguiente = temp;
        //aux = primero;
    }
    public void insertar(int dato)
    {
        nodo temp = new nodo(dato);
        temp.siguiente = primero;
        primero = temp;
        tamanio++;
    }
    
    public void mostrarElementos()
    {
        if(verificarVacia())
            System.out.println("La lista está vaciá!!!");
        else
        {
            nodo dato = primero;
            while(dato != null)
            {
                System.out.println(dato.getDato());
                dato = dato.siguiente;
            }
        }
    }
    
    public boolean verificarVacia()
    {
        if(primero==null)
            return true;
        return false;
    }
    
    public void eliminarNodo()
    {
        if(verificarVacia())
            System.out.println("No hay más elementos");
        else
        {
            int dato = primero.getDato();
            primero = primero.siguiente;
            tamanio--;
            System.out.println("Se elimino " + dato);
        }
    }
}
