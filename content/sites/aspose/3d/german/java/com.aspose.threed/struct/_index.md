---
title: Struktur
second_title: Aspose.3D für Java API-Referenz
description: Erstellt von lexchou am 13.11.2017.
type: docs
weight: 262
url: /de/java/com.aspose.threed/struct/
---

**All Implemented Interfaces:**
java.lang.Cloneable, java.io.Serializable
```
public interface Struct<T> extends Cloneable, Serializable
```

Erstellt von lexchou am 13.11.2017.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>byVal(T value)](#-T-byVal-T-) | Versuche, den Eingabewert zu kopieren, wenn er eine Struktur ist |
| [clone()](#clone--) | Klone aktuelle Instanz |
| [copyFrom(T t)](#copyFrom-T-) | Kopiere den internen Zustand vom Argument t |
### <T>byVal(T value) {#-T-byVal-T-}
```
public static T <T>byVal(T value)
```


Versuche, den Eingabewert zu kopieren, wenn er eine Struktur ist

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | T | Eingabewert zum Klonen |

**Returns:**
T – null, wenn die Eingabe null ist oder eine geklonte Instanz
### clone() {#clone--}
```
public abstract T clone()
```


Klone aktuelle Instanz

**Returns:**
T – geklonte Instanz
### copyFrom(T t) {#copyFrom-T-}
```
public abstract void copyFrom(T t)
```


Kopiere den internen Zustand vom Argument t

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| t | T | Quellinstanz zum Kopieren |

