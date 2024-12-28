grossIncome =500_000

if grossIncome<5_999:
    print('Monthly Contribution = 150.00')
elif grossIncome >=6_000 and grossIncome <= 7_999:
    print('Monthly Contribution = 300.00')
elif grossIncome >=8_000 and grossIncome <= 11_999:
    print('Monthly Contribution = 400.00')    
elif grossIncome >=12_000 and grossIncome <= 14_999:
    print('Monthly Contribution = 500.00')
elif grossIncome >=15_000 and grossIncome <= 19_999:
    print('Monthly Contribution = 600.00')
elif grossIncome >=20_000 and grossIncome <= 24_999:
    print('Monthly Contribution = 750.00')
elif grossIncome >=25_000 and grossIncome <= 29_999:
    print('Monthly Contribution = 850.00')
elif grossIncome >=30_000 and grossIncome <= 49_999:
    print('Monthly Contribution = 1_000.00')
elif grossIncome >=50_000 and grossIncome <= 99_999:
    print('Monthly Contribution = 1_500.00')
else :
    print('Monthly Contribution = 2_000.00')                   