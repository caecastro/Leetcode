/*
1 - Two sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 

Constraints:

    2 <= nums.length <= 104
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.

 */

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Criamos um HashMap para armazenar os valores já vistos e seus índices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Percorremos o array uma vez
        for (int i = 0; i < nums.length; i++) {
            // Calculamos o complemento necessário para atingir o target
            int complemento = target - nums[i];
            
            // Se o complemento já foi visto antes, encontramos a solução
            if (map.containsKey(complemento)) {
                // Retornamos os índices do complemento e do número atual
                return new int[] { map.get(complemento), i };
            }
            
            // Caso contrário, armazenamos o número atual e seu índice no HashMap
            map.put(nums[i], i);
        }
        
        // O problema garante que sempre haverá uma solução, então este return é apenas para compilar
        return null;
    }
}
