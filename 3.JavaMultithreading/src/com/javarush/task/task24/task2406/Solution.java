package com.javarush.task.task24.task2406;

import java.math.BigDecimal;

/* 
Наследование от внутреннего класса
*/
public class Solution {
    public class Building {
        public class Hall {
            private BigDecimal square;

            public Hall() {
            }

            public Hall(BigDecimal square) {
                this.square = square;
            }
        }

        public class Apartments {
        }
    }

    public class Apt3Bedroom extends Solution.Building.Apartments {
        public Apt3Bedroom(Building b, Building.Apartments a) {
            b.super();
        }
    }
    public class BigHall extends Solution.Building.Hall{
        public BigHall(Building b, Building.Hall h) {
            b.super(h.square);
        }
    }


    public static void main(String[] args) {

    }
}
