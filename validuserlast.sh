#!/bin/bash -x
read value
pattern="^[A-Z]{1}[a-z]{2,}\s{0,1}[A-Z]{1}[a-z]{2,}$"
if [[ $value =~ $pattern ]]
then
        echo true;
else
        echo false;
fi
