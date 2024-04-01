---
title: XpsPathGeometry
second_title: Aspose.Page for Java API Reference
description: Class incapsulating PathGeometry property element features.
type: docs
weight: 42
url: /java/com.aspose.xps/xpspathgeometry/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray

**All Implemented Interfaces:**
com.aspose.xps.ITransformableProperty
```
public final class XpsPathGeometry extends XpsArray<XpsPathFigure> implements ITransformableProperty
```

Class incapsulating PathGeometry property element features. This element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element.
## Methods

| Method | Description |
| --- | --- |
| [add(T obj)](#add-T-) | Adds a new object into array. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Adds a path segment to the list of child segments of the last pah figure. |
| [deepClone()](#deepClone--) | Clones this path geometry. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Provides access to array's element by index  i . |
| [getClass()](#getClass--) |  |
| [getFillRule()](#getFillRule--) | Returns the value specifying how the intersecting areas of geometric shapes are combined to form a region. |
| [getPathFigures()](#getPathFigures--) | Returns the list of child path figures. |
| [getTransform()](#getTransform--) | Returns the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Inserts a new object into array at specified position. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Inserts a path segment to the list of child segments of the last path figure at  index  position. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Removes an object from array. |
| [removeAt(int index)](#removeAt-int-) | Removes an object from array at specified position. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Removes a path segment from the list of child segments of the last path figure. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Removes a path segment from the list of child segments of the last path figure at  index  position. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Sets the value specifying how the intersecting areas of geometric shapes are combined to form a region. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [size()](#size--) | Returns number of elements. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### add(T obj) {#add-T-}
```
public T add(T obj)
```


Adds a new object into array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | T | The object to add. |

**Returns:**
T - Added object.
### addSegment(XpsPathSegment segment) {#addSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment addSegment(XpsPathSegment segment)
```


Adds a path segment to the list of child segments of the last pah figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | The path segment to be added. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Added path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Clones this path geometry.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
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
### get(int i) {#get-int-}
```
public T get(int i)
```


Provides access to array's element by index  i .

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| i | int | Index of the element. |

**Returns:**
T - The element at  i  position.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Returns the value specifying how the intersecting areas of geometric shapes are combined to form a region.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Returns the list of child path figures.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - The list of child path figures.
### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returns the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### insert(int index, T obj) {#insert-int-T-}
```
public T insert(int index, T obj)
```


Inserts a new object into array at specified position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The position to insert an object at. |
| obj | T | The object to insert. |

**Returns:**
T - Inserted object.
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Inserts a path segment to the list of child segments of the last path figure at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a segment should be inserted. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | A path segment to be inserted. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### remove(T obj) {#remove-T-}
```
public T remove(T obj)
```


Removes an object from array.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | T | The object to remove. |

**Returns:**
T - Removed object.
### removeAt(int index) {#removeAt-int-}
```
public T removeAt(int index)
```


Removes an object from array at specified position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | The position to remove an object at. |

**Returns:**
T - Removed object.
### removeSegment(XpsPathSegment segment) {#removeSegment-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment removeSegment(XpsPathSegment segment)
```


Removes a path segment from the list of child segments of the last path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | The path segment to be removed. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### removeSegmentAt(int index) {#removeSegmentAt-int-}
```
public XpsPathSegment removeSegmentAt(int index)
```


Removes a path segment from the list of child segments of the last path figure at  index  position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a path segment should be removed. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Sets the value specifying how the intersecting areas of geometric shapes are combined to form a region.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | The value specifying how the intersecting areas of geometric shapes are combined to form a region. |

### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Sets the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The affine transformation matrix. |

### size() {#size--}
```
public int size()
```


Returns number of elements.

**Returns:**
int - The number of elements.
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

