package main.java.OtherTasks;

import java.util.Scanner;

public class Task00_0002_Triangle {
    private static Scanner scanner;

    public static void main(String[] args) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int b1 = scanner.nextInt();
            int b2 = scanner.nextInt();
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            Point a = new Point(a1, a2);
            Point b = new Point(b1, b2);
            Point c = new Point(c1, c2);
            Triangle t = new Triangle(a, b, c);
            if (t != null) {
                System.out.println("Area of the triangle is " + t.area());
            } else {
                System.out.println("Triangle does not exist");
            }
        }

        static class Triangle {

            Point a, b, c;

            public Triangle(Point a, Point b, Point c) {
                // check if the points form a triangle

                double ab = distance(a, b);
                double bc = distance(b, c);
                double ac = distance(a, c);
                if (ab + bc > ac && ab + ac > bc && ac + bc > ab) {
                    this.a = a;
                    this.b = b;
                    this.c = c;
                } else {
                    throw new IllegalArgumentException("Triangle does not exist");
                }
            }

            public double area() {
                double ab = distance(a, b);
                double bc = distance(b, c);
                double ac = distance(a, c);
                double s = (ab + bc + ac) / 2;
                return Math.sqrt(s * (s - ab) * (s - bc) * (s - ac));
            }

            private double distance(Point A, Point B) {
                return Math.sqrt((B.getX() - A.getX()) * (B.getX() - A.getX()) + (B.getY() - A.getY()) * (B.getY() - A.getY()));
            }
        }

        static class Point {
            private double x;
            private double y;

            public Point(final double x, final double y) {
                this.x = x;
                this.y = y;
            }

            public double getX() {
                return x;
            }

            public double getY() {
                return y;
            }
        }
    }
