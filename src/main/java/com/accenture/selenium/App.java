package com.accenture.selenium;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Gmail enviarCorreo = new Gmail(); // instanciando el objeto de la clase Gmail para que se pueda ejecutat la automatización
    	enviarCorreo.IrSantiago(); // llamando el metodo que contiene las tareas y la automatización.
    	
    	/*Duolingo duo = new Duolingo();
    	duo.AbrirDuolingo();*/
    }
}
