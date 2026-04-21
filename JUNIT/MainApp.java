public class MainApp 
{

    public static void main(String[] args) 
    {

        ArrayUtils utils = new ArrayUtils();
        int[] arr = {12, 5, 8, 20, 3};

        System.out.println("Maximum Value : " + utils.findMax(arr));
        System.out.println("Minimum Value : " + utils.findMin(arr));
    }
}