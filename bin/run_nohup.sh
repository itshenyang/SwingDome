#!/usr/bin/env bash
cd ..
git pull origin master
mvn clean package
nohup java -jar target/GluttonousSnake-1.0-SNAPSHOT.jar &