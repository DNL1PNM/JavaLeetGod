package main.java.OtherTasks;

import java.util.Scanner;

public class Task00_0001_Line {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int k1 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int k2 = scanner.nextInt();
            int b2 = scanner.nextInt();

            Line line1 = new Line(k1,b1);
            Line line2 = new Line(k2,b2);

            System.out.println(line1.intersection(line2));
        }
    }

    class Line {
        int k, b;

        public Line(int k, int b) {
            this.k = k;
            this.b = b;
        }

        public Point intersection(Line other) {
            if (this.k == other.k) {
                // линии параллельны или совпадают
                return null;
            }

            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x, y);
        }

    }

    class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d;%d)", x, y);
        }
    }