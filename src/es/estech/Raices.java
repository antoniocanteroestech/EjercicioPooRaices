package es.estech;

//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2o grado.
//Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//Hay que insertar estos 3 valores para construir el objeto.
//Las operaciones que se podrán hacer son las siguientes:
//        - obtenerRaices(): imprime las 2 posibles soluciones
//        - obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución posible.
//        - getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, (b^2)-4*a*c
//        - tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
//        - tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
//        - calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuación, en caso de no existir solución, mostrarlo también.


import java.util.Arrays;

public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminante(){
        return (getB()*getB())-(4*getA()*getC());
    }

    public boolean tieneRaices (){
        //si el determinante es mayor de 0 la ecuación tiene 2 soluciones (raices)
        if( (getDiscriminante()) > 0){
            return true;
        }
        return false;
    }

    public boolean tieneRaiz (){
        //si el determinante es igual a 0 la ecuación tiene 1 solución (raiz)
        if( (getDiscriminante()) == 0){
            return true;
        }
        return false;
    }

    public void obtenerRaices(){
        double[] raices = new double[2];
        raices[0] = (-getB() + ( Math.sqrt(getDiscriminante())) ) / (2*getA());
        raices[1] = (-getB() - ( Math.sqrt(getDiscriminante())) ) / (2*getA());

        System.out.println("La ecuación tiene dos soluciones");
        for (double raiz : raices){
            System.out.println(raiz);
        };
    }

    public void obtenerRaiz(){
        double raiz = (-getB() + ( Math.sqrt(getDiscriminante())) ) / (2*getA());

        System.out.println("La ecuación tiene una solución");
        System.out.println(raiz);


    }

    public void calcular() {

        if(tieneRaiz()){
            obtenerRaiz();
        } else if (tieneRaices()){
            obtenerRaices();
        } else {
            System.out.println("La ecuación no tiene solución");
        }

    }
}



