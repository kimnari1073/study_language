#include <stdio.h>

double bmi_calculate(double h, double w);
int main(void){
	double height, weight, bmi;
	printf("BMI 계산하기\n");
	printf("키와 몸무게를 입력해 주세요: ");
	scanf("%lf %lf", &height, &weight);
	bmi = bmi_calculate(height, weight);
	printf("Your BMI : %lf \n",bmi);
	return 0;
}

double bmi_calculate(double h, double w){
	double BMI;
	BMI = w / (h * h);
	return BMI;
}
