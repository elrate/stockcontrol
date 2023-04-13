INSERT INTO category (name) VALUES ('Categoria A');
INSERT INTO category (name) VALUES ('Categoria B');
INSERT INTO category (name) VALUES ('Categoria C');

INSERT INTO product (name, validity, manufacture) VALUES ('Produto A', '2023-04-30', '2023-04-13');

INSERT INTO product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO product_category (product_id, category_id) VALUES (1, 2);
INSERT INTO product_category (product_id, category_id) VALUES (1, 3);

INSERT INTO company (name, address_zip_code, address_street, address_city, address_state) VALUES ('Empresa A','12345-678','Rua A', 'Cidade A', 'Estado A');

INSERT INTO company_product (company_id, product_id) VALUES (1, 1);
