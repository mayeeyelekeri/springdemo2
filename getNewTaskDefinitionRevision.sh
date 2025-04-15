#/bin/bash 
accountId=$1
taskName=$2

currentVersion=`aws ecs describe-task-definition --task-definition springdemo --query "taskDefinition.revision"`

((currentVersion++)) 

# Format
# 
taskDef="arn:aws:ecs:us-east-1:accountId:task-definition\/$taskName:$currentVersion" 
echo $taskDef

