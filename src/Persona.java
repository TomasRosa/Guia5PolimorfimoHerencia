import java.util.Random;
public class Persona
{
    ///Constante
    private static final char sexoPredeterminado = 'h';
    public static final int saludable = -1;
    public static final int bajoPeso = 0;
    public static final int sobrePeso = 1;
    private String nombre;
    private int edad;
    private long dni = generarDNI();
    private char sexo = sexoPredeterminado;

    private double peso;
    private double altura;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Persona ()
    {
        this.dni = generarDNI();
    }
    public Persona (String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generarDNI();
    }
    public Persona (String nombre, int edad,char sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularImc ()
    {
        double formula = 0;
        double alturaEnMetros = this.altura/100;

        formula = this.peso / (alturaEnMetros * alturaEnMetros);

        if(formula < 20)
        {
            return saludable;
        }
        else if(formula >= 20 && formula<= 25)
        {
            return bajoPeso;
        }
        else
        {
            return sobrePeso;
        }
    }
    public boolean esMayorDeEdad ()
    {
        if(this.edad > 17)
        {
            System.out.println("Es mayor de edad.");
            return true;
        }
        else
        {
            System.out.println("Es menor de edad.");
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    public static int generarDNI()
    {
        Random rand = new Random();
        int numero = rand.nextInt(90000000) + 10000000; // Genera un número de 8 dígitos
        return numero;
    }
    public void EstadoDeSalud ()
    {
        if(calcularImc() == saludable)
        {
            System.out.println("Persona saludable.");
        }
        else if (calcularImc() == sobrePeso)
        {
            System.out.println("Persona con sobrepeso.");
        }
        else if(calcularImc() == bajoPeso)
        {
            System.out.println("Persona en bajo peos.");
        }
    }
}
