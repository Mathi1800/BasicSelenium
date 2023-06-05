package testNG;

import org.testng.annotations.Test;

public class skipTestCase {

	@Test(priority = 0)
	public void startThecar() {
		System.out.println("Start the car:");

	}

	@Test(priority = 5, enabled = false)
	public void turnMusic() {
		System.out.println("Music Turned On ");
	}

	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("First Gear:");
	}

	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("second Gear:");

	}

	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Third Gear:");

	}

	@Test(priority = 4)
	public void putFourGear() {
		System.out.println("Four Gear:");

	}
}
