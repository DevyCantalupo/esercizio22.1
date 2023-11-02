public class esercizio22di1 {
        public static String getUnicodeCharacter(String inputString, int position) {
            StringBuilder result = new StringBuilder();

            if (position >= 0 && position < inputString.length()) {
                char character = inputString.charAt(position);
                result.append("Carácter en la posición ").append(position).append(": Unicode: \\u");
                result.append(Integer.toHexString(character | 0x10000).substring(1));
            } else {
                result.append("Error");
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String resultado = getUnicodeCharacter("a", 0);
            System.out.println(resultado);
        }
    }

