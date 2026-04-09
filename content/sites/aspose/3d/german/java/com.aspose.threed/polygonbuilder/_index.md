---
title: PolygonBuilder
second_title: Aspose.3D für Java API-Referenz
description: Eine Hilfsklasse zum Erstellen von Polygonen für  Beispiel
type: docs
weight: 133
url: /de/java/com.aspose.threed/polygonbuilder/
---

**Inheritance:**
java.lang.Object
```
public final class PolygonBuilder
```

Eine Hilfsklasse zum Erstellen von Polygonen für [Mesh](../../com.aspose.threed/mesh) **Beispiel:**

```
Mesh mesh = new Mesh();
  PolygonBuilder builder = new PolygonBuilder(mesh);
  builder.begin();
  builder.addVertex(0);
  builder.addVertex(1);
  builder.addVertex(2);
  builder.end();
```

Entspricht:

```
Mesh mesh = new Mesh();
  int[] indices = new int[] {0, 1, 2};
  mesh.createPolygon(indices);
```

Wenn alle Indizes einsatzbereit sind, wird [Mesh](../../com.aspose.threed/mesh) bevorzugt, andernfalls wäre [PolygonBuilder](../../com.aspose.threed/polygonbuilder) die bessere Wahl.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [PolygonBuilder(Mesh mesh)](#PolygonBuilder-com.aspose.threed.Mesh-) | Initialisiert eine neue Instanz der Klasse [PolygonBuilder](../../com.aspose.threed/polygonbuilder). |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addVertex(int index)](#addVertex-int-) | Fügt dem Polygon einen Scheitelindex hinzu |
| [begin()](#begin--) | Beginnt ein neues Polygon hinzuzufügen |
| [end()](#end--) | Beendet die Polygonerstellung |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PolygonBuilder(Mesh mesh) {#PolygonBuilder-com.aspose.threed.Mesh-}
```
public PolygonBuilder(Mesh mesh)
```


Initialisiert eine neue Instanz der Klasse [PolygonBuilder](../../com.aspose.threed/polygonbuilder).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mesh | [Mesh](../../com.aspose.threed/mesh) | Auf welchem Mesh das Polygon erstellt werden soll. |

### addVertex(int index) {#addVertex-int-}
```
public void addVertex(int index)
```


Fügt dem Polygon einen Scheitelindex hinzu

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int |  |

### begin() {#begin--}
```
public void begin()
```


Beginnt ein neues Polygon hinzuzufügen

### end() {#end--}
```
public void end()
```


Beendet die Polygonerstellung

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
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
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
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

