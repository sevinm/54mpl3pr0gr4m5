import java.util.Scanner;
public class matrix{
public class static void(String args[]){

  int r1,c1,r2,c2,i,j,k;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the rows and columns of first matrix");

  r1=sc.nextInt();
  c1=sc.nextInt();
  int a[][] = new int[r1][c1];
  System.out.println("Enter the elements in matrix a");
  for(i=0;i<r1;i++){
    for(j=0;j<c1;j++){
      a[i][j]= sc.nextInt();
    }
  }
    System.out.println("enter the rows and columns of second matrix");

  r2=sc.nextInt();
  c2=sc.nextInt();
  int b[][] = new int[r2][c2];
  System.out.println("Enter the elements in matrix b");
  for(i=0;i<r2;i++){
    for(j=0;j<c2;j++){
      b[i][j]= sc.nextInt();
    }
  }
  int c[][]= new int[r1][c2];
  if(r1==c2){
    for(i=0;i<r1;i++){
    for(j=0;j<c2;j++){
      for(k=0;k<c1;k++){
        c[i][j] = c[i][j] + a[i][k]* b[k][j];
      }
    }
    }
    System.out.println("the matrix is");
        for(i=0;i<r1;i++){
    for(j=0;j<c2;j++){
      System.out.println(c[i][j]);
    }
    }
  }
  else{
    System.out.println("NOT POSSIBLE");
  }
}
}
