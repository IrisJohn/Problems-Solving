class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(b1,b2)->Integer.compare(b2[1],b1[1]));
        
        int i=0,units=0;
        while(truckSize > 0 && i < boxTypes.length)
        {
            //sum=sum+boxTypes[i][0];
            if(boxTypes[i][0]<=truckSize)
            {
                units=units+(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
                
            }
            else
            {
                units+=Math.min(truckSize,boxTypes[i][0])*boxTypes[i][1];
                truckSize-=Math.min(truckSize,boxTypes[i][0]);
            }
            i++;
        }
        return units;
        
        
        
        
    }
}