package example.spring.aop;

public class Musician implements Performer {

	@Override
	public void perform() {
		System.out.println("Playing a guitar");
		//throw new RuntimeException();

	}

}
