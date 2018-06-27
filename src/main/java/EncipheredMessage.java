class EncipheredMessage {

    private String message;

    EncipheredMessage(String message) {
        this.message = message;
    }

    String decipher() {
        StringBuilder decipheredMessage = new StringBuilder();
        char[] charArray = this.message.toCharArray();

        int i;
        for (i = 0; i < charArray.length; i += 2) {
            decipheredMessage.append(charArray[i]);
        }

        if (charArray.length % 2 == 0) {
            for (i = charArray.length - 1; i > 0; i -= 2) {
                decipheredMessage.append(charArray[i]);
            }
        } else {
            for (i = charArray.length - 2; i > 0; i -= 2) {
                decipheredMessage.append(charArray[i]);
            }
        }

        return decipheredMessage.toString();
    }
}
