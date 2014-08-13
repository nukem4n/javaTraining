public class Person {
    
    private String name;
    private String phoneNumber;
    
      public Person (String name, String number) {
      
      this.name=name;
      this.phoneNumber=number;
    }
      
    public String getName(){
      return this.name;
    }
    
    public String getNumeber(){
      return this.phoneNumber;
    }
    
    public String toString(){
      return this.name+" number:"+this.phoneNumber;
    }
    
    public void changeNumber(String newNumber){
      this.number=newNumber;
    }

}
