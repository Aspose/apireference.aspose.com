---
title: BoundingBox
second_title: Aspose.3D für Java API-Referenz
description: Der achsenorientierte BoundingBox Beispiel  Der folgende Code zeigt, wie man eine BoundingBox von einer Entity-Instanz erhält.
type: docs
weight: 24
url: /de/java/com.aspose.threed/boundingbox/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.threed.Struct, java.io.Serializable
```
public final class BoundingBox implements Struct<BoundingBox>, Serializable
```

Die achsenorientierte Begrenzungsbox **Beispiel:** Der folgende Code zeigt, wie man eine Begrenzungsbox aus einer Entity‑Instanz erhält.

```
var sphere = new Sphere();
      var boundingBox = sphere.getBoundingBox();
      System.out.println("Bounding box = " + boundingBox);
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [BoundingBox(Vector3 minimum, Vector3 maximum)](#BoundingBox-com.aspose.threed.Vector3-com.aspose.threed.Vector3-) | Initialisieren Sie eine endliche Begrenzungsbox mit gegebenen minimalen und maximalen Eckpunkten |
| [BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)](#BoundingBox-double-double-double-double-double-double-) | Initialisieren Sie eine endliche Begrenzungsbox mit gegebenen minimalen und maximalen Eckpunkten |
| [BoundingBox()](#BoundingBox--) |  |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [contains(BoundingBox bbox)](#contains-com.aspose.threed.BoundingBox-) | Die BoundingBox, um zu prüfen, ob sie innerhalb der aktuellen BoundingBox liegt. |
| [contains(Vector3 p)](#contains-com.aspose.threed.Vector3-) | Prüfe, ob der Punkt p innerhalb der BoundingBox liegt |
| [copyFrom(BoundingBox src)](#copyFrom-com.aspose.threed.BoundingBox-) |  |
| [equals(Object obj)](#equals-java.lang.Object-) | Bestimmt, ob zwei Objekte gleich sind |
| [fromGeometry(Geometry geometry)](#fromGeometry-com.aspose.threed.Geometry-) | Erstelle eine BoundingBox aus gegebener Geometrie |
| [getCenter()](#getCenter--) | Der Mittelpunkt der BoundingBox. |
| [getClass()](#getClass--) |  |
| [getExtent()](#getExtent--) | Gibt den Umfang der Begrenzungsbox zurück. |
| [getInfinite()](#getInfinite--) | Die unendliche Begrenzungsbox |
| [getMaximum()](#getMaximum--) | Der maximale Eckpunkt der Begrenzungsbox |
| [getMinimum()](#getMinimum--) | Der minimale Eckpunkt der Begrenzungsbox |
| [getNull()](#getNull--) | Die Null-Begrenzungsbox |
| [getSize()](#getSize--) | Die Größe der BoundingBox |
| [hashCode()](#hashCode--) | Gibt den Hashcode für diese Instanz zurück |
| [merge(BoundingBox bb)](#merge-com.aspose.threed.BoundingBox-) | Fügt die neue Box in die aktuelle Begrenzungsbox ein. |
| [merge(Vector3 pt)](#merge-com.aspose.threed.Vector3-) | Füge die aktuelle BoundingBox mit dem angegebenen Punkt zusammen |
| [merge(Vector4 pt)](#merge-com.aspose.threed.Vector4-) | Füge die aktuelle BoundingBox mit dem angegebenen Punkt zusammen |
| [merge(double x, double y, double z)](#merge-double-double-double-) | Füge die aktuelle BoundingBox mit dem angegebenen Punkt zusammen |
| [mul(BoundingBox bbox, Matrix4 mat)](#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-) | Operatorüberladung für Multiplikation, die minimale und maximale Ecke der neuen BoundingBox werden durch die Matrix transformiert. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [overlapsWith(BoundingBox box)](#overlapsWith-com.aspose.threed.BoundingBox-) | Prüfe, ob die aktuelle BoundingBox mit der angegebenen BoundingBox überlappt. |
| [scale()](#scale--) | Berechnet den absoluten größten Koordinatenwert eines beliebigen enthaltenen Punktes. |
| [toString()](#toString--) | Gibt die Zeichenkettenrepräsentation der Begrenzungsbox zurück. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BoundingBox(Vector3 minimum, Vector3 maximum) {#BoundingBox-com.aspose.threed.Vector3-com.aspose.threed.Vector3-}
```
public BoundingBox(Vector3 minimum, Vector3 maximum)
```


Initialisieren Sie eine endliche Begrenzungsbox mit gegebenen minimalen und maximalen Eckpunkten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| minimum | [Vector3](../../com.aspose.threed/vector3) | Der minimale Eckpunkt |
|  | maximum | [Vector3](../../com.aspose.threed/vector3) | Die maximale Ecke **Example:** Der folgende Code zeigt, wie man eine BoundingBox aus minimalen und maximalen Ecken konstruiert. |

```
var minimum = new Vector3(0, 0, 0);
  var maximum = new Vector3(10, 10, 10);
  var boundingBox = new BoundingBox(minimum, maximum);
  System.out.println("Bounding box = " + boundingBox);
