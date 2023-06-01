// //extending Thread class
// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// public class ThreadJava {
//     public static void main(String[] args) {

//         A obj1 = new A();
//         B obj2 = new B();

//         obj1.start();
//         try {
//             Thread.sleep(2);
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         obj2.start();

//     }
// }

//implementing Runable interface 

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// public class ThreadJava {
//     public static void main(String[] args) {

//         Runnable obj1 = new A();
//         Runnable obj2 = new B();

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();
//         // kuch nahi ho raha hai - so what we'll do we have to make the referece of
//         // runnable and to the object and pass that reference as a argument to the
//         // thread constructor

//         t2.start();

//     }
// }

//let's use the lambda expression✔➡⏩⏩

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }

//         }
//     }
// }

public class ThreadJava {
    public static void main(String[] args) {

        // anonymous class - lambda
        Runnable obj1 = () -> {
            {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi");

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        t2.start();

    }
}