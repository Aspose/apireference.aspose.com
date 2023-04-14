---
title: RenderState
second_title: Aspose.3D for Java API Reference
description: Render state for building the pipeline The changes made on render state will not affect the created pipeline instances.
type: docs
weight: 139
url: /java/com.aspose.threed/renderstate/
---

**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.io.Closeable, java.lang.Comparable
```
public class RenderState implements Closeable, Comparable<RenderState>
```

Render state for building the pipeline The changes made on render state will not affect the created pipeline instances.
## Constructors

| Constructor | Description |
| --- | --- |
| [RenderState()](#RenderState--) | Constructor of [RenderState](../../com.aspose.threed/renderstate) |
## Methods

| Method | Description |
| --- | --- |
| [close()](#close--) | Dispose the [RenderState](../../com.aspose.threed/renderstate) and release all internal resources. |
| [compareTo(RenderState other)](#compareTo-com.aspose.threed.RenderState-) | Compare the render state with another instance |
| [equals(Object obj)](#equals-java.lang.Object-) | Returns a value indicating whether this instance is equal to a specified object. |
| [getBlend()](#getBlend--) | Enable or disable the fragment blending. |
| [getBlendColor()](#getBlendColor--) | Gets the blend color where used in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR) |
| [getClass()](#getClass--) |  |
| [getCullFace()](#getCullFace--) | Enable or disable cull face |
| [getCullFaceMode()](#getCullFaceMode--) | Gets which face will be culled. |
| [getDepthFunction()](#getDepthFunction--) | Gets the compare function used in depth test |
| [getDepthMask()](#getDepthMask--) | Enable or disable the depth writing. |
| [getDepthTest()](#getDepthTest--) | Enable or disable the depth test. |
| [getDestinationBlendFactor()](#getDestinationBlendFactor--) | Gets how the color is blended. |
| [getFrontFace()](#getFrontFace--) | Gets which order is front face. |
| [getPolygonMode()](#getPolygonMode--) | Gets the polygon's render mode. |
| [getScissorTest()](#getScissorTest--) | Enable or disable scissor test |
| [getSourceBlendFactor()](#getSourceBlendFactor--) | Gets how the color is blended. |
| [getStencilBackFace()](#getStencilBackFace--) | Gets the stencil state for back face. |
| [getStencilFrontFace()](#getStencilFrontFace--) | Gets the stencil state for front face. |
| [getStencilMask()](#getStencilMask--) | Gets the mask that is ANDed with the both reference and stored stencil value when test is done. |
| [getStencilReference()](#getStencilReference--) | Gets the reference value for the stencil test. |
| [getStencilTest()](#getStencilTest--) | Enable or disable the stencil test. |
| [hashCode()](#hashCode--) | Returns the hash code for this instance. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setBlend(boolean value)](#setBlend-boolean-) | Enable or disable the fragment blending. |
| [setBlendColor(FVector4 value)](#setBlendColor-com.aspose.threed.FVector4-) | Sets the blend color where used in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR) |
| [setCullFace(boolean value)](#setCullFace-boolean-) | Enable or disable cull face |
| [setCullFaceMode(int value)](#setCullFaceMode-int-) | Sets which face will be culled. |
| [setDepthFunction(CompareFunction value)](#setDepthFunction-com.aspose.threed.CompareFunction-) | Sets the compare function used in depth test |
| [setDepthMask(boolean value)](#setDepthMask-boolean-) | Enable or disable the depth writing. |
| [setDepthTest(boolean value)](#setDepthTest-boolean-) | Enable or disable the depth test. |
| [setDestinationBlendFactor(BlendFactor value)](#setDestinationBlendFactor-com.aspose.threed.BlendFactor-) | Sets how the color is blended. |
| [setFrontFace(FrontFace value)](#setFrontFace-com.aspose.threed.FrontFace-) | Sets which order is front face. |
| [setPolygonMode(PolygonMode value)](#setPolygonMode-com.aspose.threed.PolygonMode-) | Sets the polygon's render mode. |
| [setScissorTest(boolean value)](#setScissorTest-boolean-) | Enable or disable scissor test |
| [setSourceBlendFactor(BlendFactor value)](#setSourceBlendFactor-com.aspose.threed.BlendFactor-) | Sets how the color is blended. |
| [setStencilMask(int value)](#setStencilMask-int-) | Sets the mask that is ANDed with the both reference and stored stencil value when test is done. |
| [setStencilReference(int value)](#setStencilReference-int-) | Sets the reference value for the stencil test. |
| [setStencilTest(boolean value)](#setStencilTest-boolean-) | Enable or disable the stencil test. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### RenderState() {#RenderState--}
```
public RenderState()
```


Constructor of [RenderState](../../com.aspose.threed/renderstate)

### close() {#close--}
```
public void close()
```


Dispose the [RenderState](../../com.aspose.threed/renderstate) and release all internal resources.

### compareTo(RenderState other) {#compareTo-com.aspose.threed.RenderState-}
```
public int compareTo(RenderState other)
```


Compare the render state with another instance

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| other | [RenderState](../../com.aspose.threed/renderstate) |  |

**Returns:**
int
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Returns a value indicating whether this instance is equal to a specified object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object |  |

**Returns:**
boolean
### getBlend() {#getBlend--}
```
public boolean getBlend()
```


Enable or disable the fragment blending.

**Returns:**
boolean
### getBlendColor() {#getBlendColor--}
```
public FVector4 getBlendColor()
```


Gets the blend color where used in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR)

**Returns:**
[FVector4](../../com.aspose.threed/fvector4)
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


Enable or disable cull face

**Returns:**
boolean
### getCullFaceMode() {#getCullFaceMode--}
```
public int getCullFaceMode()
```


Gets which face will be culled.

**Returns:**
int
### getDepthFunction() {#getDepthFunction--}
```
public CompareFunction getDepthFunction()
```


Gets the compare function used in depth test

**Returns:**
[CompareFunction](../../com.aspose.threed/comparefunction)
### getDepthMask() {#getDepthMask--}
```
public boolean getDepthMask()
```


Enable or disable the depth writing.

**Returns:**
boolean
### getDepthTest() {#getDepthTest--}
```
public boolean getDepthTest()
```


Enable or disable the depth test.

**Returns:**
boolean
### getDestinationBlendFactor() {#getDestinationBlendFactor--}
```
public BlendFactor getDestinationBlendFactor()
```


Gets how the color is blended.

**Returns:**
[BlendFactor](../../com.aspose.threed/blendfactor)
### getFrontFace() {#getFrontFace--}
```
public FrontFace getFrontFace()
```


Gets which order is front face.

**Returns:**
[FrontFace](../../com.aspose.threed/frontface)
### getPolygonMode() {#getPolygonMode--}
```
public PolygonMode getPolygonMode()
```


Gets the polygon's render mode.

**Returns:**
[PolygonMode](../../com.aspose.threed/polygonmode)
### getScissorTest() {#getScissorTest--}
```
public boolean getScissorTest()
```


Enable or disable scissor test

**Returns:**
boolean
### getSourceBlendFactor() {#getSourceBlendFactor--}
```
public BlendFactor getSourceBlendFactor()
```


Gets how the color is blended.

**Returns:**
[BlendFactor](../../com.aspose.threed/blendfactor)
### getStencilBackFace() {#getStencilBackFace--}
```
public StencilState getStencilBackFace()
```


Gets the stencil state for back face.

**Returns:**
[StencilState](../../com.aspose.threed/stencilstate)
### getStencilFrontFace() {#getStencilFrontFace--}
```
public StencilState getStencilFrontFace()
```


Gets the stencil state for front face.

**Returns:**
[StencilState](../../com.aspose.threed/stencilstate)
### getStencilMask() {#getStencilMask--}
```
public int getStencilMask()
```


Gets the mask that is ANDed with the both reference and stored stencil value when test is done.

**Returns:**
int
### getStencilReference() {#getStencilReference--}
```
public int getStencilReference()
```


Gets the reference value for the stencil test.

**Returns:**
int
### getStencilTest() {#getStencilTest--}
```
public boolean getStencilTest()
```


Enable or disable the stencil test.

**Returns:**
boolean
### hashCode() {#hashCode--}
```
public int hashCode()
```


Returns the hash code for this instance.

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


Enable or disable the fragment blending.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setBlendColor(FVector4 value) {#setBlendColor-com.aspose.threed.FVector4-}
```
public void setBlendColor(FVector4 value)
```


Sets the blend color where used in [BlendFactor.CONSTANT\_COLOR](../../com.aspose.threed/blendfactor\#CONSTANT-COLOR)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FVector4](../../com.aspose.threed/fvector4) | New value |

### setCullFace(boolean value) {#setCullFace-boolean-}
```
public void setCullFace(boolean value)
```


Enable or disable cull face

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setCullFaceMode(int value) {#setCullFaceMode-int-}
```
public void setCullFaceMode(int value)
```


Sets which face will be culled.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setDepthFunction(CompareFunction value) {#setDepthFunction-com.aspose.threed.CompareFunction-}
```
public void setDepthFunction(CompareFunction value)
```


Sets the compare function used in depth test

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [CompareFunction](../../com.aspose.threed/comparefunction) | New value |

### setDepthMask(boolean value) {#setDepthMask-boolean-}
```
public void setDepthMask(boolean value)
```


Enable or disable the depth writing.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setDepthTest(boolean value) {#setDepthTest-boolean-}
```
public void setDepthTest(boolean value)
```


Enable or disable the depth test.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setDestinationBlendFactor(BlendFactor value) {#setDestinationBlendFactor-com.aspose.threed.BlendFactor-}
```
public void setDestinationBlendFactor(BlendFactor value)
```


Sets how the color is blended.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [BlendFactor](../../com.aspose.threed/blendfactor) | New value |

### setFrontFace(FrontFace value) {#setFrontFace-com.aspose.threed.FrontFace-}
```
public void setFrontFace(FrontFace value)
```


Sets which order is front face.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FrontFace](../../com.aspose.threed/frontface) | New value |

### setPolygonMode(PolygonMode value) {#setPolygonMode-com.aspose.threed.PolygonMode-}
```
public void setPolygonMode(PolygonMode value)
```


Sets the polygon's render mode.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [PolygonMode](../../com.aspose.threed/polygonmode) | New value |

### setScissorTest(boolean value) {#setScissorTest-boolean-}
```
public void setScissorTest(boolean value)
```


Enable or disable scissor test

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setSourceBlendFactor(BlendFactor value) {#setSourceBlendFactor-com.aspose.threed.BlendFactor-}
```
public void setSourceBlendFactor(BlendFactor value)
```


Sets how the color is blended.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [BlendFactor](../../com.aspose.threed/blendfactor) | New value |

### setStencilMask(int value) {#setStencilMask-int-}
```
public void setStencilMask(int value)
```


Sets the mask that is ANDed with the both reference and stored stencil value when test is done.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setStencilReference(int value) {#setStencilReference-int-}
```
public void setStencilReference(int value)
```


Sets the reference value for the stencil test.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | New value |

### setStencilTest(boolean value) {#setStencilTest-boolean-}
```
public void setStencilTest(boolean value)
```


Enable or disable the stencil test.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

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
public final native void wait(long arg0)
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

