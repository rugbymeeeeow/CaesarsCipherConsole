//class FileExample {
//    public static void main(String[] args) {
//        // Путь к файлу для чтения
//        Path inputFilePath = Paths.get("input.txt");
//        // Путь к файлу для записи
//        Path outputFilePath = Paths.get("output.txt");
//
//        try {
//            // Чтение всех строк из файла
//            List<String> lines = Files.readAllLines(inputFilePath);
//            // Выводим строки на консоль
//            for (String line : lines) {
//                System.out.println(line);
//            }
//
//            // Запись в новый файл
//            Files.write(outputFilePath, lines);
//            System.out.println("Данные успешно записаны в " + outputFilePath);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

import javax.crypto.Cipher;
import java.util.Scanner;
import java.util.regex.Pattern;

class CaesarsСipher{
    private String input;
    private int number;
    public CaesarsСipher(String input, int number){
        this.input = input; this.number = number % 26;
    }
    public String Cipher(){
        StringBuilder editInput = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(Character.isLetter(currentChar)){
                char numberInput = (char) ((currentChar - 'a' + number) % 26 + 'a');
                editInput.setCharAt(i,numberInput);
            }
            else{
                editInput.setCharAt(i,currentChar);
            }
        }
        return editInput.toString();
    }
    public String Jqifs(){
        StringBuilder editInput = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(Character.isLetter(currentChar)){
                char numberInput = (char) ((currentChar - 'a' - number + 26) % 26 + 'a');
                editInput.setCharAt(i,numberInput);
            }
            else{
                editInput.setCharAt(i,currentChar);
            }
        }
        return editInput.toString();
    }
    public String Cipher1(){
        StringBuilder editInput = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(Character.isLetter(currentChar)){
                char numberInput = (char) ((currentChar - 'а' + number) % 33 + 'а');
                editInput.setCharAt(i,numberInput);
            }
            else{
                editInput.setCharAt(i,currentChar);
            }
        }
        return editInput.toString();
    }
    public String Jqifs2(){
        StringBuilder editInput = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if(Character.isLetter(currentChar)){
                char numberInput = (char) ((currentChar - 'а' - number + 33) % 33 + 'а');
                editInput.setCharAt(i,numberInput);
            }
            else{
                editInput.setCharAt(i,currentChar);
            }
        }
        return editInput.toString();
    }
    public char[] pomogite() {
        StringBuilder editInput = new StringBuilder(input);
        for (int number = 1; number < 33; number++) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (Character.isLetter(currentChar)) {
                    char numberInput = (char) ((currentChar - 'а' - number + 32) % 32 + 'а');
                    editInput.setCharAt(i, numberInput);
                } else {
                    editInput.setCharAt(i, currentChar);
                }
            }
            System.out.println("Сдвиг " + number + ": " + editInput.toString());
        }
        return editInput.toString().toCharArray();
    }
    public char[] pomogite1() {
        StringBuilder editInput = new StringBuilder(input);
        for (int number = 1; number < 26; number++) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (Character.isLetter(currentChar)) {
                    char numberInput = (char) ((currentChar - 'a' - number + 26) % 26 + 'a');
                    editInput.setCharAt(i, numberInput);
                } else {
                    editInput.setCharAt(i, currentChar);
                }
            }
            System.out.println("Сдвиг " + number + ": " + editInput.toString());
        }
        return editInput.toString().toCharArray();
    }
}
public class Main {
    public static void main(String[] args) {
        while(true){
            Menu();
            Scanner in = new Scanner(System.in);
            int Choice = Integer.parseInt(in.nextLine());
            switch (Choice){
                case 1:
                    int a = chooseRusOrEng();
                    if(a == 2) {
                        System.out.println("Введите шифр: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = in.nextInt();
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.Cipher());
                        break;
                    }
                    else {
                        System.out.println("Введите шифр: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = in.nextInt();
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.Cipher1());
                        break;
                    }
                case 2:
                    int b = chooseRusOrEng();
                    if(b == 2) {
                        System.out.println("Введите предложение: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = in.nextInt();
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.Jqifs());
                        break;
                    }
                    else {
                        System.out.println("Введите предложение: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = in.nextInt();
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.Jqifs2());
                        break;
                    }
                case 3:
                    int c = chooseRusOrEng();
                    if(c == 2) {
                        System.out.println("Введите предложение: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = in.nextInt();
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.pomogite1());
                        break;
                    }
                    else {
                        System.out.println("Введите предложение: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = in.nextInt();
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.pomogite());
                        break;
                    }
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
            }
        }
    }
    private static void Menu(){
        System.out.println("Меню: ");
        System.out.println("1 Зашифровка");
        System.out.println("2 Расшифровка");
        System.out.println("3 Расшифровка каждым сдвигом");
        System.out.println("4 ПотомРеализую");
        System.out.println("5 ПотомРеализую");
        System.out.println("6 Выход");
    }
    private static boolean isEnglish(String input){
        return Pattern.matches("[a-zA-Z0-9,.!?;:\"'()\\[\\]{}\\s-]*$", input);
    }
    private static boolean isRus(String input){
        return Pattern.matches("[а-яА-ЯеЁ0-9,.!?;:\"'()\\[\\]{}\\s-]*$", input);
    }
    private static int chooseRusOrEng(){
        System.out.println("Выберите : 1 - русский, 2 - английский");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}


