---
title: IRenderTarget
second_title: Aspose.3D for Java API Reference
description: The base interface of render target
type: docs
weight: 226
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
| [createViewport(Camera camera, Color backgroundColor, RelativeRectangle rect)](#createViewport-com.aspose.threed.Camera-java.awt.Color-com.aspose.threed.RelativeRectangle-) | Create a viewport with specified background color and position/size in specified camera perspective. |
| [getSize()](#getSize--) | Gets the size of the render target. |
| [getViewports()](#getViewports--) | Gets all viewports that associated with this render target. |
| [setSize(Dimension value)](#setSize-java.awt.Dimension-) | Sets the size of the render target. |
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
### createViewport(Camera camera, Color backgroundColor, RelativeRectangle rect) {#createViewport-com.aspose.threed.Camera-java.awt.Color-com.aspose.threed.RelativeRectangle-}
```
public abstract Viewport createViewport(Camera camera, Color backgroundColor, RelativeRectangle rect)
```


Create a viewport with specified background color and position/size in specified camera perspective.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| camera | [Camera](../../com.aspose.threed/camera) | The camera |
| backgroundColor | java.awt.Color | The background of the viewport |
| rect | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | Position and size of the viewport |

**Returns:**
[Viewport](../../com.aspose.threed/viewport)
### getSize() {#getSize--}
```
public abstract Dimension getSize()
```


Gets the size of the render target.

**Returns:**
java.awt.Dimension
### getViewports() {#getViewports--}
```
public abstract List<Viewport> getViewports()
```


Gets all viewports that associated with this render target.

**Returns:**
java.util.List<com.aspose.threed.Viewport>
### setSize(Dimension value) {#setSize-java.awt.Dimension-}
```
public abstract void setSize(Dimension value)
```


Sets the size of the render target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Dimension | New value |

