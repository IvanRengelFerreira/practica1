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
            //Generamos un punto aleatorio en el cuadrado de lado 1
            //Para ello generamos dos números aleatorios entre 0 y 1
            double x = Math.random();
            double y = Math.random();
            //Calculamos la distancia del punto al centro del cuadrado con el teorema de Pitágoras
            double distancia = Math.sqrt(x * x + y * y);
            if(distancia < 1.0){
                dentroCirculo++;
            }
        }
        //La probabilidad de que un punto aleatorio caiga dentro del círculo es igual al área del círculo dividido por el área del cuadrado
        //Como el círculo tiene radio 1, su área es pi
        return 4.0 * dentroCirculo / pasos;
    }
}