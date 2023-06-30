package com.functional.programming;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Collection.*;
import java.util.function.Predicate;

public class StreamExample  {
private static void printtheLimit()
{
	IntStream.range(1,11).map(x-> x*x).forEach(x->System.out.println(x));
}private static void lowerCaseData(List<String> l) {
	l.stream().map(x->x.toLowerCase()).forEach(x->System.out.println(x));
	
}
private static void lengthofData(List<String> l)
{
	l.stream().map(x->x.length()).forEach(e->System.out.println(e));
}
private static void printtheLimitHundred()
{
	IntStream.iterate(0,i->i+1).limit(100).map(x->x*x).forEach(x->System.out.println(x));;
}
private static void printSum()
{
	int data=IntStream.range(1, 11).reduce(0,(n1,n2)->n1+n2);
	System.out.println(data);
}
private static void findmax(List<Integer> li)
{
	int data=li.stream().max((x1,x2)->Integer.compare(x1,x2)).get();
	System.out.println("max"+data);
}
public static void findMin(List<Integer> l1)
{
	int data=l1.stream().min((x1,x2)->Integer.compare(x1,x2)).get();
	System.out.println("min"+data);
}
public static void printodd(List<Integer> l1)
{
List<Integer>ll=l1.stream().filter(x->x%2==1).collect(Collectors.toList());
System.out.println(ll);
//Stream<T> filter(Predicate<? super T> predicate);
//boolean test(T t);
}
public static void squares()
{
	List<Integer> data1=IntStream.range(1, 11).map(x->x*x).boxed().collect(Collectors.toList());
	//IntStream is not a stream.it Intstream implement Intpipeline.so convert to stream by using boxed() method
	System.out.println(data1);
}
public static void findmaxeven(List<Integer> l1)
{
	int data1=l1.stream().filter(x->x %2==0).min((x1,x2)->Integer.compare(x1,x2)).orElse(0);
	System.out.println(data1);
//	int data=l1.stream().filter(x->x %2==0).min((x1,x2)->Integer.compare(x1,x2)).get();
//	System.out.println(data);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printtheLimit();
		List<String> l=List.of("Apple","Orange","KIWI");
		lowerCaseData(l);
		lengthofData(l);
		System.out.println("****************");
		printtheLimitHundred();
		System.out.println("****************");
		printSum();
		List<Integer> l1=List.of(6,8,3,4,1,2);
		findmax(l1);
		System.out.println("****************");
		findMin(l1);
		printodd(l1);
		squares();
		List<Integer> l11=List.of(13,3,41,1,21);
		findmaxeven(l11);

	}

}
