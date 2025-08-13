public class ValidParenthesis {
    public static boolean valid(String s) {
        char[] stack = new char[s.length()];
        int idx = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[idx++] = ch;
            } else {
                if (idx == 0) return false;
                char top = stack[--idx];
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return idx == 0;
    }

    public static void main(String[] args) {
        String inputString = "()";
        boolean ans = valid(inputString);
        System.out.println(ans);
    }
}
