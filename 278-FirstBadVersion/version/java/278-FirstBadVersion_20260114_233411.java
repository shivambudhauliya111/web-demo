// Last updated: 1/14/2026, 11:34:11 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int lo=1;
7	int hi=n;
8	int ans=0;
9	while(lo<=hi) {
10		int mid=lo+(hi-lo)/2;
11		if(isBadVersion(mid)==true) {
12			ans=mid;
13			hi=mid-1;
14			
15		}else {
16			lo=mid+1;
17			
18		}
19	}
20	return ans; 
21        
22    }
23}