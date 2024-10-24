public class CountVowel {
    public static void main(String[] args) {
        String text="Gerald";
        System.out.println("The number of vowels in "+text+"is :"+countVowels(text));

    }
    public static int countVowels(String text){
        int count=0;
        for (int i = 0;  i < text.length(); i++){
            char letter=text.toLowercase().charAt(i);
            if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u');
                count++;
        }
    }
        return count; 
}
