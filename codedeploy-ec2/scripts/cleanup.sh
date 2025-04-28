#!/bin/bash
# Remove temporary files created during deploy 
docker ps -aqf "name=springdemo"
curl http://localhost
rm -rf /tmp/Dockerfile /tmp/*.jar
echo cleanup done 