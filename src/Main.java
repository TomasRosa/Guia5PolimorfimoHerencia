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

        Persona persona1 = new Persona(nombre,edad,Persona.generarDNI(),sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Jorge");
        persona3.setEdad(47);
        persona3.setSexo('h');
        persona3.setPeso(90);
        persona3.setAltura(180);

        int imc1 = persona1.calcularImc();
        int imc2 = persona2.calcularImc();
        int imc3 = persona3.calcularImc();

        System.out.println("PERSONA 1, CREADA CON ATRIBUTOS X CONSOLA");
        String personaString1 = persona1.toString();
        System.out.println(personaString1);

        if(imc1 == Persona.bajoPeso)
        {
            System.out.println("Persona en bajo peso. ");
        }
        else if(imc1 == Persona.sobrePeso)
        {
            System.out.println("Persona en sobre peso.");
        }
        else if(imc1 == Persona.saludable)
        {
            System.out.println("Persona saludable.");
        }

        if(persona1.esMayorDeEdad())
        {
            System.out.println("Es mayor de edad.");
        }
        else
        {
            System.out.println("No es mayor de edad.");
        }


        System.out.printf("PERSONA 2 CREADA CON NOMBRE EDAD Y SEXO, LOS DEMAS POR DEFECTO");
        String persona2String = persona2.toString();
        System.out.println(persona2String);

        if(imc2 == Persona.bajoPeso)
        {
            System.out.println("Persona en bajo peso. ");
        }
        else if(imc2 == Persona.sobrePeso)
        {
            System.out.println("Persona en sobre peso.");
        }
        else if(imc2 == Persona.saludable)
        {
            System.out.println("Persona saludable.");
        }

        if(persona2.esMayorDeEdad())
        {
            System.out.println("Es mayor de edad.");
        }
        else
        {
            System.out.println("No es mayor de edad.");
        }

        System.out.println("PERSONA 3 CREADA CON CONSTRUCTOR VACIO, PERO SETEO LO MISMO QUE PERSONA 1.");
        String persona3String = persona3.toString();
        System.out.println(persona3String);
        if(imc3 == Persona.bajoPeso)
        {
            System.out.println("Persona en bajo peso. ");
        }
        else if(imc3 == Persona.sobrePeso)
        {
            System.out.println("Persona en sobre peso.");
        }
        else if(imc3 == Persona.saludable)
        {
            System.out.println("Persona saludable.");
        }


        if(persona3.esMayorDeEdad())
        {
            System.out.println("Es mayor de edad.");
        }
        else
        {
            System.out.println("No es mayor de edad.");
        }
    }
}