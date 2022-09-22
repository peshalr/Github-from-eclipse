
public class Book {
	
	private int id;
	private String name;
	private int ages;
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", ages=" + ages + "]";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name, int ages) {
		super();
		this.id = id;
		this.name = name;
		this.ages = ages;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAges() {
		return ages;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	
	
	
}
