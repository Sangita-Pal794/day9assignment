#!/bin/bash -x
read value
pattern="^[91]{2}\s{1}[0-9]{10}$"
#pattern="(^[0-9a-zA-Z\.\$\&\-]+)@([a-z]+)\.([a-z]{2,5})$"
#value="53242344"
if [[ $value =~ $pattern ]]
then
        echo true;
else
        echo false;
fi
