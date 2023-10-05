public class JaggedArrayDemo {
    public static void main(String args[]) {
        int jarr[][]=new int [3][];
        jarr[0]=new int[3];
        jarr[1]=new int[4];
        jarr[2]=new int[2];
        int count=0;
        for(int i=0;i<jarr.length;i++) {
            for(int j=0;j<jarr[i].length;j++) {
                jarr[i][j]=count++;
            }
        }
        System.out.println("The elements in jagged array are : ");
        for(int j=0;j<jarr[1].length;j++) {
        System.out.println(jarr[1][j]);
        }
    }
}
