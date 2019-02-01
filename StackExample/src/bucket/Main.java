package bucket;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackBucket stackBucket= new StackBucket();
		// add values to the stack 
		if(!stackBucket.isFull()){
			stackBucket.push("Orange");
			stackBucket.push("Apple");
            stackBucket.push("Lemon");
			stackBucket.push("Guyave");
			stackBucket.push("Kiwi");

		}
		// this will automatically pop the last pushed string value Kiwi first
		System.out.println(stackBucket.pop());
		//this will pop the string Guyave 
		//because the top value is set to top-- inside the function pop
		System.out.println(stackBucket.pop());
		//this time it will pop lemon as the top value is decremented and pointed to the string Lemon
		System.out.println(stackBucket.pop());
		//Apple
		System.out.println(stackBucket.pop());
        //Orange
		System.out.println(stackBucket.pop());




	}

}

