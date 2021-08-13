#!/bin/sh
mvn clean test
status=$?
echo $status
if [[ $status != "0" || $report != "0" ]]; then
        echo "Exit Status is 1"
        exit 1
else
       echo "Exit Status is 0"
       exit 0
fi

echo $?