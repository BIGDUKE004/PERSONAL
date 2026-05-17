public class Time{

    public static int time(int minute){

int calculation =  minute * 60 ;

return calculation;


}

    public static double hour(int minute){
double cal = (double) minute / 60;
return cal;
}
public static void main(String[] args){

System.out.println(time(30));
System.out.println(hour(30));

}
}


