create table team (
    id_team serial,
    id_opponent serial,
    name varchar,
    primary key(id_team),
    constraint fk_team
            foreign key id_team
                references team(id_team)
    constraint fk_id_opponent
            foreign key id_opponent
                references team(id_team)
);