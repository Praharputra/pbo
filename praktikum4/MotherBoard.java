/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motherboard;

/**
 *
 * @author user
 */
public class MotherBoard {
	static class USB
	{
		int usb2;
		int usb3;
		int getTotalPorts()
		{
			return usb2 + usb3;
		}
	}
}
