class A
{
int i, j;
void showij() {
System.out.println("i and j: " + i + " " + j);
}
}
// Create a subclass by extending class A.
class B extends A {
int k;
void showk() {
System.out.println("k: " + k);
}
void sum() {
System.out.println("i+j+k: " + (i+j+k));
}
}
class SimpleInheritance {
public static void main(String args[]) {
A objA = new A();
B objB = new B();
// The superclass may be used by itself.
objA.i = 10;
objA.j = 20;
System.out.println("Contents of objA: ");
objA.showij();
System.out.println();
/* The subclass can access to all public members of
its superclass. */
objB.i = 7;
objB.j = 8;
objB.k = 9;
System.out.println("Contents of objB: ");
objB.showij();
objB.showk();
System.out.println();
System.out.println("Sum of i, j and k in objB:");
objB.sum();
}
}