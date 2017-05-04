
/**
 * Write a description of class Vaca here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0 (Revision 04/05/2017)
 */
public class Vaca extends Mamifero implements Vacunable
{
    private static final int PESO_INICIAL = 25;
    private static final String SONIDO = "Muuu Muuu";
    private static final int PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION = 30; 

    /**
     * Constructor for objects of class Vaca
     */
    public Vaca()
    {
        super(PESO_INICIAL, SONIDO);
    }

    public void vacunar(){
        variarPuntosDeVida(PUNTOS_DE_VIDA_GANADOS_POR_VACUNACION);
    }
}
