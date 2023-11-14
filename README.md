# Proyecto de Agricultura: Granjeros y Clientes Carlos Gabriel Díaz Zapata

Este proyecto simula la colaboración entre granjeros y clientes en el cultivo y consumo de verduras. Los granjeros plantan diversas verduras en un huerto compartido, y los clientes consumen esas verduras en un restaurante vegano.

## Contenido

1. [Estructura del Proyecto](#estructura-del-proyecto)
2. [Instrucciones de Ejecución](#instrucciones-de-ejecución)
3. [Clases Principales](#clases-principales)
4. [Personalizaciones](#personalizaciones)

## Estructura del Proyecto

La estructura del proyecto está organizada en paquetes para separar las clases de granjeros, clientes y el restaurante. La lógica principal se encuentra en las siguientes clases:

- `Granjero`: Representa a los granjeros y su capacidad para plantar verduras.
- `Cliente`: Representa a los clientes y su capacidad para consumir verduras.
- `Restaurante`: Representa el recurso compartido (almacén) entre granjeros y clientes.

## Instrucciones de Ejecución

Para ejecutar la simulación, sigue estos pasos:

1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo (Eclipse, IntelliJ, etc.).
3. Ejecuta la clase `App` desde el paquete principal.

## Clases Principales

### Granjero

La clase `Granjero` extiende la clase `Thread` y representa a los granjeros que plantan verduras en el huerto. Cada granjero tiene un nombre, cantidad de verduras a plantar y puede plantar varias verduras.

### Cliente

La clase `Cliente` extiende la clase `Thread` y representa a los clientes que consumen las verduras del restaurante. Cada cliente tiene un nombre, cantidad de verduras a consumir y realiza la acción de consumir.

### Restaurante

La clase `Restaurante` gestiona el recurso compartido (almacén) donde se depositan y consumen las verduras. Utiliza `BlockingQueue` para modelar el almacén con capacidad limitada.

## Personalizaciones

- Puedes ajustar la capacidad del restaurante modificando el valor al instanciar la clase `Restaurante`.
- Personaliza los tiempos de crecimiento, consumo, y otros parámetros según tus necesidades en las clases `Granjero` y `Cliente`.
 

