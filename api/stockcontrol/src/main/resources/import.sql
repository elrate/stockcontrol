CREATE TABLE category (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE product (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    validity DATE,
    manufacture DATE NOT NULL
);

CREATE TABLE product_category (
    product_id BIGINT,
    category_id BIGINT,
    PRIMARY KEY (product_id, category_id),
    FOREIGN KEY (product_id) REFERENCES product (id),
    FOREIGN KEY (category_id) REFERENCES category (id)
);

CREATE TABLE company (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address_street VARCHAR(255) NOT NULL,
    address_city VARCHAR(255) NOT NULL,
    address_state VARCHAR(255) NOT NULL,
    address_zip_code VARCHAR(10) NOT NULL
);

CREATE TABLE company_product (
    company_id BIGINT,
    product_id BIGINT,
    quantity INTEGER NOT NULL,
    PRIMARY KEY (company_id, product_id),
    FOREIGN KEY (company_id) REFERENCES company (id),
    FOREIGN KEY (product_id) REFERENCES product (id)
);

INSERT INTO category (name) VALUES ('Categoria A');
INSERT INTO category (name) VALUES ('Categoria B');
INSERT INTO category (name) VALUES ('Categoria C');

INSERT INTO product (name, validity, manufacture) VALUES ('Produto A', '2023-04-30', '2023-04-13');

INSERT INTO product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO product_category (product_id, category_id) VALUES (1, 2);
INSERT INTO product_category (product_id, category_id) VALUES (1, 3);

INSERT INTO company (name, address_zip_code, address_street, address_city, address_state) VALUES ('Empresa A','12345-678','Rua A', 'Cidade A', 'Estado A');

INSERT INTO company_product (company_id, product_id, quantity) VALUES (1, 1, 1);
