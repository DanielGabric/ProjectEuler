/*Taken from http://www.cs.berkeley.edu/~jrs/61bs02/hw/hw9/set/DisjointSets.java*/
public class DisjointSet{
    private int[] array;
    public DisjointSet(int numElements) {
        array = new int [numElements];
        for (int i = 0; i < array.length; i++)array[i] = -1;
    }
    public void union(int root1, int root2) {
        if (array[root2] < array[root1])
            array[root1] = root2;        
        else {
            if (array[root1] == array[root2])
                array[root1]--;           
            array[root2] = root1;      
        }
    }
    public int find(int x) {
        if (array[x] < 0)return x;                       
        else{
            array[x] = find(array[x]);
            return array[x];                                       
        }
    }
}