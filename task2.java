// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd

public class task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddd";
        String newString = zip(str);
        System.out.println(newString);
    }

    static String zip(String str) {
        char[] charArray = str.toCharArray();
        int count = 1;        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < charArray.length - 1; i++) {

            if (charArray[i] != charArray[i + 1]) {
                sb.append(count);
                sb.append(charArray[i]);
                count = 1;
            } else {
                count += 1;
            }            
        }
        sb.append(count);
        sb.append(charArray[charArray.length-1]);
        return sb.toString();
        }
}
