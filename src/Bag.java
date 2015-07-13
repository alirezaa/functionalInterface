

//very simple java 8 example
//Alireza Aghamohammadi
public class Bag {

	public interface Items {
		int value(int currentItem);
	}

	public Items find() {
		//anonymous inner class
		//	    return new Items() {
		//	     @Override
		//	      public int value(int currentValue) {
		//	    	 return ++currentValue; }
		//	    };  

		//the below works fine isn't this less code ! :)
		//typical format also works ( some parameter ) -> { body }
		return currentItem -> ++currentItem; 
	}
	public static void main(String[] args) {
		Bag p = new Bag();
		int ourCurrentIteminBox=11;
		System.out.println("Next item in the Bag is: "+p.find().value(ourCurrentIteminBox));

	}
}
