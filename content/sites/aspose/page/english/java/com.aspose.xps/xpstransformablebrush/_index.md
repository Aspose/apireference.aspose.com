---
title: XpsTransformableBrush
second_title: Aspose.Page for Java API Reference
description: Class incapsulating common features of transformable brushes elements all except SolidColorBrush.
type: docs
weight: 52
url: /java/com.aspose.xps/xpstransformablebrush/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), [com.aspose.xps.XpsBrush](../../com.aspose.xps/xpsbrush)

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public abstract class XpsTransformableBrush extends XpsBrush implements ITransformableProperty
```

Class incapsulating common features of transformable brushes elements (all except SolidColorBrush).
## Methods

| Method | Description |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getOpacity()](#getOpacity--) | Returns value defining the uniform transparency of the brush fill. |
| [getTransform()](#getTransform--) | Returns the matrix transformation applied to the coordinate space of the brush. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setOpacity(float value)](#setOpacity-float-) | Sets value defining the uniform transparency of the brush fill. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the matrix transformation applied to the coordinate space of the brush. |
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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getOpacity() {#getOpacity--}
```
public float getOpacity()
```


Returns value defining the uniform transparency of the brush fill.

**Returns:**
float - Value defining the uniform transparency of the brush fill.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returns the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The matrix transformation applied to the coordinate space of the brush.
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




### setOpacity(float value) {#setOpacity-float-}
```
public void setOpacity(float value)
```


Sets value defining the uniform transparency of the brush fill.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | float | Value defining the uniform transparency of the brush fill. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Sets the matrix transformation applied to the coordinate space of the brush. The Transform property is concatenated with the current effective render transform to yield an effective render transform local to the brush. The viewport for the brush is transformed using the local effective render transform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The matrix transformation applied to the coordinate space of the brush. |

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

