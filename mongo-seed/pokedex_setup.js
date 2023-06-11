db = connect( 'mongodb://root:example@mongo:27017/pokedex?authSource=admin' );

db.pokemon.createIndex({num: 1});