public class binary {
    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int target = 5;
      int low = arr[0];
      int high = arr.length - 1;
      for(int i = 0; i < arr.length; i++){
        int mid = (low + high) / 2;
        if(arr[mid] == target){
          System.out.println("Element found at index: " + mid);
          break;
        }
        else if(arr[mid] < target){
          low = mid + 1;
        }
        else{
          high = mid - 1;
        }
      }
    }
}