
/**
 * Write a description of interface Granja here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0
 */

public class Granja
{
    public void comer(Animal animal){
        animal.comer();
    }
    
    public void emitirSonidoCaracteristico(Animal animal){
        animal.emitirSonidoCaracteristico();
    }
    
    public int getPeso(Animal animal){
        return animal.getPeso();
    }
    
    public int getPuntosDeVida(Animal animal){
        return animal.getPuntosDeVida();
    }
    
    public void vacunar(Vacunable animal){
        animal.vacunar();
    }
}
