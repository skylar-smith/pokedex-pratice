db = connect( 'mongodb://root:example@mongo:27017/pokedex?authSource=admin' );

db.Pokemon.createIndex({num: 1});