INSERT INTO usuario (id_usuario, nombre, email)
VALUES (1, 'Juan Pérez', 'juan@example.com');

INSERT INTO usuario (id_usuario, nombre, email)
VALUES (2, 'María López', 'maria@example.com');

INSERT INTO usuario (id_usuario, nombre, email)
VALUES (3, 'Carlos Ruiz', 'carlos@example.com');


INSERT INTO incidencia (id_incidencia, titulo, descripcion, prioridad, estado, fecha_creacion, fk_usuario)
VALUES (1, 'No funciona el WiFi', 'El portátil no conecta a la red.', 'ALTA', 'ABIERTA', CURRENT_TIMESTAMP, 1);

INSERT INTO incidencia (id_incidencia, titulo, descripcion, prioridad, estado, fecha_creacion, fk_usuario)
VALUES (2, 'Pantalla en negro', 'El PC enciende pero no muestra imagen.', 'MEDIA', 'EN_PROCESO', CURRENT_TIMESTAMP, 2);

INSERT INTO incidencia (id_incidencia, titulo, descripcion, prioridad, estado, fecha_creacion, fk_usuario)
VALUES (3, 'Error al imprimir', 'La impresora lanza un error desconocido.', 'BAJA', 'ABIERTA', CURRENT_TIMESTAMP, 1);


INSERT INTO comentario (id_comentario, contenido, fecha, fk_incidencia, fk_usuario)
VALUES (1, '¿Has probado reiniciar el router?', CURRENT_TIMESTAMP, 1, 2);

INSERT INTO comentario (id_comentario, contenido, fecha, fk_incidencia, fk_usuario)
VALUES (2, 'Revisando cables de alimentación.', CURRENT_TIMESTAMP, 2, 3);

INSERT INTO comentario (id_comentario, contenido, fecha, fk_incidencia, fk_usuario)
VALUES (3, 'Intenta volver a añadir la impresora.', CURRENT_TIMESTAMP, 3, 2);