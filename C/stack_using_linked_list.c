#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
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
        printf("������ �Է� : ");
        scanf("%d %c", &data.key, &data.grade);
        if (data.key != 0) {
            pushlist(data);
            i++;
        }
        printf("���ÿ� �����͸� ��� �Է��ϽǷ���?(1/0)");
        scanf("%d", &cond);
    }
    printf("�Է��� �������� ���� : %d \n", i);

    printf("���ÿ��� ��� �����Ͱ� �ʿ��ϼ��� ? ");
    scanf("%d", &n);
    printf("���ÿ��� ������ ������ : \n");
    for (i = 0; i < n; i++) {
        data = poplist();
        printf("%d \t%c\n", data.key, data.grade);
    }
}

void pushlist(element item)
{
    StackNode* inode;
    inode = (StackNode*)malloc(sizeof(StackNode));
    inode->data = item;
    inode->next = top;
    top = inode;
}

element poplist()
{
    element item;
    StackNode* dnode;

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