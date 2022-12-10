package desserts.brownies;

import org.springframework.stereotype.Component;

@Component("myBrownie")
public class Brownie {
	public void makeBrownie() {
		System.out.println("Making Chocolate Brownie");
	}
}