``` |

### BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {#BoundingBox-double-double-double-double-double-double-}
```
public BoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
```


Initialisieren Sie eine endliche Begrenzungsbox mit gegebenen minimalen und maximalen Eckpunkten

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| minX | double | Der X-Wert der minimalen Ecke |
| minY | double | The minimum corner's Y |
| minZ | double | The minimum corner's Z |
| maxX | double | Die maximale Ecke X |
| maxY | double | Die maximale Ecke Y |
|  | maxZ | double | Die maximale Ecke Z **Example:** Der folgende Code zeigt, wie man eine Begrenzungsbox aus minimalen und maximalen Ecken konstruiert. |

```
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
  System.out.println("Bounding box = " + boundingBox);
``` |

### BoundingBox() {#BoundingBox--}
```
public BoundingBox()
```


### clone() {#clone--}
```
public BoundingBox clone()
```


Klone aktuelle Instanz

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### contains(BoundingBox bbox) {#contains-com.aspose.threed.BoundingBox-}
```
public boolean contains(BoundingBox bbox)
```


Die BoundingBox, um zu prüfen, ob sie innerhalb der aktuellen BoundingBox liegt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bbox | [BoundingBox](../../com.aspose.threed/boundingbox) |  |

**Returns:**
boolean
### contains(Vector3 p) {#contains-com.aspose.threed.Vector3-}
```
public boolean contains(Vector3 p)
```


Prüfe, ob der Punkt p innerhalb der BoundingBox liegt

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| p | [Vector3](../../com.aspose.threed/vector3) | Der zu testende Punkt |

**Returns:**
boolean - True, wenn der Punkt innerhalb der Begrenzungsbox liegt **Example:** Der folgende Code zeigt, wie man prüft, ob ein Punkt innerhalb der Begrenzungsbox liegt.

```
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
  var pt = new Vector3(4, 4, 4);
  System.out.println("Bounding box overlaps = " + boundingBox.contains(pt));
```
### copyFrom(BoundingBox src) {#copyFrom-com.aspose.threed.BoundingBox-}
```
public void copyFrom(BoundingBox src)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| src | [BoundingBox](../../com.aspose.threed/boundingbox) |  |

### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Bestimmt, ob zwei Objekte gleich sind

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object | Das zu vergleichende Objekt |

**Returns:**
boolean - true, wenn zwei Objekte gleich sind
### fromGeometry(Geometry geometry) {#fromGeometry-com.aspose.threed.Geometry-}
```
public static BoundingBox fromGeometry(Geometry geometry)
```


Erstelle eine BoundingBox aus gegebener Geometrie

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| geometry | [Geometry](../../com.aspose.threed/geometry) | Die Geometrie zur Berechnung der Begrenzungsbox |

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The bounding box of given geometry **Example:** The following code shows how to construct a bounding box from a geometry instance.

```
var sphere = (new Sphere()).toMesh();
  var boundingBox = BoundingBox.fromGeometry(sphere);
  System.out.println("Bounding box = " + boundingBox);
```
### getCenter() {#getCenter--}
```
public Vector3 getCenter()
```


