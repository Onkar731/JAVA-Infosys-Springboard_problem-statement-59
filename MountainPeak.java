class MountainPeak {
    public static int findMountainSubArray(int[]heights,int N){    
        int longestMountainSubArray = 0;
        int base = 0;

        while(base < N){
            int mountainPeak = base;
            //if the current base is the left most point. Possible mountain scenario
            if ((mountainPeak+1 < N) && (heights[mountainPeak] < heights[mountainPeak+1])){
                //adjust the hill point to the potential highest peak
                while((mountainPeak+1 < N) && (heights[mountainPeak] < heights[mountainPeak+1])){
                    mountainPeak += 1;
                }
                //further points are shorted than peak
                if((mountainPeak+1 < N) && heights[mountainPeak] > heights[mountainPeak+1]){
                    //move to the lowest hill point
                    while((mountainPeak+1 < N) && (heights[mountainPeak] > heights[mountainPeak+1])){
                        mountainPeak += 1;
                    }
                    
                    longestMountainSubArray = Math.max(longestMountainSubArray,mountainPeak-base+1);
                }
            }
            base = Math.max(mountainPeak,base+1);
        }
        return longestMountainSubArray;
    }
}
