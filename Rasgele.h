#include <stdlib.h>
#include <stdio.h>
#include <time.h>

#define RED     "\x1b[31m"
#define GREEN   "\x1b[32m"
#define YELLOW  "\x1b[33m"
#define BLUE    "\x1b[34m"
#define MAGENTA "\x1b[35m"
#define CYAN    "\x1b[36m"
#define RESET   "\x1b[0m"
#define MAX 50

int ortalama(int i,int j,int temp){

        j=0;
        temp=0;

        puts(YELLOW"Bitirmek için -1 Basın !" RESET);

        while(i != -1){

                puts(YELLOW "Notlarınızı Giriniz " RESET);
                scanf("%d",&i);
		system("clear");

                temp = temp +i;
                j++;
        }
        temp++;
        j--;

        printf("Notlarınızın Toplamı -> %d\n",temp);
        printf("Notlarınızın Ortalaması -> %d\n",temp/j);
	system("clear");

}

int kare(int x){
	
	return x*x;
}

void Hata(char hata[50]){

	printf("Hata Sebebi -> %s",hata);
}

unsigned int  Random(unsigned int a){
	srand(time(NULL));
	a = 1+ rand() %9;
	switch(a){

	case 1: 
		system("toilet -f smmono9 'Pinus Sylvestris ' --filter border");
		break;
	
	case 2:
		system("toilet -f smmono9 'Pinus Sylvestris' --filter metal");
		break;
	case 3:
		system("cowsay -f turkey Pinus Sylvestris");
		break;
	case 4:
		system("cowsay Pinus Sylvestris");
		break;
	case 5:
		system("cowsay -f ghostbusters Pinus Sylvestris");
		break;
	case 6:
		system("cowsay -f dragon Pinus Sylvestris");
		break;
	case 7:
		system("cowsay -f elephant Pinus Sylvestris");
		break;
	case 8:
		system("cowsay -f tux Pinus Sylvestris");
		break;
	case 9:
       puts("*********************************************************************************************************");
    puts("     p p p pp p                                                                                             ");
    puts("     p        p                                                                                             ");
    puts("     p        p    i    n       n     u       u     sssssssssss                                             ");
    puts("     p        p         n n     n     u       u     s                                                       ");
    puts("     p p p pp p    i    n   n   n     u       u     s                                                       ");
    puts("     p             i    n    n  n     u       u     sssssssssss                                             ");
    puts("     p             i    n     n n     u       u               s                                             ");
    puts("     p             i    n      nn     u       u               s                                             ");
    puts("     p             i    n       n     uuuuuuuuu     sssssssssss                                             ");
    puts("                                                                                                            ");
    puts("       sssssssssss                                                                                          ");
    puts("       s                y   y     l                                                                         ");
    puts("       s                y   y     l         v       v   ee e ee   ssssss    t      r r r r  i    ssssss     ");
    puts("       sssssssssss      y y y     l          v     v    e         s         t      r             s          ");
    puts("                 s          y     l           v   v     ee e e    ssssss   ttt     r        i    ssssss     ");
    puts("                 s          y     l            v v      e              s    t      r        i         s     ");
    puts("       sssssssssss      y y y     l l l l       v       e e e e   ssssss    ttttt  r        i    ssssss     ");
    puts("************************************************************************************************************");

		
		break;
	default:
		Hata("başlık switch");
        }
}

unsigned int theEnd(unsigned int rasgele){


	srand(time(NULL));
	rasgele = 1+ rand() %7;
	switch(rasgele){

	case 1:
		system("cowsay -b program sonlandı");
		break;
	case 2:
		system("cowsay -f turkey Program sonlandırıldı");
		break;
	case 3:
		system("cowsay Program sonlandırıldı");
		break;
	case 4:
		system("cowsay -f ghostbusters Program sonlandırıldı");
		break;
	case 5:
		system("cowsay -f dragon Program sonlandırıldı");
		break;
	case 6:
		system("cowsay -f elephant Program sonlandırıldı");
		break;
	case 7:
		system("cowsay -f tux Program sonlandırıldı");
		break;
	default:
		Hata("Kapanış switch");
		break;


}

}

void faktoriel(int i,int j,int temp){

	puts("çıkmak için -1 basın");
	while(temp != -1){
		puts("Faktoriel alınıcak sayı giriniz");
		scanf("%d",&temp);
	j=1;
	for(i=1;i<=temp;i++)
		j=j*i;
	printf("Sayının Faktoriel' -> %d\n",j);
	continue;
	}
	system("clear");
	
	}

int usAl(int x,int y,int i,int temp){

        puts("Us alınıcak sayı giriniz");
        scanf("%d%d",&x,&y);

        for(i=1;i<=y;i++){

                x*x*x;
                y*y*x;
                temp = temp *x;
        }

        printf("%d\n\n",temp);
}


int show_status (int percent){
int x;

    printf("Yükleniyor [");
    for(x = 0; x <=percent; x++)
    {
       printf(GREEN"/\a"RESET);

    }
    printf("]");
       printf("%d%%\r",percent);
       fflush(stdout);
       system("sleep 1");


}
void ucgen(int a,int b,int c){

	puts("üçgenin açısı giriniz");
	scanf("%d%d%d",&a,&b,&c);

	if(a==b || b==c || c==a)
		puts("Bu bir eşkenar üçgendir");

	else if(a!=b || b!=c || c!=a)
		puts("Bı bir çesitkenar üçgendir");

	else
		puts("Bu bir ikizkenar üçgendir");
}

void selectionSort(int arr[],int size){
	int i,j;
	int minimumindex;
		for(i =0; i < size;i++){
			minimumindex=i;
				for(j =i;j < size;j++){
					if(arr[j] < arr[minimumindex]){
						minimumindex = j;
}}
		int temp =arr[i];
		arr[i] = arr[minimumindex];
		arr[minimumindex] = temp;
}}

void bubbleSort(int arr[],int size){

	int i,j;
	for(i = 0; i <size; i++){
		for(j=1;j<size-i;j++){
			if(arr[j-1] > arr[j]){
				int temp = arr[j];
					arr[j] = arr[j-1];
						arr[j-1] = temp;
}}}}
