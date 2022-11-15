#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct {
    int job_num;
    char grade;
} element;
typedef struct node {
    element qdata;
    struct node* next;
}QueueNode;

QueueNode* rear = NULL, * front = NULL;
void addqlist(element item);
element deleteqlist();
void printlist();

main()
{
    int i, job_num, gradeA = 0;
    element temp;

    printf("���� �۾��� �۾� ����? ");
    scanf("%d", &job_num);

    printf("�۾���ȣ�� �۾����� �Է� :\n");
    for (i = 0; i < job_num; i++) {
        scanf("%d %c", &temp.job_num, &temp.grade);
        addqlist(temp);
    }

    printf("\n ���� ť ���� ������ = \n");
    printlist();

    printf("\n 1�� ���� �� ���� ���� �׽�Ʈ\n");
    temp = deleteqlist();
    addqlist(temp);
    printlist();

    printf("A����� ��ǰ��ȣ = ");
    for (i = 0; i < job_num; i++) {
        temp = deleteqlist();
        if (temp.grade == 'A') {
            printf("%d\t", temp.job_num);
            gradeA++;
        }
        else
            addqlist(temp);
    }
    printf("\nA ����� ��ǰ�� %d���Դϴ�. \n", gradeA);
    printf("%d ���� ��� A ���� �� ť ���� ������ = \n", gradeA);
    printlist();
}
void addqlist(element item) {
    QueueNode* inode = (QueueNode*)malloc(sizeof(QueueNode));
    inode->qdata = item;
    inode->next = NULL;
    if (front == NULL) front = rear = inode;
    else {
        rear->next = inode;
        rear = inode;
    }
}
element deleteqlist() {
    element dnode;
    QueueNode* tem = front;
    if (front == rear) {
        printf("NO!");
        exit(1);
    }
    else {
        dnode = front->qdata;
        front = front->next;
        free(tem);
        return dnode;
     }
}
void printlist() {
    QueueNode* pnode = front;
    while (pnode != NULL) {
        printf("%d\t%c\n", pnode->qdata.job_num, pnode->qdata.grade);
        pnode = pnode->next;
    }
}