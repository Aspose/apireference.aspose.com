---
title: RendererVariableManager
second_title: Aspose.3D für Java API-Referenz
description: Diese Klasse verwaltet Variablen, die beim Rendering verwendet werden.
type: docs
weight: 154
url: /de/java/com.aspose.threed/renderervariablemanager/
---

**Inheritance:**
java.lang.Object
```
public abstract class RendererVariableManager
```

Diese Klasse verwaltet Variablen, die beim Rendering verwendet werden.
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCameraPosition()](#getCameraPosition--) | Position der Kamera im Weltkoordinatensystem |
| [getClass()](#getClass--) |  |
| [getDepthBias()](#getDepthBias--) | Tiefenbias für Shadow Mapping, Standardwert ist 0.001 |
| [getMatrixLightSpace()](#getMatrixLightSpace--) | Matrix für die Lichtraum-Transformation |
| [getMatrixProjection()](#getMatrixProjection--) | Matrix für die Projektions-Transformation |
| [getMatrixView()](#getMatrixView--) | Matrix für die View-Transformation |
| [getMatrixViewProjection()](#getMatrixViewProjection--) | Matrix für View- und Projektions-Transformation. |
| [getMatrixWorld()](#getMatrixWorld--) | Matrix für die World-Transformation |
| [getMatrixWorldNormal()](#getMatrixWorldNormal--) | Matrix zum Konvertieren von Normalen vom Objekt- in den World‑Raum. |
| [getMatrixWorldViewProjection()](#getMatrixWorldViewProjection--) | Matrix für Weltansicht- und Projektionsumwandlung |
| [getShadowCaster()](#getShadowCaster--) | Position des Schattenwerfers im Weltkoordinatensystem |
| [getShadowmap()](#getShadowmap--) | Die Tiefentextur, die für die Schattenabbildung verwendet wird |
| [getViewportSize()](#getViewportSize--) | Größe des Viewports, gemessen in Pixel |
| [getWorldAmbient()](#getWorldAmbient--) | Umgebungsfarbe, definiert im Viewport. |
| [getWorldTime()](#getWorldTime--) | Zeit in Sekunden |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCameraPosition(FVector3 value)](#setCameraPosition-com.aspose.threed.FVector3-) | Position der Kamera im Weltkoordinatensystem |
| [setDepthBias(float value)](#setDepthBias-float-) | Tiefenbias für Shadow Mapping, Standardwert ist 0.001 |
| [setMatrixLightSpace(FMatrix4 value)](#setMatrixLightSpace-com.aspose.threed.FMatrix4-) | Matrix für die Lichtraum-Transformation |
| [setMatrixProjection(FMatrix4 value)](#setMatrixProjection-com.aspose.threed.FMatrix4-) | Matrix für die Projektions-Transformation |
| [setMatrixView(FMatrix4 value)](#setMatrixView-com.aspose.threed.FMatrix4-) | Matrix für die View-Transformation |
| [setShadowCaster(FVector3 value)](#setShadowCaster-com.aspose.threed.FVector3-) | Position des Schattenwerfers im Weltkoordinatensystem |
| [setShadowmap(ITextureUnit value)](#setShadowmap-com.aspose.threed.ITextureUnit-) | Die Tiefentextur, die für die Schattenabbildung verwendet wird |
| [setViewportSize(FVector2 value)](#setViewportSize-com.aspose.threed.FVector2-) | Größe des Viewports, gemessen in Pixel |
| [setWorldAmbient(FVector3 value)](#setWorldAmbient-com.aspose.threed.FVector3-) | Umgebungsfarbe, definiert im Viewport. |
| [setWorldTime(float value)](#setWorldTime-float-) | Zeit in Sekunden |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getCameraPosition() {#getCameraPosition--}
```
public FVector3 getCameraPosition()
```


Position der Kamera im Weltkoordinatensystem

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Camera's position in world coordinate system
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getDepthBias() {#getDepthBias--}
```
public float getDepthBias()
```


Tiefenbias für Shadow Mapping, Standardwert ist 0.001

**Returns:**
float – Tiefenversatz für Shadow Mapping, Standardwert ist 0,001
### getMatrixLightSpace() {#getMatrixLightSpace--}
```
public FMatrix4 getMatrixLightSpace()
```


Matrix für die Lichtraum-Transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for light space transformation
### getMatrixProjection() {#getMatrixProjection--}
```
public FMatrix4 getMatrixProjection()
```


Matrix für die Projektions-Transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for projection transformation
### getMatrixView() {#getMatrixView--}
```
public FMatrix4 getMatrixView()
```


Matrix für die View-Transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for view transformation
### getMatrixViewProjection() {#getMatrixViewProjection--}
```
public FMatrix4 getMatrixViewProjection()
```


Matrix für View- und Projektions-Transformation.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for view and projection transformation.
### getMatrixWorld() {#getMatrixWorld--}
```
public FMatrix4 getMatrixWorld()
```


Matrix für die World-Transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for world transformation
### getMatrixWorldNormal() {#getMatrixWorldNormal--}
```
public FMatrix4 getMatrixWorldNormal()
```


Matrix zum Konvertieren von Normalen vom Objekt- in den World‑Raum.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for converting normal from object to world space.
### getMatrixWorldViewProjection() {#getMatrixWorldViewProjection--}
```
public FMatrix4 getMatrixWorldViewProjection()
```


Matrix für Weltansicht- und Projektionsumwandlung

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for world view and projection transformation
### getShadowCaster() {#getShadowCaster--}
```
public FVector3 getShadowCaster()
```


Position des Schattenwerfers im Weltkoordinatensystem

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Position of shadow caster in world coordinate system
### getShadowmap() {#getShadowmap--}
```
public ITextureUnit getShadowmap()
```


Die Tiefentextur, die für die Schattenabbildung verwendet wird

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit) - The depth texture used for shadow mapping
### getViewportSize() {#getViewportSize--}
```
public FVector2 getViewportSize()
```


Größe des Viewports, gemessen in Pixel

**Returns:**
[FVector2](../../com.aspose.threed/fvector2) - Size of viewport, measured in pixel
### getWorldAmbient() {#getWorldAmbient--}
```
public FVector3 getWorldAmbient()
```


Umgebungsfarbe, definiert im Viewport.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Ambient color defined in viewport.
### getWorldTime() {#getWorldTime--}
```
public float getWorldTime()
```


Zeit in Sekunden

**Returns:**
float – Zeit in Sekunden
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




### setCameraPosition(FVector3 value) {#setCameraPosition-com.aspose.threed.FVector3-}
```
public void setCameraPosition(FVector3 value)
```


Position der Kamera im Weltkoordinatensystem

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FVector3](../../com.aspose.threed/fvector3) | Neuer Wert |

### setDepthBias(float value) {#setDepthBias-float-}
```
public void setDepthBias(float value)
```


Tiefenbias für Shadow Mapping, Standardwert ist 0.001

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

### setMatrixLightSpace(FMatrix4 value) {#setMatrixLightSpace-com.aspose.threed.FMatrix4-}
```
public void setMatrixLightSpace(FMatrix4 value)
```


Matrix für die Lichtraum-Transformation

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FMatrix4](../../com.aspose.threed/fmatrix4) | Neuer Wert |

### setMatrixProjection(FMatrix4 value) {#setMatrixProjection-com.aspose.threed.FMatrix4-}
```
public void setMatrixProjection(FMatrix4 value)
```


Matrix für die Projektions-Transformation

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FMatrix4](../../com.aspose.threed/fmatrix4) | Neuer Wert |

### setMatrixView(FMatrix4 value) {#setMatrixView-com.aspose.threed.FMatrix4-}
```
public void setMatrixView(FMatrix4 value)
```


Matrix für die View-Transformation

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FMatrix4](../../com.aspose.threed/fmatrix4) | Neuer Wert |

### setShadowCaster(FVector3 value) {#setShadowCaster-com.aspose.threed.FVector3-}
```
public void setShadowCaster(FVector3 value)
```


Position des Schattenwerfers im Weltkoordinatensystem

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FVector3](../../com.aspose.threed/fvector3) | Neuer Wert |

### setShadowmap(ITextureUnit value) {#setShadowmap-com.aspose.threed.ITextureUnit-}
```
public void setShadowmap(ITextureUnit value)
```


Die Tiefentextur, die für die Schattenabbildung verwendet wird

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [ITextureUnit](../../com.aspose.threed/itextureunit) | Neuer Wert |

### setViewportSize(FVector2 value) {#setViewportSize-com.aspose.threed.FVector2-}
```
public void setViewportSize(FVector2 value)
```


Größe des Viewports, gemessen in Pixel

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FVector2](../../com.aspose.threed/fvector2) | Neuer Wert |

### setWorldAmbient(FVector3 value) {#setWorldAmbient-com.aspose.threed.FVector3-}
```
public void setWorldAmbient(FVector3 value)
```


Umgebungsfarbe, definiert im Viewport.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FVector3](../../com.aspose.threed/fvector3) | Neuer Wert |

### setWorldTime(float value) {#setWorldTime-float-}
```
public void setWorldTime(float value)
```


Zeit in Sekunden

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | float | Neuer Wert |

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

