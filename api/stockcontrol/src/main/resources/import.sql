CREATE TABLE if not exists category (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE if not exists product (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    validity DATE,
    manufacture DATE NOT NULL,
    brand VARCHAR(255)
);

CREATE TABLE if not exists company (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address_street VARCHAR(255) NOT NULL,
    address_city VARCHAR(255) NOT NULL,
    address_state VARCHAR(255) NOT NULL,
    address_zip_code VARCHAR(10) NOT NULL
);

CREATE TABLE if not exists product_category (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    product_id BIGINT,
    category_id BIGINT,
    CONSTRAINT fk_product_category_product FOREIGN KEY (product_id) REFERENCES product (id) ON DELETE CASCADE,
    CONSTRAINT fk_product_category_category FOREIGN KEY (category_id) REFERENCES category (id) ON DELETE CASCADE
);

CREATE TABLE if not exists company_product (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    company_id BIGINT,
    product_id BIGINT,
    quantity INTEGER NOT NULL,
    CONSTRAINT fk_company_product_company FOREIGN KEY (company_id) REFERENCES company (id) ON DELETE CASCADE,
    CONSTRAINT fk_company_product_product FOREIGN KEY (product_id) REFERENCES product (id) ON DELETE CASCADE
);
INSERT INTO category (name) VALUES ('Categoria A');
INSERT INTO category (name) VALUES ('Categoria B');
INSERT INTO category (name) VALUES ('Categoria C');

INSERT INTO product (name, validity, manufacture,brand) VALUES ('Produto A', '2023-04-30', '2023-04-13','Marca 1');
INSERT INTO product (name, validity, manufacture,brand) VALUES ('Produto B', '2019-12-10', '2002-01-12','Marca 2');

INSERT INTO product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO product_category (product_id, category_id) VALUES (1, 3);

INSERT INTO company (name, address_zip_code, address_street, address_city, address_state) VALUES ('Empresa A','12345-678','Rua A', 'Cidade A', 'Estado A');
INSERT INTO company_product (company_id, product_id, quantity) VALUES (1, 1, 1000);

