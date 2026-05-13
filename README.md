#Sistema de Roles Empresariales (Java)

#Descripción

Este proyecto implementa un sistema de gestión de roles empresariales utilizando **interfaces y una clase abstracta en Java**.
El sistema modela tres tipos de usuarios: **Cajero, Administrador y Supervisor**, cada uno con diferentes responsabilidades dentro de la empresa.

El objetivo es aplicar correctamente el uso de interfaces junto con herencia para lograr un diseño más estructurado, reutilizable y profesional.

#Objetivo del Proyecto

* Aplicar interfaces como contratos de comportamiento
* Implementar herencia mediante clase abstracta
* Utilizar polimorfismo
* Evitar duplicación de código
* Diseñar un sistema claro y escalable

#Diseño del Sistema

El sistema está compuesto por interfaces y una clase abstracta base.

#Interfaces

* `Autenticable` → Permite validar acceso mediante usuario y contraseña
* `Reportable` → Permite generar reportes
* `Gestionable` → Permite gestionar información del sistema

#Clase Abstracta

#UsuarioBase

Clase abstracta que contiene:

* Atributos comunes:

  * `usuario`
  * `clave`
* Implementación del método:

  * `iniciarSesion()`

Su función es evitar la duplicación de código en las clases hijas.

#Clases Implementadas

#Cajero

Hereda de: `UsuarioBase`
Implementa:

* `Gestionable`

Funciones:

* Iniciar sesión (heredado)
* Gestionar datos

#Administrador

Hereda de: `UsuarioBase`
Implementa:

* `Reportable`
* `Gestionable`

Funciones:

* Iniciar sesión (heredado)
* Generar reportes
* Gestionar datos

#Supervisor

Hereda de: `UsuarioBase`
Implementa:

* `Reportable`

Funciones:

* Iniciar sesión (heredado)
* Generar reportes

#Funcionamiento

1. El sistema solicita usuario y contraseña
2. Se identifica el tipo de usuario
3. Se validan las credenciales mediante la clase abstracta
4. Si son correctas:

   * Se permite el acceso
   * Se ejecutan acciones según el rol
5. Si son incorrectas:

   * Se deniega el acceso

#Polimorfismo

El sistema utiliza polimorfismo mediante el uso de interfaces:

```java
Autenticable persona;
```

Esto permite que una misma variable pueda representar diferentes tipos de usuario según el rol.

#Validaciones

* Verificación de usuario y contraseña
* Control de acceso por rol
* Prevención de accesos inválidos

#Decisiones de Diseño

* Se utilizaron interfaces para definir responsabilidades específicas
* Se implementó una clase abstracta para reutilizar atributos y lógica común
* Cada clase implementa únicamente lo necesario según su rol
* Se combinó herencia e interfaces para lograr un diseño más profesional

#Ejecución del Proyecto

1. Abrir el proyecto en IntelliJ IDEA
2. Ejecutar la clase `MainRoles`
3. Ingresar credenciales según el rol

Ejemplo:

* Usuario: `admin`
* Clave: `admin`

#Tecnologías

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)

#Autor

Leonel Alejandro Moreira Rengifo

#Conclusión

La combinación de interfaces y clase abstracta permitió desarrollar un sistema organizado, reutilizable y fácil de mantener, aplicando principios fundamentales de la programación orientada a objetos como la herencia, el polimorfismo y la separación de responsabilidades.

VIDEO YOTUBE: https://youtu.be/B1MNF_QpGMM
