---
title: Viewport
second_title: Aspose.3D for Java API Reference
description: A  contains at least one viewport for rendering the scene.
type: docs
weight: 224
url: /java/com.aspose.threed/viewport/
---

**Inheritance:**
java.lang.Object
```
public class Viewport
```

A [IRenderTarget](../../com.aspose.threed/irendertarget) contains at least one viewport for rendering the scene.
## Methods

| Method | Description |
| --- | --- |
| [clone()](#clone--) |  |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getArea()](#getArea--) | Gets the area of the viewport in render target. |
| [getBackgroundColor()](#getBackgroundColor--) | Gets the background color of the viewport. |
| [getClass()](#getClass--) |  |
| [getDepthClear()](#getDepthClear--) | Gets the depth value used when clear the viewport with depth buffer bit set. |
| [getEnabled()](#getEnabled--) | Enable or disable this viewport. |
| [getFrustum()](#getFrustum--) | Gets the camera of this [Viewport](../../com.aspose.threed/viewport) |
| [getRenderTarget()](#getRenderTarget--) | Gets the render target that created this viewport. |
| [getZOrder()](#getZOrder--) | Gets the Z-order of the viewport. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setArea(RelativeRectangle value)](#setArea-com.aspose.threed.RelativeRectangle-) | Sets the area of the viewport in render target. |
| [setBackgroundColor(Vector3 value)](#setBackgroundColor-com.aspose.threed.Vector3-) | Sets the background color of the viewport. |
| [setDepthClear(float value)](#setDepthClear-float-) | Sets the depth value used when clear the viewport with depth buffer bit set. |
| [setEnabled(boolean value)](#setEnabled-boolean-) | Enable or disable this viewport. |
| [setFrustum(Frustum value)](#setFrustum-com.aspose.threed.Frustum-) | Sets the camera of this [Viewport](../../com.aspose.threed/viewport) |
| [setZOrder(int value)](#setZOrder-int-) | Sets the Z-order of the viewport. |
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getArea() {#getArea--}
```
public RelativeRectangle getArea()
```


Gets the area of the viewport in render target.

**Returns:**
[RelativeRectangle](../../com.aspose.threed/relativerectangle) - the area of the viewport in render target.
### getBackgroundColor() {#getBackgroundColor--}
```
public Vector3 getBackgroundColor()
```


Gets the background color of the viewport.

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


Gets the depth value used when clear the viewport with depth buffer bit set.

**Returns:**
float - the depth value used when clear the viewport with depth buffer bit set.
### getEnabled() {#getEnabled--}
```
public boolean getEnabled()
```


Enable or disable this viewport.

**Returns:**
boolean - Enable or disable this viewport.
### getFrustum() {#getFrustum--}
```
public Frustum getFrustum()
```


Gets the camera of this [Viewport](../../com.aspose.threed/viewport)

**Returns:**
[Frustum](../../com.aspose.threed/frustum) - the camera of this [Viewport](../../com.aspose.threed/viewport)
### getRenderTarget() {#getRenderTarget--}
```
public IRenderTarget getRenderTarget()
```


Gets the render target that created this viewport.

**Returns:**
[IRenderTarget](../../com.aspose.threed/irendertarget) - the render target that created this viewport.
### getZOrder() {#getZOrder--}
```
public int getZOrder()
```


Gets the Z-order of the viewport.

**Returns:**
int - the Z-order of the viewport.
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


Sets the area of the viewport in render target.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [RelativeRectangle](../../com.aspose.threed/relativerectangle) | New value |

### setBackgroundColor(Vector3 value) {#setBackgroundColor-com.aspose.threed.Vector3-}
```
public void setBackgroundColor(Vector3 value)
```


Sets the background color of the viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Vector3](../../com.aspose.threed/vector3) | New value |

### setDepthClear(float value) {#setDepthClear-float-}
```
public void setDepthClear(float value)
```


Sets the depth value used when clear the viewport with depth buffer bit set.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setEnabled(boolean value) {#setEnabled-boolean-}
```
public void setEnabled(boolean value)
```


Enable or disable this viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setFrustum(Frustum value) {#setFrustum-com.aspose.threed.Frustum-}
```
public void setFrustum(Frustum value)
```


Sets the camera of this [Viewport](../../com.aspose.threed/viewport)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Frustum](../../com.aspose.threed/frustum) | New value |

### setZOrder(int value) {#setZOrder-int-}
```
public void setZOrder(int value)
```


Sets the Z-order of the viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

