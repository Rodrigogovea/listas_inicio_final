package listas;
import java.util.Scanner;
public class Listas 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        lista miLista = new lista();
        Scanner lector = new Scanner(System.in);
        int opc = 0;
        int dato = 0;
        int salida = 0;
        do
        {
            System.out.println("Menu de opciones");
            System.out.println("1.- Agregar un elemento");
            System.out.println("2.- Agregar un elemento al final");
            System.out.println("3.- Mostrar elementos");
            System.out.println("4.- Mostrar elementos de forma inversa");
            System.out.println("5.- Eliminar un elemento");
            System.out.println("6.- Eliminar elemento al final");
            System.out.println("7.- Eliminar un elemento específico");
            System.out.println("8.- Salir");
            opc = lector.nextInt();
            switch(opc)
            {
                case 1:
                    System.out.println("Teclea el número que deseas ingresar: ");
                    dato = lector.nextInt();
                    miLista.insertar(dato);
                break;
                case 2:
                    System.out.println("Teclea el número que deseas ingresar: ");
                    dato = lector.nextInt();
                    miLista.insertarFinal(dato);
                break;
                case 3:
                    miLista.mostrarElementos();
                break;
                case 4:
                    miLista.mostrarElementosInv();;
                break;
                case 5:
                    miLista.eliminarNodo();
                break;
                case 6:
                    miLista.eliminarFinal();
                break;
                case 7:
                    if(miLista.verificarVacia())
                        System.out.println("La lista está vacía");
                    else
                    {
                        miLista.mostrarElementos();
                        System.out.println("Teclea el dato que deseas eliminar: ");
                        dato = lector.nextInt();
                        miLista.eliminarNodo(dato);
                    }
                break;
                case 8:
                    System.out.println("Confirma que deseas salir");
                    System.out.println("1.- Sì \n2.-No");
                    salida = lector.nextInt();
                    if(salida==1)
                        opc = 8;
                break;
                default:
                    System.out.println("Lo siento amigo, esa opción aún no esta lista...");
                break;
            }
        }while(opc!=8);
        lector.close();
    }
}