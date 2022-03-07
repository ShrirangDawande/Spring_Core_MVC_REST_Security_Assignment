package MainClass.Service;

import org.springframework.stereotype.Service;

@Service
public class service {

	public int addMethod(int a, int b) {
		return a+b;
	}

	public int subMethod(int a, int b) {
		return a-b;
	}

	public int mulMethod(int a, int b) {
		return a*b;
	}

	public int divMethod(int a, int b) {
		return a/b;
	}

	public int sqrMethod(int a) {
		return (int) Math.sqrt(a);
	}

	
}
