   public class Greater{
    public static void main(String...args){
    int [] box = {4, 15, 22, 8, 13};
    int largest = 0;
    for(int a = 0; a < box.length; a++){
if(box[a] > 10 ){
largest++;
}
}
System.out.println(largest);
}

}
