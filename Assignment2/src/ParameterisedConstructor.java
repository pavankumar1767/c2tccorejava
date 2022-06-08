
public class ParameterisedConstructor {
	String languages;

	  // constructor accepting single value
	 ParameterisedConstrutor(String lang) {
	    languages = lang;
	    System.out.println(languages + " Programming Language");
	  }

	  public static void main(String[] args) {

	    // call constructor by passing a single value
		ParameterisedConstructor obj1 = new ParameterisedConstructor("Java");
		ParameterisedConstructor obj2 = new ParameterisedConstructor("Python");
		ParameterisedConstructor obj3 = new ParameterisedConstructor("C");
	  }


}
