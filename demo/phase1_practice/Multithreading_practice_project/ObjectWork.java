package multithreading;

public class ObjectWork {
	String name; 
    String breed; 
    int age; 
    String color; 
    public ObjectWork(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color=color;
    }
    public String getName()
    {
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + ".");} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ObjectWork s=new ObjectWork("Arun","faf",2,"white");
        System.out.println(s.toString());
	}

}
