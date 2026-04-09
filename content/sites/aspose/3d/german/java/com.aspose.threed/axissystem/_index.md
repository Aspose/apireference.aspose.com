---
title: AxisSystem
second_title: Aspose.3D für Java API-Referenz
description: Das Achsensystem ist eine Kombination aus Aufwärtsvektor und Frontvektor des Koordinatensystems.
type: docs
weight: 18
url: /de/java/com.aspose.threed/axissystem/
---

**Inheritance:**
java.lang.Object
```
public class AxisSystem
```

Das Achsensystem ist eine Kombination aus Koordinatensystem, Aufwärtsvektor und Frontvektor.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [AxisSystem(CoordinateSystem coordinateSystem, Axis up)](#AxisSystem-com.aspose.threed.CoordinateSystem-com.aspose.threed.Axis-) | Konstruiert ein neues Achsensystem |
| [AxisSystem(Axis up, Axis front)](#AxisSystem-com.aspose.threed.Axis-com.aspose.threed.Axis-) | Konstruiert ein neues Achsensystem |
| [AxisSystem(CoordinateSystem coordinateSystem, Axis up, Axis front)](#AxisSystem-com.aspose.threed.CoordinateSystem-com.aspose.threed.Axis-com.aspose.threed.Axis-) | Konstruiert ein neues Achsensystem |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fromAssetInfo(AssetInfo assetInfo)](#fromAssetInfo-com.aspose.threed.AssetInfo-) | Erstelle [AxisSystem](../../com.aspose.threed/axissystem) aus [AssetInfo](../../com.aspose.threed/assetinfo) |
| [getClass()](#getClass--) |  |
| [getCoordinateSystem()](#getCoordinateSystem--) | Ruft das Koordinatensystem dieses Achsensystems ab. |
| [getFront()](#getFront--) | Ruft den Frontvektor dieses Achsensystems ab. |
| [getUp()](#getUp--) | Ruft den Aufwärtsvektor dieses Achsensystems ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [transformTo(AxisSystem targetSystem)](#transformTo-com.aspose.threed.AxisSystem-) | Erstellt eine Matrix, die zur Umwandlung vom aktuellen Achsensystem in das Zielachsensystem verwendet wird. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisSystem(CoordinateSystem coordinateSystem, Axis up) {#AxisSystem-com.aspose.threed.CoordinateSystem-com.aspose.threed.Axis-}
```
public AxisSystem(CoordinateSystem coordinateSystem, Axis up)
```


Konstruiert ein neues Achsensystem

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| coordinateSystem | [CoordinateSystem](../../com.aspose.threed/coordinatesystem) | Das in diesem Achsensystem verwendete Koordinatensystem |
| up | [Axis](../../com.aspose.threed/axis) | Der Aufwärtsvektor des Achsensystems |

### AxisSystem(Axis up, Axis front) {#AxisSystem-com.aspose.threed.Axis-com.aspose.threed.Axis-}
```
public AxisSystem(Axis up, Axis front)
```


Konstruiert ein neues Achsensystem

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| up | [Axis](../../com.aspose.threed/axis) | Der Aufwärtsvektor des Achsensystems |
| front | [Axis](../../com.aspose.threed/axis) | Der Frontvektor des Achsensystems |

### AxisSystem(CoordinateSystem coordinateSystem, Axis up, Axis front) {#AxisSystem-com.aspose.threed.CoordinateSystem-com.aspose.threed.Axis-com.aspose.threed.Axis-}
```
public AxisSystem(CoordinateSystem coordinateSystem, Axis up, Axis front)
```


Konstruiert ein neues Achsensystem

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| coordinateSystem | [CoordinateSystem](../../com.aspose.threed/coordinatesystem) | Das in diesem Achsensystem verwendete Koordinatensystem |
| up | [Axis](../../com.aspose.threed/axis) | Der Aufwärtsvektor des Achsensystems |
| front | [Axis](../../com.aspose.threed/axis) | Der Frontvektor des Achsensystems |

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
### fromAssetInfo(AssetInfo assetInfo) {#fromAssetInfo-com.aspose.threed.AssetInfo-}
```
public static AxisSystem fromAssetInfo(AssetInfo assetInfo)
```


Erstelle [AxisSystem](../../com.aspose.threed/axissystem) aus [AssetInfo](../../com.aspose.threed/assetinfo)

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| assetInfo | [AssetInfo](../../com.aspose.threed/assetinfo) | Aus welchen Asset-Informationen das Koordinatensystem, der Aufwärtsvektor und der Frontvektor gelesen werden sollen. |

**Returns:**
[AxisSystem](../../com.aspose.threed/axissystem) - Axis system containg coordinate system, up, front from given asset info
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCoordinateSystem() {#getCoordinateSystem--}
```
public CoordinateSystem getCoordinateSystem()
```


Ruft das Koordinatensystem dieses Achsensystems ab.

**Returns:**
[CoordinateSystem](../../com.aspose.threed/coordinatesystem) - the coordinate system of this axis system.
### getFront() {#getFront--}
```
public Axis getFront()
```


Ruft den Frontvektor dieses Achsensystems ab.

**Returns:**
[Axis](../../com.aspose.threed/axis) - the front vector of this axis system
### getUp() {#getUp--}
```
public Axis getUp()
```


Ruft den Aufwärtsvektor dieses Achsensystems ab.

**Returns:**
[Axis](../../com.aspose.threed/axis) - the up vector of this axis system.
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
### transformTo(AxisSystem targetSystem) {#transformTo-com.aspose.threed.AxisSystem-}
```
public Matrix4 transformTo(AxisSystem targetSystem)
```


Erstellt eine Matrix, die zur Umwandlung vom aktuellen Achsensystem in das Zielachsensystem verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetSystem | [AxisSystem](../../com.aspose.threed/axissystem) | Zielachsensystem |

**Returns:**
[Matrix4](../../com.aspose.threed/matrix4) - A new transformation matrix to do the axis conversion
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

