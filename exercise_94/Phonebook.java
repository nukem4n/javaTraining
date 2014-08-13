public class Phonebook{
  
  ArrayList<Person> list = new ArrayList<Person>();
  
  public void add(String name, String number){
    list.add(new Person(name,number));
  }
  
  public void printAll(){
    for(Person x : list){
      System.out.println(x);
  }
  
  }
  
}
