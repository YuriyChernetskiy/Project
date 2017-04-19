package Learning;

class RandomEmail {
    private String email;
    private String[] domName = {"@gmail.com", "@hotline.com", "@ya.ru", "@mail.ru", "@i.ua"};
    private char[] a;
    private int random;

    public void newEmail() {
        a = new char[10];
        random = 0 +(int) (Math.random()*4);
        for (int i = 0; i < a.length; i++){
            int z = (int) (Math.random() * 10);
            int sum = z+97;
            a[i] += sum;
        }
        email = new String(a);
        System.out.println(email+domName[random]);
    }
}

class RandomApp {
    public static void main(String[] args) {
         RandomEmail re = new RandomEmail();
         re.newEmail();
        }
   }