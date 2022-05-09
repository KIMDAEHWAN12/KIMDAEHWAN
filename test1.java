package Test;
import java.util.Scanner;
public class test1
{
private static final char A0 = 0;
private static final char B0 = 0;
private static final char C0 = 0;
private static final char D0 = 0;

@SuppressWarnings("unused")
public static void main(String[] args) 
{
      Scanner s = new Scanner(System.in); {
      while(true)
      {
         System.out.println(" ★ 시험 화면            "); 
         System.out.println("---------------------");
         System.out.println("1 : 채점              ");
         System.out.println("2 : 성적처리            ");
         System.out.println("3 : 구간 합 구하기       ");
         System.out.println("4 : 소감              ");
         System.out.println("5 : 종료              ");
         System.out.println("---------------------");
         System.out.print ("menu select :    ");
         String sel = s.next();
         if (sel.equals("1"))
         {
         System.out.println("\n----------------------------");
         System.out.println("학생 수 n : ");
         int stNo = s.nextInt();
         System.out.println("과목 수 n : ");
         int subNo = s.nextInt();
         System.out.println("\n----------------------------");
         // int [과목 수][10문항]
         int[][] score = new int[subNo][10];
         // int [학생수][과목수][학생답]
         int[][][] student = new int[stNo][subNo][10];
         // int [학생수][과목수][과목 총점]
         int[][][] point1 = new int[stNo][subNo][1];

         // 각 과목당 10문제 정답 랜덤 배치
         for(int i = 0; i < subNo; i++){ 
         for(int j = 0; j < 10; j++){
         score[i][j] = (int)(Math.random() * 4+1);
         }
         System.out.print("\n과목" + (i+1));
         // 랜덤 배치한 정답 나열하기
         for(int j = 0; j < 10; j++){
         System.out.printf("%2d",score[i][j]);
         } 
                      }
         System.out.println("\n----------------------------"); 
         System.out.print("학생1"); 

         // 학생 당 과목 별 선택답
         for(int i=0; i<stNo; i++){
         for(int j = 0; j < subNo; j++){
         int sum = 0; 

         // i가 0이면 학생1 성적
         if(i == 0){
         System.out.print("\n과목" + (j+1)); 
         }
         for(int z = 0; z < 10; z++){
         student[i][j][z] = (int)(Math.random() * 4+1); 

         //  정답하고 학생답하고 같으면 O 출력 
         if(score[j][z] == student[i][j][z]){
         if(i == 0) System.out.print(" O"); 
         sum = sum + 10; //  점수 저장
         }
         //  정답하고 다르면 X 출력
         else{
         if(i == 0)System.out.print(" X");
         } 
         //  마지막 채점문제라면 sum값 저장
         if(z == 9){
         point1[i][j][0] = sum;
         if(i == 0)System.out.print("  " + sum + "점");
         }
         }
         }
         }
         System.out.println("\n----------------------------");
         //  과목 수 만큼 나열
         System.out.print("성명");
         for(int i = 0; i < subNo; i++){
         System.out.print("\t과목" + (i+1));
         }
         System.out.print("\n----------------------------");
        
         //  학생 당 총점 배치
         for(int i = 0; i < stNo; i++){
         System.out.print("\n학생" + (i+1));
         for(int j = 0; j < subNo; j++){
         System.out.print("\t" + point1[i][j][0]);
         }
         }
         System.out.println("\n----------------------------");
         }
         else if (sel.equals("2")) {
         int stuNum = 101;
         int mid = 30;
         int gm = 20;
         int rp = 10;
         int chul = 10;
         int tot = mid + gm + rp + chul; 
         int avg = tot;
         int length = 0;
         char point = ' ';

           if(avg >=90) {
        	   point = 'A';
           }
           else if(avg >=80) {
        	   point = 'B';
             }
           else if(avg >=70) {
        	   point = 'C';
             }
           else if(avg >=60) {
        	   point = 'D';
             }
           else{
        	   point = 'F';  
           }

         System.out.println("==============================");
         System.out.println("학번  중간 기말 리포트 출석 총점 학점");
         System.out.println(stuNum+"  "+mid+  "   "+gm+ "  "+rp+ "    "+chul+"  "+tot+ " "+ point +"  ");
         System.out.println("------------------------------");
        }
         else if (sel.equals("3"))
         {
          int sum = 0, i; 
             for (i = 1; i <= 10 ; i ++ ) {
              if (i % 2 == 0) {
               sum += i;
             System.out.println("1~10까지 짝수의 합 = " + sum);
             }
             else{
             sum += i; 
             System.out.println("1~10까지 홀수의 합 = " + sum);
             }
             }
         }
         else if (sel.equals("4"))
          System.out.println("연락 주세요.");
         else if (sel.equals("5"))
         {
            System.out.println("종료");
            break;
            }
         else continue;
         }
}
}
}
  