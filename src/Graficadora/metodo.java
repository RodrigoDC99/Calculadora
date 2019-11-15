
package Graficadora;


public class metodo {
    public double raiz(funcion f, double x0,double x1, int c,double e )  //para calcular la raiz
             // funcion f ==> FUNCION CREADA EN LA CLASE FUNCION
             // X0 Y X1  ==> PARAMETROS 
             // int c ==> numero de ciclos maximos q se va a permitir en el metodo
             // double e==> error ermito para considerar que se encontro la raiz
    {
       double r=Double.NaN; // variable r que va a contener el valor de la raiz
                            // NaN==> si no se encuentra la raiz aparecera este valor en la casilla
       double x2=x0; // variable x2 para la interseccion del eje x
       int k=0; // variable q cuenta los ciclos q se llevan hasta encontrar la raiz
       while (Math.abs(f.evaluar(x2))>e&&k<c){ //este ciclo sirve para verificar que hemos llegado a la respuesta
            x2=x0-f.evaluar(x0)*(x1-x0)/(f.evaluar(x1)-f.evaluar(x0)); //calculando x2
            x0=x1;
            x1=x2;
            k++;
       }
       if(k<c){
            r=x2;
       }
       return r;//nos muetra el valor de la raiz
    }
    
}
