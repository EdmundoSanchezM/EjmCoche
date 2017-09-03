/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocheejm;

/**
 * <h1>TdCoche</h1>
 * 
 * <p>Clase que hereda de DtCoche, crea un auto de cualquier marca que usa gasolina </p>
 * 
 * @author Sanchez Mendez Edmundo Josue
 * @version 1.0.0
 * @since 02-09-2017
 */
public class TdCoche extends DtCoche{
    
    private String NCarro;
    private int capMaxAcelerar;
    private int gas;
    
    /**
    * <h3>Constructor</h3>
    * Este constructor inicializa la clase con solo el modelo
    * 
    * @param Ncarro String del nombre del carro
    */
    //Ejemplo de clase vacia
    public TdCoche (String Ncarro){
        this.NCarro=Ncarro;
        this.capMaxAcelerar=0;
        this.gas=0;
    }
    
    /**
    * <h3>Constructor</h3>
    * Este constructor inicializa la clase con el modelo, la gasolina que tiene y la aceleraacion del carro
    * Regularmente un tanque puede ser llenado hasta los 20 lts;
    * 
    * @param NCarro Nombre del carro
    * @param gas Número que señala cuantos litros tiene el tanque 
    * @param capMaxAcelerar Numero que nos señala la aceleracion del carro
    * @throws java.lang.Exception
    */
    
    public TdCoche(String NCarro,int capMaxAcelerar,int gas) throws Exception{
        if(gas<0||gas<20){
            throw new Exception();
        }
        this.NCarro=NCarro;
        this.capMaxAcelerar=capMaxAcelerar;
        this.gas=gas;
    }
    //Ejemplo de sobreescritura de método abstracto
    
    /**
    * <h3>Comprar carro</h3>
    * Implementacion del método abstracto comprar de DtCoche, reasigna al propietario
    * e imprime la compra en pantalla
    * 
    * @param Nombrep Nombre de la persona que compro el carro
    */
   @Override
    public void comprar(String Nombrep) {
        this.setNombrep(Nombrep);
        System.out.println(Nombrep + " ha comprado el auto");
    }
    
    /**
    * <h3>Encender el carro</h3>
    * Imprime que el carro ha sido encendido en caso de tener como minimo 1 lt de gasolina
    */
    public void Inicio(){
        if(this.gas<=20){
            System.out.println("Tiene el tanque lleno hasta"+this.gas+",podra funcionar su carro");
        }else{
            if(gas+this.gas>20){
                System.out.println("Capacidad maxima para su tanque, aun asi podra funcionar");
            }else{
                System.out.println("Pongale gasolina a su carro no tiene");
            }
        }
    }
    
    /**
    * <h3>Acelerar</h3>
    * Lee la aceleracion del carro y manda mensaje si tiene una aceleracion adecuada o no
    * 
    */
    public void Acelerar(){
        if(this.capMaxAcelerar>=180){
            System.out.println("Cuidado se va a matar");
        }else{
            System.out.println("Usted es un buen conductor");
        }
    }
    //Getterz y Setters
    public int getCapMaxAcelerar() {
        return capMaxAcelerar;
    }
    public void setCapMaxAcelerar(int capMaxAcelerar) {
        this.capMaxAcelerar = capMaxAcelerar;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}

