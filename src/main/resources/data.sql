CREATE  DATABASE if not exists Task1;

use Task1;

CREATE TABLE IF NOT EXISTS Bank (
ID                      INT AUTO_INCREMENT,
Name                  	VARCHAR(25) NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS Credit (
ID                      INT AUTO_INCREMENT,
bankName                VARCHAR(25) NOT NULL,
firstInstallmentC       INT NOT NULL,
insurancePrcntC         INT NOT NULL,
commission              INT NOT NULL,
prcntInMounth           INT NOT NULL,
topUpAccountImmediately BOOLEAN NOT NULL,
minMoneyQuantity        INT NOT NULL,
maxMoneyQuantity        INT NOT NULL,
minMonth                INT NOT NULL,
maxMonth                INT NOT NULL,
PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS Deposit (

PRIMARY KEY (ID)
);
INSERT INTO Credit (bankName,firstInstallmentC,insurancePrcntC,commission,prcntInMounth,topUpAccountImmediately,minMoneyQuantity,maxMoneyQuantity,minMonth,maxMonth)
VALUES ('PrivatBank',10,25,876,1,true,5000,25000,6,24);
INSERT INTO Credit (bankName,firstInstallmentC,insurancePrcntC,commission,prcntInMounth,topUpAccountImmediately,minMoneyQuantity,maxMoneyQuantity,minMonth,maxMonth)
VALUES ('PrivatBank',5,20,425,1,false,10000,50000,3,12);
INSERT INTO Credit (bankName,firstInstallmentC,insurancePrcntC,commission,prcntInMounth,topUpAccountImmediately,minMoneyQuantity,maxMoneyQuantity,minMonth,maxMonth)
VALUES ('MonoBank',15,30,0,1,true,5000,100000,10,36);
INSERT INTO Deposit (bankName,prcntInOneMonthUAH,prcntInSixMonthUAH,prcntInTwelveMonthUAH,prcntInOneMonthUSD,prcntInSixMonthUSD,prcntInTwelveMonthUSD,takeOffImmediately,minMoneyQuantity,maxMoneyQuantity)
VALUES ('MonoBank',1,2,3,1,1,2,true,3,120);
INSERT INTO Deposit (bankName,prcntInOneMonthUAH,prcntInSixMonthUAH,prcntInTwelveMonthUAH,prcntInOneMonthUSD,prcntInSixMonthUSD,prcntInTwelveMonthUSD,takeOffImmediately,minMoneyQuantity,maxMoneyQuantity)
VALUES ('MonoBank',1,3,3,1,2,2,true,12,120);
INSERT INTO Deposit (bankName,prcntInOneMonthUAH,prcntInSixMonthUAH,prcntInTwelveMonthUAH,prcntInOneMonthUSD,prcntInSixMonthUSD,prcntInTwelveMonthUSD,takeOffImmediately,minMoneyQuantity,maxMoneyQuantity)
VALUES ('PrivatBank',1,2,3,1,1,2,true,3,24);