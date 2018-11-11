import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		Function<Integer, Integer> adderFunction = x -> {
			if (x < 0)
				return x + 2;
			else
				return x + 1;
		};

		System.out.println(applyAdder(10, adderFunction));

	}

	private static Integer applyAdder(Integer parameter, Function<Integer, Integer> fn) {
		return fn.apply(parameter);
	}
}
