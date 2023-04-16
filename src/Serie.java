import java.util.ArrayList;

public class Serie extends Contenido
{
    private int nTemporadas = 3;
    private String creador;

    public Serie ()
    {
        super();
    }
    public Serie (String titulo, int nTemporadas, String genero, String creador)
    {
        super(titulo,genero);
        this.nTemporadas = nTemporadas;
        this.creador = creador;
    }
    public Serie (String titulo, String creador)
    {
        super(titulo);
        this.creador = creador;
    }

    public int getnTemporadas()
    {
        return nTemporadas;
    }

    public void setnTemporadas(int nTemporadas)
    {
        this.nTemporadas = nTemporadas;
    }
    public String getCreador()
    {
        return creador;
    }
    public void setCreador(String creador)
    {
        this.creador = creador;
    }
    @Override
    public String toString()
    {
        return super.toString() + "N temporadas: " + this.nTemporadas + "Creador: " + this.creador;
    }
    public int contarEntregadoSerie (ArrayList<Serie> serie)
    {
        int contar = 0;

        for (int i = 0; i < serie.size(); i++)
        {
            if(serie.get(i).getEntregado() == true)
            {
                contar++;
            }
        }
        return contar;
    }
    @Override
    public int compareTo(Object a)
    {
        int retorno = 9000;

        if(a instanceof Serie)
        {
            if(((Serie) a).nTemporadas > this.nTemporadas)
            {
                retorno = 1;
            }
            else if (((Serie) a).nTemporadas == this.nTemporadas)
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
            System.out.println("El objeto pasado por parametro no es una serie.");
        }
        return retorno;
    }
    public Serie retornarSerieMasTemporadas (ArrayList<Serie> series)
    {
        Serie aRetornar = series.get(0);

        for(int i = 0; i < series.size(); i++)
        {
            if(aRetornar.compareTo(series.get(i)) == 1)
            {
                aRetornar = series.get(i);
            }
        }

        return aRetornar;
    }
}
