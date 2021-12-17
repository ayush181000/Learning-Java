package com.ayush;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Python", "an interpreted,high level programing language with dynamic semantics");
        languages.put("Java", "a compiled high level, object-oriented independent language");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "beginners All Purpose Symbolic Instruction Code");
        System.out.println(languages.put("Lisp", "There in lies madness"));

        System.out.println(languages.get("Java"));
        System.out.println(languages.get("Python"));
        System.out.println(languages.get("Lisp"));

        if (languages.containsKey("Lisp")) {
            System.out.println("Lisp is already in map");
        } else {
            System.out.println(languages.put("Lisp", "Rewrite madness"));
        } // languages.put returns object and return null if it is brand-new key

        System.out.println(languages.get("Lisp"));

        System.out.println("====================================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic")) {
            System.out.println("Algol removed");

        } else {
            System.out.println("Kay value pair not found");
        }

        if (languages.replace("Lisp", "There in lies madness", "programing language with imperative features")) {
            System.out.println("Lisp is replaced");
        } else {
            System.out.println("Lisp is not replaced");
        }

//            System.out.println(languages.replace("Scala", "this will not be added"));

        System.out.println("====================================");

        for (String key : languages.keySet()) {
            System.out.println(key + ":" + languages.get(key));
        }


    }
}
