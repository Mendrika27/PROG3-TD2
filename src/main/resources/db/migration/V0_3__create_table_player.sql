CREATE TABLE player (
    id_player serial ,
    id_team serial,
    name varchar,
    number int,
    primary key(id_player),
    constraint fk_team
        foreign key id_team
            references team(id_team)
)