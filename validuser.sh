#!/bin/bash -x
read value
pattern="(^[A-Z]{1}[a-zA-Z]{2,}*$)"

if [[ $value =~ $pattern ]]
then
        echo true;
else
        echo false
fi
