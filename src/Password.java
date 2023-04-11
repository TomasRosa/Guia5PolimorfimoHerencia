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
}
