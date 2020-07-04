#!/bin/bash -x
read value
#pattern="^[1-9]{1}[0-9]{2}\s{0,1}[0-9]{3}$"  
#pattern="^([0-9a-zA-Z\.\$\&\_\*\+\-]+)@([a-z]+)\.([a-z]{2,5}+)\.([a-z]{2,5})$"
pattern="^([0-9a-zA-Z\.\$\&\_\*\+\-]+)@([a-z]+)\.([a-z]{2,5})"

#value="53242344"
if [[ $value =~ $pattern ]]
then
        echo true;
else
        echo false;
fi

