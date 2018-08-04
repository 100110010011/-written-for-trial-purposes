#include <stdio.h>
#include <stdlib.h>
#include <getopt.h>
#include "Rasgele.h"

#define MAX 50

#define File printf("File -> %s\n",__FILE__);
#define Date printf("Date -> %s\n",__DATE__);
#define Line printf("Line -> %d\n",__LINE__);
#define Std  printf("Stdc -> %d\n",__STDC__);
#define Time printf("Clck -> %s\n",__TIME__);

static int test_flag;

int main(int argc,char *argv[]){

	unsigned int q;
	unsigned int a,b,c;
	unsigned int rasgele;
	int i,j=1,temp,x,y;	
	int taskcompleted = 1;
   	double numtasks = 8;
	int array[MAX],size;
	
	while(1){
		
		static struct option long_option[]={
		
		{"ortalama", no_argument,0,'o',},
                {"kare", no_argument,0,'k'},
                {"faktoriel", no_argument,0,'f'},
                {"us", no_argument,0,'u'},
                {"md5", no_argument,0,'m'},
                {"sha-1", no_argument,0,'1'},
                {"ceasar", no_argument,0,'c'},
                {"polybius", no_argument,0,'p'},
                {"affine",no_argument,0,'a'},
                {"rsa", no_argument,0,'r'},
		{"help",no_argument,0,'h'},
		{0,0,0,0},

		};

		int option_index = 0;

		int c = getopt_long(argc,argv,"okfusbm1cparh",
			long_option , & option_index);

		if(c == -1)
			break;

		switch(c){
		
			case 0:
				
				if(long_option[option_index].flag != 0)
				break;
		printf("options %s",long_option[option_index].name);
		if(optarg)
			printf("with arg %s",optarg);
		puts("");
		break;
	
			case 'o':
				ortalama(i,j=0,temp);
				break;
			case 'k':
				puts("Kare Alınıcak sayı Giriniz");
				scanf("%d",&x);
				printf("Karesi -> %d\n",kare(x));
				break;
			case 'f':
				faktoriel(temp,i,j);
				break;
			case 'u':
				
				usAl(x,y,i,temp=1);
				break;
			case 'm':
				system("javac main1.java MD5.java");
				system("java main1 MD5");
				break;
			case '1':
				system("javac SHA1.java main2.java");
				system("java main2");
				break;
			case 'c':
				system("javac Ceasar.java");
				system("java Ceasar");
				break;
			case 'p':
				system("javac Polybius.java main7.java");
				system("java main7");
				break;
			case 'a':
				system("javac Affine.java main3.java");
				system("java main3");
				break;
			case 'r':
				system("javac main11.java RSA.java");
				system("java main11");
				break;

			case 'h':
        printf("  *** TESTING WRITE PROGRAM *** \n"
               " -o [--ortalama]        :ORTALAMA ALMAK ICIN\n"
               " -k [--kare]            :KARE ALMAK ICIN\n"
               " -f [--faktariel]       :FAKTORIEL ALMAK ICIN\n"
               " -u [--us]              :US ALMAK ICIN\n"
               " -m [--md5]             :MD5 SIFRELEME\n"
               " -1 [--sha-1]           :SHA-1 SIFRELEME\n"
               " -c [--ceasar]          :CEASAR SIFRELEME\n"
               " -p [--polybius]        : POLYBIUS SIFRELEME\n"
               " -a [--affine]          :AFFINE SIFRELEME\n"
               " -r [--rsa]             :RSA SIFRELEME\n"
	       "CREATE:					\n"
	       "       PINUS SYLVESTRIS \n\n\n");
	break;
			default:
        printf("  *** TESTING WRITE PROGRAM *** \n"
               " -o [--ortalama]        :ORTALAMA ALMAK ICIN\n"
               " -k [--kare]            :KARE ALMAK ICIN\n"
               " -f [--faktariel]       :FAKTORIEL ALMAK ICIN\n"
               " -u [--us]              :US ALMAK ICIN\n"
               " -m [--md5]             :MD5 SIFRELEME\n"
               " -1 [--sha-1]           :SHA-1 SIFRELEME\n"
               " -c [--ceasar]          :CEASAR SIFRELEME\n"
               " -p [--polybius]        : POLYBIUS SIFRELEME\n"
               " -a [--affine]          :AFFINE SIFRELEME\n"
               " -r [--rsa]             :RSA SIFRELEME\n"
               "CREATE:                                 \n"
               "       PINUS SYLVESTRIS \n\n\n");
break;
		
		}
		}

	if (test_flag)
		puts("test flag");
	if(optind < argc){
	
		printf("non-option ARGV-element:");

		while(optind < argc)
			printf("%s",argv[optind++]);
		putchar('\n');
	}
} 
