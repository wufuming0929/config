#!/bin/sh
mvn clean package -Dmaven.test.skip=true
docker build -t springcloud/config .
docker push registry.cn-hangzhou.aliyuncs.com/formain/springcloud:config
