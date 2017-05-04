
/**
 * Write a description of interface Granja here.
 * 
 * @author Oscar Charro Rivera (oschariv)
 * @version 1.0 (Revision 04/05/2017)
 */

public class Granja
{
    public void alimentar(Animal animal){
        if(animal.getPuntosDeVida()>0){
            animal.comer();
        }
    }
    
    public void vacunar(Vacunable animal){
        animal.vacunar();
    }
    
    public void emitirSonidoCaracteristico(Animal animal){
        animal.emitirSonidoCaracteristico();
    }
}
