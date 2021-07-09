public class Validate {

    boolean checkRomeSymbol(String enter) {
        String[] rime = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int i = 0;
        try {
            for (i = 0; i < 11; i++) {
                if (rime[i].equals(enter)) {  //если в процессе проверки появляется совпадение с массивом римских цифр
                    return true;
                }
            }
        } catch (Exception ignored) {
        }
        return false;
    }

    boolean checkArabSymbol(String enter) {
        String[] ar = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int i = 0;
        try {
            for (i = 0; i < 11; i++) {
                if (ar[i].equals(enter)) {  //если в процессе проверки появляется совпадение с массивом римских цифр
                    return true;
                }
            }
        } catch (Exception ignored) {
        }
        return false;
    }
}