/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_trading;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author user
 */
public class Accion {
    
    
    private String simbolo;
    private String fecha;
    private double max, min, cierre;
    
    public Accion(double max, double min, double cierre){
        
        this.fecha = LocalDate.now().toString();
        this.max = max;
        this.min = min;
        this.cierre = cierre;
    }
    @Override
    public boolean equals(Object o){
        
        
        if(o== null)
            return false;
        
        if(!(o instanceof Accion))
            return false;
        
        Accion a = (Accion)o;
        
        if(a.fecha.equals(this.fecha) && a.min == this.min && a.max == this.max && a.cierre == this.cierre) 
            return true;
        
        return false;
        
        
    }
    
    @Override
    public String toString(){
        
        
        return "Maximo: " + this.max + "Minimo: " + this.min;
    }
    
    public double variacionDiaria(){
        
        return this.max - this.min;
    }
    
    public Accion leerAccion(){
        double max, min, cierre;
        
        Accion a;
        max = StdIn.readDouble();
        min = StdIn.readDouble();
        cierre = StdIn.readDouble();
        
        a = new Accion(max, min, cierre);
        return a;
    }
    
    
    public static void main(String args[]){
        
        Accion a1 = new Accion(20, 5, 100);
        Accion a2 = new Accion(20, 5, 100);
        
        StdOut.println(a1.fecha + " "+ a2.fecha);
        StdOut.println(a1.toString());
        StdOut.println(a2.toString());
        StdOut.println(a1.equals(a2));
        
        
    }
}
