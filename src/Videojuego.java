import java.util.ArrayList;

public class Videojuego extends Contenido
{
    private double horasEstimadas = 10;
    private String compañia;
    public Videojuego()
    {
        super();
    }
    public Videojuego (String titulo, double horasEstimadas)
    {
        super(titulo);
        this.horasEstimadas = horasEstimadas;
    }
    public Videojuego (String titulo, double horasEstimadas, String genero, String compañia)
    {
        super(titulo,genero);
        this.horasEstimadas = horasEstimadas;
        this.compañia = compañia;
    }
    @Override
    public String toString()
    {
        return super.toString() + "Horas estimadas de juego: " + this.horasEstimadas + "Compañia: " + this.compañia;
    }
    @Override
    public int compareTo(Object a)
    {
        int retorno = 9000;

        if(a instanceof Videojuego)
        {
            if(((Videojuego) a).horasEstimadas > this.horasEstimadas)
            {
                retorno = 1;
            }
            else if (((Videojuego) a).horasEstimadas == this.horasEstimadas)
            {
                retorno = 0;
            }
            else
            {
                retorno = -1;
            }
        }
        else
        {
            System.out.println("No es un videojuego. ");
        }
        return retorno;
    }
    public Videojuego retornarSerieMasTemporadas (ArrayList<Videojuego> videojuegos)
    {
        Videojuego aRetornar = videojuegos.get(0);

        for(int i = 0; i < videojuegos.size(); i++)
        {
            if(aRetornar.compareTo(videojuegos.get(i)) == 1)
            {
                aRetornar = videojuegos.get(i);
            }
        }
        return aRetornar;
    }
    public int contarEntregadoVideoJuego (ArrayList<Videojuego> videoJuego)
    {
        int contar = 0;

        for (int i = 0; i < videoJuego.size(); i++)
        {
            if(videoJuego.get(i).getEntregado() == true)
            {
                contar++;
            }
        }
        return contar;
    }
}
