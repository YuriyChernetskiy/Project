package Learning;

 class PriceParser {
     StringBuffer sb = new StringBuffer();
     private String tempPrice;
     private char[] inPrice;
     private int price;
     boolean control;

     public void getPrice(String price) {
         inPrice = price.toCharArray();
     }

     public int processingPrice() {
         tempPrice = "";
         control = true;

         for (int i=0; i<inPrice.length; i++) {

             if (Character.isDigit(inPrice[i]))
                 sb = sb.append(inPrice[i]);

             if (inPrice[i] == ',' || inPrice[i] == '.') {
                 tempPrice = sb.toString();
                 price = Integer.parseInt(tempPrice)*100;
                 control = false;
                 tempPrice = "";
                 sb.setLength(0);
             }
             if (!control && sb.length() > 2)
                 sb = sb.delete(2, sb.length());
         }
                tempPrice = sb.toString();
                sb.setLength(0);

                if (control)
                  price = Integer.parseInt(tempPrice)*100;

                if (!control && (tempPrice.length() > 1) && tempPrice.matches("0\\d"))
                    price += Integer.parseInt(tempPrice);

                if (!control && (tempPrice.length() > 1) && tempPrice.matches("[1-9]\\d"))
                    price += Integer.parseInt(tempPrice);

                if (!control && (tempPrice.length() == 1)){
                 tempPrice += "0";
                 price += Integer.parseInt(tempPrice);
                 sb.setLength(0);
             }

             return price;
     }

     public String showPrice(int price){

         String showPrice = "$";
         int checkCent = price%100;
         sb.append(price/100);
         sb.append(',');

         if (checkCent < 10)
             sb.append('0');

         sb.append(checkCent);
         showPrice += sb.toString();
         sb.setLength(0);
         return showPrice;
         }
 }