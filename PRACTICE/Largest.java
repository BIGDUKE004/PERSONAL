   public class Largest{
    public static void main(String...args){
    int [] box = {10, 20, 30, 40, 50};
    int largest = box[0];
    for(int a = 0; a < box.length; a++){
if(largest < box[a]){
largest = box[a];
}
}
System.out.println(largest);
}

}
