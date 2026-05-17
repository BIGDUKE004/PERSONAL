public class Mode{

    public static void main(String[] args){

int [] list = {1,  2, 2, 3, 2, 4};
int occured = 0;
//int count = 0;
for( int count = 0; count < list.length; count++){
//System.out.println(occured);

for(int occur  = 0; occur < list.length; occur++){
if(occur == count){

occured += count;
System.out.println(occured);
}

}




}
}
}

