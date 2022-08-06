#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<iostream>
char *strrev(char *str)
{
      char *p1, *p2;

      if (! str || ! *str)
            return str;
      for (p1 = str, p2 = str + strlen(str) - 1; p2 > p1; ++p1, --p2)
      {
            *p1 ^= *p2;
            *p2 ^= *p1;
            *p1 ^= *p2;
      }
      return str;
}
void pm();
void plus();
void div();
int i,ch,j,l,addr=100;
char ex[10], e[10] ,e1[10],e2[10],id1[5],op[5],id2[5];
int main()
{
while(1)
{
printf("\n1.assignment\n2.arithmetic\n3.relational\n4.Exit\nEnter the choice:");
scanf("%d",&ch);
switch(ch)
{
case 1:
printf("\nEnter the eression with assignment operator:");
scanf("%s",e);
l=strlen(e);
e2[0]='\0';
i=0;
while(e[i]!='=')
{
i++;
}
strncat(e2,e,i);
strrev(e);
e1[0]='\0';
strncat(e1,e,l-(i+1));
strrev(e1);
printf("Three address code:\ntemp=%s\n%s=temp\n",e1,e2);
break;
case 2:
printf("\nEnter the eression with arithmetic operator:");
scanf("%s",ex);
strcpy(e,ex);
l=strlen(e);
e1[0]='\0';
for(i=0;i<l;i++)
{
if(e[i]=='+'||e[i]=='-')
{
if(e[i+2]=='/'||e[i+2]=='*')
{
pm();
break;
}
else
{
plus();
break;
}
}
else if(e[i]=='/'||e[i]=='*')
{
div();
break;
}
}
break;
case 3:
printf("Enter the eression with relational operator");
scanf("%s%s%s",id1,op,id2);
if(((strcmp(op,"<")==0)||(strcmp(op,">")==0)||(strcmp(op,"<=")==0)||(strcmp(op,">=")==0)||(strcmp(op,"==")==0)||(strcmp(op,"!=")==0))==0)
printf("eression is error");
else
{
printf("\n%d\tif %s%s%s goto %d",addr,id1,op,id2,addr+3);
addr++;
printf("\n%d\t T:=0",addr);
addr++;
printf("\n%d\t goto %d",addr,addr+2);
addr++;
printf("\n%d\t T:=1",addr);
}
break;
case 4:
exit(0);
}
}
}
void pm()
{
strrev(e);
j=l-i-1;
strncat(e1,e,j);
strrev(e1);
printf("Three address code:\ntemp=%s\ntemp1=%c%ctemp\n",e1,e[j+1],e[j]);
}
void div()
{
strncat(e1,e,i+2);
printf("Three address code:\ntemp=%s\ntemp1=temp%c%c\n",e1,e[i+2],e[i+3]);
}
void plus()
{
strncat(e1,e,i+2);
printf("Three address code:\ntemp=%s\ntemp1=temp%c%c\n",e1,e[i+2],e[i+3]);
}
