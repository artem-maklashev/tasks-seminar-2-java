// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение).
public class task3 {
    public static void main(String[] args) {
        String str = "казакf";
        System.out.println(isPolyndrome(str));
    }
    static boolean isPolyndrome( String str){
        String newString = new StringBuilder(str).reverse().toString();
        if (newString.equals(str)){
            return true;
        }
        return false;
    }
}

// new StringBuilder(hi).reverse().toString()
// mawa = mawa.substring(startindex, endindex);