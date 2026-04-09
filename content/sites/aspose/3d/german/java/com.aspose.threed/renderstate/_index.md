---
title: RenderState
second_title: Aspose.3D für Java API-Referenz
description: Renderzustand zum Aufbau der Pipeline. Änderungen am Renderzustand wirken sich nicht auf die erstellten Pipeline‑Instanzen aus.
type: docs
weight: 151
url: /de/java/com.aspose.threed/renderstate/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable, java.lang.Comparable
```
public class RenderState implements Closeable, Comparable<RenderState>
```

Renderzustand zum Aufbau der Pipeline. Änderungen am Renderzustand wirken sich nicht auf die erstellten Pipeline-Instanzen aus.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [RenderState()](#RenderState--) | Konstruktor von [RenderState](../../com.aspose.threed/renderstate) |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [close()](#close--) | Freigeben Sie den [RenderState](../../com.aspose.threed/renderstate) und geben Sie alle internen Ressourcen frei. |
| [compareTo(RenderState other)](#compareTo-com.aspose.threed.RenderState-) | Vergleichen Sie den Renderzustand mit einer anderen Instanz |
| [equals(Object obj)](#equals-java.lang.Object-) | Gibt einen Wert zurück, der angibt, ob diese Instanz einem angegebenen Objekt gleich ist. |
| [getBlend()](#getBlend--) | Aktivieren oder deaktivieren Sie das Fragment‑Blending. |
| [getBlendColor()](#getBlendColor--) | Liefert die Mischfarbe, die in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR) verwendet wird. |
| [getClass()](#getClass--) |  |
| [getCullFace()](#getCullFace--) | Aktivieren oder deaktivieren Sie das Cull‑Face |
| [getCullFaceMode()](#getCullFaceMode--) | Liefert, welche Fläche verworfen wird. |
| [getDepthFunction()](#getDepthFunction--) | Liefert die Vergleichsfunktion, die im Tiefentest verwendet wird. |
| [getDepthMask()](#getDepthMask--) | Aktivieren oder deaktivieren Sie das Tiefenschreiben. |
| [getDepthTest()](#getDepthTest--) | Aktivieren oder deaktivieren Sie den Tiefentest. |
| [getDestinationBlendFactor()](#getDestinationBlendFactor--) | Liefert, wie die Farbe gemischt wird. |
| [getFrontFace()](#getFrontFace--) | Liefert, welche Reihenfolge die Vorderseite hat. |
| [getPolygonMode()](#getPolygonMode--) | Liefert den Rendermodus des Polygons. |
| [getScissorTest()](#getScissorTest--) | Aktivieren oder deaktivieren Sie den Scheren‑Test. |
| [getSourceBlendFactor()](#getSourceBlendFactor--) | Liefert, wie die Farbe gemischt wird. |
| [getStencilBackFace()](#getStencilBackFace--) | Liefert den Stencil‑Zustand für die Rückseite. |
| [getStencilFrontFace()](#getStencilFrontFace--) | Liefert den Stencil‑Zustand für die Vorderseite. |
| [getStencilMask()](#getStencilMask--) | Liefert die Maske, die bei Abschluss des Tests mit dem Referenz‑ und dem gespeicherten Stencil‑Wert UND‑verknüpft wird. |
| [getStencilReference()](#getStencilReference--) | Liefert den Referenzwert für den Stencil‑Test. |
| [getStencilTest()](#getStencilTest--) | Aktivieren oder deaktivieren Sie den Stencil‑Test. |
| [hashCode()](#hashCode--) | Gibt den Hashcode für diese Instanz zurück. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBlend(boolean value)](#setBlend-boolean-) | Aktivieren oder deaktivieren Sie das Fragment‑Blending. |
| [setBlendColor(FVector4 value)](#setBlendColor-com.aspose.threed.FVector4-) | Setzt die Mischfarbe, die in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR) verwendet wird. |
| [setCullFace(boolean value)](#setCullFace-boolean-) | Aktivieren oder deaktivieren Sie das Cull‑Face |
| [setCullFaceMode(int value)](#setCullFaceMode-int-) | Setzt, welche Fläche verworfen wird. |
| [setDepthFunction(CompareFunction value)](#setDepthFunction-com.aspose.threed.CompareFunction-) | Setzt die Vergleichsfunktion, die im Tiefentest verwendet wird. |
| [setDepthMask(boolean value)](#setDepthMask-boolean-) | Aktivieren oder deaktivieren Sie das Tiefenschreiben. |
| [setDepthTest(boolean value)](#setDepthTest-boolean-) | Aktivieren oder deaktivieren Sie den Tiefentest. |
| [setDestinationBlendFactor(BlendFactor value)](#setDestinationBlendFactor-com.aspose.threed.BlendFactor-) | Setzt, wie die Farbe gemischt wird. |
| [setFrontFace(FrontFace value)](#setFrontFace-com.aspose.threed.FrontFace-) | Setzt, welche Reihenfolge die Vorderseite hat. |
| [setPolygonMode(PolygonMode value)](#setPolygonMode-com.aspose.threed.PolygonMode-) | Legt den Rendermodus des Polygons fest. |
| [setScissorTest(boolean value)](#setScissorTest-boolean-) | Aktivieren oder deaktivieren Sie den Scheren‑Test. |
| [setSourceBlendFactor(BlendFactor value)](#setSourceBlendFactor-com.aspose.threed.BlendFactor-) | Setzt, wie die Farbe gemischt wird. |
| [setStencilMask(int value)](#setStencilMask-int-) | Legt die Maske fest, die beim Test mit dem Referenz- und dem gespeicherten Stencil-Wert UND-verknüpft wird. |
| [setStencilReference(int value)](#setStencilReference-int-) | Legt den Referenzwert für den Stencil-Test fest. |
| [setStencilTest(boolean value)](#setStencilTest-boolean-) | Aktivieren oder deaktivieren Sie den Stencil‑Test. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RenderState() {#RenderState--}
```
public RenderState()
```


Konstruktor von [RenderState](../../com.aspose.threed/renderstate)

### close() {#close--}
```
public void close()
```


Freigeben Sie den [RenderState](../../com.aspose.threed/renderstate) und geben Sie alle internen Ressourcen frei.

### compareTo(RenderState other) {#compareTo-com.aspose.threed.RenderState-}
```
public int compareTo(RenderState other)
```


Vergleichen Sie den Renderzustand mit einer anderen Instanz

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | [RenderState](../../com.aspose.threed/renderstate) | Ein weiterer Renderzustand zum Vergleich |

**Returns:**
int
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Gibt einen Wert zurück, der angibt, ob diese Instanz einem angegebenen Objekt gleich ist.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getBlend() {#getBlend--}
```
public boolean getBlend()
```


Aktivieren oder deaktivieren Sie das Fragment‑Blending.

**Returns:**
boolean - Aktivieren oder Deaktivieren des Fragment‑Blending.
### getBlendColor() {#getBlendColor--}
```
public FVector4 getBlendColor()
```


Liefert die Mischfarbe, die in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR) verwendet wird.

**Returns:**
[FVector4](../../com.aspose.threed/fvector4) - the blend color where used in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCullFace() {#getCullFace--}
```
public boolean getCullFace()
```


Aktivieren oder deaktivieren Sie das Cull‑Face

**Returns:**
boolean - Aktivieren oder Deaktivieren des Cull Face
### getCullFaceMode() {#getCullFaceMode--}
```
public int getCullFaceMode()
```


Liefert, welche Fläche verworfen wird.

**Returns:**
int - welche Fläche wird gecullt.
### getDepthFunction() {#getDepthFunction--}
```
public CompareFunction getDepthFunction()
```


Liefert die Vergleichsfunktion, die im Tiefentest verwendet wird.

**Returns:**
[CompareFunction](../../com.aspose.threed/comparefunction) - the compare function used in depth test
### getDepthMask() {#getDepthMask--}
```
public boolean getDepthMask()
```


Aktivieren oder deaktivieren Sie das Tiefenschreiben.

**Returns:**
boolean - Aktivieren oder Deaktivieren des Tiefen-Schreibens.
### getDepthTest() {#getDepthTest--}
```
public boolean getDepthTest()
```


Aktivieren oder deaktivieren Sie den Tiefentest.

**Returns:**
boolean - Aktivieren oder Deaktivieren des Tiefen-Tests.
### getDestinationBlendFactor() {#getDestinationBlendFactor--}
```
public BlendFactor getDestinationBlendFactor()
```


Liefert, wie die Farbe gemischt wird.

**Returns:**
[BlendFactor](../../com.aspose.threed/blendfactor) - how the color is blended.
### getFrontFace() {#getFrontFace--}
```
public FrontFace getFrontFace()
```


Liefert, welche Reihenfolge die Vorderseite hat.

**Returns:**
[FrontFace](../../com.aspose.threed/frontface) - which order is front face.
### getPolygonMode() {#getPolygonMode--}
```
public PolygonMode getPolygonMode()
```


Liefert den Rendermodus des Polygons.

**Returns:**
[PolygonMode](../../com.aspose.threed/polygonmode) - the polygon's render mode.
### getScissorTest() {#getScissorTest--}
```
public boolean getScissorTest()
```


Aktivieren oder deaktivieren Sie den Scheren‑Test.

**Returns:**
boolean - Aktivieren oder Deaktivieren des Scissor-Tests
### getSourceBlendFactor() {#getSourceBlendFactor--}
```
public BlendFactor getSourceBlendFactor()
```


Liefert, wie die Farbe gemischt wird.

**Returns:**
[BlendFactor](../../com.aspose.threed/blendfactor) - how the color is blended.
### getStencilBackFace() {#getStencilBackFace--}
```
public StencilState getStencilBackFace()
```


Liefert den Stencil‑Zustand für die Rückseite.

**Returns:**
[StencilState](../../com.aspose.threed/stencilstate) - the stencil state for back face.
### getStencilFrontFace() {#getStencilFrontFace--}
```
public StencilState getStencilFrontFace()
```


Liefert den Stencil‑Zustand für die Vorderseite.

**Returns:**
[StencilState](../../com.aspose.threed/stencilstate) - the stencil state for front face.
### getStencilMask() {#getStencilMask--}
```
public int getStencilMask()
```


Liefert die Maske, die bei Abschluss des Tests mit dem Referenz‑ und dem gespeicherten Stencil‑Wert UND‑verknüpft wird.

**Returns:**
int - die Maske, die beim Test mit dem Referenz- und dem gespeicherten Stencil-Wert UND-verknüpft wird.
### getStencilReference() {#getStencilReference--}
```
public int getStencilReference()
```


Liefert den Referenzwert für den Stencil‑Test.

**Returns:**
int - der Referenzwert für den Stencil-Test.
### getStencilTest() {#getStencilTest--}
```
public boolean getStencilTest()
```


Aktivieren oder deaktivieren Sie den Stencil‑Test.

**Returns:**
boolean - Aktivieren oder Deaktivieren des Stencil-Tests.
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gibt den Hashcode für diese Instanz zurück.

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




### setBlend(boolean value) {#setBlend-boolean-}
```
public void setBlend(boolean value)
```


Aktivieren oder deaktivieren Sie das Fragment‑Blending.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setBlendColor(FVector4 value) {#setBlendColor-com.aspose.threed.FVector4-}
```
public void setBlendColor(FVector4 value)
```


Setzt die Mischfarbe, die in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR) verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FVector4](../../com.aspose.threed/fvector4) | Neuer Wert |

### setCullFace(boolean value) {#setCullFace-boolean-}
```
public void setCullFace(boolean value)
```


Aktivieren oder deaktivieren Sie das Cull‑Face

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setCullFaceMode(int value) {#setCullFaceMode-int-}
```
public void setCullFaceMode(int value)
```


Setzt, welche Fläche verworfen wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setDepthFunction(CompareFunction value) {#setDepthFunction-com.aspose.threed.CompareFunction-}
```
public void setDepthFunction(CompareFunction value)
```


Setzt die Vergleichsfunktion, die im Tiefentest verwendet wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [CompareFunction](../../com.aspose.threed/comparefunction) | Neuer Wert |

### setDepthMask(boolean value) {#setDepthMask-boolean-}
```
public void setDepthMask(boolean value)
```


Aktivieren oder deaktivieren Sie das Tiefenschreiben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setDepthTest(boolean value) {#setDepthTest-boolean-}
```
public void setDepthTest(boolean value)
```


Aktivieren oder deaktivieren Sie den Tiefentest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setDestinationBlendFactor(BlendFactor value) {#setDestinationBlendFactor-com.aspose.threed.BlendFactor-}
```
public void setDestinationBlendFactor(BlendFactor value)
```


Setzt, wie die Farbe gemischt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [BlendFactor](../../com.aspose.threed/blendfactor) | Neuer Wert |

### setFrontFace(FrontFace value) {#setFrontFace-com.aspose.threed.FrontFace-}
```
public void setFrontFace(FrontFace value)
```


Setzt, welche Reihenfolge die Vorderseite hat.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [FrontFace](../../com.aspose.threed/frontface) | Neuer Wert |

### setPolygonMode(PolygonMode value) {#setPolygonMode-com.aspose.threed.PolygonMode-}
```
public void setPolygonMode(PolygonMode value)
```


Legt den Rendermodus des Polygons fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [PolygonMode](../../com.aspose.threed/polygonmode) | Neuer Wert |

### setScissorTest(boolean value) {#setScissorTest-boolean-}
```
public void setScissorTest(boolean value)
```


Aktivieren oder deaktivieren Sie den Scheren‑Test.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

### setSourceBlendFactor(BlendFactor value) {#setSourceBlendFactor-com.aspose.threed.BlendFactor-}
```
public void setSourceBlendFactor(BlendFactor value)
```


Setzt, wie die Farbe gemischt wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [BlendFactor](../../com.aspose.threed/blendfactor) | Neuer Wert |

### setStencilMask(int value) {#setStencilMask-int-}
```
public void setStencilMask(int value)
```


Legt die Maske fest, die beim Test mit dem Referenz- und dem gespeicherten Stencil-Wert UND-verknüpft wird.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setStencilReference(int value) {#setStencilReference-int-}
```
public void setStencilReference(int value)
```


Legt den Referenzwert für den Stencil-Test fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | int | Neuer Wert |

### setStencilTest(boolean value) {#setStencilTest-boolean-}
```
public void setStencilTest(boolean value)
```


Aktivieren oder deaktivieren Sie den Stencil‑Test.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | boolean | Neuer Wert |

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

