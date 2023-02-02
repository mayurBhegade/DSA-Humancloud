package Demo;

import java.util.Scanner;

public class App
{
		public static void main(String[] args)
		{
				 Scanner sc =new Scanner(System.in);
				 
			do {
				System.out.println("_____Main Menu_____");
				System.out.println("\n1.Stack");
				System.out.println("\n2.Queue");
				System.out.println("\n3.LinkedList");
				System.out.println("\n4.Exit");

				
				System.out.println("Enter your choice...");
				switch(sc.nextInt())
				{
				case 1 :
					Stack stk = new Stack();
					Scanner sc1 = new Scanner(System.in);
					do
					{
						System.out.println("------ STACK MENU-------");
						System.out.println("\n1.PUSH");
						System.out.println("\n2.POP");
						System.out.println("\n3.SHOW");
						System.out.println("\n4.PEEK");
						System.out.println("\n5.SIZE");
						System.out.println("\n6.IS_EMPTY");
						System.out.println("\n7.EXIT");

						System.out.println("\n Enter your Choice : ");
						switch(sc1.nextInt())
						{
						case 1 :
								System.out.println("Enter the values : ");
								stk.push(sc1.nextInt());
								break;
								
						case 2 :
								System.out.println("element pop : "+stk.pop());
								break;
								
						case 3 :
								stk.show();
								break;
							
						case 4 :
							    System.out.println("element peek : "+stk.peek());
							    break;
								
						case 5 :
							    System.out.println("Size of elements : "+stk.size());
							    break;
							    
						case 6 :
								System.out.println("Stack is empty : "+stk.isEmpty());
								break;
								
						case 7 :					   	    	        
							    System.out.println("Thank u...!");
							    System.exit(0);
							    break;
								
						default :
								 System.out.println("Wrong choice...");
								 
						}
						System.out.println("\n Do you want to continue...please press 1");
						
					}
						while(sc1.nextInt()==1);
					        break;
						
						case 2 :
							Queue qq = new Queue();
				   			Scanner sc11 = new Scanner(System.in);
				   			do
				   			{
				   				System.out.println("-------QUEUE MENU---------");
				   				System.out.println("\n1.ENQUEUE");
				   				System.out.println("\n2.DEQUEUE");
				   				System.out.println("\n3.SHOW");
				   				System.out.println("\n4.SIZE");
				   				System.out.println("\n5.IS_EMPTY");
				   				System.out.println("\n6.IS_FULL");
				   				System.out.println("\n7.EXIT");
				   				
				   				System.out.println("\nEnter your Choice...");
				   				switch(sc11.nextInt())
				   				{
				   				case 1 :
				   						System.out.println("Enter the values : ");
				   						qq.enqueue(sc11.nextInt());
				   						break;
				   						
				   				case 2 :
				   						System.out.println("Element remove from Queue : "+qq.dequeue());
				   						break;
				   						
				   				case 3 :
				   						qq.show();
				   						break;
				   						
				   				case 4 :
				   					    System.out.println("Size of elements stored in Queue : "+qq.getsize());
				   					    break;
				   					    
				   				case 5 :
				   					   System.out.println("Stack is empty : "+qq.isEmpty());
				   					   break;
				   					   
				   				case 6 :
				   						System.out.println("Stack is full : "+qq.isFull());
				   						break;
				   						
				   				case 7 :
				   	    	            System.out.println("Go to the main menu....press 1 ");
				   	    	            
				   	    	              while(sc11.nextInt()==1)
				   	    	              {
				   	    	               break;
				   	    	              }
				   	    	            
				   						break;
				   						
				   		       default :			
				   		    	   		System.out.println("Wrong choice...");
				   		    	   		break;
				   				
				   				}
				   				System.out.println("\n Do you want to continue...please press 1");
				   				
				   			}
				   				while(sc11.nextInt()==1);
				   		      	break;
				   				
				   	      case 3 :
				   	    	      LLDemo  LL = new LLDemo();
				   			      Scanner sc12 = new Scanner(System.in);
				   			do
				   			{
				   				System.out.println("-------LINKED LIST MENU---------");
				   				System.out.println("\n1.INSERT");
				   				System.out.println("\n2.INSERT AT FIRST POSITION");
				   				System.out.println("\n3.SHOW");
				   				System.out.println("\n4.INSERT AT POSITION");
				   				System.out.println("\n5.DELETE");
				   				System.out.println("\n6.EXIT");
				   				
				   				System.out.println("\nEnter your Choice...");
				   				switch(sc12.nextInt())
				   				{
				   				case 1 :
				   						System.out.println("Enter the values : ");
				   						LL.Insert(sc12.nextInt());
				   						break;
				   						
				   				case 2 :
				   						System.out.println("Insert at first position : ");
				   						LL.InsertAtFirst(sc12.nextInt());
				   						break;
				   						
				   				case 3 :
				   						LL.show();
				   						break;
				   						
				   				case 4 :
				   					    System.out.println("Insert the element through index : ");
				   					    LL.InsertAt((sc12.nextInt()), (sc12.nextInt()));
				   					    break;
				   					    
				   				case 5 :
				   					   System.out.println("Element Deleted : ");
				   					   LL.deleteAt(sc12.nextInt());
				   					   break;
				   			
				   				case 6 :
					   	    	        System.out.println("Thank u...!");
					   	    	        System.exit(0);
				   						break;
				   						
				   		       default :			
				   		    	   		System.out.println("Wrong choice...");
				   		    	   		break;
				   				
				   				}
				   				System.out.println("\n Do you want to continue...please press 1");
				   				
				   			}
				   				while(sc12.nextInt()==1);
				   			
				   			    break;
				   		
				   	     case 4 :	   						   
				   	    	    System.out.println("Thank u...!");
				   	    	    System.exit(0);
	   						    break;
							    
					 default :			
		   		    	   		  System.out.println("Wrong choice...");
		   		    	   		  break;		    

							
				}		
				 System.out.println("Do you want to Continue...please press 1");
						
					
					
				}
			 
			while(sc.nextInt()==1);
			
			sc.close();

						 
		}
}
