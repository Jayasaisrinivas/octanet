import time
print("Enter your card")
time.sleep(3)
pin=9080
password=int(input("Enter your pin"))
balance=5000
if pin==password:
    print("Account Authorized!")
    while 1:
        print("Select your transaction\n 1.Balance Inquiry \n 2.Deposit \n 3.Withdraw \n 4.Reset Your pin \n 5.Exit")
        op=int(input("Enter valid option"))
        if op==1:
            print(f"Available Balance:{balance}")
        elif op==2:
            deposit=int(input("Enter the amount to deposit "))
            balance=balance+deposit
            print(f"Balance after depositing the amount :{balance}")
        elif op==3:
            withdraw=int(input("Enter the amount to withdraw"))
            if withdraw<=balance:
                balance=balance-withdraw
                print(f"Balance after withdrawing the amount :{balance}")
            else:
                print("Insufficient balance")
        elif op==4:
            pin1=int(input("Enter new pin"))
            pin2=int(input("Conform the pin"))
            if pin1==pin2:
                pin=pin1
                print("Pin has successfully reset")
            else:
                print("Conform pin and new pin not matches")
        elif op==5:
            break
        else:
            print("You entered wrong option Try again")

        ch=input("Do you want to have another transaction(y/n)")
        if ch=='y':
            pass
        else:
            break
else:
    print("You entered incorrect pin")
print("Thank You")
    
    
            
    
        
