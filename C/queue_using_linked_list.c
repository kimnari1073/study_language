#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

typedef struct {

    int key;

    char grade;

} element;



typedef struct node {

    element data;

    struct node* next;

} StackNode;



StackNode* top = NULL;



void pushlist(element data);

element poplist();



main()

{

    element data;

    int i, n, cond = 1;

    i = 0;

    while (cond) {

        printf("데이터 입력 : ");

        scanf("%d %c", &data.key, &data.grade);

        if (data.key != 0) {

            pushlist(data);

            i++;

        }

        printf("스택에 데이터를 계속 입력하실래요?(1/0)");

        scanf("%d", &cond);

    }

    printf("입력한 데이터의 개수 : %d \n", i);



    printf("스택에서 몇개의 데이터가 필요하세요 ? ");

    scanf("%d", &n);

    printf("스택에서 삭제한 데이터 : \n");

    for (i = 0; i < n; i++) {

        data = poplist();

        printf("%d \t%c\n", data.key, data.grade);

    }

}

void pushlist(element data) {

    StackNode* inode = (StackNode*)malloc(sizeof(StackNode));

    inode->data = data;

    inode->next = top;

    top = inode;

}

element poplist() {
    StackNode* dnode;
    element item;

    if (top == NULL) {
        printf("Stack is empty!!!");
        exit(1);
    }

    else {
        dnode = top;
        item = dnode->data;
        top = top->next;
        free(dnode);
        return item;
    }

}