
/**
 * Write a description of class Animal here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0 (Revision 04/05/2017)
 */
public abstract class Animal
{
    private int peso;
    private int puntosDeVida;
    private String sonidoCaracteristico;
    private static final int PUNTOS_VIDA_INICIALES = 100;
    private static final int PUNTOS_VIDA_PERDIDOS_POR_COMER = 10;

    /**
     * Constructor para objetos de la clase Animal
     * @param peso Peso inicial del animal.
     * @param sonido Sonido caracteristico del animal.
     */
    public Animal(int peso, String sonido){
        sonidoCaracteristico = sonido;
        this.peso = peso;
        puntosDeVida = PUNTOS_VIDA_INICIALES;
    }

    public void comer(){
        puntosDeVida -= PUNTOS_VIDA_PERDIDOS_POR_COMER;
    }

    public void emitirSonidoCaracteristico(){
        System.out.println(sonidoCaracteristico);
    }

    public int getPeso(){
        return peso;
    }

    public int getPuntosDeVida(){
        return puntosDeVida;
    }
    
    public void variarPeso(int nuevoPeso){
        peso += nuevoPeso;
    }
    
    protected void variarPuntosDeVida(int variacionPuntosVida)
    {
       puntosDeVida += variacionPuntosVida;
    }
}
