package Serialization;

import java.util.Stack;

public class GenericStack <E> {
	  Stack <E> stk = new Stack <E>();
	  public void push(E obj)
	  {
	  stk.push(obj);
	  }
	  public E pop()
	  {
	  E obj = stk.pop();
	  return obj;
	  }
	  }
	  class Output
	  {
	  public static void main(String args[])
	  {
		  GenericStack <Integer> gs = new GenericStack<Integer>();
	  gs.push(36);
	  System.out.println(gs.pop());
	  }
	 }


