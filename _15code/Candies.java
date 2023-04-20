import java.util.ArrayList;
import java.util.List;

//  leet code question
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> rest =  new ArrayList<Boolean>(); 
        for(int i =0 ; i<candies.length;i++){
            rest.add(max(candies,candies[i]+extraCandies));
        }
        return rest;
    }
    public static boolean max(int[] arr, int val){
        for(int value:arr){
            if(value>val){
                return false;
            }
        }
        return true ;
    }
}