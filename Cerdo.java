
/**
 * Write a description of class Cerdo here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0 (Revision 04/05/2017)
 */
public class Cerdo extends Mamifero implements Vacunable
{
    private static final int PESO_INICIAL = 15;
    private static final String SONIDO = "Ñoik, ñoik";  
    private static final int PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION = 20; 

    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        super(PESO_INICIAL, SONIDO);
    }

    public void vacunar(){
        variarPuntosDeVida(PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION);
    }
}
