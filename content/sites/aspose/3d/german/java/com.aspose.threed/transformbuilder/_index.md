---
title: TransformBuilder
second_title: Aspose.3D für Java API-Referenz
description: Der  wird verwendet, um Transformationsmatrizen durch eine Kette von Transformationen zu erstellen.
type: docs
weight: 191
url: /de/java/com.aspose.threed/transformbuilder/
---

**Inheritance:**
java.lang.Object
```
public class TransformBuilder
```

Der [TransformBuilder](../../com.aspose.threed/transformbuilder) wird verwendet, um Transformationsmatrizen durch eine Kette von Transformationen zu erstellen. **Beispiel:** Der folgende Code zeigt, wie man eine Matrix durch eine Reihe von Operationen erstellt.

```
TransformBuilder tb = new TransformBuilder();
     tb.translate(10, 20, 0);
     tb.scale(10, 10, 10);
     tb.rotateEulerDegree(90, 0, 0);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [TransformBuilder(Matrix4 initial, ComposeOrder order)](#TransformBuilder-com.aspose.threed.Matrix4-com.aspose.threed.ComposeOrder-) | Erstelle einen [TransformBuilder](../../com.aspose.threed/transformbuilder) mit einer Anfangstransformationsmatrix und einer angegebenen Zusammenstellungsreihenfolge. |
| [TransformBuilder(ComposeOrder order)](#TransformBuilder-com.aspose.threed.ComposeOrder-) | Erstelle einen [TransformBuilder](../../com.aspose.threed/transformbuilder) mit einer anfänglichen Identitäts-Transformationsmatrix und einer angegebenen Zusammenstellungsreihenfolge. |
| [TransformBuilder()](#TransformBuilder--) | Erstelle einen [TransformBuilder](../../com.aspose.threed/transformbuilder) mit einer anfänglichen Identitäts-Transformationsmatrix und einer angegebenen Zusammenstellungsreihenfolge. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [append(Matrix4 m)](#append-com.aspose.threed.Matrix4-) | Füge die neue Transformationsmatrix zur Transformationskette hinzu. |
| [compose(Matrix4 m)](#compose-com.aspose.threed.Matrix4-) | Füge das Argument zur internen Matrix hinzu oder stelle es voran. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getComposeOrder()](#getComposeOrder--) | Liefert die Zusammenstellungsreihenfolge der Kette. |
| [getMatrix()](#getMatrix--) | Liefert den aktuellen Matrixwert |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [prepend(Matrix4 m)](#prepend-com.aspose.threed.Matrix4-) | Stelle die neue Transformationsmatrix an den Anfang der Transformationskette. |
| [rearrange(Axis newX, Axis newY, Axis newZ)](#rearrange-com.aspose.threed.Axis-com.aspose.threed.Axis-com.aspose.threed.Axis-) | Ordne das Layout der Achse neu. |
| [reset()](#reset--) | Setze die Transformation auf die Identitätsmatrix zurück |
| [rotate(Quaternion q)](#rotate-com.aspose.threed.Quaternion-) | Verkette eine Rotation mittels Quaternion **Beispiel:** |
| [rotateDegree(Vector3 rot, RotationOrder order)](#rotateDegree-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-) | Rotation mit angegebener Reihenfolge anhängen |
| [rotateDegree(double angle, Vector3 axis)](#rotateDegree-double-com.aspose.threed.Vector3-) | Verkette eine Rotations-Transformation in Grad |
| [rotateEulerDegree(double degX, double degY, double degZ)](#rotateEulerDegree-double-double-double-) | Verkette eine Rotation mittels Euler-Winkeln in Grad **Beispiel:** |
| [rotateEulerRadian(Vector3 r)](#rotateEulerRadian-com.aspose.threed.Vector3-) | Verkette eine Rotation mittels Euler-Winkeln in Bogenmaß **Beispiel:** |
| [rotateEulerRadian(double x, double y, double z)](#rotateEulerRadian-double-double-double-) | Verkette eine Rotation mittels Euler-Winkeln in Bogenmaß **Beispiel:** |
| [rotateRadian(Vector3 rot, RotationOrder order)](#rotateRadian-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-) | Rotation mit angegebener Reihenfolge anhängen |
| [rotateRadian(double angle, Vector3 axis)](#rotateRadian-double-com.aspose.threed.Vector3-) | Verkette eine Rotations-Transformation in Bogenmaß |
| [scale(Vector3 s)](#scale-com.aspose.threed.Vector3-) | Verkette eine Skalierungs-Transformation **Beispiel:** |
| [scale(double s)](#scale-double-) | Verkette eine Skalierungs-Transformationsmatrix, bei der eine Komponente um s skaliert wird **Beispiel:** |
| [scale(double x, double y, double z)](#scale-double-double-double-) | Verkette eine Skalierungs-Transformationsmatrix **Beispiel:** |
| [setComposeOrder(ComposeOrder value)](#setComposeOrder-com.aspose.threed.ComposeOrder-) | Legt die Verkettungs-Zusammensetzungsreihenfolge fest. |
| [setMatrix(Matrix4 value)](#setMatrix-com.aspose.threed.Matrix4-) | Setzt den aktuellen Matrixwert |
| [toString()](#toString--) |  |
| [translate(Vector3 v)](#translate-com.aspose.threed.Vector3-) | Verkette eine Translations-Transformation **Beispiel:** |
| [translate(double tx, double ty, double tz)](#translate-double-double-double-) | Verkette eine Translations-Transformation **Beispiel:** |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformBuilder(Matrix4 initial, ComposeOrder order) {#TransformBuilder-com.aspose.threed.Matrix4-com.aspose.threed.ComposeOrder-}
```
public TransformBuilder(Matrix4 initial, ComposeOrder order)
```


Erstelle einen [TransformBuilder](../../com.aspose.threed/transformbuilder) mit einer Anfangstransformationsmatrix und einer angegebenen Zusammenstellungsreihenfolge.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| initial | [Matrix4](../../com.aspose.threed/matrix4) |  |
| order | [ComposeOrder](../../com.aspose.threed/composeorder) |  |

### TransformBuilder(ComposeOrder order) {#TransformBuilder-com.aspose.threed.ComposeOrder-}
```
public TransformBuilder(ComposeOrder order)
```


Erstelle einen [TransformBuilder](../../com.aspose.threed/transformbuilder) mit einer anfänglichen Identitäts-Transformationsmatrix und einer angegebenen Zusammenstellungsreihenfolge.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| order | [ComposeOrder](../../com.aspose.threed/composeorder) |  |

### TransformBuilder() {#TransformBuilder--}
```
public TransformBuilder()
```


Erstelle einen [TransformBuilder](../../com.aspose.threed/transformbuilder) mit einer anfänglichen Identitäts-Transformationsmatrix und einer angegebenen Zusammenstellungsreihenfolge.

### append(Matrix4 m) {#append-com.aspose.threed.Matrix4-}
```
public TransformBuilder append(Matrix4 m)
```


Füge die neue Transformationsmatrix zur Transformationskette hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m | [Matrix4](../../com.aspose.threed/matrix4) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### compose(Matrix4 m) {#compose-com.aspose.threed.Matrix4-}
```
public void compose(Matrix4 m)
```


Füge das Argument zur internen Matrix hinzu oder stelle es voran.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m | [Matrix4](../../com.aspose.threed/matrix4) |  |

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
### getComposeOrder() {#getComposeOrder--}
```
public ComposeOrder getComposeOrder()
```


Liefert die Zusammenstellungsreihenfolge der Kette.

**Returns:**
[ComposeOrder](../../com.aspose.threed/composeorder) - the chain compose order.
### getMatrix() {#getMatrix--}
```
public Matrix4 getMatrix()
```


Liefert den aktuellen Matrixwert

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - the current matrix value
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




### prepend(Matrix4 m) {#prepend-com.aspose.threed.Matrix4-}
```
public TransformBuilder prepend(Matrix4 m)
```


Stelle die neue Transformationsmatrix an den Anfang der Transformationskette.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| m | [Matrix4](../../com.aspose.threed/matrix4) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rearrange(Axis newX, Axis newY, Axis newZ) {#rearrange-com.aspose.threed.Axis-com.aspose.threed.Axis-com.aspose.threed.Axis-}
```
public TransformBuilder rearrange(Axis newX, Axis newY, Axis newZ)
```


Ordne das Layout der Achse neu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newX | [Axis](../../com.aspose.threed/axis) | Die neue x-Komponente Quelle |
| newY | [Axis](../../com.aspose.threed/axis) | Die neue y-Komponente Quelle |
| newZ | [Axis](../../com.aspose.threed/axis) | Die neue z-Komponente Quelle |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### reset() {#reset--}
```
public void reset()
```


Setze die Transformation auf die Identitätsmatrix zurück

### rotate(Quaternion q) {#rotate-com.aspose.threed.Quaternion-}
```
public TransformBuilder rotate(Quaternion q)
```


Verkette eine Rotation mittels Quaternion **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.rotate(Quaternion.fromEulerAngle(0, Math.PI, 0));
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| q | [Quaternion](../../com.aspose.threed/quaternion) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateDegree(Vector3 rot, RotationOrder order) {#rotateDegree-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-}
```
public void rotateDegree(Vector3 rot, RotationOrder order)
```


Rotation mit angegebener Reihenfolge anhängen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rot | [Vector3](../../com.aspose.threed/vector3) | Rotation in Grad |
| order | [RotationOrder](../../com.aspose.threed/rotationorder) |  |

### rotateDegree(double angle, Vector3 axis) {#rotateDegree-double-com.aspose.threed.Vector3-}
```
public TransformBuilder rotateDegree(double angle, Vector3 axis)
```


Verkette eine Rotations-Transformation in Grad

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | double | Der Winkel zum Rotieren in Grad |
|  | axis | [Vector3](../../com.aspose.threed/vector3) | Die Achse zum Rotieren **Beispiel:** |

```
TransformBuilder tb = new TransformBuilder();
     tb.rotateDegree(90, Vector3.getUnitY());
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
``` |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateEulerDegree(double degX, double degY, double degZ) {#rotateEulerDegree-double-double-double-}
```
public TransformBuilder rotateEulerDegree(double degX, double degY, double degZ)
```


Verkette eine Rotation mittels Euler-Winkeln in Grad **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.rotateEulerDegree(0, 90, 0);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| degX | double |  |
| degY | double |  |
| degZ | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateEulerRadian(Vector3 r) {#rotateEulerRadian-com.aspose.threed.Vector3-}
```
public TransformBuilder rotateEulerRadian(Vector3 r)
```


Verkette eine Rotation mittels Euler-Winkeln in Bogenmaß **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.rotateEulerRadian(new Vector3(0, Math.PI, 0));
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| r | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateEulerRadian(double x, double y, double z) {#rotateEulerRadian-double-double-double-}
```
public TransformBuilder rotateEulerRadian(double x, double y, double z)
```


Verkette eine Rotation mittels Euler-Winkeln in Bogenmaß **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.rotateEulerRadian(0, Math.PI, 0);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double |  |
| y | double |  |
| z | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### rotateRadian(Vector3 rot, RotationOrder order) {#rotateRadian-com.aspose.threed.Vector3-com.aspose.threed.RotationOrder-}
```
public void rotateRadian(Vector3 rot, RotationOrder order)
```


Rotation mit angegebener Reihenfolge anhängen

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
|  | rot | [Vector3](../../com.aspose.threed/vector3) | Rotation in Bogenmaß **Beispiel:** |

```
TransformBuilder tb = new TransformBuilder();
     tb.rotateRadian(new Vector3(0.3, 0.4, 0.1), RotationOrder.YZX);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
