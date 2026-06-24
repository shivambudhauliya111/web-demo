// Last updated: 24/06/2026, 14:29:34
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> l1 = new ArrayList<>();
        
       int row=0;
       int star=1;
       while(row<n){
       List<Integer> l2 = new ArrayList<>();

        int i=0;
        int val=1;
        while(i<star){
            l2.add(val);
            val=((row-i)*val)/(i+1);
            i++;
        }
        l1.add(new ArrayList<>(l2));
        //l2.remove(l2.size()-1);
        row++;
        star++;



        
       
    }

    return l1;
}  
    }
