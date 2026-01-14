INSERT INTO usuario (id, nombre, email)
VALUES (1, 'Juan Pérez', 'juan@example.com');

INSERT INTO usuario (id, nombre, email)
VALUES (2, 'María López', 'maria@example.com');

INSERT INTO usuario (id, nombre, email)
VALUES (3, 'Carlos Ruiz', 'carlos@example.com');


INSERT INTO incidencia (id, titulo, descripcion, prioridad, estado, fechacreacion, fk_usuario)
VALUES (1, 'No funciona el WiFi', 'El portátil no conecta a la red.', 'ALTA', 'ABIERTA', '2024-01-14', 1);

INSERT INTO incidencia (id, titulo, descripcion, prioridad, estado, fechacreacion, fk_usuario)
VALUES (2, 'Pantalla en negro', 'El PC enciende pero no muestra imagen.', 'MEDIA', 'EN_PROCESO', '2025-01-14', 2);

INSERT INTO incidencia (id, titulo, descripcion, prioridad, estado, fechacreacion, fk_usuario)
VALUES (3, 'Error al imprimir', 'La impresora lanza un error desconocido.', 'BAJA', 'ABIERTA', '2026-01-14', 1);


INSERT INTO comentario (id, contenido, fecha, fk_incidencia, fk_usuario)
VALUES (1, '¿Has probado reiniciar el router?', '2024-01-14', 1, 2);

INSERT INTO comentario (id, contenido, fecha, fk_incidencia, fk_usuario)
VALUES (2, 'Revisando cables de alimentación.', '2023-01-14', 2, 3);

INSERT INTO comentario (id, contenido, fecha, fk_incidencia, fk_usuario)
VALUES (3, 'Intenta volver a añadir la impresora.', '2026-01-14', 3, 2);