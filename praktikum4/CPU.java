/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpu;

/**
 *
 * @author user
 */
public class CPU {
	double price;
	 // nested class
	 class Processor{
	 // members of nested class
	 double cores;
	 String manufacturer;
	 double getCache(){
	 return 4.3;
	 }
	 }
	 // nested protected class
	 protected class RAM{
	 // members of protected nested class
	 double memory;
	 String manufacturer;
	 double getClockSpeed(){
	 return 5.5;
	 }
   }
}