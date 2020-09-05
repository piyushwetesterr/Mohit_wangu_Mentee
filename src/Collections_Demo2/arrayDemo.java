package Collections_Demo2;

import java.lang.reflect.Array;
//Array is an indexed collection of fixed number of homogeneous data elements
//Main advantage is that we can represent multiple values by using single variable so that readibility of code will be improved

//Limitations->
//Arrays are fixed in size i.e. once we create an array we cannot increase or decrease the size of the array based on requirement
//Thus in order to use array concept we need to know its size in advance which may not be always possible
//Array can hold only homogeneous data type elements(example below); We can solve this problem using Object type arrays (same example)
//Arrays concept is not implemented based on some standard data structure and hence read no ready made methods are available
//For every requirement we have to write the code explicitly which increases complexity of programming
//To overcome above problems of Arrays we should go for Collections concept
//Can hold both Primitives and Objects

//Collections:
//Collections are growable in nature i.e. based on our requirement we can increase or decrease the size
//Collections can hold homogeneous and heterogeneous elements
//Collections class is implemented based on some standard data structure; Hence for every requirement readymade method support is available.
//We are responsible to use those methods are we are not responsible to implement those methods
//Can hold Objects only


class Student {
}

class Customer {
}

class arrayDemo {

	public static void main(String[] args) {

		Array[] aa = new Array[20];

		System.out.println(aa.length);

		Object[] objA = new Object[20];
		objA[0] = new String("name");
		objA[1] = new Student();
		objA[2] = new Customer();

	}

}
