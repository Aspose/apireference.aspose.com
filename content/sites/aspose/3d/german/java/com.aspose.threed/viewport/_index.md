---
title: Viewport
second_title: Aspose.3D für Java API-Referenz
description: Ein  enthält mindestens ein Viewport zum Rendern der Szene.
type: docs
weight: 229
url: /de/java/com.aspose.threed/viewport/
---

**Inheritance:**
java.lang.Object
```
public class Viewport
```

Ein [IRenderTarget](../../com.aspose.threed/irendertarget) enthält mindestens ein Viewport zum Rendern der Szene.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getArea()](#getArea--) | Ermittelt die Fläche des Viewports im Renderziel. |
| [getBackgroundColor()](#getBackgroundColor--) | Ermittelt die Hintergrundfarbe des Viewports. |
| [getClass()](#getClass--) |  |
| [getDepthClear()](#getDepthClear--) | Ermittelt den Tiefenwert, der verwendet wird, wenn das Viewport mit gesetztem Tiefenpuffer-Bit gelöscht wird. |
| [getEnabled()](#getEnabled--) | Aktivieren oder deaktivieren Sie dieses Viewport. |
| [getFrustum()](#getFrustum--) | Ermittelt die Kamera dieses [Viewport](../../com.aspose.threed/viewport) |
| [getRenderTarget()](#getRenderTarget--) | Ermittelt das Renderziel, das dieses Viewport erstellt hat. |
| [getZOrder()](#getZOrder--) | Ermittelt die Z‑Reihenfolge des Viewports. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setArea(RelativeRectangle value)](#setArea-com.aspose.threed.RelativeRectangle-) | Legt den Bereich des Viewports im Renderziel fest. |
| [setBackgroundColor(Vector3 value)](#setBackgroundColor-com.aspose.threed.Vector3-) | Legt die Hintergrundfarbe des Viewports fest. |
| [setDepthClear(float value)](#setDepthClear-float-) | Legt den Tiefenwert fest, der beim Löschen des Viewports mit gesetztem Tiefenpuffer‑Bit verwendet wird. |
| [setEnabled(boolean value)](#setEnabled-boolean-) | Aktivieren oder deaktivieren Sie dieses Viewport. |
| [setFrustum(Frustum value)](#setFrustum-com.aspose.threed.Frustum-) | Legt die Kamera dieses [Viewport](../../com.aspose.threed/viewport) fest. |
| [setZOrder(int value)](#setZOrder-int-) | Legt die Z‑Reihenfolge des Viewports fest. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### clone() {#clone--}
```
public Viewport clone()
```




**Returns:**
[Viewport](../../com.aspose.threed/viewport)
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
### getArea() {#getArea--}
```
public RelativeRectangle getArea()
```


Ermittelt die Fläche des Viewports im Renderziel.

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle) - the area of the viewport in render target.
### getBackgroundColor() {#getBackgroundColor--}
```
public Vector3 getBackgroundColor()
```


Ermittelt die Hintergrundfarbe des Viewports.

**Returns:**
[Vector3](../../com.aspose.threed/vector3) - the background color of the viewport.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDepthClear() {#getDepthClear--}
```
public float getDepthClear()
```


Ermittelt den Tiefenwert, der verwendet wird, wenn das Viewport mit gesetztem Tiefenpuffer-Bit gelöscht wird.

**Returns:**
float - der Tiefenwert, der beim Löschen des Viewports mit gesetztem Tiefenpuffer‑Bit verwendet wird.
### getEnabled() {#getEnabled--}
```
public boolean getEnabled()
```


Aktivieren oder deaktivieren Sie dieses Viewport.

**Returns:**
boolean - Aktivieren oder Deaktivieren dieses Viewports.
### getFrustum() {#getFrustum--}
```
public Frustum getFrustum()
```


Ermittelt die Kamera dieses [Viewport](../../com.aspose.threed/viewport)

**Returns:**
[Frustum](../../com.aspose.threed/frustum) - the camera of this [Viewport](../../com.aspose.threed/viewport)
### getRenderTarget() {#getRenderTarget--}
```
public IRenderTarget getRenderTarget()
```


Ermittelt das Renderziel, das dieses Viewport erstellt hat.

**Returns:**
[IRenderTarget](../../com.aspose.threed/irendertarget) - the render target that created this viewport.
### getZOrder() {#getZOrder--}
```
public int getZOrder()
```


Ermittelt die Z‑Reihenfolge des Viewports.

**Returns:**
int - die Z‑Reihenfolge des Viewports.
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




### setArea(RelativeRectangle value) {#setArea-com.aspose.threed.RelativeRectangle-}
```
public void setArea(RelativeRectangle value)
```


Legt den Bereich des Viewports im Renderziel fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | Neuer Wert |

### setBackgroundColor(Vector3 value) {#setBackgroundColor-com.aspose.threed.Vector3-}
```
public void setBackgroundColor(Vector3 value)
```


Legt die Hintergrundfarbe des Viewports fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | Neuer Wert |

### setDepthClear(float value) {#setDepthClear-float-}
```
public void setDepthClear(float value)
```


Legt den Tiefenwert fest, der beim Löschen des Viewports mit gesetztem Tiefenpuffer‑Bit verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setEnabled(boolean value) {#setEnabled-boolean-}
```
public void setEnabled(boolean value)
```


Aktivieren oder deaktivieren Sie dieses Viewport.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setFrustum(Frustum value) {#setFrustum-com.aspose.threed.Frustum-}
```
public void setFrustum(Frustum value)
```


Legt die Kamera dieses [Viewport](../../com.aspose.threed/viewport) fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Frustum](../../com.aspose.threed/frustum) | Neuer Wert |

### setZOrder(int value) {#setZOrder-int-}
```
public void setZOrder(int value)
```


Legt die Z‑Reihenfolge des Viewports fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

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

