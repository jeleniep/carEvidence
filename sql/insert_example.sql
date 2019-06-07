INSERT INTO car (make, model, number_plate, current_mileage, attentions )
VALUES ('OPEL', 'AGILA', 'BS11838', 70000, 'Czerwony');

INSERT INTO car (make, model, number_plate, current_mileage, attentions )
VALUES ('Honda', 'Civic', 'BS41401', 105000, 'Czerwony');

select * from car;

delete from mileage
where mileage_id > 4;

delete from car
where car_id > 2;

INSERT INTO mileage (start_place, end_place, start_mileage, end_mileage, attentions, user_id, car_id )
VALUES ('Suwałki', 'Waw', '70000', 70301, 'Fajna trasa', 9 , 1);

INSERT INTO mileage (start_place, end_place, start_mileage, end_mileage, attentions, user_id, car_id )
VALUES ('Waw', 'Suwałki', '70301', 70602, 'Fajna trasa', 9 , 1);

INSERT INTO mileage (start_place, end_place, start_mileage, end_mileage, attentions, user_id, car_id )
VALUES ('Brazylia', 'Łomianki', '105000', 105200, 'Słąbo było', 9 , 10);

UPDATE mileage
SET end_place = 'Wwa'
WHERE mileage_id = 1;

select * from mileage;



select u.name from user u
left join mileage m  ON (u.user_id = m.user_id)
where m.end_place = 'Waw';