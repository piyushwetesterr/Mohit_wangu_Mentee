package Collections_Demo2;

//Collection : If we want to represent a group of individual objects as a single entity, then we should go for collection
//Collection Framework : It contains several classes and interfaces which can be used to represent a group of individual objects as a single entity
//There is no concrete class which implements Collection interface directly.



// 9 key interfaces of Collection framework : 
//1. Collection
//2.List
//3.Set
//4.SortedSet
//5.NavigableSet
//6.Queue
//7.Map
//8.SortedMap
//9.NavigableMap

//1. Collection(I): Collection Interface contains the most common methods applicable for any Collection Object.
//e.g: add(),remove(),isempty(),size() etc.
//Collection interface is considered the root interface of Collection framework
//There is no concrete class which implements Collection interface directly. 

//Difference between Collection and Collections : 

//Collection is an interface; If we want to represent a group of individual objects as a single entity, then we should go for Collection
//Collections is an utility class present in Java.util package to define several utility methods for Collection objects (like sorting, searching etc).

//2. List(I) : It is the child interface of Collection; If we want to represent a group of individual objects as a single entity where duplicates are allowed 
//and insertion order must be preserved, then we should go for List.
//We can preserve insertion order via index and we can differentiate duplicate objects by using index.
//Hence index will play a very important role in List.
//List interface defines the following specific methods (Sheet) 

//Implementing Classes : 
//a) ArrayList
//b) LinkedList
//c) Vector
//d) Stack

//ArrayList : 
//1) The underlying data structure is Resizable Array or Growable Array
//2) Duplicates are allowed
//3) Insertion order is preserved
//4) Heterogeneous objects are allowed (except TreeSet and TreeMap, everwhere heterogeneous objects are allowed)
//5) NULL insertion is allowed
//6) Usually we can use collections to hold and transfer objects from one location to another location (Container).To provide support for this requirement,
//every collection class by default implements Serializable and Cloneable interfaces
//7) ArrayList and Vector classes implement RANDOM ACCESS INTERFACE so that any random element can be accessed with the same speed.
//8) Random Access : Random Access interface present in Java.util package and it does not contain any methods. It is a marker interface, where required ability
//will be provided automatically by the JVM.
//9) ArrayList is the best choice if our frequent operation is retrieval operation(because ArrayList implement RandomAccess Interface)
//10)ArrayList is the worst choice if our frequent operation is insertion or deletion in the middle
//11)By default ArrayList is non-synchronized but we can get synchronized version of ArrayList object by using the SynchronizedList() method of Collections class
//-->
//public static List synchronizedList(List l);
//Similarly we can get synchronized version of Set and Map as well :-
//-->
//public static Set synchronizedSet(Set s);
//public static Map synchronizedMap(Map m);


//LinkedList : 
//1)The underlying data structure is Doubly Linked List
//2)Insertion order is preserved
//3)Duplicates are allowed
//4)Heterogeneous objects are allowed
//5)NULL insertion is possible
//6)LinkedList implements Serializable and Cloneable interfaces but not RandomAccess
//7)LinkedList is the best choice when our frequent operation is insertion or deletion in the middle
//8)LinkedList is the worst choice if our frequent operation is retrieval operation


//Cursors : 
//Three type of Cursors are available in Java :- Enumeration, Iterator, ListIterator

//Iterator :- 
//1)We can apply Iterator concept for any collection object and hence it is a Universal cursor
//2)By using Iterator we can perform both Read and Write operations






























//3. Set(I) : It is the child interface of Collection. 
//If we want to represent a group of individual object as a single entity where duplicates are not allowed and insertion order is not required, then we should go 
//for Set interface.

//4. SortedSet(I) : It is the child interface of Set. If we want to represent a group of individual objects as a single entity where duplicates are not allowed but
//objects should be inserted according to some sorting order, then we should go for SortedSet.

//5. NavigableSet(I) : It is the child interface of SortedSet. It contains several methods for Navigation purposes.
//Implementing Class : TreeSet(C)

//6. Queue(I) : It is the child interface of Collection. If we want to represent a group of individual objects PRIOR TO PROCESSING then we should go for queue.
//Usually queue follows, FIFO order but based on out requirement we can implement our own priority order also.
//e.g.: before sending a mail all mail ids we have to store in some data structure. mails will be delivered in the same order that we added the mail ids.
// for this requirement queue is best choice.

//All the above interfaces(Collection,List,Set,SortedSet,NavigableSet and Queue) meant for representing a group of individual objects.
//If we want to represent a group of objects as Key-Value pairs, then we should go for Map.

//7. Map(I) : 
//Map is NOT child interface of Collection.
//If we want to represent a group of Objects as Key-Value pairs, then we should go for MAP.
//Both Key and Value are objects.
//Duplicate keys are not allowed but values can be duplicated.


//8. Sorted Map(I) : 
//It is the child interface of MAP
//If we want to represent a group of K,V pairs according to some SORTING ORDER OF KEYS, then we should go for Sorted Map.
//In Sorted Map, the sorting should be based on KEY but not based on VALUE.









public class collectionDemo {

}
