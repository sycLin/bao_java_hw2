
***** THIS IS THE README FILE FOR QUESTION 10.13 *****

# How To Run

Step 1: Go to the base directory "401410081".
Step 2: Use "make p1" to compile the source files for this problem.
Step 3: Execute the program with "make run1".

# The class hierarchy

TwoDimensionalShape & ThreeDimensionalShape are direct subclasses of Shape.

Circle, Square, and Triangle inherit TwoDimensionalShape directly.

Sphere, Cubic, and Tetrahedron inherit ThreeDimensionalShape directly.

In addition, Shape, TwoDimensionalShape, and ThreeDimensionalShape are abstract classes, while the other 6 classes are concrete ones.

# My Program Flow

In main() function, an array of Shape is created and is populated with objects of the 6 concrete classes each.

With a for-loop, I processed the Shape array polymorpically, and inside the loop, "instanceof" is applied to check whether the object reference is 2D or 3D.

For 2D ones, the program outputs its area by getArea() function after invoking toString() to display basic information. As for 3D ones, the program outputs both its surface area and its volume through getArea() and getVolume() respectively after displaying basic info with toString().

# I/O

At the very beginning, the program needs a number (double) from user. The number is then used to initialize all objects of the 6 concrete classes mentioned above.