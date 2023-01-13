CREATE TABLE score(
    id serial,
    match_id int,
    player_id int,
    times int,
    isOs boolean,
    primary key (id),
    FOREIGN KEY (match_id) REFERENCES matches(id),
    FOREIGN KEY (player_id) REFERENCES player(id)

);

INSERT INTO score(match_id, player_id, times, isOs) values (1, 1, 30, true);