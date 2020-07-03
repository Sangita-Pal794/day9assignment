#!/bin/bash -x
read value
pattern="^[A-Z]{1}[A-Za-z0-9\.\$\@\_\-]{7,}$"
#value="53242344"
if [[ $value =~ $pattern ]]
then
        echo true;
else
        echo false;
fi
