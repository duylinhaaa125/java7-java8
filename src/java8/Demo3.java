package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo3 {
	public static void main(String[] args) {
//    	Consumer<String> csr = n -> {
//    		System.out.println(n);
//    	};
//    	
//    	csr.accept("Meo meo");

//    	Supplier<Integer> num = () -> {
//    		Random xucXac = new Random();
//    		return xucXac.nextInt();
//    	};
//    	
//    	int randomNumber = num.get();
//    	System.out.println(randomNumber);
//    	
//    	Function<Integer, String> ft = number -> String.valueOf(number);
//    	String numberString = ft.apply(600);
//    	System.out.println(numberString);
//    	
//    	
//    	Predicate<Integer> pd = numbers -> numbers > 5;
//    	boolean rs = pd.test(6);
//    	System.out.println(rs);
//    	

		List<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(8);
		nums.add(45);
		nums.add(12);
		nums.add(50);
		nums.add(88);

		List<Integer> numbers = nums.stream().filter(num -> num > 30).collect(Collectors.toList());
		System.out.println(numbers);

		List<Integer> numb = nums.stream().map(num -> num * 2).collect(Collectors.toList());
		System.out.println(numb);

		List<Integer> number = nums.stream().filter(num -> num < 10).map(num -> num * 10).collect(Collectors.toList());
//		input : [3, 8, 45, 12, 50, 88]
//		output:[30 , 80]
		System.out.println(number);

		List<Integer> result = nums.stream().limit(4).collect(Collectors.toList());
		System.out.println(result);

		int res = nums.stream().reduce(3, (x, y) -> x + y);
		System.out.println(res);

		List<Integer> rs = new ArrayList<>();

		for (Integer num : nums) {
			if (num < 10) {
				rs.add(num * 10);
			}
		}
		System.out.println(rs);

//		String[] string = new String[11];
//		Optional<String> check = Optional.ofNullable(string[4]);
//		System.out.println(check);

		Optional<String> pokemon = Optional.ofNullable(null);
		String takashi = null;

		pokemon.ifPresent(value -> System.out.println(value));
		System.out.println(pokemon.isEmpty());
		
		
	}

}
