package nested_loops;

public class forloopedeydoop {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
for (int i = 101; i > -1; i--) {
	System.out.println(i);
}


for (int i = 2; i < 101; i=i+2) {
	System.out.println(i);
}

for (int i = 1; i <100; i=i+2
) {
	System.out.println(i);
}

for (int i =1; i <501; i++) {
	if (i%2==0) {
		System.out.println(i+" even");
	}
	else {
		System.out.println(i+" odd");
	}
}
 for (int x = 0; x < 3 ; x++) {
	for (int y = 0; y < 3; y++) {
		System.out.println(x+""+y);
	}
}
for (int y = 1; y < 9; y+=3) {
	for (int x = 0; x <3; x++) {
	System.out.print(x+y+" ");
	}
	System.out.println();
}
 
for (int y = 1; y < 100; y+=10) {
	for (int x = 0; x <10; x++) {
	System.out.print(x+y+" ");
	}
	System.out.println();
}

for (int y = 0; y < 6; y++) {
	for (int x = 0; x < y; x++) {
		System.out.print("*");
	}
	System.out.println();
}


}
}
