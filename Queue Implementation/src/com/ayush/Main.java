package com.ayush;

import java.util.Scanner;

class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        int x = arr[front];
        System.out.println("Removing " + x);
        front = (front + 1) % capacity;
        count--;
        return x;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public boolean isFull() {
        return (size() == capacity);
    }

    public void print() {
        System.out.println("============================");
        System.out.println("Queue : ");
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============================");
    }
}

class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Queue q = new Queue(5);

    public static void main(String[] args) {
        boolean quit = false;
        printOptions();

        while (!quit) {
            System.out.print("Enter choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter the value : ");
                    int x = scanner.nextInt();
                    scanner.nextLine();
                    q.enqueue(x);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.println("Peeking at element " + q.peek());
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    if (q.isEmpty()) System.out.println("Queue is empty");
                    else System.out.println("Queue is not empty");
                    break;
                case 6:
                    if (q.isFull()) System.out.println("Queue is full");
                    else System.out.println("Queue is not full");
                    break;
                case 7:
                    printOptions();
                    break;
                default: {
                    System.out.println("Enter the correct option from the list. ");
                    printOptions();
                }
            }
        }
    }

    private static void printOptions() {
        System.out.println("""
                Choose from following actions :\s
                0. to quit
                1. enqueue
                2. dequeue
                3. peek
                4. print the queue
                5. is Empty ?
                6. is Full ?
                7. print the available actions
                """);
    }
}
