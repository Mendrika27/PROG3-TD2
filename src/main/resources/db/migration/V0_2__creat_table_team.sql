create table team (
    id_team serial,
    id_team_1 serial,
    name varchar,
    primary key(id_team),
    constraint fk_team
            foreign key id_team
                references team(id_team)
);