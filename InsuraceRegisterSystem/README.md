# Vehicle Incurance Claim System
This program reord the given claim information with corresponding customer information.

## Example
## input:  
BEGIN_CUSTOMER  
NAME = Robert  
DATE_OF_BIRTH = 1980-02-23  
INCOME = 99000  
END_CUSTOMER  

BEGIN_CUSTOMER  
NAME = Alice  
DATE_OF_BIRTH = 1985-02-23  
INCOME = 102000  
END_CUSTOMER  

BEGIN_HOME  
OWNER_NAME = Robert  
POSTAL_CODE = A2B4H3  
VALUE = 500000  
BUILD_DATE = 2000-02-23  
END_HOME  

BEGIN_CAR  
OWNER_NAME = Alice  
MAKE = Tesla  
MODEL = 3  
PURCHASE_DATE = 2018-02-23  
MILEAGE = 5000  
VALUE = 40000  
END_CAR  

BEGIN_HOME_PLAN  
NAME = affordable_home_plan  
PREMIUM = 1000  
MAX_COVERAGE_PER_CLAIM = 100000  
DEDUCTIBLE = 5000  
HOME.VALUE < 1000000  
CUSTOMER.INCOME > 30000  
HOME.AGE < 30  
END_HOME_PLAN  

BEGIN_CAR_PLAN  
NAME = high_end_plan  
PREMIUM = 5000  
MAX_COVERAGE_PER_CLAIM = 40000  
DEDUCTIBLE = 200  
CAR.MILEAGE < 50000  
CUSTOMER.AGE > 18  
CUSTOMER.AGE < 85  
END_CAR_PLAN  

BEGIN_CONTRACT  
CONTRACT_NAME = Alice_car_contract  
CUSTOMER_NAME = Alice  
PLAN_NAME = high_end_plan  
START_DATE = 2018-02-25  
END_DATE = 2019-02-25  
DISCOUNT_PERCENTAGE = 0  
END_CONTRACT  

BEGIN_CLAIM  
CONTRACT_NAME = Alice_car_contract  
AMOUNT = 1500  
DATE = 2019-01-01  
END_CLAIM  

BEGIN_CLAIM  
CONTRACT_NAME = Alice_car_contract  
AMOUNT = 500  
DATE = 2019-01-23  
END_CLAIM  

BEGIN_CONTRACT  
CONTRACT_NAME = Robert_home_contract  
CUSTOMER_NAME = Robert  
PLAN_NAME = affordable_home_plan  
START_DATE = 2015-02-25  
END_DATE = 2018-02-25  
DISCOUNT_PERCENTAGE = 0  
END_CONTRACT  

BEGIN_CLAIM  
CONTRACT_NAME = Robert_home_contract  
AMOUNT = 15000  
DATE = 2019-01-20  
END_CLAIM  

PRINT CUSTOMER TOTAL_CLAIMED Alice  
PRINT CUSTOMER TOTAL_RECEIVED Alice  
PRINT CUSTOMER TOTAL_CLAIMED Robert  
PRINT CUSTOMER TOTAL_RECEIVED Robert  

PRINT PLAN NUM_CUSTOMERS high_end_plan  
PRINT PLAN NUM_CUSTOMERS affordable_home_plan  
PRINT PLAN TOTAL_PAYED_TO_CUSTOMERS high_end_plan  
PRINT PLAN TOTAL_PAYED_TO_CUSTOMERS affordable_home_plan  

FINISH  

### Output

Claim on 2019-01-01 for contract Alice_car_contract was successful.  
Claim on 2019-01-23 for contract Alice_car_contract was successful.  
Claim on 2019-01-20 for contract Robert_home_contract was not successful.  
Total amount claimed by Alice is 2000  
Total amount received by Alice is 1600  
Total amount claimed by Robert is 15000  
Total amount received by Robert is 0  
Number of customers under high_end_plan is 1  
Number of customers under affordable_home_plan is 1  
Total amount payed under high_end_plan is 1600  
Total amount payed under affordable_home_plan is 0  