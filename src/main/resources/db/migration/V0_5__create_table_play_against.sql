CREATE TABLE playAgainst (
    id_firstTeam serial ,
    id_secondTeam serial,
    datetime date,
    stadium varchar,
    constraint fk_firstTeam
        foreign key id_firstTeam
            references team(id_team)
    constraint fk_secondTeam
        foreign key id_secondTeam
            references team(id_team)
)