package com.se12.test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SwitchTest {
    public static void main(String[] args) {
        String s = '\u2003' + "Java ";
        String striped = s.strip();
        System.out.printf("'%s'%n", striped);//'test string'

        String trimmed = s.trim();
        System.out.printf("'%s'%n", trimmed);//'test string '
       /*
        String html =
                '<html>
                     '<head></head>'
                    '<body>Hello </body>'
                '</html>';
        System.out.println(html);

        */

        String text = "Hello Baeldung!\nThis is Java 12 article.";

        text = text.indent(12);
        System.out.println(text);
        double mean
                = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .collect(Collectors.teeing(
                        Collectors.summingDouble(i -> i), Collectors.counting(),
                        (sum, n) -> sum / n));
        System.out.println(mean);
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(3);
        System.out.println(likesShort.format(1200000));

    }

    public static String getData(int number){
        return switch(number){
            case 1,2 -> "you selected 1,2";
            case 3 -> "you selected 3";
            case 4,5,6 -> "you selected either 4,5, 6";
            default -> "Please select a case";
        };
    }
}
