#!/usr/bin/env bash

echo "Running Homebrew"
brew update
brew install nodejs

echo "Running npm installers"
npm install -g gulp
npm install -g bower
npm install -g mean-cli

echo "Running bower"
bower install --allow-root
npm install

# Start Server
echo "Starting server on port 3000"
gulp