``` |
| order | [RotationOrder](../../com.aspose.threed/rotationorder) |  |

### rotateRadian(double angle, Vector3 axis) {#rotateRadian-double-com.aspose.threed.Vector3-}
```
public TransformBuilder rotateRadian(double angle, Vector3 axis)
```


Verkette eine Rotations-Transformation in Bogenmaß

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | double | Der Winkel zum Rotieren in Bogenmaß |
|  | axis | [Vector3](../../com.aspose.threed/vector3) | Die Achse zum Rotieren **Beispiel:** |

```
TransformBuilder tb = new TransformBuilder();
     tb.rotateRadian(Math.PI, Vector3.getUnitY());
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
``` |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### scale(Vector3 s) {#scale-com.aspose.threed.Vector3-}
```
public TransformBuilder scale(Vector3 s)
```


Verkette eine Skalierungs-Transformation **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.scale(new Vector3(10, 10, 10));
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### scale(double s) {#scale-double-}
```
public TransformBuilder scale(double s)
```


Verkette eine Skalierungs-Transformationsmatrix, bei der eine Komponente um s skaliert wird **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.scale(10);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### scale(double x, double y, double z) {#scale-double-double-double-}
```
public TransformBuilder scale(double x, double y, double z)
```


Verkette eine Skalierungs-Transformationsmatrix **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.scale(10, 10, 10);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double |  |
| y | double |  |
| z | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### setComposeOrder(ComposeOrder value) {#setComposeOrder-com.aspose.threed.ComposeOrder-}
```
public void setComposeOrder(ComposeOrder value)
```


Legt die Verkettungs-Zusammensetzungsreihenfolge fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ComposeOrder](../../com.aspose.threed/composeorder) | Neuer Wert |

### setMatrix(Matrix4 value) {#setMatrix-com.aspose.threed.Matrix4-}
```
public void setMatrix(Matrix4 value)
```


Setzt den aktuellen Matrixwert

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Matrix4](../../com.aspose.threed/matrix4) | Neuer Wert |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### translate(Vector3 v) {#translate-com.aspose.threed.Vector3-}
```
public TransformBuilder translate(Vector3 v)
```


Verkette eine Translations-Transformation **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.translate(new Vector3(0, 10, 0));
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| v | [Vector3](../../com.aspose.threed/vector3) |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
### translate(double tx, double ty, double tz) {#translate-double-double-double-}
```
public TransformBuilder translate(double tx, double ty, double tz)
```


Verkette eine Translations-Transformation **Beispiel:**

```
TransformBuilder tb = new TransformBuilder();
     tb.translate(0, 10, 0);
     System.out.printf("Transform Matrix: %s", tb.getMatrix());
```

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tx | double |  |
| ty | double |  |
| tz | double |  |

**Returns:**
[TransformBuilder](../../com.aspose.threed/transformbuilder)
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

