public class Second{
    public static void main(String[] args){

int [] list = {2, 3, 4, 67, 322};

int largest = list[0];
int second = list[0];

for(int index = 1; index < list.length; index++){

if(list[index] > largest){
second = largest;
largest = list[index];
} else if(list[index] > second){
second = list[index];
}


}
System.out.println(second);
}
}




















