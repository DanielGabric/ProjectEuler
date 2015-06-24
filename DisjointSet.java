/*Taken from http://www.cs.berkeley.edu/~jrs/61bs02/hw/hw9/set/DisjointSets.java*/
public class DisjointSet{
    private int[][] nodes;
        
    public DisjointSets(int size) {
        nodes = new int[size][2];
        for (int i = 0; i < size; i++){
            
            nodes[i][0]=0;
            nodes[i][1]=1;
        }
    }
        
        
    public int[] find(int i) {
        
    }
        
        
    public void union(int i, int j) {
        
    }
}