#PROBLEM STATEMENT 

A company working in artificial intelligence domain is planning to create a Robot. But before they do heavy investment in Robot research and development, they requested their technical team to do a small prototype and create a Robot with some basic features. Technical team decided to introduce following features in the Robot prototype:

#Power Operated:

1. Robot works on battery and can walk for 5 km per charge.

2. If remaining battery is less than 15%, a red light on Robot head should lit up indicating low battery.

#Handling physical objects:

3. Robot can carry any object not weighing more than 10 Kg.

4. For every Kilogram carried by Robot, 2% extra [in addition to walking discharge] battery will be consumed.

5. If the weight of the object is more than 10 Kg, Robot display [LED display on chest] will show message “Overweight”.

#Scanning:

6. Robot can scan any bar code and display it&#39;s price on Robot Display.

7. In case bar code is not clear enough for scanning, Robot display will show “Scan Failure”.

Technical team handed over these details to IT team to build a software for Robot. Please create a Robot application in Java for automating all the features listed above.


#Assumption:

1. Robot will accept integer weights.

2. Robot will calculate the task and required power and capcity upfront and denies if it has lower power left than required.It wont complete the partial task.

3. Assuming 100% charge as complete charge.

4. Bar code is being random generated for even number and for odd number, I am assuming as failure.

#Calculation:

1. As Robot can walk 5Km/charge. It will run 50 meter per 1% charge.
