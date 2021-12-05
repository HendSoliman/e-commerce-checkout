
insert into ecommerce.product ( id,name ,description
, price , count)
 values ('11', 'Mobile', 'Mobile ', 1550, 3);
 
insert into ecommerce.product  ( id,name ,description
, price , count) values ('22', 'Book', 'Book - description',2000, 2);

insert into ecommerce.product ( id,name ,description
, price , count) values ('33', 'Book2', 'Book - description',2100, 14);

insert into ecommerce.product  ( id,name ,description
, price , count) values ('44', 'Book3', 'Book - description', 750, 5);

insert into ecommerce.product  ( id,name ,description
, price , count) values ('55', 'Book4', 'Book - description', 790, 7);

insert into ecommerce.product  ( id,name ,description
, price , count) values ('66', 'Book', 'Book - description', 7.99, 115);




insert into ecommerce.user (id, username, password, first_name, last_name, email, phone, user_status) values('1', 'test', 'pwd', 'Test', 'User', 'test@user.com', '234234234', 'ACTIVE');
insert into ecommerce.user (id, username, password, first_name, last_name, email, phone, user_status) values('2', 'test', 'pwd', 'Test2', 'User2', 'test2@user.com', '234234234', 'ACTIVE');






INSERT INTO ecommerce.address VALUES ('1', '9I-999', 'Fraser Suites Le Claridge', 'Champs-Elysees');
--insert into ecommerce.user_address values ('1', '1');
INSERT INTO ecommerce.card VALUES ('1', '999-999-999-999', '12/28', '0000' ,'1');
----
--insert into ecommerce.item (id,product,UNIT_PRICE,QUANTITY,is_Available,cart_id) values('1', '22', 150, 2,false,1);
--insert into ecommerce.cart_item values ('1','1');
--insert into ecommerce.item (id,PRODUCT_ID,UNIT_PRICE,QUANTITY,is_Available) values('2', 'a0a4f044-b040-410d-8ead-4de0446aec7e', 100, 2,true);
--insert into ecommerce.cart_item values ('1', '2');