CREATE TABLE have (
    id_sponsor serial ,
    id_team serial,
    constraint fk_id_sponsor
        foreign key id_sponsor
            references sponsor(id_sponsor)
    constraint fk_team
        foreign key id_team
            references team(id_team)
)