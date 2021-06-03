package com.company;

public class SimpleHashTable {
   private Employee[] hashtable;

   public SimpleHashTable() {
       //constructor
       //initialize the Employee hashtable array
       hashtable = new Employee[10];
   }

   public void put(String key, Employee employee) {
       //key and employee are the 'value pair' i.e the key and the data to be stored
       int hashedKey = hashKey(key);
       if (hashtable[hashedKey] != null) {
           System.out.println("Sorry, there's already an employee at position " +hashedKey);
       }
       else {
           hashtable[hashedKey] = employee;
       }
   }

   public Employee get(String key) {
       int hashedKey = hashKey(key);
       return hashtable[hashedKey];
   }

   private int hashKey(String key) {
       return key.length() % hashtable.length;
   }

   public void printHashTable() {
       for(int i = 0; i< hashtable.length; i++) {
           System.out.println(hashtable[i]);
       }
   }

}
