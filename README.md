# Práctica Individual 2: Árboles y Grafos.
# Proyecto: Ejercicios de Algoritmos y Estructuras de Datos

Este repositorio contiene la implementación de varios ejercicios relacionados con árboles binarios, árboles n-arios, grafos y problemas de dependencia, desarrollados para la asignatura de Algoritmos y Estructuras de Datos Avanzadas. Cada ejercicio aborda problemas complejos utilizando técnicas eficientes y buenas prácticas de programación.

---

## Ejercicios Resueltos

### **1. Números Palíndromos en Árboles**
- **Problema:**
  - Diseñar un algoritmo que devuelva el número palíndromo de mayor longitud formado desde el nodo raíz hasta una hoja de un árbol binario de enteros positivos de un solo dígito.
  - Extensión: Proporcionar una solución también para árboles n-arios.
- **Salida esperada:**
  - El número palíndromo más largo o -1 si no existe ningún palíndromo.
- **Requisitos:**
  - Solución implementada de forma recursiva.

### **2. Longitud de Cadenas en Niveles del Árbol**
- **Problema:**
  - Diseñar un algoritmo que devuelva una lista con el número de cadenas en cada nivel del árbol cuya longitud sea mayor que un entero `k`.
  - Extensión: Proporcionar una solución también para árboles n-arios.
- **Salida esperada:**
  - Una lista de enteros correspondiente a cada nivel del árbol.
- **Requisitos:**
  - Solución implementada de forma recursiva.

### **3. Problemas en Grafos de Estaciones de Tren**
Este ejercicio trabaja con grafos conexos, no dirigidos y ponderados, con las siguientes sub-tareas:

#### a. Filtrado de Estaciones y Tramos:
- Seleccionar estaciones con más de 7 empleados y una media de costes de tramos menor a 10 euros.
- Resaltar estaciones y aristas seleccionadas en el grafo.

#### b. Trayecto de Menor Coste:
- Determinar el trayecto de menor coste entre dos estaciones dadas y resaltarlo en el grafo.

#### c. Camino de Menor Tiempo Medio (Viaje Hamiltoniano):
- Encontrar el camino de menor tiempo medio que pase por todas las estaciones exactamente una vez y vuelva al origen.

#### d. Tramos Críticos y Cierre de Tramos:
- Identificar tramos más importantes para garantizar la conectividad y tramos críticos cuya falla implica desconexión.

#### e. Mantenimiento de Tramos y Estaciones:
- Minimizar el número de estaciones para enviar personal de mantenimiento.
- Asignar franjas horarias a estaciones minimizando el solapamiento de mantenimientos.

### **4. Instalación de Aplicaciones con Dependencias**
- **Problema:** Trabajar con un grafo dirigido y acíclico (DAG) que representa aplicaciones y sus dependencias.

#### a. Orden Válido de Instalación:
- Generar un orden válido respetando las dependencias.

#### b. Clasificación de Aplicaciones:
- Identificar aplicaciones que no dependen de ninguna y aquellas de las que no depende ninguna otra.

#### c. Aplicaciones Más Dependientes:
- Determinar las aplicaciones que dependen directa o indirectamente de un mayor número de otras.

#### d. Dependencias de una Aplicación:
- Listar todas las aplicaciones que dependen directa o indirectamente de una dada.

---

## Características del Proyecto
- **Entrada:**
  - Todos los datos de entrada se leen desde ficheros, asegurando una separación clara entre los algoritmos y los datos.
- **Salida:**
  - Los resultados de cada ejercicio se imprimen en pantalla y se muestran en representaciones visuales cuando sea necesario.
- **Visualizaciones:**
  - Grafos configurados con diferentes colores y estilos para resaltar elementos relevantes (estaciones, aristas, dependencias, etc.).

## Tecnologías Utilizadas
- Lenguaje de programación: [Especificar el lenguaje principal]
- Librerías para visualización de grafos: [Especificar librerías, como `matplotlib`, `networkx`, etc.]
- Lectura de ficheros: Manejo eficiente de entrada y salida de datos.

## Estructura del Repositorio
- **`/src`**: Código fuente de los algoritmos.
- **`/data`**: Ficheros de entrada con datos de prueba.
- **`/visualizations`**: Visualizaciones generadas por los algoritmos.
- **`README.md`**: Descripción del proyecto.

## Uso
1. Clona el repositorio:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```
2. Dirígete al directorio del proyecto:
   ```bash
   cd <NOMBRE_DEL_REPOSITORIO>
   ```
3. Ejecuta los scripts correspondientes a cada ejercicio:
   ```bash
   python ejercicio1.py
   python ejercicio2.py
   python ejercicio3.py
   python ejercicio4.py
   ```

## Contacto
Si tienes alguna pregunta o sugerencia sobre este proyecto, no dudes en abrir un issue o contactar al autor a través de [TU_CORREO].


