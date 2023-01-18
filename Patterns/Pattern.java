package Patterns;

public class Pattern {
    public static void main(String[] args) {
        // pattern to execute.
        pattern31(4);
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i < 2 * n; i++) {
            if (i >= n) {
                for (int j = 0; j < 2 * n - i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = 1; j < 2 * n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i - n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if ((j == 0 || j == 2 * i) && i != n - 1) {
                    System.out.print("*");
                } else if (i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 1; j++) {
                if ((j == 0 || j == 2 * (n - i - 1)) && i != 0) {
                    System.out.print("*");
                } else if (i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= 2 * i; j++) {
                    if ((j == 0 || j == 2 * i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < i - n; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= 2 * n; j++) {
                    if ((j == 0 || j == 2 * n - (2 * (i - n)))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("1");
                } else if (j % 2 == 0 && (j != 0 || j != 2 * i)) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i <= n) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print(k);
                }
                for (int k = 2; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            } else {
                for (int j = n; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int k = 2 * n - i; k > 0; k--) {
                    System.out.print(k);
                }
                for (int k = 2; k <= 2 * n - i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (i < n) {
                    if (j >= n - i && j < n + i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (j > Math.abs(n - i) && j < 2 * n - Math.abs((i - n + 1))) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j < 2 * n; j++) {
                    if (j > i && j < 2 * n - i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < 2 * n; j++) {
                    if (j >= 2 * n - (i + 1) && j <= i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            if (i > 0 && i < n - 1) {
                for (int j = 0; j < n - 1; j++) {
                    if (j == 0 || j == n - 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int k = 0; k < n - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void pattern21(int n) {
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                x = x + 1;
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(x + " ");
                if (x == 1) {
                    x = 0;
                } else {
                    x = 1;
                }
            }
            System.out.println();
        }
    }

    public static void pattern23(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if ((j == 0 || j == 2 * i) && i != n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                if (j == 0 && i == n - 2) {
                    System.out.print("");
                } else if ((j == 0 || j == 2 * i) && i != n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern24(int n) {
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j == 0 || j == 2 * n - 1 || j == i || j == 2 * n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern25(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            if (i > 0 && i < n - 1) {
                for (int j = 0; j < n - 1; j++) {
                    if (j == 0 || j == n - 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } else {
                for (int k = 0; k < n - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void pattern26(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j <= Math.abs(n - i); j++) {
                System.out.print(" ");
            }
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < 2 * n - i; j++) {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    public static void pattern30(int n) {
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void pattern31(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (i == 0 || i == 2 * n - 2) {
                    System.out.print(n);
                } else if (j == 0 || j == 2 * n - 2) {
                    System.out.print(n);
                } else if (j == 1 || j == 2 * n - 3) {
                    System.out.print(n - 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern35(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j > i && j < 2 * n - i - 1) {
                    System.out.print(" ");
                } else {
                    if (j < n) {
                        System.out.print(j + 1);
                    } else {
                        System.out.print(2 * n - j);
                    }
                }
            }
            System.out.println();
        }
    }
}
