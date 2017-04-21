package Learning;

 class PriceParser {
     StringBuffer sb = new StringBuffer();
     private String strDollar;
     private String strCent;
     private String tempPrice;
     private char[] inPrice;
     private int dollar;
     private int cent;

     public void getPrice(String price) {
         inPrice = price.toCharArray();
         processingPrice();
     }

     private void processingPrice() {
         strDollar = "";
         strCent = "";
         int i;
         int j;
         for (i = 0; i < inPrice.length; i++) {
             if (Character.isDigit(inPrice[i])) {
                 while (Character.isDigit(inPrice[i])) {
                     sb = sb.append(inPrice[i]);
                     i++;
                 }

                 if (inPrice[i] == ',' || inPrice[i] == '.'){
                     tempPrice = sb.toString();
                     strDollar = tempPrice;
                     tempPrice = "";
                     sb.setLength(0);
                     i++;
                 }

                 for (j = i; j < inPrice.length; j++) {
                     if (!Character.isDigit(inPrice[j])) break;
                     sb = sb.append(inPrice[j]);
                     i=j;
                 }
                 if (sb.length()== 1){
                     sb = sb.append(0);
                     tempPrice = sb.toString();
                     }
                 if (sb.length()> 2){
                     sb = sb.delete(2,sb.length());
                     tempPrice = sb.toString();
                 }else
                     tempPrice = sb.toString();
                     strCent = tempPrice;
             }
         }

         dollar = Integer.parseInt(strDollar);
         cent = Integer.parseInt(strCent);
         sb.setLength(0);
     }

     public String showPrice(int price){
       String showPrice = String.valueOf(price);
       showPrice = sb.append('$').append(price).append(',').append(0).toString();
       return showPrice;
     }

     public String showPrice(double price) {
         String showPrice = String.valueOf(price);
         showPrice = sb.append('$').append(price).toString();
         return showPrice;
     }
 }