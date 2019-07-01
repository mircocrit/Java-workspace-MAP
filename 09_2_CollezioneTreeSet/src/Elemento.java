import java.util.*;

public class Elemento implements Comparator<Elemento> , Comparable<Elemento>{
	 private String id;
	 private Integer value;
	 
	public Elemento(String string, int i) {
		this.id= string;
		this.value = (Integer) i;
	}
	public Integer getValue() {return value;}
	public void setValue(Integer value) {this.value = value;}
	public String getId() {	return id;	}
	public void setId(String id) {	this.id = id;}
	
	
	@Override
	public int compare(Elemento a, Elemento b) {
		if(a.value > b.value)		return 1;
		else if (a.value < b.value)	return -1;
		else 						return 0;
	}
	
	public boolean equals(Object o) {
		Elemento s = (Elemento)o;
		return (this.id == s.id);	
	}

	@Override
	public int compareTo(Elemento o) { 
		if(this.value < o.value)		return -1;													//NomeECognome.compareTo(o.getNomeECognome()) < 0)		
		else if(this.value== o.value)	return 0;												//NomeECognome.compareTo(o.getNomeECognome()) == 0)		
		else	return 1;		
	}	
	
	public Object clone(){
		Object o = null; 
		try {
			o = super.clone();
		} 
		catch (CloneNotSupportedException e) {e.printStackTrace();}
		return o;
	}
	
	
}
