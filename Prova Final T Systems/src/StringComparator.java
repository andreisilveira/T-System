public class StringComparator {

    public boolean compareStrings(String str1, String str2) {
        // Verifica se alguma das strings é vazia
        if (str1.isEmpty() || str2.isEmpty()) {
            System.out.println("Erro: Uma ou ambas as strings estão vazias.");
            return false;
        }

        // Verifica se ambas as strings têm pelo menos 2 caracteres
        if (str1.length() < 2 || str2.length() < 2) {
            System.out.println("Erro: Pelo menos uma das strings tem menos de 2 caracteres.");
            return false;
        }

        // Obtém os dois últimos caracteres da primeira string
        String lastTwoOfStr1 = str1.substring(str1.length() - 2);

        // Obtém os dois primeiros caracteres da segunda string
        String firstTwoOfStr2 = str2.substring(0, 2);

        // Compara as duas partes obtidas
        return lastTwoOfStr1.equals(firstTwoOfStr2);
    }
}