
/**
 * Write a description of class Ave here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0 (Revision 04/05/2017)
 */
public abstract class Ave extends Animal
{
    // instance variables - replace the example below with your own
    private static final int GANANCIA_PESO_POR_COMER = 1;
    
    /**
     * Constructor for objects of class Ave
     */
    public Ave(int peso, String sonido)
    {
        super(peso, sonido);
    }

    public void comer(){
        variarPeso(GANANCIA_PESO_POR_COMER);
    }
}
