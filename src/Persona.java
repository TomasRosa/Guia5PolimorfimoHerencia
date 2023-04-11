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

    }
    public Persona (String nombre, int edad, char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona (String nombre, int edad, long dni, char sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularImc ()
    {
        int valorARetornar = 9999;

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
            return true;
        }
        else
        {
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
        int numero = rand.nextInt(100000000); // Genera un número de 8 dígitos
        int digitoVerificador = numero % 23; // Calcula el dígito verificador
        return numero * 10 + digitoVerificador; // Agrega el dígito verificador al final
    }
}
