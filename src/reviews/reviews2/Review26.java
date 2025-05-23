package reviews.reviews2;

public class Review26 {
    public static void main(String[] args) {
        int[] numArray = new int[] {1,5,2,5,5,4,7,6,2,1,5,3,6,4};
        int target = 5;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
