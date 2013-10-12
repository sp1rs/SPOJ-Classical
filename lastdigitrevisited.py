class Main:
	t=int(input())
	while(t>0):
		t-=1
		s=raw_input().split(" ")
		a=int(s[0])%10
		b=int(s[1])
		d=1
		if(a==1 or b==0):
			d=0
			print 1
		elif(a==2):
			l=[2,4,6,8]
			y=b%4-1
		elif(a==3):
			l=[3,9,7,1]
			y=b%4-1
		elif(a==4):
			l=[4,6]
			y=b%2-1
		elif(a==5 or a==6 or a==0):
			d=0
			print a
		elif(a==7):
			l=[7,9,3,1]
			y=b%4-1
		elif(a==8):
			l=[8,4,2,6]
			y=b%4-1
		elif(a==9):
			l=[9,1]
			y=b%2-1
		if(d==1):	
			print l[y]	
			
