#!/bin/bash

# Load environment variables from .env file
if [ -f "./.env" ]; then
  set -a
  source ./.env
  set +a
fi

# Run your Spring Boot application
java -jar ./app.jar
