//package com.company.annotation;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Cookies c = new Cookies();
//
//        Field[] fs = c.getClass().getFields(); //получить все поля
//
//        for (Field f:fs) {
//            if(f.getDeclaredAnnotation(ControlledObject.class).def()==1) { //искать поле где в аннотации указано 1
//
//                String name = f.getDeclaredAnnotations(ControlledObject.class).name();
//                Method[] ms = c.getClass().getDeclaredMethods();
//
//                for (Method m:ms) {
//                    if(m.getName().equals("set" + name)); {
//                        m.invoke(c, "123"); //вызов через рефлексию
//                    }
//                }
//            }
//        }
//
////        System.out.println(c.getClass().getAnnotation(ControlledObject.class).name());
////
////        System.out.println(c.getClass().getAnnotations());
////
////        System.out.println(c.getClass().getDeclaredAnnotationsByType(ControlledObject.class));
//
////        Annotation[] a = c.getClass().getAnnotations();
////
////        for (Annotation aa:a) {
////            if(aa.annotationType().getSimpleName().equalsIgnoreCase("ControledObject")) {
////                System.out.println(((ControlledObject) aa).name());
////                System.out.println(((ControlledObject) aa).def());
////            }
////        }
//
//    }
//
//}
