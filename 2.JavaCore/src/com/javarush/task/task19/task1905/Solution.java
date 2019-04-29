package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Адаптировать Customer и Contact к RowItem.
Классом-адаптером является DataAdapter.

9. В классе DataAdapter реализуй методы интерфейса RowItem используя подсказки в виде комментариев в интерфейсах.
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        public String getCountryCode(){
            String s= customer.getCountryName();
            String s1= "";
            for (Map.Entry<String, String> e : countries.entrySet()) {
                String key = e.getKey();
                String value = e.getValue();
                if (value.equals(s)){
                    s1= key;
                }
            }
            return s1;
        }
        public String getCompany(){
            return customer.getCompanyName();
        }

        public String getContactFirstName(){
            String[] d = contact.getName().split(", ");
            return d[1];
        }

        public String getContactLastName(){
            String[] d = contact.getName().split(", ");
            return d[0];
        }

        /*Метод getDialString() должен вернуть строку состоящую из надписи
        callto://+  и телефонного номера из которого убраны все символы кроме
        цифр(смотри примеры). Номер телефона нужно взять из getPhoneNumber() объекта сontact.*/
        public String getDialString(){
            String s1 =contact.getPhoneNumber().replaceAll("[/\\D+/g]","");
            return "callto://+"+s1;
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}