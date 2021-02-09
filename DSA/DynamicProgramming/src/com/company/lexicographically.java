package com.company;

import java.util.*;

public class lexicographically {

    public static void main(String[] args) {
        //input done
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        String[] city = new String[test];
        int[] Pi = new int[test];

        for(int i = 0; i < test; i++){
            Pi[i] = sc.nextInt();
            city[i] = sc.nextLine();
        }

        //copy the values in a temporary array
        String[] temporaryCity = Arrays.copyOf(city, test);
        int[] temporaryPi = Arrays.copyOf(Pi, test);

        //sort the cities
        for(int i = 0; i < test - 1; i++) {
            for (int j = i + 1; j < test; j++) {
                if (city[i].compareTo(city[j]) > 0) {
                    String temp = temporaryCity[i];
                    temporaryCity[i] = temporaryCity[j];
                    temporaryCity[j] = temp;
                    int numTemp;
                    numTemp = temporaryPi[i];
                    temporaryPi[i] = temporaryPi[j];
                    temporaryPi[j] = numTemp;
                } else if(city[i].compareTo(city[j]) == 0) {
                    if(Pi[i] < Pi[j]) {
                        int numTemp;
                        numTemp = temporaryPi[i];
                        temporaryPi[i] = temporaryPi[j];
                        temporaryPi[j] = numTemp;
                    }
                }
            }
        }

        for(int i = 0; i < test; i++) {
            int element = temporaryPi[i];
            for (int j = 0; j < test; j++) {
                if (Pi[j] == element) {
                    System.out.println(j + 1);
                }
            }
        }
    }
}