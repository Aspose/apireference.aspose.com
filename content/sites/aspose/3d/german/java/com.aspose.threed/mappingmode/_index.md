---
title: MappingMode
second_title: Aspose.3D für Java API-Referenz
description: Bestimmt, wie das Element auf eine Oberfläche abgebildet wird.
type: docs
weight: 285
url: /de/java/com.aspose.threed/mappingmode/
---

**Inheritance:**
java.lang.Object, java.lang.Enum
```
public enum MappingMode extends Enum<MappingMode>
```

Bestimmt, wie das Element auf eine Oberfläche abgebildet wird. Der [MappingMode](../../com.aspose.threed/mappingmode) definiert, wie [VertexElement](../../com.aspose.threed/vertexelement) auf die Oberfläche der Geometrie abgebildet wird.
## Felder

| Feld | Beschreibung |
| --- | --- |
| [ALL_SAME](#ALL-SAME) | Ein Datenwert, der auf die gesamte Oberfläche abgebildet ist. |
| [CONTROL_POINT](#CONTROL-POINT) | Jeder Datenwert wird dem Kontrollpunkt der Geometrie zugeordnet. |
| [EDGE](#EDGE) | Die Daten werden der Kante zugeordnet. |
| [POLYGON](#POLYGON) | Die Daten werden dem Polygon zugeordnet. |
| [POLYGON_VERTEX](#POLYGON-VERTEX) | Die Daten werden dem Polygon‑Scheitelpunkt zugeordnet. Wenn ein Kontrollpunkt von mehreren Polygonen gemeinsam genutzt wird und die Daten als [POLYGON\_VERTEX](../../com.aspose.threed/mappingmode\#POLYGON-VERTEX) zugeordnet sind, hat der Kontrollpunkt als verschiedener Polygon‑Scheitelpunkt eigene Daten. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [<T>valueOf(Class<T> arg0, String arg1)](#-T-valueOf-java.lang.Class-T--java.lang.String-) |  |
| [compareTo(E arg0)](#compareTo-E-) |  |
| [describeConstable()](#describeConstable--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDeclaringClass()](#getDeclaringClass--) |  |
| [hashCode()](#hashCode--) |  |
| [name()](#name--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [ordinal()](#ordinal--) |  |
| [toString()](#toString--) |  |
| [valueOf(String name)](#valueOf-java.lang.String-) |  |
| [values()](#values--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ALL_SAME {#ALL-SAME}
```
public static final MappingMode ALL_SAME
```


Ein Datenwert, der auf die gesamte Oberfläche abgebildet ist. Unabhängig davon, ob Daten als Kontrollpunkt/Polygon‑Scheitelpunkt/Kantenendpunkte interpretiert werden, sind die Daten immer dieselben, wie sie durch [ALL\_SAME](../../com.aspose.threed/mappingmode\#ALL-SAME) definiert sind.

### CONTROL_POINT {#CONTROL-POINT}
```
public static final MappingMode CONTROL_POINT
```


Jeder Datenwert wird dem Kontrollpunkt der Geometrie zugeordnet.

### EDGE {#EDGE}
```
public static final MappingMode EDGE
```


Die Daten werden der Kante zugeordnet. Jeder Kantenendpunkt teilt dieselben Daten, wenn die Zuordnung [EDGE](../../com.aspose.threed/mappingmode\#EDGE) ist.

### POLYGON {#POLYGON}
```
public static final MappingMode POLYGON
```


Die Daten werden dem Polygon zugeordnet. Jeder Polygon‑Scheitelpunkt teilt dieselben Daten, wenn der Zuordnungsmodus [POLYGON](../../com.aspose.threed/mappingmode\#POLYGON) ist.

### POLYGON_VERTEX {#POLYGON-VERTEX}
```
public static final MappingMode POLYGON_VERTEX
```


Die Daten werden dem Polygon‑Scheitelpunkt zugeordnet. Wenn ein Kontrollpunkt von mehreren Polygonen gemeinsam genutzt wird und die Daten als [POLYGON\_VERTEX](../../com.aspose.threed/mappingmode\#POLYGON-VERTEX) zugeordnet sind, hat der Kontrollpunkt als verschiedener Polygon‑Scheitelpunkt eigene Daten.

### <T>valueOf(Class<T> arg0, String arg1) {#-T-valueOf-java.lang.Class-T--java.lang.String-}
```
public static T <T>valueOf(Class<T> arg0, String arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Class<T> |  |
| arg1 | java.lang.String |  |

**Returns:**
T
### compareTo(E arg0) {#compareTo-E-}
```
public final int compareTo(E arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | E |  |

**Returns:**
int
### describeConstable() {#describeConstable--}
```
public final Optional<Enum.EnumDesc<E>> describeConstable()
```




**Returns:**
java.util.Optional<java.lang.Enum.EnumDesc<E>>
### equals(Object arg0) {#equals-java.lang.Object-}
```
public final boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDeclaringClass() {#getDeclaringClass--}
```
public final Class<E> getDeclaringClass()
```




**Returns:**
java.lang.Class<E>
### hashCode() {#hashCode--}
```
public final int hashCode()
```




**Returns:**
int
### name() {#name--}
```
public final String name()
```




**Returns:**
java.lang.String
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### ordinal() {#ordinal--}
```
public final int ordinal()
```




**Returns:**
int
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### valueOf(String name) {#valueOf-java.lang.String-}
```
public static MappingMode valueOf(String name)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String |  |

**Returns:**
[MappingMode](../../com.aspose.threed/mappingmode)
### values() {#values--}
```
public static MappingMode[] values()
```




**Returns:**
com.aspose.threed.MappingMode[]
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

