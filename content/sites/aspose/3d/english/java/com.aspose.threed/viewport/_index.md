---
title: Viewport
second_title: Aspose.3D for Java API Reference
description: A com.aspose.threed.IRenderTarget contains at least one viewport for rendering the scene.
type: docs
weight: 208
url: /java/com.aspose.threed/viewport/
---

**Inheritance:**
java.lang.Object
```
public class Viewport
```

A com.aspose.threed.IRenderTarget contains at least one viewport for rendering the scene.
## Methods

| Method | Description |
| --- | --- |
| [getFrustum()](#getFrustum--) | Gets the camera of this com.aspose.threed.Viewport |
| [setFrustum(Frustum value)](#setFrustum-com.aspose.threed.Frustum-) | Sets the camera of this com.aspose.threed.Viewport |
| [getEnabled()](#getEnabled--) | Enable or disable this viewport. |
| [setEnabled(boolean value)](#setEnabled-boolean-) | Enable or disable this viewport. |
| [getRenderTarget()](#getRenderTarget--) | Gets the render target that created this viewport. |
| [getArea()](#getArea--) | Gets the area of the viewport in render target. |
| [setArea(RelativeRectangle value)](#setArea-com.aspose.threed.RelativeRectangle-) | Sets the area of the viewport in render target. |
| [getZOrder()](#getZOrder--) | Gets the Z-order of the viewport. |
| [setZOrder(int value)](#setZOrder-int-) | Sets the Z-order of the viewport. |
| [getBackgroundColor()](#getBackgroundColor--) | Gets the background color of the viewport. |
| [setBackgroundColor(Color value)](#setBackgroundColor-java.awt.Color-) | Sets the background color of the viewport. |
| [getDepthClear()](#getDepthClear--) | Gets the depth value used when clear the viewport with depth buffer bit set. |
| [setDepthClear(float value)](#setDepthClear-float-) | Sets the depth value used when clear the viewport with depth buffer bit set. |
| [clone()](#clone--) |  |
### getFrustum() {#getFrustum--}
```
public Frustum getFrustum()
```


Gets the camera of this com.aspose.threed.Viewport

**Returns:**
[Frustum](../../com.aspose.threed/frustum)
### setFrustum(Frustum value) {#setFrustum-com.aspose.threed.Frustum-}
```
public void setFrustum(Frustum value)
```


Sets the camera of this com.aspose.threed.Viewport

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Frustum](../../com.aspose.threed/frustum) | New value |

### getEnabled() {#getEnabled--}
```
public boolean getEnabled()
```


Enable or disable this viewport.

**Returns:**
boolean
### setEnabled(boolean value) {#setEnabled-boolean-}
```
public void setEnabled(boolean value)
```


Enable or disable this viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### getRenderTarget() {#getRenderTarget--}
```
public IRenderTarget getRenderTarget()
```


Gets the render target that created this viewport.

**Returns:**
[IRenderTarget](../../com.aspose.threed/irendertarget)
### getArea() {#getArea--}
```
public RelativeRectangle getArea()
```


Gets the area of the viewport in render target.

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle)
### setArea(RelativeRectangle value) {#setArea-com.aspose.threed.RelativeRectangle-}
```
public void setArea(RelativeRectangle value)
```


Sets the area of the viewport in render target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | New value |

### getZOrder() {#getZOrder--}
```
public int getZOrder()
```


Gets the Z-order of the viewport.

**Returns:**
int
### setZOrder(int value) {#setZOrder-int-}
```
public void setZOrder(int value)
```


Sets the Z-order of the viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```


Gets the background color of the viewport.

**Returns:**
java.awt.Color
### setBackgroundColor(Color value) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color value)
```


Sets the background color of the viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.Color | New value |

### getDepthClear() {#getDepthClear--}
```
public float getDepthClear()
```


Gets the depth value used when clear the viewport with depth buffer bit set.

**Returns:**
float
### setDepthClear(float value) {#setDepthClear-float-}
```
public void setDepthClear(float value)
```


Sets the depth value used when clear the viewport with depth buffer bit set.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### clone() {#clone--}
```
public Viewport clone()
```




**Returns:**
[Viewport](../../com.aspose.threed/viewport)
