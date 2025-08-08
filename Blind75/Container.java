public class Container {

    public static int areaFinder(int[] height){
        int actArea = 0;
        int area;
        int left = 0;
        int right = height.length - 1;

        if(height.length == 1) return 0;
        if(height.length == 2) return height[0]*height[1];

        while (left <= right) { 
            if(height[left] < height[right]){
                area = height[left] * (right - left);
                left++;
            }
            else{
                area = height[right] * (right - left);
                right--;
            }

            if(area > actArea){
                actArea = area;
            }
        }

        return actArea;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7,9};
        int actArea = areaFinder(height);
        System.out.println(actArea);
    }
}
