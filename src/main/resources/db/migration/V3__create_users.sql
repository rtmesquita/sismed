INSERT INTO user
    (id, nome, password, login, role)
VALUES
    (1, 'Administrador' ,'$2a$10$6cT9mRwT6PI0V02AxduAnOrkRbgF66YAodt1m.f0ECVvJr9Ms2L2m', 'admin', 'ADMIN');
INSERT INTO user
(id, nome, password, login, role)
VALUES
    (2, 'Médico','$2a$10$TIvNhpg/wWOQ0CPIHPtrYOefxJ2whq3.cHitKKVrF9CvI63n9.WEy', 'medico', 'MEDICO');
INSERT INTO user
(id, nome, password, login, role)
VALUES
    (3, 'Usuário','$2a$10$BMKtMun7TxdYdubjUu8.j.JUeF8UouU/TIIbTOWerfatU0s8M9XIK', 'user', null);