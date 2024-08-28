---
title: TransformedStroke
second_title: Aspose.Page for Java API Reference
description: A stroke that contains transformation.
type: docs
weight: 17
url: /java/com.aspose.page/transformedstroke/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
java.awt.Stroke
```
public class TransformedStroke implements Stroke
```

A stroke that contains transformation.
## Constructors

| Constructor | Description |
| --- | --- |
| [TransformedStroke(Stroke base, AffineTransform at)](#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-) | Creates a TransformedStroke based on another Stroke and an AffineTransform. |
## Methods

| Method | Description |
| --- | --- |
| [createStrokedShape(Shape s)](#createStrokedShape-java.awt.Shape-) | Strokes the given Shape with this stroke, creating an outline. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getBaseStroke()](#getBaseStroke--) | Gets basic stroke. |
| [getClass()](#getClass--) |  |
| [getTransform()](#getTransform--) | Gets a transformation. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TransformedStroke(Stroke base, AffineTransform at) {#TransformedStroke-java.awt.Stroke-java.awt.geom.AffineTransform-}
```
public TransformedStroke(Stroke base, AffineTransform at)
```


Creates a TransformedStroke based on another Stroke and an AffineTransform.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| base | java.awt.Stroke | The stroke base. |
| at | java.awt.geom.AffineTransform | The affine transformation. |

### createStrokedShape(Shape s) {#createStrokedShape-java.awt.Shape-}
```
public Shape createStrokedShape(Shape s)
```


Strokes the given Shape with this stroke, creating an outline. This outline is distorted by our AffineTransform relative to the outline which would be given by the base stroke, but only in terms of scaling (i.e. thickness of the lines), as translation and rotation are undone after the stroking.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| s | java.awt.Shape | As shape to be outlined. |

**Returns:**
java.awt.Shape - An outline of the shape.
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
### getBaseStroke() {#getBaseStroke--}
```
public Stroke getBaseStroke()
```


Gets basic stroke.

**Returns:**
java.awt.Stroke - Basic stroke.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTransform() {#getTransform--}
```
public AffineTransform getTransform()
```


Gets a transformation.

**Returns:**
java.awt.geom.AffineTransform - A transformation.
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

