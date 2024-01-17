package com.skilldistillery.remotecontrol;

import java.util.Scanner;

public class RemoteControl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		simulateRemoteControl(scanner);
	}

	private static void simulateRemoteControl(Scanner scanner) {
		System.out.println("To begin, turn on the remote control: (ON/OFF)");

		while (true) {
			String on = scanner.nextLine();

			if (on.equals("ON")) {
				turningOn();
				break;
			} else {
				System.out.println("Please turn on the remote control first.");
			}
		}
		
		while (true) {
            System.out.print("Enter the button to press: (1-9, ON, OFF)");
            String off = scanner.nextLine();

            if (off.equals("OFF")) {
                turningOff();
                break;
            } else if (off.matches("[0-9]")) {
                pressButton();
            } else {
                System.out.println("Command not recognized.");
            }
        }
	}

	public static void turningOn() {
		System.out.println("TURNING ON...");
	}
	
	public static void turningOff() {
		System.out.println("TURNING OFF...");
	}
	
	public static void pressButton() {
		System.out.println("BUTTON PRESSED");
	}

}