Der Mittelpunkt der BoundingBox.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The center of the bounding box.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getExtent() {#getExtent--}
```
public BoundingBoxExtent getExtent()
```


Gibt den Umfang der Begrenzungsbox zurück.

**Returns:**
[BoundingBoxExtent](../../com.aspose.threed/boundingboxextent) - the extent of the bounding box.
### getInfinite() {#getInfinite--}
```
public static BoundingBox getInfinite()
```


Die unendliche Begrenzungsbox

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The infinite bounding box
### getMaximum() {#getMaximum--}
```
public Vector3 getMaximum()
```


Der maximale Eckpunkt der Begrenzungsbox

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The maximum corner of the bounding box
### getMinimum() {#getMinimum--}
```
public Vector3 getMinimum()
```


Der minimale Eckpunkt der Begrenzungsbox

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The minimum corner of the bounding box
### getNull() {#getNull--}
```
public static BoundingBox getNull()
```


Die Null-Begrenzungsbox

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The null bounding box
### getSize() {#getSize--}
```
public Vector3 getSize()
```


Die Größe der BoundingBox

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The size of the bounding box
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode für diese Instanz zurück

**Returns:**
int - Der Hashcode der Begrenzungsbox
### merge(BoundingBox bb) {#merge-com.aspose.threed.BoundingBox-}
```
public void merge(BoundingBox bb)
```


Fügt die neue Box in die aktuelle Begrenzungsbox ein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bb | [BoundingBox](../../com.aspose.threed/boundingbox) | Die zu zusammenzufügende Begrenzungsbox |

### merge(Vector3 pt) {#merge-com.aspose.threed.Vector3-}
```
public void merge(Vector3 pt)
```


Füge die aktuelle BoundingBox mit dem angegebenen Punkt zusammen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | pt | [Vector3](../../com.aspose.threed/vector3) | Der Punkt, der in die Begrenzungsbox eingefügt werden soll **Example:** Der folgende Code zeigt, wie man einen Punkt in die Begrenzungsbox einfügt. |

```
var boundingBox = BoundingBox.getNull();
  boundingBox.Merge(new Vector3(1, 10, -1));
  System.out.println("Bounding box = " + boundingBox);
``` |

### merge(Vector4 pt) {#merge-com.aspose.threed.Vector4-}
```
public void merge(Vector4 pt)
```


Füge die aktuelle BoundingBox mit dem angegebenen Punkt zusammen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | pt | [Vector4](../../com.aspose.threed/vector4) | Der Punkt, der in die Begrenzungsbox eingefügt werden soll **Example:** Der folgende Code zeigt, wie man einen Punkt in die Begrenzungsbox einfügt. |

```
var boundingBox = BoundingBox.getNull();
  boundingBox.Merge(new Vector4(1, 10, -1));
  System.out.println("Bounding box = " + boundingBox);
``` |

### merge(double x, double y, double z) {#merge-double-double-double-}
```
public void merge(double x, double y, double z)
```


Füge die aktuelle BoundingBox mit dem angegebenen Punkt zusammen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Der Punkt, der in die Begrenzungsbox eingefügt werden soll |
| y | double | Der Punkt, der in die Begrenzungsbox eingefügt werden soll |
|  | z | double | Der Punkt, der in die Begrenzungsbox eingefügt werden soll **Example:** Der folgende Code zeigt, wie man einen Punkt in die Begrenzungsbox einfügt. |

```
var boundingBox = BoundingBox.getNull();
  boundingBox.Merge(1, 10, -1);
  System.out.println("Bounding box = " + boundingBox);
``` |

### mul(BoundingBox bbox, Matrix4 mat) {#mul-com.aspose.threed.BoundingBox-com.aspose.threed.Matrix4-}
```
public static BoundingBox mul(BoundingBox bbox, Matrix4 mat)
```


Operatorüberladung für Multiplikation, die minimale und maximale Ecke der neuen BoundingBox werden durch die Matrix transformiert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bbox | [BoundingBox](../../com.aspose.threed/boundingbox) | Die Eingabe‑Begrenzungsbox. |
| mat | [Matrix4](../../com.aspose.threed/matrix4) | Die Matrix, die verwendet wird, um die Ecken der Begrenzungsbox zu transformieren |

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox) - The product of bounding box and transform matrix.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### overlapsWith(BoundingBox box) {#overlapsWith-com.aspose.threed.BoundingBox-}
```
public boolean overlapsWith(BoundingBox box)
```


Prüfe, ob die aktuelle BoundingBox mit der angegebenen BoundingBox überlappt.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| box | [BoundingBox](../../com.aspose.threed/boundingbox) | Die andere zu testende Begrenzungsbox |

**Returns:**
boolean - True, wenn die aktuelle Begrenzungsbox mit der angegebenen überlappt **Example:** Der folgende Code zeigt, wie man prüft, ob zwei Begrenzungsboxen miteinander überlappen.

```
var boundingBox = new BoundingBox(0, 0, 0, 10, 10, 10);
  var bbox2 = new BoundingBox(1, 1, 1, 11, 11, 11);
  System.out.println("Bounding box overlaps = " + boundingBox.overlapsWith(bbox2));
```
### scale() {#scale--}
```
public double scale()
```


Berechnet den absoluten größten Koordinatenwert eines beliebigen enthaltenen Punktes.

**Returns:**
double - der berechnete absolute größte Koordinatenwert eines enthaltenen Punktes.
### toString() {#toString--}
```
public String toString()
```


Gibt die Zeichenkettenrepräsentation der Begrenzungsbox zurück.

**Returns:**
java.lang.String - Die String‑Darstellung der Begrenzungsbox.
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

