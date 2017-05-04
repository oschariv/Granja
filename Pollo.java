
/**
 * Write a description of class Pollo here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0
 */
public class Pollo extends Animal implements Vacunable
{
    // instance variables - replace the example below with your own
    private int peso;
    private static final int PESO_INICIAL = 2;
    private int vida;
    private static final int VIDA_INICIAL = 100;

    /**
     * Constructor for objects of class Pollo
     */
    public Pollo()
    {
        peso = PESO_INICIAL;
        vida = VIDA_INICIAL;
    }

    public void comer(){
        peso += 1;
        vida -= 10;
    }
    
    public void emitirSonidoCaracteristico(){
        System.out.println("Pio Pio");
    }
    
    public int getPeso(){
        return peso;
    }
    
    public int getPuntosDeVida(){
        return vida;
    }
    
    public void vacunar(){
        vida += 10;
    }
}
