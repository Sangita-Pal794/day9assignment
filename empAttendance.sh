#!/bin/bash -x
isPresent=1
randomCheck=$((RANDOM%2))
if [ $isPresent -eq $randomCheck ]
then
	echo "Employee is Present"
else
	echo "Employee is not Present"
fi
#Conflict At Terminal#Conflict Created

