---
title: IRenderTarget
second_title: Aspose.3D für Java API-Referenz
description: Die Basisschnittstelle des Renderziels
type: docs
weight: 249
url: /de/java/com.aspose.threed/irendertarget/
---

**All Implemented Interfaces:**
java.io.Closeable
```
public interface IRenderTarget extends Closeable
```

Die Basisschnittstelle des Renderziels
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [createViewport(Camera camera)](#createViewport-com.aspose.threed.Camera-) | Erstelle ein Viewport in der angegebenen Kameraperspektive. |
| [createViewport(Camera camera, RelativeRectangle rect)](#createViewport-com.aspose.threed.Camera-com.aspose.threed.RelativeRectangle-) | Erstelle ein Viewport mit Position/Größe in der angegebenen Kameraperspektive. |
| [createViewport(Camera camera, Vector3 backgroundColor, RelativeRectangle rect)](#createViewport-com.aspose.threed.Camera-com.aspose.threed.Vector3-com.aspose.threed.RelativeRectangle-) | Erstelle ein Viewport mit angegebenem Hintergrundfarbwert und Position/Größe in der angegebenen Kameraperspektive. |
| [getSize()](#getSize--) | Ermittelt die Größe des Renderziels. |
| [getViewports()](#getViewports--) | Ermittelt alle Viewports, die mit diesem Renderziel verknüpft sind. |
| [setSize(Vector2 value)](#setSize-com.aspose.threed.Vector2-) | Legt die Größe des Renderziels fest. |
### createViewport(Camera camera) {#createViewport-com.aspose.threed.Camera-}
```
public abstract Viewport createViewport(Camera camera)
```


Erstelle ein Viewport in der angegebenen Kameraperspektive.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Die Kamera |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### createViewport(Camera camera, RelativeRectangle rect) {#createViewport-com.aspose.threed.Camera-com.aspose.threed.RelativeRectangle-}
```
public abstract Viewport createViewport(Camera camera, RelativeRectangle rect)
```


Erstelle ein Viewport mit Position/Größe in der angegebenen Kameraperspektive.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Die Kamera |
| rect | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | Position und Größe des Viewports |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### createViewport(Camera camera, Vector3 backgroundColor, RelativeRectangle rect) {#createViewport-com.aspose.threed.Camera-com.aspose.threed.Vector3-com.aspose.threed.RelativeRectangle-}
```
public abstract Viewport createViewport(Camera camera, Vector3 backgroundColor, RelativeRectangle rect)
```


Erstelle ein Viewport mit angegebenem Hintergrundfarbwert und Position/Größe in der angegebenen Kameraperspektive.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | Die Kamera |
| backgroundColor | [Vector3](../../com.aspose.threed/vector3) | Der Hintergrund des Viewports |
| rect | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | Position und Größe des Viewports |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### getSize() {#getSize--}
```
public abstract Vector2 getSize()
```


Ermittelt die Größe des Renderziels.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the size of the render target.
### getViewports() {#getViewports--}
```
public abstract List<Viewport> getViewports()
```


Ermittelt alle Viewports, die mit diesem Renderziel verknüpft sind.

**Returns:**
java.util.List<com.aspose.threed.Viewport> - alle Viewports, die mit diesem Renderziel verknüpft sind.
### setSize(Vector2 value) {#setSize-com.aspose.threed.Vector2-}
```
public abstract void setSize(Vector2 value)
```


Legt die Größe des Renderziels fest.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | Neuer Wert |

