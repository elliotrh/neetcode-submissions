class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];
        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        //sort by position in descending order
        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        
        Stack<Double> stack = new Stack<>();
        for(int[] car: cars){
            int pos = car[0];
            int spd = car[1];
            double time = (double)(target - pos) / spd;

            if(stack.empty() || (time > stack.peek())){
                stack.push(time);
            }
        }
        return stack.size();
    }
}
