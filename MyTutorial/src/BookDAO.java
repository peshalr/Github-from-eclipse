import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks(){
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "C book",300));
		books.add(new Book(2, "B book",200));
		books.add(new Book(3, "A book",100));
		
		return books;
	}

}
