
/**
 * Write a description of class Mamifero here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0 (Revision 04/05/2017)
 */
public abstract class Mamifero extends Animal
{
    // instance variables - replace the example below with your own
    private static final int GANANCIA_PESO_POR_COMER = 2;

    /**
     * Constructor for objects of class Mamifero
     */
    public Mamifero(int peso, String sonido)
    {
        super(peso, sonido);
    }
    
    public void comer(){
        variarPeso(GANANCIA_PESO_POR_COMER);
    }
    
}
