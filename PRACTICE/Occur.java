public class Occur{
    public static void main(String[] args){

int highestCount = 0;
int mostOccured = 0;

int [] list = {2, 3, 5, 2, 4, 2};

for(int index = 0; index < list.length; index++){
if(list[index] > highestCount){
highestCount = list[index];
mostOccured = highestCount;
}

}
System.out.println(mostOccured);
}
}
