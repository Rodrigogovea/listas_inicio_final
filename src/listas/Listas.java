package listas;

public class Listas 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        lista miLista = new lista();
        
        miLista.insertar(10);
        miLista.insertar(20);
        miLista.insertar(30);
        miLista.insertar(40);
        
        miLista.insertarFinal(5);
        miLista.insertarFinal(4);
        miLista.insertarFinal(3);
        miLista.insertarFinal(2);
        miLista.insertarFinal(1);
//        
        miLista.mostrarElementos();
        System.out.println("");
        miLista.mostrarElementosInv();
        System.out.println("");
    }
}
