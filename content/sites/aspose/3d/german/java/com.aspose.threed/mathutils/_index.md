---
title: MathUtils
second_title: Aspose.3D für Java API-Referenz
description: Eine Sammlung nützlicher mathematischer Hilfsprogramme.
type: docs
weight: 99
url: /de/java/com.aspose.threed/mathutils/
---

**Inheritance:**
java.lang.Object
```
public class MathUtils
```

Eine Sammlung nützlicher mathematischer Hilfsprogramme.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [calcNormal(Vector3[] points)](#calcNormal-com.aspose.threed.Vector3---) |  |
| [clamp(double val, double min, double max)](#clamp-double-double-double-) | Begrenze den Wert auf den Bereich [min, max] |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findIntersection(Vector2 p0, Vector2 d0, Vector2 p1, Vector2 d1, Vector2[] results)](#findIntersection-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2---) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [pointInsideTriangle(Vector2 p, Vector2 p0, Vector2 p1, Vector2 p2)](#pointInsideTriangle-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Prüfe, ob Punkt p innerhalb des Dreiecks (p0, p1, p2) liegt |
| [rayIntersect(Vector2 origin, Vector2 dir, Vector2 a, Vector2 b)](#rayIntersect-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-) | Prüfe, ob der Strahl (Ursprung, Richtung) mit dem Liniensegment (Start, Ende) schneidet |
| [toDegree(Vector3 radian)](#toDegree-com.aspose.threed.Vector3-) | Konvertiere ein [Vector3](../../com.aspose.threed/vector3) von Radiant zu Grad. |
| [toDegree(double radian)](#toDegree-double-) | Konvertiere eine Zahl von Radiant zu Grad |
| [toDegree(double x, double y, double z)](#toDegree-double-double-double-) | Konvertiere eine Zahl von Radiant zu Grad |
| [toDegree(float radian)](#toDegree-float-) | Konvertiere eine Zahl von Radiant zu Grad |
| [toRadian(Vector3 degree)](#toRadian-com.aspose.threed.Vector3-) | Konvertiere ein [Vector3](../../com.aspose.threed/vector3) von Grad zu Radiant |
| [toRadian(double degree)](#toRadian-double-) | Konvertiere eine Zahl von Grad in Bogenmaß |
| [toRadian(double x, double y, double z)](#toRadian-double-double-double-) | Konvertiere einen Vektor von Grad in Bogenmaß |
| [toRadian(float degree)](#toRadian-float-) | Konvertiere eine Zahl von Grad in Bogenmaß |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### calcNormal(Vector3[] points) {#calcNormal-com.aspose.threed.Vector3---}
```
public static Vector3 calcNormal(Vector3[] points)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| points | [Vector3\[\]](../../com.aspose.threed/vector3) |  |

**Returns:**
[Vector3](../../com.aspose.threed/vector3)
### clamp(double val, double min, double max) {#clamp-double-double-double-}
```
public static double clamp(double val, double min, double max)
```


Begrenze den Wert auf den Bereich [min, max]

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| val | double | Wert zum Begrenzen. |
| min | double | Minimaler Wert. |
| max | double | Maximaler Wert. |

**Returns:**
double - Der Wert zwischen [min, max] **Example:**

```
double val = 195;
     //Clamp value to [0, 100]
     double clampedValue = MathUtils.clamp(val, 0, 100);
     //This will output 100
     System.out.printf("Value = %d", val);
```
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
### findIntersection(Vector2 p0, Vector2 d0, Vector2 p1, Vector2 d1, Vector2[] results) {#findIntersection-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2---}
```
public static int findIntersection(Vector2 p0, Vector2 d0, Vector2 p1, Vector2 d1, Vector2[] results)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| p0 | [Vector2](../../com.aspose.threed/vector2) |  |
| d0 | [Vector2](../../com.aspose.threed/vector2) |  |
| p1 | [Vector2](../../com.aspose.threed/vector2) |  |
| d1 | [Vector2](../../com.aspose.threed/vector2) |  |
| results | [Vector2\[\]](../../com.aspose.threed/vector2) |  |

**Returns:**
int
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




### pointInsideTriangle(Vector2 p, Vector2 p0, Vector2 p1, Vector2 p2) {#pointInsideTriangle-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static boolean pointInsideTriangle(Vector2 p, Vector2 p0, Vector2 p1, Vector2 p2)
```


Prüfe, ob Punkt p innerhalb des Dreiecks (p0, p1, p2) liegt

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| p | [Vector2](../../com.aspose.threed/vector2) |  |
| p0 | [Vector2](../../com.aspose.threed/vector2) |  |
| p1 | [Vector2](../../com.aspose.threed/vector2) |  |
| p2 | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
boolean
### rayIntersect(Vector2 origin, Vector2 dir, Vector2 a, Vector2 b) {#rayIntersect-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-com.aspose.threed.Vector2-}
```
public static Vector2 rayIntersect(Vector2 origin, Vector2 dir, Vector2 a, Vector2 b)
```


Prüfe, ob der Strahl (Ursprung, Richtung) mit dem Liniensegment (Start, Ende) schneidet

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| origin | [Vector2](../../com.aspose.threed/vector2) |  |
| dir | [Vector2](../../com.aspose.threed/vector2) |  |
| a | [Vector2](../../com.aspose.threed/vector2) |  |
| b | [Vector2](../../com.aspose.threed/vector2) |  |

**Returns:**
[Vector2](../../com.aspose.threed/vector2)
### toDegree(Vector3 radian) {#toDegree-com.aspose.threed.Vector3-}
```
public static Vector3 toDegree(Vector3 radian)
```


Konvertiere ein [Vector3](../../com.aspose.threed/vector3) von Radiant zu Grad.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| radian | [Vector3](../../com.aspose.threed/vector3) | Der Bogenmaßwert. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The degree value. **Example:**

```
Vector3 degrees = MathUtils.toDegree(new Vector3(0.34, 0.9, 0.2));
     System.out.printf("Degrees = %s", degrees);
```
### toDegree(double radian) {#toDegree-double-}
```
public static double toDegree(double radian)
```


Konvertiere eine Zahl von Radiant zu Grad

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bogenmaß | double | Der Bogenmaßwert. |

**Returns:**
double - Der Gradwert. **Example:**

```
var deg = MathUtils.toDegree(0.3);
     System.out.printf("Degrees = %s", deg);
```
### toDegree(double x, double y, double z) {#toDegree-double-double-double-}
```
public static Vector3 toDegree(double x, double y, double z)
```


Konvertiere eine Zahl von Radiant zu Grad

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x‑Komponente im Bogenmaßwert. |
| y | double | Die y‑Komponente im Bogenmaßwert. |
| z | double | Die z‑Komponente im Bogenmaßwert. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The degree value.
### toDegree(float radian) {#toDegree-float-}
```
public static float toDegree(float radian)
```


Konvertiere eine Zahl von Radiant zu Grad

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bogenmaß | float | Der Bogenmaßwert. |

**Returns:**
float - Der Gradwert. **Example:**

```
var deg = MathUtils.toDegree(0.3f);
     System.out.printf("Degrees = %s", deg);
```
### toRadian(Vector3 degree) {#toRadian-com.aspose.threed.Vector3-}
```
public static Vector3 toRadian(Vector3 degree)
```


Konvertiere ein [Vector3](../../com.aspose.threed/vector3) von Grad zu Radiant

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| degree | [Vector3](../../com.aspose.threed/vector3) | Der Gradwert. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The radian value. **Example:**

```
Vector3 radians = MathUtils.toRadian(new Vector3(90, 134, 0));
     System.out.printf("Radians = %s", radians);
```
### toRadian(double degree) {#toRadian-double-}
```
public static double toRadian(double degree)
```


Konvertiere eine Zahl von Grad in Bogenmaß

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Grad | double | Der Gradwert. |

**Returns:**
double - Der Bogenmaßwert. **Example:**

```
var rad = MathUtils.toRadian(0.3);
     System.out.printf("Radian = %d", rad);
```
### toRadian(double x, double y, double z) {#toRadian-double-double-double-}
```
public static Vector3 toRadian(double x, double y, double z)
```


Konvertiere einen Vektor von Grad in Bogenmaß

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | double | Die x‑Komponente im Gradwert. |
| y | double | Die y‑Komponente im Gradwert. |
| z | double | Die z‑Komponente im Gradwert. |

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - The radian value.
### toRadian(float degree) {#toRadian-float-}
```
public static float toRadian(float degree)
```


Konvertiere eine Zahl von Grad in Bogenmaß

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Grad | float | Der Gradwert. |

**Returns:**
float - Der Bogenmaßwert. **Example:**

```
var rad = MathUtils.toRadian(0.3);
     System.out.printf("Radian = %d", rad);
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

