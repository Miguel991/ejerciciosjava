package com.codigo.ejercicios;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class FactorialRecusivo {
	
	public static double factorial(int factorial){
		if(factorial != 0) { return factorial(factorial-1)*factorial;}else{return 1;}
	}
	
	public static double factorialIterativo(int factorial){
		double valor = 0;
		double cont = 1;
		for(int i = 1;i<factorial;i++){
			valor = cont * (i+1);
			cont = valor;
		}
		return valor;
	}
	
	public static void main(String[] args){
		
		System.out.println(factorial(5));
		System.out.println(factorialIterativo(5));
		cargarImage();
	}
	
	private static Image imagen;
	
	public static void cargarImage(){
		
		try {
			imagen = ImageIO.read(new File("ssd"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
