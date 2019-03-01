Steps to execute all 3 programs,

1. Download/Clone the src folder containing the 3 java programs from GIT repo - 
2. Open Command Promt, navigate to the path containing the 'src' folder.
3. Execute the following command to compile the java program one by one,
   javac <filename>.java 
   (Example: javac SuperStack.java)
4. After successful compilation, corresponding .class will be generated in the same folder. (Example: SuperStack.class)
5. Now to execute the program, execute the following command via Command Prompt,
   java <filename>
   (Example: java SuperStack)


Steps to specify input for each Program,

---- MinimumUniqueArraySum.java ----
1. Once the generated .class file is executed is executed via command prompt, user will be queried for the input as follows,
   Note : Press 'Enter' after keying in each input
   
   - Query : "Enter the number of input elements"
     User input : 3

   - Query : Enter the input elements one by one [Press Enter after keying each number]
     User input : 
     1
     2
     2

     Output : Result=6


 ---- SuperStack.java ----
 1. Once the generated .class file is executed is executed via command prompt, user will be queried for the input as follows,
   Note : Press 'Enter' after keying in each input

   - Query : Specify the size of stack (size should be > 0)
     User input : 3

   - Query : 
     Select the operation to be performed
	 1.Push
	 2.Pop
	 3.Increment stack elements
	 User input : 1
	 (Enter the corresponding number to perform a stack operation, 1 - push, 2 - pop, 3 - increment)
 
   - Query : Enter push value:
	 User Input : 100
	 Output : TOP=100
	         Do you want to continue?
				1.Yes
				2.No

     User input : 1
	 (Enter 1 to perform more stack operations or Enter 2 to Exit)

   - Query : 
	 Select the operation to be performed
	 1.Push
	 2.Pop
	 3.Increment stack elements
	 User input : 2
     Output : TOP = 100
	         Do you want to continue?
				1.Yes
				2.No
	User input : 2

	//Exit


 ---- CountingPairs.java ----
 1. Once the generated .class file is executed is executed via command prompt, user will be queried for the input as follows,
    Note : Press 'Enter' after keying in each input

   - Query : Enter the number of input elements (>1) :
     User input : 6

   - Query : Enter the input elements one by one [Press Enter after keying each number]
     User input : 
     1
     1
     2
     2
     3
     3
     Query : Enter the delta value :
     User input : 1
     Output : Result Pair Count=2


     ----------------------------------------------------------- EOF -----------------------------------------------------------------------









