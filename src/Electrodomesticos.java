public class Electrodomesticos
{
    public final String colorConst = "Blanco";
    public final char consumoConst = 'F';
    public final double precioConst = 100;
    public final double pesoConst = 5;

    private double precio = precioConst;
    private String color = colorConst;
    private char consumo = consumoConst;
    private double peso = pesoConst;

    public Electrodomesticos ()
    {

    }
    public Electrodomesticos(double precio, double peso)
    {
        this.precio = precio;
        this.peso = peso;
    }
    public Electrodomesticos (double precio, String color, char consumo, double peso)
    {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso  = peso;
    }

    public double getPrecio()
    {
        return precio;
    }

    public String getColor()
    {
        return color;
    }

    public char getConsumo()
    {
        return consumo;
    }

    public double getPeso()
    {
        return peso;
    }
    public void comprobarConsumoEnergia ()
    {
        if(this.consumo != 'A' || this.consumo != 'B' || this.consumo != 'C' || this.consumo != 'D' || this.consumo != 'E' || this.consumo != 'F')
        {
            this.consumo = this.consumoConst;
        }
    }
    public void comprobarColor ()
    {
        if(this.color  != "Blanco" || this.color != "Negro" ||this.color != "Rojo" ||this.color != "Azul" ||this.color != "Gris")
        {
            this.color = colorConst;
        }
    }
    public void precioFinal ()
    {
        double guardarLetra = 0;
        double guardarTamaño = 0;

        if(this.consumo == 'A')
        {
            guardarLetra = 100;
        }
        else if(this.consumo == 'B')
        {
            guardarLetra = 80;

        }
        else if(this.consumo == 'C')
        {
            guardarLetra = 60;

        }
        else if(this.consumo == 'D')
        {
            guardarLetra = 50;

        }
        else if(this.consumo == 'E')
        {
            guardarLetra = 30;

        }
        else if(this.consumo == 'F')
        {
            guardarLetra = 10;

        }

        if(this.peso > 0 && this.peso < 20)
        {
            guardarTamaño = 10;
        }
        if(this.peso >= 20 && this.peso < 50)
        {
            guardarTamaño = 50;
        }
        if(this.peso >= 50 && this.peso < 80)
        {
            guardarTamaño = 80;
        }
        if(this.peso >= 80)
        {
            guardarTamaño = 100;
        }
        this.precio = guardarLetra + guardarTamaño;
    }
}
