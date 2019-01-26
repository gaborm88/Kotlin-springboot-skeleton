create table address (
  id bigint NOT NULL AUTO_INCREMENT,
  created_at timestamp,
  updated_at timestamp,
  city varchar(255),
  state varchar(255),
  street varchar(255),
  zipcode varchar(255),
  user_id bigint,
  primary key (id));

create table user (
  id bigint NOT NULL AUTO_INCREMENT,
  created_at timestamp,
  updated_at timestamp,
  first_name varchar(255),
  last_name varchar(255),
  login varchar(255),
  primary key (id));

alter table address add constraint fk_user_id foreign key (user_id) references address(id);
