public class Exercise4_10 {
    public static void main(String[] args) {
        // 1~100사이의 임의의 값을 얻어서  answer에 저장한다.
        int answer = (int)(Math.random()*100+1);
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기위한 변수

        // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100사이의 값을 입력하세요 : ");
            input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.

            if(answer == input){
                System.out.println("숫자를 맞췄습니다");
                return;
            }
            else{
                if(input<answer){
                    System.out.println("정답은 당신이 적은숫자보다 큰 숫자입니다");
                }
                else{
                    System.out.println("정답은 당신이 적은숫자보다 작은 숫자입니다");
                }
            }
        } while(true); //무한반복문
    } // end of main
}
