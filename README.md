## Integrantes:

-    Alcivar Castillo Moises
-    Cevallos Llumipanta Jamileth
-    Cifuentes González Elian

## Descripción General

Este proyecto implementa el modelo básico de un videojuego llamado
"Legends of Aether", aplicando los principios fundamentales de la
Programación Orientada a Objetos (POO):

-   Abstracción
-   Encapsulamiento
-   Enumeraciones avanzadas (Enums)

Simulando personajes, enemigos, objetos y niveles dentro del
juego.

------------------------------------------------------------------------

# Clases Implementadas

## 1. PersonajeJugador

Representa al personaje controlado por el jugador. Incluye:

-   nombre
-   salud
-   TipoPersonaje (enum)

Comportamiento principal: - atacar(CriaturaEnemiga enemigo)

------------------------------------------------------------------------

## 2. CriaturaEnemiga

Representa a las criaturas enemigas del juego. Incluye:

-   nombre
-   salud
-   TipoCriaturaEnemiga (enum)

Comportamiento principal: - recibirDaño(int daño)

------------------------------------------------------------------------

## 3. ObjetoRecolectable

Representa un objeto que el jugador puede recoger. Incluye:

-   nombre
-   RarezaObjeto (enum)

Comportamiento principal: - recolectar(PersonajeJugador jugador)

------------------------------------------------------------------------

## 4. NivelZona

Simula una zona o escenario del juego. Incluye:

-   Lista de CriaturaEnemiga
-   Lista de ObjetoRecolectable

Comportamientos principales: - agregarEnemigo(CriaturaEnemiga enemigo) -
agregarObjeto(ObjetoRecolectable objeto) - mostrarContenido()

------------------------------------------------------------------------

# Abstracción y Encapsulamiento

## Abstracción

Cada clase representa un elemento esencial del videojuego:

-   PersonajeJugador controla acciones del jugador.
-   CriaturaEnemiga recibe daño.
-   ObjetoRecolectable puede ser recolectado.
-   Nivel organiza y muestra elementos.

## Encapsulamiento

Todos los atributos son privados y se accede a ellos mediante métodos
públicos (getters y setters), protegiendo los datos internos del
sistema.

------------------------------------------------------------------------

# Enumeraciones Avanzadas

## 1. TipoPersonaje

Define roles jugables junto con su estilo de juego y descripción
narrativa.

## 2. TipoCriaturaEnemiga

Define la amenaza y comportamiento de cada tipo de criatura.

## 3. RarezaObjeto

Define la probabilidad y valor relativo de cada objeto dentro del juego.

------------------------------------------------------------------------

# Integración Entre Clases

El sistema establece relaciones claras entre las clases:

-   El PersonajeJugador puede atacar a CriaturaEnemiga.\
-   El PersonajeJugador puede recolectar ObjetoRecolectable.\
-   Un Nivel contiene listas de enemigos y objetos.

------------------------------------------------------------------------

# Funcionamiento General del Sistema

1.  El jugador selecciona un PersonajeJugador.\
2.  Se crean enemigos y objetos dentro del nivel.\
3.  Se muestran los elementos del nivel.\
4.  El jugador puede realizar acciones como atacar y recolectar objetos.
