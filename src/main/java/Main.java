public class Main {
    private static String initialText = "Russia invaded Ukraine on 24 February 2022," +
            " marking a steep escalation of the Russo-Ukrainian War," +
            " which began in 2014 following the Ukrainian Revolution of Dignity." +
            " The invasion has caused Europe's largest refugee crisis" +
            " since World War II, with more than 5.4 million Ukrainians leaving " +
            "the country and a quarter of the population displaced." +
            "At the start of the war in 2014, Russia annexed Crimea," +
            " and Russian-backed separatists seized part of the south-eastern" +
            " Donbas region of Ukraine, sparking a regional war there. In 2021," +
            " Russia began a large military build-up along its border with Ukraine," +
            " amassing up to 190,000 troops along with their equipment." +
            " (text is taken from Wikipedia.com)";
    private static final String wordToReplace = "Russia";
    private static final String replacementWord = "bad_country";

    public static void main(String[] args) {
        System.out.println("Text before changes: ");
        System.out.println(initialText);
        initialText = initialText.replaceAll(wordToReplace, replacementWord);

        System.out.println("Text after changes: ");
        System.out.println(initialText);
    }
}