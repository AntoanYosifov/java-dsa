package easy;
// Given two non-negative decimal strings a and b, return their sum as a decimal string.
//
// Example 1:
// Input: a = "11", b = "1"
// Output: "12"
//
// Example 2:
// Input: a = "1090", b = "9011"
// Output: "10101"
//
// Constraints:
// 1 <= a.length, b.length <= 10^4
// a and b consist only of characters '0' to '9'.
// Each string does not contain leading zeros except for the zero itself.
public class AddIntegerStrings {

    public String addIntegerStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0){
                int numberAValueToAdd = a.charAt(i--) - '0';
                sum += numberAValueToAdd;
            }
            if (j >= 0) {
                int numberBValueToAdd = b.charAt(j--) - '0';
                sum += numberBValueToAdd;
            }
            int toAppend = sum % 10;
            sb.append(toAppend);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
