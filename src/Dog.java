
public class Dog {
	private int price;
	public boolean equals(Object a){
		if(a==this){
			return true;
		}
		else{
			if(a instanceof Dog){
				if(((Dog) a).price==this.price)
					return true;
				else
					return false;
			}
			else
				return false;
		}
	}
}
