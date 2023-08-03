package HW_3;

public class test2 implements test1{
    int age;
   

    public test2(){
      age = 27;
       
    }
    public int getNext(){
     age = 27;

       return age;
     
    }

    public void reset(){

     age = 10;

    }

    public void setNum(int x){
   
       age = x;
       
    }

    
}
