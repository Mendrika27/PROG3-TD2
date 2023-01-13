create table team (
    id serial,
    name varchar,
    primary key(id)
);

create table team_sponsor (
    team_id int,
    sponsor_id int,
    FOREIGN KEY (team_id) REFERENCES team(id),
    FOREIGN KEY (sponsor_id) REFERENCES sponsor(id)

);

INSERT into team(name) values ('Argentine'), ('France');
INSERT into team_sponsor(id_team, sponsor_id) values (1,1), (2,1);
