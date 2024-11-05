interface StringOperations {
    int countCharacters(String str);
    String oddPositionCharacters(String str);
    String reverseString(String str);
}

// Класс ProcessStrings, реализующий интерфейс StringOperations
class ProcessStrings implements StringOperations {
    @Override
    public int countCharacters(String str) {
        return str.length();
    }

    @Override
    public String oddPositionCharacters(String str) {
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) { // Нечетные позиции (1, 3, 5...)
                oddChars.append(str.charAt(i));
            }
        }
        return oddChars.toString();
    }

    @Override
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}