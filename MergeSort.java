class MergeSort {

  public void mergesort(int [] arr , int l , int m , int r){
       int len1 = m-l + 1 ;
       int len2 = r-m ;
       int []  arr1= new int[len1] ;
       int arr2 [] =  new int[len2] ;

       for(int i = 0 ; i < len1 ; i++){
         arr1[i] = arr[l+i] ;
       }
       for(int i = 0 ; i < len2 ; i++)
       {
         arr2[i] = arr[m+i+1] ;
       }
       int i = 0 ;
       int j = 0 ;
       int k = l ;
       for( ; i < len1 && j < len2 ;){
            if(arr1[i] < arr2[j]){
              arr[k++] = arr1[i++] ;
            }
            else{
              arr[k++] = arr2[j++] ;
            }
             
       }
        while(i < len1)
          arr[k++] = arr1[i++] ;
        
        while(j < len2)
          arr[k++] = arr[j++] ;
        
  }
  public void sort(int[] arr , int l , int r){
    if(l < r){
      int m = (l+r-1)/2 ;
      sort(arr , l , m) ;
      sort(arr, m+1 , r) ;

      mergesort( arr , l , m , r);

    }

  }
}