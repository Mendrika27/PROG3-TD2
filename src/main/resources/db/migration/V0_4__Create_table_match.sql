CREATE TABLE match (
    id   serial ,
    teams_id1 int,
    teams_id2 int,
    datetime date,
    stadium varchar,
    constraint fk_teams_id1
        foreign key (teams_id1)
            references team(id),
    constraint fk_teams_id2
        foreign key (teams_id2)
            references team(id)
)