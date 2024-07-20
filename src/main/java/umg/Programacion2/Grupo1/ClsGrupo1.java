package umg.Programacion2.Grupo1;

import jdk.dynalink.beans.StaticClass;

public class ClsGrupo1 {
    public static double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double circunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
}
  public class  cubo {
    public static double volumen(double lado){
        return Math.pow(lado, 3);
    }
}
