package chpter9_Override;

public class GreetMain {
    public static void main(String[] args) {
        GreetInJapanese jp = new GreetInJapanese();
        jp.morning();
        
        GreetInEnglish en = new GreetInEnglish();
        en.morning();
    }
}