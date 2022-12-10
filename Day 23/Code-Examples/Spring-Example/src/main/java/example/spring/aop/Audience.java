package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* example.spring.aop.Musician.perform(..))")
	public void myPointCut() {}
	@Before("myPointCut()")
	public void takeSeats() {
		System.out.println("Take Seats");
	}
	@Before("myPointCut()")
	public void turnOffMobile() {
		System.out.println("Turn off mobiles");
	}
	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("Clap clap clap");
	}
	
	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("Please give my money back");
	}
	@After("myPointCut()")
	public void goHome() {
		System.out.println("Going home");
	}
}
