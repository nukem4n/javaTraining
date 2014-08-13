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
  
  public String searchNumber(String name){
    
    for(Student sr : list){
                    if(sr.getName().contains(name)){
                        return ""+name.getNumber();
                    } else {
                        return "number not known";
                    }

}
