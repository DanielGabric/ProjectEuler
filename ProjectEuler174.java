public class ProjectEuler174 {
    public static void main(String[] args) {
        int[]tiles=new int[1000001];
        for(int t =1;t<=250000;++t){
            int sum = 0;
            for(int row = t+2;;row+=2){
                sum+=4*row-4;
                if(sum>1000000)break;
                tiles[sum]++;
            } 
        }
        int sum=0;
        for(int i=1;i<tiles.length;++i)if(tiles[i]>=1&&tiles[i]<=10)sum++;
        System.out.println(sum);
    }
}
