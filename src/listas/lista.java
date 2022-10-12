package listas;

public class lista 
{
    private int tamanio = 0;
    private nodo primero;
    
    lista()
    {
        primero = null;
    }

    public void eliminarFinal()
    {
        if(verificarVacia())
            System.out.println("No hay elementos!!!");
        else
        {
            nodo ultimo = primero;
            if(ultimo.siguiente == null)
                primero = null;
            else
            {
                nodo aux = ultimo.siguiente;
                while(aux.siguiente!=null)
                {
                    aux = ultimo.siguiente;
                    ultimo = ultimo.siguiente;
                }
                ultimo.siguiente = null;
            }
        }
    }

    public void eliminarNodo(int dato)
    {

    }
    
    public void mostrarElementosInv()
    {
        if(verificarVacia())
            System.out.println("No hay elementos en la lista");
        else
        {
            inverso(primero);
            System.out.println("");
        }
    }
    
    private void inverso(nodo primero)
    {
        if(primero==null)
            return;
        else
            inverso(primero.siguiente);
        
        System.out.print(primero.getDato() + ",");
    }
    
    public void insertarFinal(int dato)
    {
        if(verificarVacia())
            insertar(dato);
        else
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
                System.out.print(dato.getDato() + ",");
                dato = dato.siguiente;
            }
        }
        System.out.println("");
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
