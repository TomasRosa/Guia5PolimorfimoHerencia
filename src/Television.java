public class Television extends  Electrodomesticos
{
    private double resolucion = 20;
    private Boolean sintonizador = false;

    public Television ()
    {
        super();
    }
    public Television (double precio, double peso)
    {
        super(precio, peso);
    }
    public Television (double resolucion, Boolean sintonizador)
    {
        super();
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion()
    {
        return resolucion;
    }

    public Boolean getSintonizador()
    {
        return sintonizador;
    }

    @Override
    public void precioFinal()
    {
        super.precioFinal();
        double guardarValor = 0;
        if(this.resolucion > 40)
        {
            guardarValor = getPrecio() * 0.3;
            setPrecio(getPrecio()+guardarValor);
        }
        if(this.sintonizador == true)
        {
            setPrecio(getPrecio()+50);
        }
    }
}
