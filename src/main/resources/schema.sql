create table IF NOT EXISTS  restaurants(
  restaurant_id integer not null AUTO_INCREMENT,
  restaurant_name varchar(255),
  rating integer(255),
  primary key(restaurant_id)
);

create table IF NOT EXISTS  food(
  food_id integer not null AUTO_INCREMENT,
  food_item varchar(255),
  price integer not null,
  primary key(food_id)
);

create table IF NOT EXISTS  orders(
  order_id integer not null,
  food_id integer not null,
  quantity integer not null,
  total_price double,
  unique (order_id,food_id)
);