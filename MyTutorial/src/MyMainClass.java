import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MyMainClass{


	public static void main(String [] args) {
				
		MyInterface myInterface = (num1, num2) -> {return (num1-num2);};
		
		System.out.println("Subraction my ass 2: "+ myInterface.subtract(1, 3));
		
		BookService bcBookService = new BookService();
		System.out.println(bcBookService.getBooksInSort());
		List<Book> listBookss = bcBookService.getBooksInSort();
		
		Consumer<List<Book>> consumer = (b) -> System.out.println(b.toString());
		consumer.accept(bcBookService.getBooksInSort());
		
		Predicate<List<Book>> predicate = (listBooks) -> listBooks.size()==5;
		System.out.println(predicate.test(listBookss));
		
		Supplier<List<Book>> supplier = () -> listBookss;
		
		System.out.println(supplier.get());
		
		Predicate<Book> predicate2 = (book) -> book.getAges()>=200;
		
		listBookss.stream().filter(predicate2).forEach((myVal)->System.out.println("Hello "+myVal.getAges()));
		
		listBookss.stream().forEach((book)->System.out.println("Here: "+book.getName()));

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
	//	map.forEach((key,value) ->System.out.println(key+": "+value));
		map.entrySet().forEach(str ->System.out.println(str.getKey()));
	}

}