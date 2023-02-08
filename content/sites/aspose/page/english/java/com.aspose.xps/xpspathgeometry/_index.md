---
title: XpsPathGeometry
second_title: Aspose.Page for Java API Reference
description: Class incapsulating PathGeometry property element features.
type: docs
weight: 41
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
| [getFillRule()](#getFillRule--) | Returns the value specifying how the intersecting areas of geometric shapes are combined to form a region. |
| [setFillRule(XpsFillRule value)](#setFillRule-com.aspose.xps.XpsFillRule-) | Sets the value specifying how the intersecting areas of geometric shapes are combined to form a region. |
| [getTransform()](#getTransform--) | Returns the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [setTransform(XpsMatrix value)](#setTransform-com.aspose.xps.XpsMatrix-) | Sets the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [getPathFigures()](#getPathFigures--) | Returns the list of child path figures. |
| [addSegment(XpsPathSegment segment)](#addSegment-com.aspose.xps.XpsPathSegment-) | Adds a path segment to the list of child segments of the last pah figure. |
| [insertSegment(int index, XpsPathSegment segment)](#insertSegment-int-com.aspose.xps.XpsPathSegment-) | Inserts a path segment to the list of child segments of the last path figure at \`\`\` index \`\`\` position. |
| [removeSegment(XpsPathSegment segment)](#removeSegment-com.aspose.xps.XpsPathSegment-) | Removes a path segment from the list of child segments of the last path figure. |
| [removeSegmentAt(int index)](#removeSegmentAt-int-) | Removes a path segment from the list of child segments of the last path figure at \`\`\` index \`\`\` position. |
| [deepClone()](#deepClone--) | Clones this path geometry. |
### getFillRule() {#getFillRule--}
```
public XpsFillRule getFillRule()
```


Returns the value specifying how the intersecting areas of geometric shapes are combined to form a region.

**Returns:**
[XpsFillRule](../../com.aspose.xps/xpsfillrule) - The value specifying how the intersecting areas of geometric shapes are combined to form a region.
### setFillRule(XpsFillRule value) {#setFillRule-com.aspose.xps.XpsFillRule-}
```
public void setFillRule(XpsFillRule value)
```


Sets the value specifying how the intersecting areas of geometric shapes are combined to form a region.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsFillRule](../../com.aspose.xps/xpsfillrule) | The value specifying how the intersecting areas of geometric shapes are combined to form a region. |

### getTransform() {#getTransform--}
```
public XpsMatrix getTransform()
```


Returns the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - The affine transformation matrix.
### setTransform(XpsMatrix value) {#setTransform-com.aspose.xps.XpsMatrix-}
```
public void setTransform(XpsMatrix value)
```


Sets the affine transformation matrix establishing the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | The affine transformation matrix. |

### getPathFigures() {#getPathFigures--}
```
public List<XpsPathFigure> getPathFigures()
```


Returns the list of child path figures.

**Returns:**
java.util.List<com.aspose.xps.XpsPathFigure> - The list of child path figures.
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
### insertSegment(int index, XpsPathSegment segment) {#insertSegment-int-com.aspose.xps.XpsPathSegment-}
```
public XpsPathSegment insertSegment(int index, XpsPathSegment segment)
```


Inserts a path segment to the list of child segments of the last path figure at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a segment should be inserted. |
| segment | [XpsPathSegment](../../com.aspose.xps/xpspathsegment) | A path segment to be inserted. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Inserted path segment.
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


Removes a path segment from the list of child segments of the last path figure at \`\`\` index \`\`\` position.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Position at which a path segment should be removed. |

**Returns:**
[XpsPathSegment](../../com.aspose.xps/xpspathsegment) - Removed path segment.
### deepClone() {#deepClone--}
```
public XpsPathGeometry deepClone()
```


Clones this path geometry.

**Returns:**
[XpsPathGeometry](../../com.aspose.xps/xpspathgeometry) - Clone of this path geometry.
