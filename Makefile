all: p1 p2

p1:
	@echo "compiling source files for problem 1..."
	@if ! [ -d "bin" ]; then mkdir bin; fi
	@javac -d bin/ prob1/*.java
p2:
	@echo "compiling source files for problem 2..."
	@if ! [ -d "bin" ]; then mkdir bin; fi
	@javac -d bin/ prob2/*.java
run1:
	@java -cp bin/ prob1 
run2:
	@java -cp bin/ PayableInterfaceTest
clean:
	rm -rf bin/
