/*
Shantanu Jha
APCS2 pd9
HW15--Generically Speaking...
2016-03-17
*/

public interface List<T> 
{ 
    public boolean add( T x ); 

    public void add( int i, T newVal );

    public T remove( int i );

    public T get( int i ); 

    public T set( int i, T x ); 

    public int size(); 
}
