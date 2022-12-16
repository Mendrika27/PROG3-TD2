CREATE TABLE sponsor (
    id_team serial ,
    id_team_1 serial,
    datetine date,
    stadium varchar,
    constraint fk_team
        foreign key id_team
            references team(id_team)
    constraint fk_team
        foreign key id_team_1
            references team(id_team_1)
)