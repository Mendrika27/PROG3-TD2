CREATE TABLE player (
    id serial ,
    name varchar,
    number int,
    poste varchar,
    team_id int,
    primary key(id),
    FOREIGN KEY (team_id) REFERENCES team(id)
);

INSERT into player(name, number, poste, team_id) values ('Messi', 10, 'Attaquant',1),
    ('Mbappe', 4, 'Attaquant',2),
    ('Emiliano', 23, 'Gardien',1),
    ('George', 5, 'Gardien',2);