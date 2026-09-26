CREATE TABLE client (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    number VARCHAR(20)
);

CREATE TABLE essay_type (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE essay (
    id SERIAL PRIMARY KEY,
    date DATE NOT NULL,
    hour TIME NOT NULL,
    client_id INT,
    essay_type_id INT,

    FOREIGN KEY (client_id) REFERENCES client(id),
    FOREIGN KEY (essay_type_id) REFERENCES essay_type(id)
);