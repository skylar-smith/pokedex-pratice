FROM mongo:latest
 # Will be set through Environment Files
 ARG DATABASE_URI
 ARG USERNAME
 ARG PASSWORD

 ENV DATABASE_URI ${DATABASE_URI}
 ENV USERNAME ${USERNAME}
 ENV PASSWORD ${PASSWORD}

 COPY Pokemon.csv /Pokemon.csv
 COPY pokedex_setup.js /pokedex_setup.js

 CMD mongoimport --uri ${DATABASE_URI} --type=csv --collection Pokemon --drop --file /Pokemon.csv --headerline && \
    mongosh --host mongo --port 27017 --username root --password example --file pokedex_setup.js
