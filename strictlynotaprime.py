class Main:
	t=int(input())
	l=[True]*100001
	l[0]=l[1]=False
	for i in range(2,100001):
		if(l[i]==True):
			j=i*i
			while(j<100001):
				l[j]=False
				j+=i
	while(t>0):
		t-=1
		s=raw_input().split(" ")
		x=0
		for i in range(int(s[0]),int(s[1])+1):
			if(l[i]==False):
				x+=1
		print x
