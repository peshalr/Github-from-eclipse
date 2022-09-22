import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getBooksInSort(){
		
		BookDAO dao = new BookDAO();
		List<Book> bookList = dao.getBooks();
		Collections.sort(bookList, (one, two)-> two.getAges()-one.getAges());
		return bookList;		
	}	

	
}
