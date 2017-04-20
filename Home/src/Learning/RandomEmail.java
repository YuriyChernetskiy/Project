package Learning;

class RandomEmail {
    private StringBuffer sb;
    private String email;
    private char[] characters;
    private char[] numbers;
    private int random;
    private String[] domName = {"@gmail.com", "@hotline.com", "@ya.ru", "@mail.ru", "@i.ua",
                                "@ukr.net", "@yandex.ru", "@rambler.ru", "@yandex.ua", "@bk.ru",
                                "@meta.ua","@mail.ua", "@bigmir.net", "@list.ru", "@inbox.ru"};


    public void newEmail() {
        random = (int) (0 + Math.random()*15);
        // получаем в масcив чаров [a-z]
        characters = new char[10];
        for (int i = 0; i < characters.length; i++) {characters[i] += (char) (97+ Math.random() * 26);}
        email = new String(characters);
        // получаем в масcив чаров [0-9]
        numbers = new char[10];
        for (int i=0; i<10; i++) {numbers[i] = (char) (48 + Math.random() * 10);}
        // вставляем цифры влогин
        sb =new StringBuffer(email);
        for (int i =0; i<4; i++) {sb = sb.insert((int)(1+Math.random()*9), numbers[((int)(1+Math.random()*9))]);}
        System.out.println(sb+domName[random]);
        }
    }

class RandomApp {
    public static void main(String[] args) {
         RandomEmail re = new RandomEmail();
         re.newEmail();
        }
   }