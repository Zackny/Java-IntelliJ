package com.syntsx.class21;
/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
 Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
  Print users name, mobile number and address in userDetails method. Test your code.
 */

public class userClass {
    String name;
    int num;

    public userClass(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
    class userAdress extends  userClass{
    String address;

        public userAdress(String name, int num, String address) {
            super(name, num);
            this.address = address;
        }

    void detailsInfo() {

        System.out.println(name+" "+num+" "+address);

    }
    }
    class Test{
        public static void main(String[] args) {
            userAdress  obj=new userAdress("Zack",222333,"456 Street");
            obj.detailsInfo();
        }


    }