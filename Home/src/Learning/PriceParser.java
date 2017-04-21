package Learning;

 class PriceParser {
     StringBuffer sb = new StringBuffer();
     private String tempPrice;
     private char[] inPrice;
     private int price;

     public void getPrice(String price) {
         inPrice = price.toCharArray();
         processingPrice();
     }

     private void processingPrice() {

         for (int i=0; i<inPrice.length; i++) {

             if (Character.isDigit(inPrice[i]))
                 sb = sb.append(inPrice[i]);

             if (inPrice[i] == ',' || inPrice[i] == '.') {
                 tempPrice = sb.toString();
                 sb.setLength(0);
             }
             if (sb.length() > 2)
                 sb = sb.delete(2, sb.length());
         }
             tempPrice += sb.toString();
             price = Integer.parseInt(tempPrice);
             sb.setLength(0);
     }

     public String showPrice(int price){
         String showPrice;
         showPrice = sb.append('$').append(price/100).append(',').append(price%100).toString();
         return showPrice;
     }
 }