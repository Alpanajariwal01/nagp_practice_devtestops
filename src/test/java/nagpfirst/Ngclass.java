package nagpfirst;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;
@Listeners(Listener.class)
public class Ngclass {

	@BeforeSuite
	public void method1() {
		System.out.println("Before Suite");
	}
	@BeforeClass
	public void method2() {
		System.out.println("Before class");
	}
	@BeforeTest
	public void method3() {
		System.out.println("Before test");
	}
	@BeforeMethod
	public void method4() {
		System.out.println("Before Method");
	}
	@Test(groups = {"Sanity"})
	public void method5() {
		System.out.println("Test");
	}
	@Test(groups = {"Sanity"})
	public void method6() {
		System.out.println("Test2");
	}
	@Test(groups = {"Sanity"})
	public void method7() {
		System.out.println("Test3");
	}
	@Test(groups = {"Sanity"})
	public void method8() {
		System.out.println("Test4");
	}
	@Test(groups = {"Sanity"})
	public void method9() {
		System.out.println("Test5");
	}
	@Test(priority=5 )
	public void method10() {
		System.out.println("Test6");
	}
}
