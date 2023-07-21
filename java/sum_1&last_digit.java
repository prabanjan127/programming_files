class sum_last_digit
{
  public static void main(String[] args)
  {
    int n = 1001;
    int l =4;
    int arr[] = new int[l];
    for(int i=0;i<l;i++)
    {
      arr[i] =n%10;
      n/=10;
    }
    System.out.print(arr[0]+arr[l-1]);
  }
}