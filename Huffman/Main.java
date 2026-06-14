public class Main {
public static void main(String[] args) {
        if (args.length != 3) {

            System.out.println(
                    "Использование:\n" +
                    "encode input output\n" +
                    "decode input output"
            );

            return;
        }

        String mode = args[0];
        String input = args[1];
        String output = args[2];

        try {

            if (mode.equalsIgnoreCase("encode")) {

                HuffmanEncoder encoder = new HuffmanEncoder();

                encoder.encode(input, output);

                System.out.println("Кодирование завершено.");
            }

            else if (mode.equalsIgnoreCase("decode")) {

                HuffmanDecoder decoder = new HuffmanDecoder();

                decoder.decode(input, output);

                System.out.println("Декодирование завершено.");
            }

            else {
                System.out.println(
                        "Режим должен быть encode или decode."
                );
            }

        } catch (Exception e) {
            System.out.println(
                    "Ошибка: " + e.getMessage()
            );

            e.printStackTrace();
        }
    }
}
