---
title: IRenderTarget
second_title: Aspose.3D for Java API Reference
description: The base interface of render target
type: docs
weight: 244
url: /java/com.aspose.threed/irendertarget/
---

**All Implemented Interfaces:**
java.io.Closeable
```
public interface IRenderTarget extends Closeable
```

The base interface of render target
## Methods

| Method | Description |
| --- | --- |
| [createViewport(Camera camera)](#createViewport-com.aspose.threed.Camera-) | Create a viewport in specified camera perspective. |
| [createViewport(Camera camera, RelativeRectangle rect)](#createViewport-com.aspose.threed.Camera-com.aspose.threed.RelativeRectangle-) | Create a viewport with position/size in specified camera perspective. |
| [createViewport(Camera camera, Vector3 backgroundColor, RelativeRectangle rect)](#createViewport-com.aspose.threed.Camera-com.aspose.threed.Vector3-com.aspose.threed.RelativeRectangle-) | Create a viewport with specified background color and position/size in specified camera perspective. |
| [getSize()](#getSize--) | Gets the size of the render target. |
| [getViewports()](#getViewports--) | Gets all viewports that associated with this render target. |
| [setSize(Vector2 value)](#setSize-com.aspose.threed.Vector2-) | Sets the size of the render target. |
### createViewport(Camera camera) {#createViewport-com.aspose.threed.Camera-}
```
public abstract Viewport createViewport(Camera camera)
```


Create a viewport in specified camera perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | The camera |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### createViewport(Camera camera, RelativeRectangle rect) {#createViewport-com.aspose.threed.Camera-com.aspose.threed.RelativeRectangle-}
```
public abstract Viewport createViewport(Camera camera, RelativeRectangle rect)
```


Create a viewport with position/size in specified camera perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | The camera |
| rect | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | Position and size of the viewport |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### createViewport(Camera camera, Vector3 backgroundColor, RelativeRectangle rect) {#createViewport-com.aspose.threed.Camera-com.aspose.threed.Vector3-com.aspose.threed.RelativeRectangle-}
```
public abstract Viewport createViewport(Camera camera, Vector3 backgroundColor, RelativeRectangle rect)
```


Create a viewport with specified background color and position/size in specified camera perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | The camera |
| backgroundColor | [Vector3](../../com.aspose.threed/vector3) | The background of the viewport |
| rect | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | Position and size of the viewport |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### getSize() {#getSize--}
```
public abstract Vector2 getSize()
```


Gets the size of the render target.

**Returns:**
[Vector2](../../com.aspose.threed/vector2) - the size of the render target.
### getViewports() {#getViewports--}
```
public abstract List<Viewport> getViewports()
```


Gets all viewports that associated with this render target.

**Returns:**
java.util.List<com.aspose.threed.Viewport> - all viewports that associated with this render target.
### setSize(Vector2 value) {#setSize-com.aspose.threed.Vector2-}
```
public abstract void setSize(Vector2 value)
```


Sets the size of the render target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector2](../../com.aspose.threed/vector2) | New value |

