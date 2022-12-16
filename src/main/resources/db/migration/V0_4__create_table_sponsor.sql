CREATE TABLE sponsor (
    id_sponsor serial ,
    id_team serial,
    name varchar,
    primary key(id_sponsor),
    constraint fk_team
        foreign key id_team
            references team(id_team)
)