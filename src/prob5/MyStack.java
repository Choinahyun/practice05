package prob5;

public class MyStack implements Stack {
	int top = -1;
	String [] arr;

	public MyStack(int a) {
		arr = new String [a+2];
	}
	
	@Override
	public void push(String item) {
		arr[top+1] = item;
		System.out.println(top + " : " + arr[top+1]);
		top++;
		 
	}

	@Override
	public String pop() throws MyStackException {
		System.out.println(top);
		if (top == -1) {
			throw new MyStackException();
		}

		String str = arr[top];
		System.out.println(str);
		top--;
		return str;
	}

	@Override
	public boolean isEmpty() {
		if (top == -1) {
			return false;
		}
		else {
		return true; 
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
