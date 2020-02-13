class RaindropConverter {

    String convert(int number) {
        String str = "";

        /*
        if(number == 1){
            return "1";
        }*/
        if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0 ){
            return Integer.toString(number);
        }
        if(number % 3 == 0){
            str += "Pling";
        }
        if(number % 5 == 0){
            str += "Plang";
        }
        if(number % 7 == 0){
            str += "Plong";
        }
        return str;
    }
    /**BETTER SOLUTION
     * class RaindropConverter {
     *
     *     String convert(int number) {
     *         StringBuilder sb = new StringBuilder();
     *
     *         if (number % 3 == 0) {
     *             sb.append("Pling");
     *         }
     *
     *         if (number % 5 == 0) {
     *             sb.append("Plang");
     *         }
     *
     *         if (number % 7 == 0) {
     *             sb.append("Plong");
     *         }
     *
     *         if (sb.length() == 0) {
     *             sb.append(number);
     *         }
     *
     *         return sb.toString();
     *     }
     *
     * }
     * **/
}
