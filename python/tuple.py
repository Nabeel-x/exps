t1 = ()
t2 = ()
while True:
	print("1: Create\n2: Delete\n3: Count\n4: Len \n5: Max \n6: Min\n7: Sum \n8: Concatenate\n9: Display\n10: Exit")
	ch = int(input("Enter option: "))
	if ch == 1:
		op = int(input("1: tuple 1 \n2:tuple 2\nEnter your option:"))
		l = []
		n = int(input("Enter no of items: "))
		for i in range(n):
			item = int(input("Enter item: "))
			l.append(item)
		if (op == 1):
			t1 = tuple(l)
			l.clear()
		else:
			t2 = tuple(l)
			l.clear()
			
	elif ch == 2:
		op = int(input("1: tuple 1 \n2:tuple 2\nEnter your option: "))
		if (op == 1):
			del t1
		else:
			del t2
	elif ch == 3:
			item = int(input("Enter item: "))
			if item in t1:
				print(t1.count(item))
			elif item in t2:
				print(t2.count(item))
			else:
				print("Item does not exist in tuple1 or tuple2")
	elif ch == 4:
		print("Length of tuple1 = ",len(t1))
		print("Length of tuple2 = ",len(t2))
	elif ch == 5:
		print("max of t1 = ",max(t1))
		print("max of t2 = ",max(t2))
	elif ch == 6:
		print("min of t1 = ",min(t1))
		print("min of t2 = ",min(t2))
	elif ch == 7:
		op = int(input("1: tuple 1 \n2:tuple 2\nEnter your option:"))
		if op == 1:
			print("Sum of t1 = ",sum(t1))
		else:
			print("Sum of t2 = ",sum(t2))
	elif ch == 8:
		print(t1+t2)
	elif ch == 9:
		print("tuple 1 = ",t1)
		print("tuple 2 = ",t2)
	elif ch == 10:
		print("Exiting..")
		break
	else:
		print("Invalid option")
