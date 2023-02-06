package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("_____Main Menu_____");
			System.out.println("\n1.Stack");
			System.out.println("\n2.Queue");
			System.out.println("\n3.LinkedList");
			System.out.println("\n4.Array");
			System.out.println("\n5.Exit");

			System.out.println("\nEnter your choice...");
			int n = sc.nextInt();
			switch (n) {
			case 1:

				Stack stk = new Stack();
				Scanner sc1 = new Scanner(System.in);
				do {

					System.out.println("------ STACK MENU-------");
					System.out.println("\nA.PUSH");
					System.out.println("\nB.POP");
					System.out.println("\nC.SHOW");
					System.out.println("\nD.PEEK");
					System.out.println("\nE.SIZE");
					System.out.println("\nF.IS_EMPTY");
					System.out.println("\nG.Exit");

					System.out.println("\n Enter your Choice : ");
					char ch = sc1.next().charAt(0);

					switch (ch) {
					case 'A':
						System.out.println("Enter the values : ");
						try {	
					        	stk.push(sc1.nextInt());
						    }
						catch(InputMismatchException e)
						{
							System.out.println("This is not valid data...");
							
							return;
						}
						break;

					case 'B':
						System.out.println("element pop : " + stk.pop());
						break;

					case 'C':
						stk.show();
						break;

					case 'D':
						System.out.println("element peek : " + stk.peek());
						break;

					case 'E':
						System.out.println("Size of elements : " + stk.size());
						break;

					case 'F':
						System.out.println("Stack is empty : " + stk.isEmpty());
						break;

					case 'G':
						System.out.println("Thank u...!");
						System.exit(0);
						break;

					default:
						System.out.println("Wrong choice...");
						break;

					}

					System.out.println("Do you want to Continue...please press 1");

				}

				while (sc1.nextInt() == 1);

				break;

			case 2:

				Queue qq = new Queue();
				Scanner sc11 = new Scanner(System.in);
				do {
					System.out.println("-------QUEUE MENU---------");
					System.out.println("\nA.ENQUEUE");
					System.out.println("\nB.DEQUEUE");
					System.out.println("\nC.SHOW");
					System.out.println("\nD.SIZE");
					System.out.println("\nE.IS_EMPTY");
					System.out.println("\nF.IS_FULL");
					System.out.println("\nG.Exit");

					System.out.println("\nEnter your Choice...");
					char ch1 = sc11.next().charAt(0);

					switch (ch1) {
					case 'A':
						System.out.println("Enter the values : ");
						qq.enqueue(sc11.nextInt());
						break;

					case 'B':
						System.out.println("Element remove from Queue : " + qq.dequeue());
						break;

					case 'C':
						qq.show();
						break;

					case 'D':
						System.out.println("Size of elements stored in Queue : " + qq.getsize());
						break;

					case 'E':
						System.out.println("Stack is empty : " + qq.isEmpty());
						break;

					case 'F':
						System.out.println("Stack is full : " + qq.isFull());
						break;

					case 'G':
						System.out.println("Thank u...!");
						System.exit(0);
						break;

					default:
						System.out.println("Wrong choice...");
						break;

					}

					System.out.println("Do you want to Continue...please press 1");

				}

				while (sc11.nextInt() == 1);

				break;

			case 3:

				LLDemo LL = new LLDemo();
				Scanner sc12 = new Scanner(System.in);
				do {
					System.out.println("-------LINKED LIST MENU---------");
					System.out.println("\nA.INSERT");
					System.out.println("\nB.INSERT AT FIRST POSITION");
					System.out.println("\nC.SHOW");
					System.out.println("\nD.INSERT AT POSITION");
					System.out.println("\nE.DELETE");
					System.out.println("\nF.Exit");

					System.out.println("\nEnter your Choice...");
					char ch11 = sc12.next().charAt(0);
					switch (ch11) {
					case 'A':
						System.out.println("Enter the values : ");
						LL.Insert(sc12.nextInt());
						break;

					case 'B':
						System.out.println("Insert at first position : ");
						LL.InsertAtFirst(sc12.nextInt());
						break;

					case 'C':
						LL.show();
						break;

					case 'D':
						System.out.println("Insert the element through index : ");
						LL.InsertAt((sc12.nextInt()), (sc12.nextInt()));
						break;

					case 'E':
						System.out.println("Element Deleted : ");
						LL.deleteAt(sc12.nextInt());
						break;

					case 'F':
						System.out.println("Thank u...!");
						System.exit(0);
						break;

					default:
						System.out.println("Wrong choice...");
						break;

					}

					System.out.println("Do you want to Continue...please press 1");

				}

				while (sc12.nextInt() == 1);

				break;

			case 4:

				DynamicArray DA = new DynamicArrayIMPL();
				Scanner sc13 = new Scanner(System.in);
				do {
					System.out.println("-------Array MENU---------");
					System.out.println("\nA.push");
					System.out.println("\nB.push_at_position");
					System.out.println("\nC.get element");
					System.out.println("\nD.size");
					System.out.println("\nE.show");
					System.out.println("\nF.Exit");

					System.out.println("\nEnter your Choice...");
					char arr = sc13.next().charAt(0);
					switch (arr) {
					case 'A':
						System.out.println("Enter the values : ");
						DA.push(sc13.nextInt());
						break;

					case 'B':
						System.out.println("Insert at any position : ");
						DA.pushAtPos(sc13.nextInt(), sc13.nextInt());
						break;

					case 'C':
						System.out.println("Get Element : ");
						DA.get(sc13.nextInt());
						break;

					case 'D':
						System.out.println("Size of Elements is : ");
						DA.size();
						break;

					case 'E':
						System.out.println("Show all elements : ");
						DA.show();
						break;

					case 'F':
						System.out.println("Thank u...!");
						System.exit(0);
						break;

					default:
						System.out.println("Wrong choice...");
						break;

					}

					System.out.println("Do you want to Continue...please press 1");

				}

				while (sc13.nextInt() == 1);

				break;

			case 5:
				System.out.println("Thank u...!");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice...");
				break;

			}
			System.out.println("Do you want to Continue...please press 1");

		}

		while (sc.nextInt() == 1);

		sc.close();

	}
}
