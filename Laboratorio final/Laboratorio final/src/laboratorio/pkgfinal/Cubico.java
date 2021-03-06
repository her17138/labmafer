
package laboratorio.pkgfinal;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Id;
import org.bson.types.ObjectId;

/**
 *
 * @author jose
 */
@Entity
public class Cubico extends Tanque
{
     //Atributos 
    private double lado;
    
    public Cubico(){}

    
    /**
     * Constructor for objects of class Cubico
     * @param lado
     * @param identificacion
     * @param porcentaje
     * @param valvUso
     * @param volumen
     * @param enUso 
     */
    public Cubico(double lado, String identificacion, double porcentaje, int valvUso, double volumen, boolean enUso) {
        super(identificacion, porcentaje, valvUso, volumen, enUso);
        this.lado = lado;
    }
    
    
    
    @Override
    public void volumen()
    {
        volumen=lado*lado*lado;
    }
    
    
}
