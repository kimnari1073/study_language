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

    printf("오늘 작업한 작업 수는? ");
    scanf("%d", &job_num);

    printf("작업번호와 작업상태 입력 :\n");
    for (i = 0; i < job_num; i++) {
        scanf("%d %c", &temp.job_num, &temp.grade);
        addqlist(temp);
    }

    printf("\n 연결 큐 안의 데이터 = \n");
    printlist();

    printf("\n 1개 삭제 후 삽입 연산 테스트\n");
    temp = deleteqlist();
    addqlist(temp);
    printlist();

    printf("A등급인 제품번호 = ");
    for (i = 0; i < job_num; i++) {
        temp = deleteqlist();
        if (temp.grade == 'A') {
            printf("%d\t", temp.job_num);
            gradeA++;
        }
        else
            addqlist(temp);
    }
    printf("\nA 등급인 제품은 %d개입니다. \n", gradeA);
    printf("%d 개의 등급 A 삭제 후 큐 안의 데이터 = \n", gradeA);
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