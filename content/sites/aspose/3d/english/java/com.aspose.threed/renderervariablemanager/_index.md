---
title: RendererVariableManager
second_title: Aspose.3D for Java API Reference
description: This class manages variables used in rendering
type: docs
weight: 150
url: /java/com.aspose.threed/renderervariablemanager/
---

**Inheritance:**
java.lang.Object
```
public abstract class RendererVariableManager
```

This class manages variables used in rendering
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCameraPosition()](#getCameraPosition--) | Camera's position in world coordinate system |
| [getClass()](#getClass--) |  |
| [getDepthBias()](#getDepthBias--) | Depth bias for shadow mapping, default value is 0.001 |
| [getMatrixLightSpace()](#getMatrixLightSpace--) | Matrix for light space transformation |
| [getMatrixProjection()](#getMatrixProjection--) | Matrix for projection transformation |
| [getMatrixView()](#getMatrixView--) | Matrix for view transformation |
| [getMatrixViewProjection()](#getMatrixViewProjection--) | Matrix for view and projection transformation. |
| [getMatrixWorld()](#getMatrixWorld--) | Matrix for world transformation |
| [getMatrixWorldNormal()](#getMatrixWorldNormal--) | Matrix for converting normal from object to world space. |
| [getMatrixWorldViewProjection()](#getMatrixWorldViewProjection--) | Matrix for world view and projection transformation |
| [getShadowCaster()](#getShadowCaster--) | Position of shadow caster in world coordinate system |
| [getShadowmap()](#getShadowmap--) | The depth texture used for shadow mapping |
| [getViewportSize()](#getViewportSize--) | Size of viewport, measured in pixel |
| [getWorldAmbient()](#getWorldAmbient--) | Ambient color defined in viewport. |
| [getWorldTime()](#getWorldTime--) | Time in seconds |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setCameraPosition(FVector3 value)](#setCameraPosition-com.aspose.threed.FVector3-) | Camera's position in world coordinate system |
| [setDepthBias(float value)](#setDepthBias-float-) | Depth bias for shadow mapping, default value is 0.001 |
| [setMatrixLightSpace(FMatrix4 value)](#setMatrixLightSpace-com.aspose.threed.FMatrix4-) | Matrix for light space transformation |
| [setMatrixProjection(FMatrix4 value)](#setMatrixProjection-com.aspose.threed.FMatrix4-) | Matrix for projection transformation |
| [setMatrixView(FMatrix4 value)](#setMatrixView-com.aspose.threed.FMatrix4-) | Matrix for view transformation |
| [setShadowCaster(FVector3 value)](#setShadowCaster-com.aspose.threed.FVector3-) | Position of shadow caster in world coordinate system |
| [setShadowmap(ITextureUnit value)](#setShadowmap-com.aspose.threed.ITextureUnit-) | The depth texture used for shadow mapping |
| [setViewportSize(FVector2 value)](#setViewportSize-com.aspose.threed.FVector2-) | Size of viewport, measured in pixel |
| [setWorldAmbient(FVector3 value)](#setWorldAmbient-com.aspose.threed.FVector3-) | Ambient color defined in viewport. |
| [setWorldTime(float value)](#setWorldTime-float-) | Time in seconds |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getCameraPosition() {#getCameraPosition--}
```
public FVector3 getCameraPosition()
```


Camera's position in world coordinate system

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


Depth bias for shadow mapping, default value is 0.001

**Returns:**
float - Depth bias for shadow mapping, default value is 0.001
### getMatrixLightSpace() {#getMatrixLightSpace--}
```
public FMatrix4 getMatrixLightSpace()
```


Matrix for light space transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for light space transformation
### getMatrixProjection() {#getMatrixProjection--}
```
public FMatrix4 getMatrixProjection()
```


Matrix for projection transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for projection transformation
### getMatrixView() {#getMatrixView--}
```
public FMatrix4 getMatrixView()
```


Matrix for view transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for view transformation
### getMatrixViewProjection() {#getMatrixViewProjection--}
```
public FMatrix4 getMatrixViewProjection()
```


Matrix for view and projection transformation.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for view and projection transformation.
### getMatrixWorld() {#getMatrixWorld--}
```
public FMatrix4 getMatrixWorld()
```


Matrix for world transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for world transformation
### getMatrixWorldNormal() {#getMatrixWorldNormal--}
```
public FMatrix4 getMatrixWorldNormal()
```


Matrix for converting normal from object to world space.

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for converting normal from object to world space.
### getMatrixWorldViewProjection() {#getMatrixWorldViewProjection--}
```
public FMatrix4 getMatrixWorldViewProjection()
```


Matrix for world view and projection transformation

**Returns:**
[FMatrix4](../../com.aspose.threed/fmatrix4) - Matrix for world view and projection transformation
### getShadowCaster() {#getShadowCaster--}
```
public FVector3 getShadowCaster()
```


Position of shadow caster in world coordinate system

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Position of shadow caster in world coordinate system
### getShadowmap() {#getShadowmap--}
```
public ITextureUnit getShadowmap()
```


The depth texture used for shadow mapping

**Returns:**
[ITextureUnit](../../com.aspose.threed/itextureunit) - The depth texture used for shadow mapping
### getViewportSize() {#getViewportSize--}
```
public FVector2 getViewportSize()
```


Size of viewport, measured in pixel

**Returns:**
[FVector2](../../com.aspose.threed/fvector2) - Size of viewport, measured in pixel
### getWorldAmbient() {#getWorldAmbient--}
```
public FVector3 getWorldAmbient()
```


Ambient color defined in viewport.

**Returns:**
[FVector3](../../com.aspose.threed/fvector3) - Ambient color defined in viewport.
### getWorldTime() {#getWorldTime--}
```
public float getWorldTime()
```


Time in seconds

**Returns:**
float - Time in seconds
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


Camera's position in world coordinate system

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FVector3](../../com.aspose.threed/fvector3) | New value |

### setDepthBias(float value) {#setDepthBias-float-}
```
public void setDepthBias(float value)
```


Depth bias for shadow mapping, default value is 0.001

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

### setMatrixLightSpace(FMatrix4 value) {#setMatrixLightSpace-com.aspose.threed.FMatrix4-}
```
public void setMatrixLightSpace(FMatrix4 value)
```


Matrix for light space transformation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FMatrix4](../../com.aspose.threed/fmatrix4) | New value |

### setMatrixProjection(FMatrix4 value) {#setMatrixProjection-com.aspose.threed.FMatrix4-}
```
public void setMatrixProjection(FMatrix4 value)
```


Matrix for projection transformation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FMatrix4](../../com.aspose.threed/fmatrix4) | New value |

### setMatrixView(FMatrix4 value) {#setMatrixView-com.aspose.threed.FMatrix4-}
```
public void setMatrixView(FMatrix4 value)
```


Matrix for view transformation

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FMatrix4](../../com.aspose.threed/fmatrix4) | New value |

### setShadowCaster(FVector3 value) {#setShadowCaster-com.aspose.threed.FVector3-}
```
public void setShadowCaster(FVector3 value)
```


Position of shadow caster in world coordinate system

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FVector3](../../com.aspose.threed/fvector3) | New value |

### setShadowmap(ITextureUnit value) {#setShadowmap-com.aspose.threed.ITextureUnit-}
```
public void setShadowmap(ITextureUnit value)
```


The depth texture used for shadow mapping

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ITextureUnit](../../com.aspose.threed/itextureunit) | New value |

### setViewportSize(FVector2 value) {#setViewportSize-com.aspose.threed.FVector2-}
```
public void setViewportSize(FVector2 value)
```


Size of viewport, measured in pixel

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FVector2](../../com.aspose.threed/fvector2) | New value |

### setWorldAmbient(FVector3 value) {#setWorldAmbient-com.aspose.threed.FVector3-}
```
public void setWorldAmbient(FVector3 value)
```


Ambient color defined in viewport.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [FVector3](../../com.aspose.threed/fvector3) | New value |

### setWorldTime(float value) {#setWorldTime-float-}
```
public void setWorldTime(float value)
```


Time in seconds

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | New value |

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

