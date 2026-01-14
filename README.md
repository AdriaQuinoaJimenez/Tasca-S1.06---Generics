# Tasca S1.06: Tipus Genèrics en Java

**Descripció**: Aquesta tasca aprofundeix en l'ús de tipus genèrics (Generics) en Java per crear codi reutilitzable, segur i net. El projecte evoluciona des de classes sense genèrics (basades en `Object`) fins a la implementació de mètodes genèrics complexos que combinen tipus fixos i paràmetres variables (Varargs).

## 📌 Enunciat del exercici

El projecte es divideix en dos nivells de dificultat:

### Nivell 1
- **Exercici 1**: Crear una classe `NoGenericMethods` que emmagatzema tres objectes del mateix tipus sense utilitzar genèrics, demostrant la necessitat de fer càstings manuals.
- **Exercici 2**: Crear una classe `Person` i un mètode genèric `printElements()` que accepti tres tipus de dades diferents en qualsevol ordre.

### Nivell 2
- **Aquest exercicis están fets a les mateixes classes, está indicat amb comentaris**
- **Exercici 1 i 2**: Refinar el mètode genèric per admetre un argument fix (`String`), un argument genèric i un nombre variable d'arguments genèrics (`Varargs`), verificant la flexibilitat de la solució.

## ✨ Funcionalitats
- **Tipificació segura**: Ús de genèrics per evitar errors de tipus en temps d'execució.
- **Flexibilitat total**: Mètodes capaços de rebre qualsevol objecte (`Person`, `String`, `Integer`, etc.).
- **Arguments variables**: Implementació de `Varargs` per processar llistes d'elements de longitud indefinida.
- **Inferencia de tipus**: Aprofitament de la capacitat de Java per detectar automàticament els tipus de dades passats als mètodes.

## 🛠 Tecnologies
- **Llenguatge**: Java 17+
- **Gestor de projectes**: Gradle / Maven
- **IDE**: IntelliJ IDEA

## 🚀 Instal·lació i Execució
1. **Clonar el repositori**:
   ```bash
   git clone [https://github.com/el-teu-usuari/S1.06-Generics.git](https://github.com/el-teu-usuari/S1.06-Generics.git)