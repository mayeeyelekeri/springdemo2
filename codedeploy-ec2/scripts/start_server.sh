#!/bin/bash
pwd 
id 
ls -lrt /tmp 
ls -lrt ~
echo $HOME
cd /tmp; docker build -t springdemo:latest .
docker run --name springdemo2 -p 80:80 -d springdemo:latest 
