package bucket;

public class StackBucket {
// 3 properties
	private String[] stackpot;
	// the top will take care of the last in stack
	private int top;
	// the total size of the stack
	private int size;
	// constructor
	public  StackBucket(){
		//set the default values for the properties
		top = -1;
		size = 50;
		stackpot = new String[50];
	}
	//another construtor if user wants to send a value for size
	public StackBucket(int size){
		top = -1;
		//this refers to the property of this class 
		//and the size refers to the formal parameter in the constructor
		this.size = size;
		stackpot = new String[this.size];
		
	}
	// used boolean to check if the value is pushed to the stack or not
	public boolean push(String item){
		if(!isFull()){
			//initially we have set the top to -1 so -1 doesn't exist so we have to increment it.
			top++;
			stackpot[top] = item;
			return true;	
		}else
		{
			return false;
		}
		
	}
	
	public String pop(){
		//once the value is popped from stack then the top should be pointed to the next value
		//so that the top should be decremented after the value is popped
		return stackpot[top--];
	}
	// to check if we popped all the value from the stack
	public boolean isEmpty(){
		return(top == -1);
	}
	//this method will check if we can add another value to stack or not
	// because if stack is full the we can't add values to it.
	public boolean isFull(){
		return (top == stackpot.length-1);
	}
	
	
}
