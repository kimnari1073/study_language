/* file name: file_io.c */

#include <stdio.h>
#include <unistd.h>

#define BUFSIZE 256

void main(){
    int n;
    char buf[BUFSIZE];

    fprintf(stderr,"Here is file start.\n");
    while((n=read(0,buf,BUFSIZE))>0)
        write(1,buf,n);
    fprintf(stderr,"Here is file end.\n");
    exit(0);
}