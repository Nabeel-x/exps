class Employee:
    def __init__(self,id,pay):
        self.ecode = id
        self.bpay = pay
    
    def salaryC(self):
        n = int(input("Enter the number of cars sold: "))
        self.incentives = n*2500
        self.salary = self.bpay + self.incentives

    def displayE(self):
        print("Employee details")
        print("Employee id: ",self.ecode)
        print("Salary: ",self.salary)

def main():
    id = int(input("Enter Employee code: "))
    pay = int(input("Enter basic salary: "))
    
    raj = Employee(id,pay)
    raj.salaryC()
    raj.displayE()

if __name__ == '__main__':
    main()
