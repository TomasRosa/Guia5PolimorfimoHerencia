public class Lavadora extends Electrodomesticos
{
    public final int cargaConst = 5;
    private int carga = cargaConst;

    public Lavadora()
    {
        super();
    }
    public Lavadora (double precio, double peso)
    {
        super(precio,peso);
    }
    public Lavadora (int carga, double precio, String color, char consumo, double peso)
    {
        super(precio,color,consumo,peso);
        this.carga = carga;
    }
}
