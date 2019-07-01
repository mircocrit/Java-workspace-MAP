public class TemplateClass<T> {
	private T t;
	
	public T get(){		return this.t;}	
	public void set(T t1)	{this.t=t1;}

	
	public static void main(String args[]){		
		TemplateClass<String> classe = new TemplateClass<String>();		
		classe.set("Mirco");
		System.out.println(classe.get());
		
		TemplateClass<Integer> classe2 = new TemplateClass();
		classe2.set(2);
		System.out.println(classe2.get());

		
		
	}
}