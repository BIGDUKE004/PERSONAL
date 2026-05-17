public class Even{
    public static boolean isEven(int a){
if(a % 2 == 0){
return true;
} else {
return false;
}

}

public static void main(String[] args){

Even number = new Even();

boolean even = number.isEven(66672);

System.out.println(even);

}

}
