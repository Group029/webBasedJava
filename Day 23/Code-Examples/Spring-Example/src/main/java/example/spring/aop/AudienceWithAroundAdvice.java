package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AudienceWithAroundAdvice {
	@Pointcut("execution(* example.spring.aop.Musician.perform(..))")
	public void myPointCut() {}
	
	@Around("myPointCut()")
	public void handleAllAdvices(ProceedingJoinPoint joinPoint) {
		try {
			takeSeats();
			turnOffMobile();
			//Invoke target bean's method
			joinPoint.proceed();
			clap();			
		}
		catch(Throwable th) {
			demandForRefund();
		}
		goHome();
	}
	
	private void takeSeats() {
		System.out.println("Around: Take Seats");
	}
	
	private void turnOffMobile() {
		System.out.println("Around: Turn off mobiles");
	}
	
	private void clap() {
		System.out.println("Around: Clap clap clap");
	}
	
	private void demandForRefund() {
		System.out.println("Around: Please give my money back");
	}
	
	private void goHome() {
		System.out.println("Around: Going home");
	}
}
