import java.util.Scanner;
class Main{
  private static void dabiao() {
    for(int i=0;i<db.length;i++){
      db[i]=1;
    }
    db[0]=0;
    db[1]=0;
    for(int i=2;i<=Math.sqrt(db.length);i++){
      for(int j=i+i;j<db.length;j=j+i){
        if(db[i]==1){
          db[j]=0;
        }
      }
    }
  }
  static int[] db = new int[65536];
  
  public static void main(String[] args) {
    dabiao();
    Scanner scn = new Scanner(System.in);
    while(scn.hasNext()){
      int x = scn.nextInt();
      if(x==0){
        break;
      }
    int y = 0;
      for(int i=1;i<=x/2;i++){
        if(db[i]==1&&db[x-i]==1){
          y++;
        }
      }
      System.out.println(y); // Displays the final result.
    }
  }

}
