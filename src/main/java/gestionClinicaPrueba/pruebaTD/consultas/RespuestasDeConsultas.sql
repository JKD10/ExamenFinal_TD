/* Consulta 1
Se solicita mostrar el nombre de cada paciente y el nombre del doctor con el que tienen una cita asignada.*/

use gestion_clinica;
SELECT p.Nombre AS Nombre_Paciente, d.Nombre AS Nombre_Doctor
FROM citas c
JOIN pacientes p ON c.ID = p.ID
JOIN doctores d ON c.ID = d.ID;

/*Consulta 2
Se solicita una lista del Nombre y la Especialidad de todos los doctores que atendieron al paciente “Juan Pérez”*/

use gestion_clinica;
SELECT d.Nombre AS Nombre_Doctor, e.Nombre AS Especialidad
FROM citas c
JOIN pacientes p ON c.Paciente_ID = p.ID
JOIN doctores d ON c.Doctor_ID = d.ID
JOIN especialidades e ON d.Especialidad_ID = e.ID
WHERE p.Nombre = 'Juan Pérez';

/*Consulta 3
Se solicita una lista con el monto que factura cada doctor, ordenados alfabéticamente de forma descendente, agrupados por el nombre del Doctor.*/

SELECT d.Nombre AS Nombre_Doctor, SUM(f.Monto) AS Monto_Facturado
FROM doctores d
JOIN citas c ON c.Doctor_ID = d.ID
JOIN facturas f ON c.Factura_ID = f.ID
GROUP BY d.Nombre
ORDER BY d.Nombre DESC;

/*Consulta 4
Se solicita una lista que muestre por paciente, el diagnóstico y tratamiento que recibió en su última cita. Ordenados de forma ascendente por el id del paciente.*/

SELECT p.ID AS ID_Paciente, p.Nombre AS Nombre_Paciente, hc.Diagnostico, hc.Tratamiento
FROM pacientes p
JOIN historia_clinica hc ON p.ID = hc.Paciente_ID
WHERE hc.Fecha_Cita = (SELECT MAX(Fecha_Cita) FROM historia_clinica WHERE Paciente_ID = p.ID)
GROUP BY p.ID, hc.Diagnostico, hc.Tratamiento
ORDER BY p.ID ASC;

/*Consulta 5
Se solicita una lista con la cantidad de pacientes que ha atendido cada doctor.*/

SELECT d.Nombre AS Nombre_Doctor, COUNT(DISTINCT c.Paciente_ID) AS Cantidad_Pacientes
FROM doctores d
JOIN citas c ON c.Doctor_ID = d.ID
GROUP BY d.Nombre;


