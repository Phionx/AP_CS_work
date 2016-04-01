/*
Team I asked him and he hadn't thought of anything yet
APCS2 pd9
HW17 -- For Each Is the Goal
2016-03-27
*/


import java.util.*;
public class LList<T> implements List<T>
{
    private DLLNode<T> first;
    private int size;
    public LList()
    {
	size = 0;
    }

    //Override
    public boolean add (T x)
    {
	if (this.size() == 0)
	    {
		first = new DLLNode<T>();
	    }
	else
	    {
		first = new DLLNode<T>(null,first);
	    }
    first.setElement(x);
    try
       	{
       	first.getNext().setPrev(first);       		
       	} catch (Exception e) {}
	size += 1;
	return true;
    }

    //Override
    public T get(int i)
    {
	DLLNode<T> target = first;
	int c = 0;
	while ((c<i) && (target != null))
	    {
		target = target.getNext();
		c += 1;
	    }
	if ((target == null) || (target.getElement() == null) || ( i < 0))
	    {
		throw new IndexOutOfBoundsException("\nIndex out of Bounds, designated node contains no item, or the list is null (contains nothing)");
	    }
	return target.getElement();	
    }

    public DLLNode getNode(int i)
    {
	DLLNode<T> target = first;
	int c = 0;
	while ((c<i) && (target != null))
	    {
		target = target.getNext();
		c += 1;
	    }
	if ((target == null) || ( i < 0))
	    {
		throw new IndexOutOfBoundsException("\nIndex out of Bounds");
	    }
	return target;	
    }

    //Override
    public int size()
    {
	return size;
    }

    //Override
    public T set (int i, T x)
    {
	DLLNode<T> target = first;
	int c = 0;
	T s = null;
	while ((c<i) && (target != null))
	    {
		target = target.getNext();
		c += 1;
	    }
	if ((target == null))
	    {
		throw new IndexOutOfBoundsException("\nIndex out of Bounds, designated node contains no item, or the list is null (contains nothing)");
	    }
	if (target.getElement() != null)
	    {
		s = target.getElement();
	    }
	target.setElement(x);
	return s;
    }

    //Override
    public void add(int i, T s)
    {
	if (i == 0)
	    {
		add(s);
		return;
	    }
	else if (i == size())
		{
		DLLNode last = getNode(size()-1);
		last.setNext(new DLLNode(last, null, s));
		size += 1;
		return;
		}
	DLLNode after = getNode(i);
	DLLNode before = after.getPrev();
	DLLNode target = new DLLNode(before, after, s);
	before.setNext(target);
	after.setPrev(target);
	size += 1;
    }

    //Override
    public T remove(int i)
    {
	if (i == 0)
	    {
		T r = first.getElement();
		first = first.getNext();
		first.setPrev(null);
		size -= 1;
		return r;
	    }
	DLLNode<T> target = getNode(i);
	if (target == null)
	    {
		throw new IndexOutOfBoundsException("Index Out of Bounds");
	    }
	T r = target.getElement();
	DLLNode before = target.getPrev();
	DLLNode after = target.getNext();
	before.setNext(after);
	if (after != null)
	{after.setPrev(before);}
	size -= 1;
	return r;
    }

    //Override
    public Iterator<T> iterator()
    {
	return new Iterator<T>() {
	    private DLLNode<T> node = first;

            public boolean hasNext() {
		return node != null;
            }

            public T next() {
        T element = node.getElement();
		node = node.getNext();
		return element;
            }

            public void remove() {
            }
        };
    }

    public String toString()
    {
	String s = "[";
	for (T n : this)
	    {
		if (n == null)
		    {
			s += "null, ";
		    }
		else
		    {
			s = s + n.toString() + ", ";
		    }
	    }
	s = s.substring(0, s.length()-2);
	s += "]";
	return s;
    }




    public static void main (String[] args)
    {
	LList l = new LList<String>();
	l.add("a");
	l.add("b");
	l.add("c");
	l.add("d");
	System.out.print("New linkedList with some stuff added: ");
	System.out.println(l);
	System.out.print("Size: ");
	System.out.println(l.size());
	Object s = l.get(2);
	System.out.println("Getting String from position 2: " + s);
	l.set(1, "abc");
	System.out.print("Setting position 1 to a new value: ");
	System.out.println(l);
	System.out.print("Size: ");
	System.out.println(l.size());
	l.add(2, "added at index");
	System.out.println("Adding item at index 2");
	System.out.println(l);
	System.out.print("Size: ");
	System.out.println(l.size());
	s = l.remove(1);
	System.out.println("Removing item at index 1");
	System.out.println(l);
	System.out.println("Removed item: " + s);
	System.out.print("Size: ");
	System.out.println(l.size());
	l.remove(0);
	System.out.println("Removing item at index 0");
	System.out.println(l);
	System.out.print("Size: ");
	System.out.println(l.size());
	l.add(l.size(), "end");
	System.out.println("Adding item at end of list");
	System.out.println(l);
	LList b = new LList();
	b.add("This is a new List");
	b.add(new Integer(1337));
	l.add(b);
	System.out.println("Adding LList to LList (testing if it works with all objects, not just Strings, and LList was all I had at the time with a good ToString method...");
	System.out.println(l);
	System.out.println("Testing generically typed list.");
	LList<Integer> k = new LList<Integer>();
	k.add(231231231);
	k.add(123);
	k.add(122222222);
	k.add(367243653);
	System.out.println(k);
	System.out.println("Attempting to get item from nonexistent index (this should throw java.lang.IndexOutOfBoundsException):");
	s = l.get(17);
    }
}

/*
private class MyIterator implements Iterator<T>{
	private DLLNoade<T> _curr; // dummy node
	public MyIterator() {
		
	}
	public boolean hasNext() {
		
	}
	public T next() {}
	public void remove {}
}
*/
