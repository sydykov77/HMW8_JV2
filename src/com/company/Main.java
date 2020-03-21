package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dictionary = new HashMap<>();
        Map<String, String[]> bigВictionary = new HashMap<>();

        dictionary.put("красивый", new String[]{"симпотичный", "эффектный", "роскошный", "благовидный","картинный","бесподобный","хорошенький","великолепный","изящный"});
        dictionary.put("дом", new String[]{"здание", "убежище", "хата", "хижина","этажка","лачуга","вилла","дача","усадьба"});
        dictionary.put("человек", new String[]{"лицо", "личность", "гражданин", "индивид","адам","смертный","индивидуальность","персона","особа"});
        dictionary.put("большой", new String[]{"большуший", "огромный", "громадный", "внушительный","изрядный","объемистый","заметный","ощутительный","колоссальный"});


        Set<String> keys = dictionary.keySet();
        Iterator iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next().toString();
            String[] values = dictionary.get(key);
            bigВictionary.put(key, values);
            for (int i =0; i<values.length;i++) {
                String budushiyKlyuch = values[i];
                ArrayList<String> strArr = new ArrayList<>(values.length);
                strArr.addAll(Arrays.asList(values));
                strArr.remove(budushiyKlyuch);
                strArr.add(key);
                String[] newVals = new String[strArr.size()];
                newVals = strArr.toArray(newVals);
                System.out.println(budushiyKlyuch
                        + " - " + Arrays.toString(newVals));
                bigВictionary.put(budushiyKlyuch, newVals);
            }
        }


        System.out.println("Введите слово: ");

        Scanner s = new Scanner(System.in);
        String sentences = s.nextLine();
        String[] words = sentences.split(" ");
        Random r = new Random();

        for (int i = 0; i < words.length; i++) {
            String[] synonyms = dictionary.get(words[i]);
            if (synonyms != null) {
                int randomN = r.nextInt(synonyms.length);

                System.out.printf(synonyms[randomN] + " ");

            } else {
                System.out.println("Не понял Вас");
            }

        }

    }
}
