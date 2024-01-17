---
title: GraphicsPathIterator
second_title: Aspose.Drawing for Java API Reference
description: Provides the ability to iterate through subpaths in a  and test the types of shapes contained in each subpath.
type: docs
weight: 24
url: /java/com.aspose.drawing.drawing2d/graphicspathiterator/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class GraphicsPathIterator implements System.IDisposable
```

Provides the ability to iterate through subpaths in a [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) and test the types of shapes contained in each subpath. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [GraphicsPathIterator(GraphicsPath path)](#GraphicsPathIterator-com.aspose.drawing.drawing2d.GraphicsPath-) | Initializes a new instance of the [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) class. |
## Methods

| Method | Description |
| --- | --- |
| [getCount()](#getCount--) | Gets the number of points in the path. |
| [getSubpathCount()](#getSubpathCount--) | Gets the number of subpaths in the path. |
| [dispose()](#dispose--) | Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources. |
| [copyData(PointF[][] points, byte[][] types, int startIndex, int endIndex)](#copyData-com.aspose.drawing.PointF-----byte-----int-int-) | Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) into the two specified arrays. |
| [enumerate(PointF[][] points, byte[][] types)](#enumerate-com.aspose.drawing.PointF-----byte-----) | Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) into the two specified arrays. |
| [hasCurve()](#hasCurve--) | Indicates whether the path associated with this [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) contains a curve. |
| [nextMarker(int[] startIndex, int[] endIndex)](#nextMarker-int---int---) | Increments the [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) to the next marker in the path and returns the start and stop indexes by way of the [out] parameters. |
| [nextMarker(GraphicsPath path)](#nextMarker-com.aspose.drawing.drawing2d.GraphicsPath-) | This [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) object has a [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object associated with it. |
| [nextPathType(byte[] pathType, int[] startIndex, int[] endIndex)](#nextPathType-byte---int---int---) | Gets the starting index and the ending index of the next group of data points that all have the same type. |
| [nextSubpath(int[] startIndex, int[] endIndex, boolean[] isClosed)](#nextSubpath-int---int---boolean---) | Moves the [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) to the next subpath in the path. |
| [nextSubpath(GraphicsPath path, boolean[] isClosed)](#nextSubpath-com.aspose.drawing.drawing2d.GraphicsPath-boolean---) | Gets the next figure (subpath) from the associated path of this [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator). |
| [rewind()](#rewind--) | Rewinds this [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) to the beginning of its associated path. |
### GraphicsPathIterator(GraphicsPath path) {#GraphicsPathIterator-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public GraphicsPathIterator(GraphicsPath path)
```


Initializes a new instance of the [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object for which this helper class is to be initialized. |

### getCount() {#getCount--}
```
public int getCount()
```


Gets the number of points in the path.

**Returns:**
int - the number of points in the path.
### getSubpathCount() {#getSubpathCount--}
```
public int getSubpathCount()
```


Gets the number of subpaths in the path.

**Returns:**
int - the number of subpaths in the path.
### dispose() {#dispose--}
```
public void dispose()
```


Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.

### copyData(PointF[][] points, byte[][] types, int startIndex, int endIndex) {#copyData-com.aspose.drawing.PointF-----byte-----int-int-}
```
public int copyData(PointF[][] points, byte[][] types, int startIndex, int endIndex)
```


Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) into the two specified arrays.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Upon return, contains an array of System.Drawing.PointF structures that represents the points in the path. |
| types | byte[][] | Upon return, contains an array of bytes that represents the types of points in the path. |
| startIndex | int | Specifies the starting index of the arrays. |
| endIndex | int | Specifies the ending index of the arrays. |

**Returns:**
int - The number of points copied.
### enumerate(PointF[][] points, byte[][] types) {#enumerate-com.aspose.drawing.PointF-----byte-----}
```
public int enumerate(PointF[][] points, byte[][] types)
```


Copies the GraphicsPath.PathPoints property and GraphicsPath.PathTypes property arrays of the associated [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) into the two specified arrays.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| points | [PointF\[\]](../../com.aspose.drawing/pointf) | Upon return, contains an array of System.Drawing.PointF structures that represents the points in the path. |
| types | byte[][] | Upon return, contains an array of bytes that represents the types of points in the path. |

**Returns:**
int - The number of points copied.
### hasCurve() {#hasCurve--}
```
public boolean hasCurve()
```


Indicates whether the path associated with this [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) contains a curve.

**Returns:**
boolean - This method returns true if the current subpath contains a curve; otherwise, false.
### nextMarker(int[] startIndex, int[] endIndex) {#nextMarker-int---int---}
```
public int nextMarker(int[] startIndex, int[] endIndex)
```


Increments the [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) to the next marker in the path and returns the start and stop indexes by way of the [out] parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startIndex | int[] | [out] The integer reference supplied to this parameter receives the index of the point that starts a subpath. |
| endIndex | int[] | [out] The integer reference supplied to this parameter receives the index of the point that ends the subpath to which startIndex points. |

**Returns:**
int - The number of points between this marker and the next.
### nextMarker(GraphicsPath path) {#nextMarker-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public int nextMarker(GraphicsPath path)
```


This [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) object has a [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object associated with it. This method increments the associated [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to the next marker in its path and copies all the points contained between the current marker and the next marker (or end of path) to a second [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object passed in to the parameter.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) object to which the points will be copied. |

**Returns:**
int - The number of points between this marker and the next.
### nextPathType(byte[] pathType, int[] startIndex, int[] endIndex) {#nextPathType-byte---int---int---}
```
public int nextPathType(byte[] pathType, int[] startIndex, int[] endIndex)
```


Gets the starting index and the ending index of the next group of data points that all have the same type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| pathType | byte[] | [out] Receives the point type shared by all points in the group. Possible types can be retrieved from the [PathPointType](../../com.aspose.drawing.drawing2d/pathpointtype) enumeration. |
| startIndex | int[] | [out] Receives the starting index of the group of points. |
| endIndex | int[] | [out] Receives the ending index of the group of points. |

**Returns:**
int - This method returns the number of data points in the group. If there are no more groups in the path, this method returns 0.
### nextSubpath(int[] startIndex, int[] endIndex, boolean[] isClosed) {#nextSubpath-int---int---boolean---}
```
public int nextSubpath(int[] startIndex, int[] endIndex, boolean[] isClosed)
```


Moves the [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) to the next subpath in the path. The start index and end index of the next subpath are contained in the [out] parameters.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| startIndex | int[] | [out] Receives the starting index of the next subpath. |
| endIndex | int[] | [out] Receives the ending index of the next subpath. |
| isClosed | boolean[] | [out] Indicates whether the subpath is closed. |

**Returns:**
int - The number of data points in the retrieved figure (subpath). If there are no more figures to retrieve, zero is returned.
### nextSubpath(GraphicsPath path, boolean[] isClosed) {#nextSubpath-com.aspose.drawing.drawing2d.GraphicsPath-boolean---}
```
public int nextSubpath(GraphicsPath path, boolean[] isClosed)
```


Gets the next figure (subpath) from the associated path of this [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) that is to have its data points set to match the data points of the retrieved figure (subpath) for this iterator. |
| isClosed | boolean[] | [out] Indicates whether the current subpath is closed. It is true if the if the figure is closed, otherwise it is false. |

**Returns:**
int - The number of data points in the retrieved figure (subpath). If there are no more figures to retrieve, zero is returned.
### rewind() {#rewind--}
```
public void rewind()
```


Rewinds this [GraphicsPathIterator](../../com.aspose.drawing.drawing2d/graphicspathiterator) to the beginning of its associated path.

