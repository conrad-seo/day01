public class Exercise3_2 {
    //3-2. 다음 연산의 결과와 그 이유를 적으세요
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);           //true
        System.out.println(y += 10 - x++);                      //13
        System.out.println(x += 2);                             //5         x = 3+2=5
        System.out.println(!('A' <= c && c <= 'Z'));            //False
        System.out.println('C' - c);                            //2
        System.out.println('5' - '0');                          //5
        System.out.println(c + 1);                              //66       아스키 a = 65
        System.out.println(++c);                                //67
        System.out.println(c++);                                //67
        System.out.println(c);                                  //68
    }
}
