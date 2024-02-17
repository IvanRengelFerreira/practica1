package mates;

public class Matematicas{
    
    /*** Genera una aproximació n al número pi mediante el mé todo de* Montecarlo. El parámetro ` pasos` indica el número de puntos generado.*/
    //El método es estático, ya que no necesitamos crear un objeto de la clase Matematicas para poder usarlo
    
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo. El parámetro `pasos` indica el número de puntos generados.
     * 
     * @param pasos El número de puntos generados.
     * @return Una aproximación al número pi.
     */
    public static double generarNumeroPiIterativo(long pasos){
        long dentroCirculo = 0;
        for(long i = 0; i < pasos; i++){
            double x = Math.random();
            double y = Math.random();
            double distancia = Math.sqrt(x * x + y * y);
            if(distancia < 1.0){
                dentroCirculo++;
            }
        }
        return 4.0 * dentroCirculo / pasos;
    }
}