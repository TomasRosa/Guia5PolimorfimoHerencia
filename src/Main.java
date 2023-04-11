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
}