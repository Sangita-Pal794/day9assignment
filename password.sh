#!/bin/bash -x
read value
pattern="^[A-Za-z0-9\.\$\@\_\-]{8,}$"
#value="53242344"
if [[ $value =~ $pattern ]]
then
        echo true;
else
        echo false;
fi
