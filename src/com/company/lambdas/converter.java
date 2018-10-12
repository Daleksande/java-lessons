package com.company.lambdas;

public class converter {

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String[] args) {
        Converter<String,Integer> conv = (from -> Integer.valueOf(from));
        conv.convert("123");
        System.out.println(conv.convert("123"));

//        Converter<String,Integer> conv = (Integer::valueOf);
//        conv.convert("123");
//        Converter<String, Integer> convc = (f->Integer.valueOf(f));
//        System.out.println(convc);
    }

}
