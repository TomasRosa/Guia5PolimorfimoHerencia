import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese que ejercicio desea ver. ");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1(scan);
                break;
            }
            case 2:
            {
                ejercicio2(scan);
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
            case 4:
            {
                ejercicio4();
                break;
            }
        }
    }
    public static void ejercicio1 (Scanner scan)
    {
        System.out.println("Ingresa el nombre: ");
        scan.nextLine();
        String nombre = scan.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = scan.nextInt();
        System.out.println("Ingresa tu sexo: ");
        char sexo = scan.next().charAt(0);
        System.out.println("Ingresa tu peso. ");
        double peso = scan.nextDouble();
        System.out.println("Ingresa tu altura en centimetros. ");
        double altura = scan.nextDouble();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Jorge");
        persona3.setEdad(47);
        persona3.setSexo('h');
        persona3.setPeso(90);
        persona3.setAltura(180);

        System.out.println("PERSONA 1, CREADA CON ATRIBUTOS X CONSOLA");
        String personaString1 = persona1.toString();
        System.out.println(personaString1);
        persona1.EstadoDeSalud();
        persona1.esMayorDeEdad();

        System.out.printf("PERSONA 2 CREADA CON NOMBRE EDAD Y SEXO, LOS DEMAS POR DEFECTO");
        String persona2String = persona2.toString();
        System.out.println(persona2String);
        persona2.EstadoDeSalud();
        persona2.esMayorDeEdad();

        System.out.println("PERSONA 3 CREADA CON CONSTRUCTOR VACIO, PERO SETEO.");
        String persona3String = persona3.toString();
        System.out.println(persona3String);
        persona3.EstadoDeSalud();
        persona3.esMayorDeEdad();
    }
    public static void ejercicio2(Scanner scan)
    {
        System.out.println("Ingresa el tamaño que quieres que tenga el arreglo. ");
        int dimension = scan.nextInt();
        System.out.println("Ingresa la longitud que quieres que tengan las contraseñas. ");
        int longitud = scan.nextInt();

        Password[] arregloContraseñas = new Password[dimension];
        Boolean[] arregloBooleanos= new Boolean[dimension];

        for(int i = 0; i < arregloContraseñas.length; i++)
        {
            Password contraseña = new Password(longitud);
            arregloContraseñas[i] = contraseña;

            arregloBooleanos[i] = arregloContraseñas[i].esFuerte();
            System.out.println("Contraseña: " + arregloContraseñas[i].getContraseña() + "Es fuerte? " + arregloBooleanos[i]);
        }
    }
    public static void ejercicio3 ()
    {
        ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<Electrodomesticos>();

       Television tele1 = new Television(100,true);
       Television tele2 = new Television(100,false);
       Lavadora lava1 = new Lavadora();
       Lavadora lava2 = new Lavadora();

       electrodomesticos.add(tele1);
       electrodomesticos.add(tele2);
       electrodomesticos.add(lava1);
       electrodomesticos.add(lava2);

       double sumaTotal = 0;

       for(Electrodomesticos mueble: electrodomesticos)
       {
           mueble.precioFinal();
           sumaTotal = sumaTotal + mueble.getPrecio();

           if(mueble instanceof Television)
           {
               mueble.precioFinal();
               System.out.println("Precio Televisor: " + mueble.getPrecio());
           }
           else if (mueble instanceof Lavadora)
           {
               mueble.precioFinal();
               System.out.println("Precio Lavadora: " + mueble.getPrecio());
           }
       }
        System.out.println("Precio de todo: " + sumaTotal);
    }
    public static void ejercicio4 ()
    {
        ArrayList<Serie> arregloSeries = new ArrayList<Serie>();
        ArrayList<Videojuego> arregloJuegos = new ArrayList<Videojuego>();

        Serie serie = new Serie();
        Videojuego videojuego = new Videojuego();

        Serie serie1 = new Serie("Oye Arnold",3,"humor","tomas rosa");
        Serie serie2 = new Serie("Hannah Montana",5,"humor","tomas rosa");
        Serie serie3 = new Serie("Rapidos y Furiosos",8,"accion","tomas rosa");
        Videojuego videojuego1 = new Videojuego("Assasins Creed",180,"aventura","PlayStation");
        Videojuego videojuego2 = new Videojuego("League of Legends",12000,"MOBA","Riot Games");
        Videojuego videojuego3 = new Videojuego("WoW",1500,"MOBA","Blizzard");

        serie1.entregar();
        videojuego2.entregar();

        arregloSeries.add(serie1);
        arregloSeries.add(serie2);
        arregloSeries.add(serie3);
        arregloJuegos.add(videojuego1);
        arregloJuegos.add(videojuego2);
        arregloJuegos.add(videojuego3);

        int contarSerie = serie.contarEntregadoSerie(arregloSeries);
        int contarVideoJuego = videojuego.contarEntregadoVideoJuego(arregloJuegos);
        int contadorTotal = contarSerie + contarVideoJuego;

        System.out.println("Contador de entregados serie: " + contarSerie);
        System.out.println("Contador de entregados videoJuego: " + contarVideoJuego);
        System.out.println("Contador de entregados totales: " + contadorTotal);

        Serie masTemporadas = serie.retornarSerieMasTemporadas(arregloSeries);
        Videojuego masHoras = videojuego.retornarSerieMasTemporadas(arregloJuegos);

        System.out.println(masTemporadas.toString());
        System.out.println(masHoras.toString());

    }
}