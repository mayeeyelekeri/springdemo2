#!/bin/bash
docker ps 
docker ps -aqf "name=springdemo"  |xargs docker rm -f  | echo "removed any old running containers(if any)"
docker ps 

ls -lrt /tmp
rm -rf /tmp/Dockerfile /tmp/*.jar
ls -lrt /tmp
 
