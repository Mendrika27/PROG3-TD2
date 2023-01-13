CREATE TABLE matches (
    id   serial ,
    teams_id1 int,
    teams_id2 int,
    date_time date,
    stadium varchar,
    primary key (id),
    constraint fk_teams_id1
        foreign key (teams_id1)
            references team(id),
    constraint fk_teams_id2
        foreign key (teams_id2)
            references team(id)
);
INSERT INTO matches(teams_id1, teams_id2, date_time, stadium) values (1, 2, '2022-08-12T08:30:00', 'Stade Mahasina');