package conditionalstatement.ifelse;
//If
//x = 2
//y = 5
//z = 0
//then find values of the following expressions:
//	a. x == 2//true
//	b. x != 5 //true
//	c. x != 5 && y >= 5 //true
//	d. z != 0 || x == 2  //true
//	e. !(y < 10) // false
public class exp {
    public static void main(String[] args) {
        int x=2;
        int y=5;
        int z=0;
        if (x == 2)
            System.out.println(x == 2);
            System.out.println(x != 5);
            System.out.println(x != 5 && y >= 5);
            System.out.println(z != 0 || x == 2);
            System.out.println(!(y < 10));
    }
}
