/*
67 - ADD BINARY
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/

class Solution {
    public String addBinary(String a, String b) {
        // Usamos StringBuilder para construir o resultado de forma eficiente
        StringBuilder sb = new StringBuilder();

        // Ponteiros para percorrer as strings de trás para frente
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Variável para armazenar o "vai‑um" (carry) da soma binária
        int carry = 0;

        // Enquanto ainda houver dígitos em a ou b, ou um carry pendente
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // começamos a soma com o carry

            // Se ainda houver dígitos em 'a', adicionamos ao sum
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // converte char '0'/'1' em inteiro 0/1
                i--;
            }

            // Se ainda houver dígitos em 'b', adicionamos ao sum
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // O bit resultante é o resto da divisão por 2
            sb.append(sum % 2);

            // O novo carry é a divisão inteira por 2
            carry = sum / 2;
        }

        // Como construímos o resultado de trás para frente, invertamos antes de retornar
        return sb.reverse().toString();
    }
}
