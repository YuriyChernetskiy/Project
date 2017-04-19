package Learning;

class RandomEmail {
    private String email;
    private String[] domName = {"@gmail.com", "@hotline.com", "@ya.ru", "@mail.ru", "@i.ua"};
    private char[] a;
    private int random;

    public void newEmail() {
        a = new char[10];
        random = (int) (0 + Math.random()*5);
        for (int i = 0; i < a.length; i++) {a[i] += (char) (97+ Math.random() * 25);}
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