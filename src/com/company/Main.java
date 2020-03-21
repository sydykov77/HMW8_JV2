package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String key=new String();
        Map<String, String[]> bigDictionary = new HashMap<>();

        bigDictionary.put("красивый", new String[]{"симпотичный", "эффектный", "роскошный", "благовидный","картинный","бесподобный","хорошенький","великолепный","изящный"});
        bigDictionary.put("дом", new String[]{"здание", "убежище", "хата", "хижина","этажка","лачуга","вилла","дача","усадьба"});
        bigDictionary.put("человек", new String[]{"лицо", "личность", "гражданин", "индивид","адам","смертный","индивидуальность","персона","особа"});
        bigDictionary.put("большой", new String[]{"большуший", "огромный", "громадный", "внушительный","изрядный","объемистый","заметный","ощутительный","колоссальный"});


        while (true) {
            System.out.println("Введите слово:");
            Scanner scanner = new Scanner(System.in);
            String sentences = scanner.nextLine();
            String[] words = sentences.split(" ");
            for (String word : words) {
                String[] sinonyms = bigDictionary.get(word);
                Random r = new Random();
                if (sinonyms != null) {
                    System.out.print(sinonyms[r.nextInt(sinonyms.length)] + " ");
                }else if (word != null){
                    System.out.print(word + " ");
                }
                else {
                    System.out.print("другое слово");
                }
            }
            System.out.println();
        }
    }
}

