# Wildlife Tracker

## Description
This is an application that allows Rangers to track wildlife sightings in the area.
## Technologies Used

- Java Spark
- SQL
- HTML
- CSS

## Installation
* `git clone <https://github.com/kipgeoffry/wildlife-tracker>` this repository
* `cd wildlife-tracker`

## Live Demo
To view the page click on the link below

## Tests

- To run test, run files under tests/java package

## Installation

## SQL
```bash
1.Launch postgres

2.Type in psql

Run these commands

3. CREATE DATABASE wildlife_tracker;

4. \c wildlife_tracker;

5. CREATE TABLE animals (id serial PRIMARY KEY, name varchar, health varchar, age varchar, type varchar);

6. CREATE TABLE wildlife_tracker=# CREATE TABLE sightings (id serial PRIMARY KEY, animal_id int, location varchar, ranger_name varchar, timestamp timestamp);

7. CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

```
## Requirements
```bash
The applications allow users to do the following:

1.Add a new animal
 
2.Add an endangered animal

3.Add an animal Sighting

```

## Known Bugs
- UI is not responsive,currently it is WIP to have it fully responsive.
- There are currently no tests done for this project.

## Contact Details
```bash
You can contact me at kipgeoffry@gmail.com
```

## License
- This project is licensed under the MIT license Copyright (c) 2023.
