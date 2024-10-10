import javax.crypto.Cipher;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;

class FileHandler {

    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return content.toString();
    }

    public static void writeToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}


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
public class Program {
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
                        int shift = 1;
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.pomogite1());
                        break;
                    }
                    else {
                        System.out.println("Введите предложение: ");
                        String cipher = in.nextLine();
                        System.out.println("Введите сдвиг: ");
                        int shift = 1;
                        CaesarsСipher NewCipherCipher = new CaesarsСipher(cipher, shift);
                        System.out.println(NewCipherCipher.pomogite());
                        break;
                    }
                case 4:
                    String inputFilePath = "input.txt";
                    String fileContent = FileHandler.readFile(inputFilePath);
                    if (fileContent.isEmpty()) {
                        System.out.println("Файл пуст или не был прочитан! Попробуйте снова.");
                        System.out.println();
                        continue;
                    }
                    System.out.println("Содержимое файла:\n" + fileContent);
                    int language = chooseRusOrEng();
                    System.out.println("Выберите действие: 1 - шифровать, 2 - расшифровать");
                    int action = in.nextInt();
                    in.nextLine();
                    System.out.println();
                    String resultContent;
                    if (language==1 & action == 1) {
                        if (!isRus(fileContent)) {
                            System.out.println("Убедитесь, что в выбранном файле алфавит соответствует выбранному языку: ");
                            System.out.println();
                            break;
                        }
                        System.out.println("Введите сдвиг");
                        int shift = in.nextInt();
                        CaesarsСipher processor = new CaesarsСipher(fileContent, shift);
                        resultContent = processor.Cipher1();
                        FileHandler.writeToFile("output.txt", resultContent);
                        System.out.println("Полученный зашифрованный текст:\n" + FileHandler.readFile("output.txt"));
                    }
                    else if(language==2 & action==1){
                        if (!isEnglish(fileContent)) {
                            System.out.println("Убедитесь, что в выбранном файле алфавит соответствует выбранному языку: ");
                            System.out.println();
                            break;
                        }
                        System.out.println("Введите сдвиг");
                        int shift = in.nextInt();
                        CaesarsСipher processor = new CaesarsСipher(fileContent, shift);
                        resultContent = processor.Cipher();
                        FileHandler.writeToFile("output.txt", resultContent);
                        System.out.println("Полученный зашифрованный текст:\n" + FileHandler.readFile("output.txt"));
                    }
                    else if (language==1 & action == 2) {
                        if (!isRus(fileContent)) {
                            System.out.println("Убедитесь, что в выбранном файле алфавит соответствует выбранному языку: ");
                            System.out.println();
                            break;
                        }
                        CaesarsСipher processor = new CaesarsСipher(fileContent, 0);
                        resultContent = processor.Jqifs2();
                        System.out.println("Расшифрованный текст:\n" + resultContent);
                        FileHandler.writeToFile("decrypted_output.txt", resultContent);
                    }
                    else if(language==2 & action==2){
                        if (!isEnglish(fileContent)) {
                            System.out.println("Убедитесь, что в выбранном файле алфавит соответствует выбранному языку: ");
                            System.out.println();
                            break;
                        }
                        CaesarsСipher processor = new CaesarsСipher(fileContent, 0);
                        resultContent = processor.Jqifs();
                        System.out.println("Расшифрованный текст:\n" + resultContent);
                        FileHandler.writeToFile("decrypted_output.txt", resultContent);
                    }
                    else {
                        System.out.println("Такого выбора нет");
                    }
                    break;
                case 5:
                    return;
            }
        }
    }
    private static void Menu(){
        System.out.println("Меню: ");
        System.out.println("1 Зашифровка");
        System.out.println("2 Расшифровка");
        System.out.println("3 Расшифровка каждым сдвигом");
        System.out.println("4 Работа с файлом");
        System.out.println("5 Выход");
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

