import java.security.SecureRandom;

public class Password
{
    private int longitud = 8;
    private String contraseña;

    public Password ()
    {
        this.contraseña = generarPassword();
    }
    public Password (int longitud)
    {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    public int getLongitud()
    {
        return longitud;
    }

    public String getContraseña()
    {
        return contraseña;
    }

    public void setLongitud(int longitud)
    {
        this.longitud = longitud;
    }

    public String generarPassword ()
    {
        String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder(this.longitud);

        for (int i = 0; i < this.longitud; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        String contrasenia = sb.toString();
        return contrasenia;
    }
    public Boolean esFuerte ()
    {
        int mayuscula = 0;
        int minuscula = 0;
        int numeros = 0;

        for(int i = 0; i < this.contraseña.length(); i++)
        {
            char c = this.contraseña.charAt(i);

            if(Character.isUpperCase(c))
            {
                mayuscula++;
            }
            if(Character.isLowerCase(c))
            {
                minuscula++;
            }
            if(Character.isDigit(c))
            {
                numeros++;
            }
        }
        if(mayuscula > 2 && minuscula > 1 && numeros > 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
