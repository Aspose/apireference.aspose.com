---
title: VertexDeclaration
second_title: Aspose.3D für Java API-Referenz
description: Die Deklaration einer benutzerdefinierten Vertex-Struktur.
type: docs
weight: 206
url: /de/java/com.aspose.threed/vertexdeclaration/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.lang.Iterable, java.lang.Comparable
```
public final class VertexDeclaration implements Iterable<VertexField>, Comparable<VertexDeclaration>
```

Die Deklaration der Struktur eines benutzerdefinierten Vertex.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [VertexDeclaration()](#VertexDeclaration--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [addField(int dataType, VertexFieldSemantic semantic)](#addField-int-com.aspose.threed.VertexFieldSemantic-) | Ein neues Vertex-Feld hinzufügen. |
| [addField(int dataType, VertexFieldSemantic semantic, int index)](#addField-int-com.aspose.threed.VertexFieldSemantic-int-) | Ein neues Vertex-Feld hinzufügen. |
| [addField(int dataType, VertexFieldSemantic semantic, int index, String alias)](#addField-int-com.aspose.threed.VertexFieldSemantic-int-java.lang.String-) | Ein neues Vertex-Feld hinzufügen. |
| [clear()](#clear--) | Alle Felder löschen. |
| [compareTo(VertexDeclaration other)](#compareTo-com.aspose.threed.VertexDeclaration-) | Vergleicht diese Instanz mit einem angegebenen Objekt und gibt einen Hinweis auf deren relative Werte zurück. |
| [equals(Object obj)](#equals-java.lang.Object-) | Bestimmt, ob diese Instanz und ein angegebenes Objekt, das ebenfalls ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration)-Objekt sein muss, denselben Wert haben. |
| [fromGeometry(Geometry geometry, boolean useFloat)](#fromGeometry-com.aspose.threed.Geometry-boolean-) | Erstelle ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) basierend auf dem Layout einer [Geometry](../../com.aspose.threed/geometry). |
| [get(int index)](#get-int-) | Liefert das [VertexField](../../com.aspose.threed/vertexfield) nach Index. |
| [getClass()](#getClass--) |  |
| [getCount()](#getCount--) | Gibt die Anzahl aller in diesem [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) definierten Felder zurück. |
| [getSealed()](#getSealed--) | Ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) wird versiegelt, wenn es von [TriMesh](../../com.aspose.threed/trimesg) verwendet wurde; weitere Änderungen sind nicht mehr erlaubt. |
| [getSize()](#getSize--) | Die Größe in Byte der Vertex-Struktur. |
| [hashCode()](#hashCode--) | Gibt den Hashcode für diese Zeichenkette zurück. |
| [iterator()](#iterator--) | Gibt einen Enumerator zurück, um alle Vertex-Felder in dieser Instanz zu durchlaufen. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) | String-Darstellung von [VertexDeclaration](../../com.aspose.threed/vertexdeclaration). |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### VertexDeclaration() {#VertexDeclaration--}
```
public VertexDeclaration()
```


### addField(int dataType, VertexFieldSemantic semantic) {#addField-int-com.aspose.threed.VertexFieldSemantic-}
```
public VertexField addField(int dataType, VertexFieldSemantic semantic)
```


Ein neues Vertex-Feld hinzufügen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dataType | int | Der Datentyp des Vertex-Feldes. |
| semantic | [VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic) | Wie wird dieses Feld verwendet |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### addField(int dataType, VertexFieldSemantic semantic, int index) {#addField-int-com.aspose.threed.VertexFieldSemantic-int-}
```
public VertexField addField(int dataType, VertexFieldSemantic semantic, int index)
```


Ein neues Vertex-Feld hinzufügen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dataType | int | Der Datentyp des Vertex-Feldes. |
| semantic | [VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic) | Wie wird dieses Feld verwendet |
| Index | int | Der Index für dieselbe Feldsemantik, -1 für automatische Generierung |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### addField(int dataType, VertexFieldSemantic semantic, int index, String alias) {#addField-int-com.aspose.threed.VertexFieldSemantic-int-java.lang.String-}
```
public VertexField addField(int dataType, VertexFieldSemantic semantic, int index, String alias)
```


Ein neues Vertex-Feld hinzufügen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| dataType | int | Der Datentyp des Vertex-Feldes. |
| semantic | [VertexFieldSemantic](../../com.aspose.threed/vertexfieldsemantic) | Wie wird dieses Feld verwendet |
| Index | int | Der Index für dieselbe Feldsemantik, -1 für automatische Generierung |
| Alias | java.lang.String | Der Aliasname des Feldes |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield)
### clear() {#clear--}
```
public void clear()
```


Alle Felder löschen.

### compareTo(VertexDeclaration other) {#compareTo-com.aspose.threed.VertexDeclaration-}
```
public int compareTo(VertexDeclaration other)
```


Vergleicht diese Instanz mit einem angegebenen Objekt und gibt einen Hinweis auf deren relative Werte zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) |  |

**Returns:**
int
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Bestimmt, ob diese Instanz und ein angegebenes Objekt, das ebenfalls ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration)-Objekt sein muss, denselben Wert haben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### fromGeometry(Geometry geometry, boolean useFloat) {#fromGeometry-com.aspose.threed.Geometry-boolean-}
```
public static VertexDeclaration fromGeometry(Geometry geometry, boolean useFloat)
```


Erstelle ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) basierend auf dem Layout einer [Geometry](../../com.aspose.threed/geometry).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| geometry | [Geometry](../../com.aspose.threed/geometry) |  |
| useFloat | boolean | Verwenden Sie float anstelle des double-Typs |

**Returns:**
[VertexDeclaration](../../com.aspose.threed/vertexdeclaration)
### get(int index) {#get-int-}
```
public VertexField get(int index)
```


Liefert das [VertexField](../../com.aspose.threed/vertexfield) nach Index.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Index | int |  |

**Returns:**
[VertexField](../../com.aspose.threed/vertexfield) - the [VertexField](../../com.aspose.threed/vertexfield) by index
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCount() {#getCount--}
```
public int getCount()
```


Gibt die Anzahl aller in diesem [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) definierten Felder zurück.

**Returns:**
int – die Anzahl aller in dieser [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) definierten Felder
### getSealed() {#getSealed--}
```
public boolean getSealed()
```


Ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) wird versiegelt, wenn es von [TriMesh](../../com.aspose.threed/trimesg) verwendet wurde; weitere Änderungen sind nicht mehr erlaubt.

**Returns:**
boolean – Ein [VertexDeclaration](../../com.aspose.threed/vertexdeclaration) wird versiegelt, wenn es von [TriMesh](../../com.aspose.threed/trimesh) verwendet wurde; weitere Änderungen sind nicht erlaubt.
### getSize() {#getSize--}
```
public int getSize()
```


Die Größe in Byte der Vertex-Struktur.

**Returns:**
int – Die Größe in Byte der Vertex-Struktur.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode für diese Zeichenkette zurück.

**Returns:**
int - Ein 32‑Bit vorzeichenbehafteter Integer-Hashcode.
### iterator() {#iterator--}
```
public Iterator<VertexField> iterator()
```


Gibt einen Enumerator zurück, um alle Vertex-Felder in dieser Instanz zu durchlaufen.

**Returns:**
java.util.Iterator<com.aspose.threed.VertexField> – Enumerator
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


String-Darstellung von [VertexDeclaration](../../com.aspose.threed/vertexdeclaration).

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

