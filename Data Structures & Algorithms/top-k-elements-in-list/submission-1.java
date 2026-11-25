class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(map.get(a),map.get(b)));

        for(int num : map.keySet()){
            if(pq.size()<k){
                pq.offer(num);
            }

            else if(map.get(num)>map.get(pq.peek())){ // only if we use map.get(peek), we will be able to access the frequency, if we just put .peek then we will get only the number on top
                pq.poll();
                pq.offer(num);
            }
        }

        int[] arr = new int[k];
        for(int i = 0; i<k; i++){
            arr[i] = pq.poll();
        }

        return arr;
    }
}
