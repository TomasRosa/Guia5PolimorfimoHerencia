import java.util.ArrayList;

public abstract class Contenido
{
    private String titulo;
    private Boolean entregado = false;
    private String genero;

    public Contenido ()
    {
    }
    public Contenido (String titulo, String genero)
    {
        this.titulo = titulo;
        this.genero = genero;
    }
    public  Contenido (String titulo)
    {
        this.titulo = titulo;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public Boolean getEntregado()
    {
        return entregado;
    }

    public void setEntregado(Boolean entregado)
    {
        this.entregado = entregado;
    }

    @Override
    public String toString()
    {
        return "Contenido{" +
                "titulo='" + titulo + '\'' +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                '}';
    }
    public void entregar ()
    {
        this.entregado = true;
    }
    public void devolver ()
    {
        this.entregado = false;
    }
    public Boolean isEntregado ()
    {
        return this.entregado;
    }
    public abstract int compareTo (Object a);


}
