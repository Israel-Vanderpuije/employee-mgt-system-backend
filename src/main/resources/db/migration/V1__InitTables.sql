--CREATE TABLE moviee (
--    id BIGSERIAL PRIMARY KEY,
--    name TEXT NOT NULL,
--    release_date DATE NOT NULL,
--    unique (name)
--);

DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  employee_id BIGSERIAL PRIMARY KEY,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  gender VARCHAR(255),
  citizenship VARCHAR(255),
  address VARCHAR(255),
  social_security VARCHAR(255),
  project VARCHAR(255),
  marital_status VARCHAR(255),
  phone_number VARCHAR(255),
  age INT,
  start_date DATE,
  date_of_birth DATE
);