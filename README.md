Gestor de Contactos - Listas Enlazadas Dinámicas

En este proyecto desarrollé desde cero un sistema de gestión de estructuras de datos dinámicas en Java. Tomé la decisión de no utilizar las colecciones predefinidas del lenguaje (como java.util.LinkedList) con el objetivo principal de aplicar y demostrar mis conocimientos sobre el manejo a bajo nivel de la memoria dinámica (Heap) y la interconexión de punteros.

Estructuras Implementadas

* **Lista Simplemente Enlazada:** Programé la lógica para la inserción y el recorrido unidireccional, gestionando de forma manual los punteros de cabeza (head) y cola (tail).
* **Lista Doblemente Enlazada:** Implementé un recorrido bidireccional mediante enlaces de avance y retroceso (next y prev), lo que me permitió agregar funcionalidades como la impresión inversa de la lista sin perder la referencia en memoria.
* **Lista Circular:** Diseñé una estructura en anillo donde configuré el puntero de avance del último nodo para que apunte de regreso a la cabeza de la lista, manteniendo la estructura unida.

Conceptos Aplicados

Durante el desarrollo de este código, apliqué los siguientes fundamentos de programación estructurada y orientada a objetos:
* Gestión manual de asignación de memoria en tiempo de ejecución para la instanciación de nodos.
* Reconexión de referencias lógicas al insertar y eliminar elementos, asegurando que el recolector de basura (Garbage Collector) de Java pueda liberar la memoria correctamente sin generar fugas.
* Uso de Tipos de Datos Abstractos (TDA) mediante la creación y manipulación de la clase compleja Contact, en lugar de utilizar datos primitivos.
* Aplicación de polimorfismo al sobrescribir el método .equals() para lograr que los algoritmos de búsqueda y eliminación identifiquen equivalencias lógicas de manera precisa.

Tecnologías y Entorno

* Lenguaje: Java
* Entorno de desarrollo: Apache NetBeans

Cómo ejecutar el proyecto

1. Clonar este repositorio o descargar el código fuente en el equipo local.
2. Abrir la carpeta del proyecto desde Apache NetBeans como una aplicación Java (Java Application).
3. Compilar y ejecutar el archivo Main.java para iniciar la interacción mediante el menú desplegado en la consola del sistema.
