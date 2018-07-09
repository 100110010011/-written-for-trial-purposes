#include <stdio.h>
#include "Rasgele.h"

#define RED     "\x1b[31m"
#define GREEN   "\x1b[32m"
#define YELLOW  "\x1b[33m"
#define BLUE    "\x1b[34m"
#define MAGENTA "\x1b[35m"
#define CYAN    "\x1b[36m"
#define RESET   "\x1b[0m"


int main(int argc,int arc[]){

	unsigned int q,a,b,c,rasgele;
	int i,j=1,temp,x,y,taskcompleted = 1,array[MAX],size;
   	double numtasks = 8;

	for(; taskcompleted <= numtasks; taskcompleted++)

         show_status((taskcompleted / numtasks) * 100);
	 system("clear");


         printf("%d",Random(a));
         puts("///////////////////////////////////////////////////////////////////////");
	 

 	 while (q != -1){

		puts("*** Matematik *** \t" "       *** Şifreleme *** \n"
		 	GREEN"[+]"RESET CYAN"|-> 1 Ortalama         \t" RESET YELLOW"[#]"RESET MAGENTA"|-> 7 MD5        \n"RESET
			GREEN"[+]"RESET CYAN"|-> 2 Kare Alma        \t" RESET YELLOW"[#]"RESET MAGENTA"|-> 8 SHA-1      \n"RESET
			GREEN"[+]"RESET CYAN"|-> 3 Faktoriel        \t" RESET YELLOW"[#]"RESET MAGENTA"|-> 9 Ceaser     \n"RESET
			GREEN"[+]"RESET CYAN"|-> 4 Us Alma          \t" RESET YELLOW"[#]"RESET MAGENTA"|-> 10 Polbuis   \n"RESET
		        GREEN"[+]"RESET CYAN"|-> 5 SelectionSort-   \t" RESET YELLOW"[#]"RESET MAGENTA"|-> 11 Affine    \n"RESET
		        GREEN"[+]"RESET CYAN"|-> 6 BubbleSort       \t" RESET YELLOW"[#]"RESET MAGENTA"|-> 12  RSA      \n"RESET
			GREEN"[+]"RESET YELLOW"\t       *** 0 Kapatmak için *** \n"RESET);

		printf(RED"\nBir Sayi Giriniz\\>" RESET);
		scanf("%d",&q);
	
		switch(q){

			case 1:
				ortalama(i,j=0,temp);
				continue;
			case 2:
				puts("Kare Alınıcak sayı Giriniz");
				scanf("%d",&x);
				printf("Karesi -> %d\n",kare(x));
				continue;
			case 3:
				faktoriel(temp,i,j);
				continue;
			case 4:
				
				usAl(x,y,i,temp=1);
				continue;
			case 5:
				puts("Dizi eleman sayı Giriniz -> ");
				scanf("%d",&size);

				for(i=0; i< size;i++){
					scanf("%d",&array[i]);
						}
				selectionSort(array,size);
				for(i=0; i< size;i++){
				printf("%d -> ",array[i]);
				puts("");
				}
				continue;
			case 6:
				puts("Dizi eleman sayı Giriniz -> ");
	  			scanf("%d",&size);
				for(i=0; i< size;i++){
				scanf("%d",&array[i]);
						}
				bubbleSort(array,size);
				for(i=0; i< size;i++){
				printf("%d -> ",array[i]);
				}
				
				continue;
			case 7:
				system("javac main1.java MD5.java");
				system("java main1 MD5");
				continue;
			case 8:
				system("javac SHA1.java main2.java");
				system("java main2");
				continue;
			case 9:
				system("javac Ceasar.java");
				system("java Ceasar");
				continue;
			case 10:
				system("javac Polybius.java main7.java");
				system("java main7");
				continue;
			case 11:
				system("javac Affine.java main3.java");
				system("java main3");
				continue;
			case 12:
				system("javac main11.java RSA.java");
				system("java main11");
				continue;
			case 13:
				ucgen(a,b,c);
				continue;


			default:
				Hata("Swicth Yapısı\n\n");
				continue;

			case 0:
				printf("%d",theEnd(rasgele));
				puts(RED"Program Kapatılıyor "RESET);
				break;

		}
		break;
	}
	
}

