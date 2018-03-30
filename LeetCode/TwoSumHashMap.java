public class TwoSumHashMap{

    public int[] search(int nums[], int target)
    {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }

        for(int j = 1; j < nums.length; j++)
        {
            int compliement = target - nums[j];
            if(map.containsKey(compliement) && map.get(compliement) != nums[0])
            {
                return new int[] { map.get(compliement), j };
            }
        }
        return new int[] { 0, 0 };
    }
}