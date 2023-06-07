package Java_Programs;
public class Encapsulation_example {
	  private String name;

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	

	  public static void main(String[] args) 
 {
	    Encapsulation_example myObj = new Encapsulation_example();
	    myObj.setName("John"); // Set the value of the name variable to "John"
	    System.out.println(myObj.getName());
	  }
	  
}
