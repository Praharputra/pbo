/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motherboardaksi;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class MotherboardAksi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Motherboard.USB usb = new Motherboard.USB();
		usb.usb2 = input.nextInt();
		usb.usb3 = input.nextInt();
		System.out.println("Total Ports = " +usb.getTotalPorts());
	}

}