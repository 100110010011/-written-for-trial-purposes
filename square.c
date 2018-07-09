#include <stdio.h>

int square(int x);

int main(int argc,int arg[]){

	int x;

	puts("Random number Enter");
	scanf("%d",&x);

	printf("%d -> square %d\n",x,square(x));


}

int square(int x){

	return x*x;
}
