CREATE TABLE users (
    user_id SERIAL PRIMARY KEY,
    given_name VARCHAR(50) NOT NULL,
    family_name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE user_security(
    security_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(user_id) ON DELETE CASCADE,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(20)  UNIQUE
);

CREATE TABLE categories(
    category_id SERIAL PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE places(
   place_id SERIAL PRIMARY KEY,
   place_name VARCHAR(100) NOT NULL,
   description TEXT,
   location VARCHAR(255) NOT NULL,
   category_id INT NOT NULL REFERENCES categories(category_id)
);

CREATE TABLE favourites(
    favourite_id SERIAL PRIMARY KEY,
    user_id INT NOT NULL REFERENCES users(user_id) ON DELETE CASCADE,
    place_id INT NOT NULL REFERENCES places(place_id) ON DELETE CASCADE,
    UNIQUE (user_id, place_id)
);

CREATE TABLE prices(
    price_id SERIAL PRIMARY KEY,
    place_id INT NOT NULL REFERENCES places(place_id) ON DELETE CASCADE,
    adult_price DECIMAL(10, 2) NOT NULL,
    child_price DECIMAL(10, 2) NOT NULL
);

CREATE TABLE photos(
    photo_id SERIAL PRIMARY KEY,
    place_id INT NOT NULL REFERENCES places(place_id) ON DELETE CASCADE,
    photo_path VARCHAR(255) NOT NULL
);

CREATE TABLE reviews(
    review_id SERIAL PRIMARY KEY,
    place_id INT NOT NULL REFERENCES places(place_id) ON DELETE CASCADE,
    user_id INT NOT NULL REFERENCES users(user_id) ON DELETE CASCADE,
    rating INT NOT NULL CHECK (rating BETWEEN 1 AND 5),
    review_text TEXT
);
