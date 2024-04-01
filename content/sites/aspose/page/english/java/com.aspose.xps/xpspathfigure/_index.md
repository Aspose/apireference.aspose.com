---
title: XpsPathFigure
second_title: Aspose.Page for Java API Reference
description: Class incapsulating PathFigure element features.
type: docs
weight: 41
url: /java/com.aspose.xps/xpspathfigure/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject), com.aspose.xps.XpsArray
```
public class XpsPathFigure extends XpsArray<XpsPathSegment>
```

Class incapsulating PathFigure element features. This element is composed of a set of one or more line or curve segments.
## Methods

| Method | Description |
| --- | --- |
| [add(T obj)](#add-T-) | Adds a new object into array. |
| [deepClone()](#deepClone--) | Clones this path figure. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [get(int i)](#get-int-) | Provides access to array's element by index  i . |
| [getClass()](#getClass--) |  |
| [getSegments()](#getSegments--) | Return the list of child path segments. |
| [getStartPoint()](#getStartPoint--) | Returns the starting point for the first segment of the path figure. |
| [hashCode()](#hashCode--) |  |
| [insert(int index, T obj)](#insert-int-T-) | Inserts a new object into array at specified position. |
| [isClosed()](#isClosed--) | Returns the value indicating whether the path figure is closed. |
| [isFilled()](#isFilled--) | Returns the value indicating whether the path figure is used in computing the area of the containing path geometry. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [remove(T obj)](#remove-T-) | Removes an object from array. |
| [removeAt(int index)](#removeAt-int-) | Removes an object from array at specified position. |
| [setClosed(boolean value)](#setClosed-boolean-) | Sets the value indicating whether the path figure is closed. |
| [setFilled(boolean value)](#setFilled-boolean-) | Sets the value indicating whether the path figure is used in computing the area of the containing path geometry. |
| [setStartPoint(Point2D value)](#setStartPoint-java.awt.geom.Point2D-) | Sets the starting point for the first segment of the path figure. |
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
### deepClone() {#deepClone--}
```
public XpsPathFigure deepClone()
```


Clones this path figure.

**Returns:**
[XpsPathFigure](../../com.aspose.xps/xpspathfigure) - Clone of this path figure.
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
### getSegments() {#getSegments--}
```
public List<XpsPathSegment> getSegments()
```


Return the list of child path segments.

**Returns:**
java.util.List<com.aspose.xps.XpsPathSegment> - The list of child path segments.
### getStartPoint() {#getStartPoint--}
```
public Point2D getStartPoint()
```


Returns the starting point for the first segment of the path figure.

**Returns:**
java.awt.geom.Point2D - The starting point for the first segment of the path figure.
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
### isClosed() {#isClosed--}
```
public boolean isClosed()
```


Returns the value indicating whether the path figure is closed.

**Returns:**
boolean - The value indicating whether the path figure is closed.
### isFilled() {#isFilled--}
```
public boolean isFilled()
```


Returns the value indicating whether the path figure is used in computing the area of the containing path geometry.

**Returns:**
boolean - The value indicating whether the path figure is used in computing the area of the containing path geometry.
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
### setClosed(boolean value) {#setClosed-boolean-}
```
public void setClosed(boolean value)
```


Sets the value indicating whether the path figure is closed.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value indicating whether the path figure is closed. |

### setFilled(boolean value) {#setFilled-boolean-}
```
public void setFilled(boolean value)
```


Sets the value indicating whether the path figure is used in computing the area of the containing path geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | The value indicating whether the path figure is used in computing the area of the containing path geometry. |

### setStartPoint(Point2D value) {#setStartPoint-java.awt.geom.Point2D-}
```
public void setStartPoint(Point2D value)
```


Sets the starting point for the first segment of the path figure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.awt.geom.Point2D | The starting point for the first segment of the path figure. |

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

