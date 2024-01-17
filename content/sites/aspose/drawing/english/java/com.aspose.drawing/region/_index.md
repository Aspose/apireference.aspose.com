---
title: Region
second_title: Aspose.Drawing for Java API Reference
description: Describes the interior of a graphics shape composed of rectangles and paths.
type: docs
weight: 39
url: /java/com.aspose.drawing/region/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class Region implements System.IDisposable
```

Describes the interior of a graphics shape composed of rectangles and paths. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [Region()](#Region--) | Initializes a new instance of the [Region](../../com.aspose.drawing/region) class. |
| [Region(RectangleF rect)](#Region-com.aspose.drawing.RectangleF-) | Initializes a new instance of the [Region](../../com.aspose.drawing/region) class from the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [Region(Rectangle rect)](#Region-com.aspose.drawing.Rectangle-) | Initializes a new instance of the [Region](../../com.aspose.drawing/region) class from the specified [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [Region(GraphicsPath path)](#Region-com.aspose.drawing.drawing2d.GraphicsPath-) | Initializes a new instance of the [Region](../../com.aspose.drawing/region) class with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [Region(RegionData rgnData)](#Region-com.aspose.drawing.drawing2d.RegionData-) | Initializes a new instance of the [Region](../../com.aspose.drawing/region) class from the specified data. |
## Methods

| Method | Description |
| --- | --- |
| [dispose()](#dispose--) | Releases all resources used by this [Region](../../com.aspose.drawing/region). |
| [equals(Region region, Graphics g)](#equals-com.aspose.drawing.Region-com.aspose.drawing.Graphics-) | Tests whether the specified [Region](../../com.aspose.drawing/region) is identical to this [Region](../../com.aspose.drawing/region) on the specified drawing surface. |
| [deepClone()](#deepClone--) | Creates an exact copy of this [Region](../../com.aspose.drawing/region). |
| [makeInfinite()](#makeInfinite--) | Initializes this [Region](../../com.aspose.drawing/region) object to an infinite interior. |
| [makeEmpty()](#makeEmpty--) | Initializes this [Region](../../com.aspose.drawing/region) to an empty interior. |
| [intersect(RectangleF rect)](#intersect-com.aspose.drawing.RectangleF-) | Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [intersect(Rectangle rect)](#intersect-com.aspose.drawing.Rectangle-) | Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [intersect(GraphicsPath path)](#intersect-com.aspose.drawing.drawing2d.GraphicsPath-) | Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [intersect(Region region)](#intersect-com.aspose.drawing.Region-) | Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [Region](../../com.aspose.drawing/region). |
| [union(RectangleF rect)](#union-com.aspose.drawing.RectangleF-) | Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [union(Rectangle rect)](#union-com.aspose.drawing.Rectangle-) | Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [union(GraphicsPath path)](#union-com.aspose.drawing.drawing2d.GraphicsPath-) | Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [union(Region region)](#union-com.aspose.drawing.Region-) | Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [Region](../../com.aspose.drawing/region). |
| [getRegionData()](#getRegionData--) | Returns a [RegionData](../../com.aspose.drawing.drawing2d/regiondata) that represents the information that describes this [Region](../../com.aspose.drawing/region). |
| [xor(RectangleF rect)](#xor-com.aspose.drawing.RectangleF-) | Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [xor(Rectangle rect)](#xor-com.aspose.drawing.Rectangle-) | Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [xor(GraphicsPath path)](#xor-com.aspose.drawing.drawing2d.GraphicsPath-) | Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [xor(Region region)](#xor-com.aspose.drawing.Region-) | Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [Region](../../com.aspose.drawing/region). |
| [exclude(RectangleF rect)](#exclude-com.aspose.drawing.RectangleF-) | Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure. |
| [exclude(Rectangle rect)](#exclude-com.aspose.drawing.Rectangle-) | Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [Rectangle](../../com.aspose.drawing/rectangle) structure. |
| [exclude(GraphicsPath path)](#exclude-com.aspose.drawing.drawing2d.GraphicsPath-) | Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath). |
| [exclude(Region region)](#exclude-com.aspose.drawing.Region-) | Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [Region](../../com.aspose.drawing/region). |
| [complement(RectangleF rect)](#complement-com.aspose.drawing.RectangleF-) | Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure that does not intersect with this [Region](../../com.aspose.drawing/region). |
| [complement(Rectangle rect)](#complement-com.aspose.drawing.Rectangle-) | Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [Rectangle](../../com.aspose.drawing/rectangle) structure that does not intersect with this [Region](../../com.aspose.drawing/region). |
| [complement(GraphicsPath path)](#complement-com.aspose.drawing.drawing2d.GraphicsPath-) | Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) that does not intersect with this [Region](../../com.aspose.drawing/region). |
| [complement(Region region)](#complement-com.aspose.drawing.Region-) | Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [Region](../../com.aspose.drawing/region) that does not intersect with this [Region](../../com.aspose.drawing/region). |
| [translate(float dx, float dy)](#translate-float-float-) | Offsets the coordinates of this [Region](../../com.aspose.drawing/region) by the specified amount. |
| [translate(int dx, int dy)](#translate-int-int-) | Offsets the coordinates of this [Region](../../com.aspose.drawing/region) by the specified amount. |
| [transform(Matrix matrix)](#transform-com.aspose.drawing.drawing2d.Matrix-) | Transforms this [Region](../../com.aspose.drawing/region) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix). |
| [getBounds(Graphics g)](#getBounds-com.aspose.drawing.Graphics-) | Gets a [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents a rectangle that bounds this [Region](../../com.aspose.drawing/region) on the drawing surface of a [Graphics](../../com.aspose.drawing/graphics) object. |
| [getRegionScans(Matrix matrix)](#getRegionScans-com.aspose.drawing.drawing2d.Matrix-) | Returns an array of [RectangleF](../../com.aspose.drawing/rectanglef) structures that approximate this [Region](../../com.aspose.drawing/region) after the specified matrix transformation is applied. |
| [isEmpty(Graphics g)](#isEmpty-com.aspose.drawing.Graphics-) | Tests whether this [Region](../../com.aspose.drawing/region) has an empty interior on the specified drawing surface. |
| [isInfinite(Graphics g)](#isInfinite-com.aspose.drawing.Graphics-) | Tests whether this [Region](../../com.aspose.drawing/region) has an infinite interior on the specified drawing surface. |
| [isVisible(float x, float y)](#isVisible-float-float-) | Tests whether the specified point is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(PointF point)](#isVisible-com.aspose.drawing.PointF-) | Tests whether the specified [PointF](../../com.aspose.drawing/pointf) structure is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(float x, float y, Graphics g)](#isVisible-float-float-com.aspose.drawing.Graphics-) | Tests whether the specified point is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(PointF point, Graphics g)](#isVisible-com.aspose.drawing.PointF-com.aspose.drawing.Graphics-) | Tests whether the specified [PointF](../../com.aspose.drawing/pointf) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(float x, float y, float width, float height)](#isVisible-float-float-float-float-) | Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(RectangleF rect)](#isVisible-com.aspose.drawing.RectangleF-) | Tests whether any portion of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(float x, float y, float width, float height, Graphics g)](#isVisible-float-float-float-float-com.aspose.drawing.Graphics-) | Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(RectangleF rect, Graphics g)](#isVisible-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics-) | Tests whether any portion of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(int x, int y, Graphics g)](#isVisible-int-int-com.aspose.drawing.Graphics-) | Tests whether the specified point is contained within this [Region](../../com.aspose.drawing/region) object when drawn using the specified [Graphics](../../com.aspose.drawing/graphics) object. |
| [isVisible(Point point)](#isVisible-com.aspose.drawing.Point-) | Tests whether the specified [Point](../../com.aspose.drawing/point) structure is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(Point point, Graphics g)](#isVisible-com.aspose.drawing.Point-com.aspose.drawing.Graphics-) | Tests whether the specified [Point](../../com.aspose.drawing/point) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(int x, int y, int width, int height)](#isVisible-int-int-int-int-) | Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(Rectangle rect)](#isVisible-com.aspose.drawing.Rectangle-) | Tests whether any portion of the specified [Rectangle](../../com.aspose.drawing/rectangle) structure is contained within this [Region](../../com.aspose.drawing/region). |
| [isVisible(int x, int y, int width, int height, Graphics g)](#isVisible-int-int-int-int-com.aspose.drawing.Graphics-) | Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
| [isVisible(Rectangle rect, Graphics g)](#isVisible-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics-) | Tests whether any portion of the specified [Rectangle](../../com.aspose.drawing/rectangle) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics). |
### Region() {#Region--}
```
public Region()
```


Initializes a new instance of the [Region](../../com.aspose.drawing/region) class.

### Region(RectangleF rect) {#Region-com.aspose.drawing.RectangleF-}
```
public Region(RectangleF rect)
```


Initializes a new instance of the [Region](../../com.aspose.drawing/region) class from the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | A [RectangleF](../../com.aspose.drawing/rectanglef) structure that defines the interior of the new [Region](../../com.aspose.drawing/region). |

### Region(Rectangle rect) {#Region-com.aspose.drawing.Rectangle-}
```
public Region(Rectangle rect)
```


Initializes a new instance of the [Region](../../com.aspose.drawing/region) class from the specified [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | A [Rectangle](../../com.aspose.drawing/rectangle) structure that defines the interior of the new [Region](../../com.aspose.drawing/region). |

### Region(GraphicsPath path) {#Region-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public Region(GraphicsPath path)
```


Initializes a new instance of the [Region](../../com.aspose.drawing/region) class with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | A [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) that defines the new [Region](../../com.aspose.drawing/region). |

### Region(RegionData rgnData) {#Region-com.aspose.drawing.drawing2d.RegionData-}
```
public Region(RegionData rgnData)
```


Initializes a new instance of the [Region](../../com.aspose.drawing/region) class from the specified data.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rgnData | [RegionData](../../com.aspose.drawing.drawing2d/regiondata) | A [RegionData](../../com.aspose.drawing.drawing2d/regiondata) that defines the interior of the new [Region](../../com.aspose.drawing/region). |

### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this [Region](../../com.aspose.drawing/region).

### equals(Region region, Graphics g) {#equals-com.aspose.drawing.Region-com.aspose.drawing.Graphics-}
```
public boolean equals(Region region, Graphics g)
```


Tests whether the specified [Region](../../com.aspose.drawing/region) is identical to this [Region](../../com.aspose.drawing/region) on the specified drawing surface.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | The [Region](../../com.aspose.drawing/region) to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a drawing surface. |

**Returns:**
boolean - true if the interior of region is identical to the interior of this region when the transformation associated with the `g` parameter is applied; otherwise, false.
### deepClone() {#deepClone--}
```
public Region deepClone()
```


Creates an exact copy of this [Region](../../com.aspose.drawing/region).

**Returns:**
[Region](../../com.aspose.drawing/region) - The [Region](../../com.aspose.drawing/region) that this method creates.
### makeInfinite() {#makeInfinite--}
```
public void makeInfinite()
```


Initializes this [Region](../../com.aspose.drawing/region) object to an infinite interior.

### makeEmpty() {#makeEmpty--}
```
public void makeEmpty()
```


Initializes this [Region](../../com.aspose.drawing/region) to an empty interior.

### intersect(RectangleF rect) {#intersect-com.aspose.drawing.RectangleF-}
```
public void intersect(RectangleF rect)
```


Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to intersect with this [Region](../../com.aspose.drawing/region). |

### intersect(Rectangle rect) {#intersect-com.aspose.drawing.Rectangle-}
```
public void intersect(Rectangle rect)
```


Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to intersect with this [Region](../../com.aspose.drawing/region). |

### intersect(GraphicsPath path) {#intersect-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public void intersect(GraphicsPath path)
```


Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to intersect with this [Region](../../com.aspose.drawing/region). |

### intersect(Region region) {#intersect-com.aspose.drawing.Region-}
```
public void intersect(Region region)
```


Updates this [Region](../../com.aspose.drawing/region) to the intersection of itself with the specified [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | The [Region](../../com.aspose.drawing/region) to intersect with this [Region](../../com.aspose.drawing/region). |

### union(RectangleF rect) {#union-com.aspose.drawing.RectangleF-}
```
public void union(RectangleF rect)
```


Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to unite with this [Region](../../com.aspose.drawing/region).

--------------------

Union leaves infinite region as infinite. |

### union(Rectangle rect) {#union-com.aspose.drawing.Rectangle-}
```
public void union(Rectangle rect)
```


Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to unite with this [Region](../../com.aspose.drawing/region).

--------------------

Union leaves infinite region as infinite. |

### union(GraphicsPath path) {#union-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public void union(GraphicsPath path)
```


Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to unite with this [Region](../../com.aspose.drawing/region).

--------------------

Union leaves infinite region as infinite. |

### union(Region region) {#union-com.aspose.drawing.Region-}
```
public void union(Region region)
```


Updates this [Region](../../com.aspose.drawing/region) to the union of itself and the specified [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | The [Region](../../com.aspose.drawing/region) to unite with this [Region](../../com.aspose.drawing/region).

--------------------

Union leaves infinite region as infinite. |

### getRegionData() {#getRegionData--}
```
public RegionData getRegionData()
```


Returns a [RegionData](../../com.aspose.drawing.drawing2d/regiondata) that represents the information that describes this [Region](../../com.aspose.drawing/region).

**Returns:**
[RegionData](../../com.aspose.drawing.drawing2d/regiondata) - A [RegionData](../../com.aspose.drawing.drawing2d/regiondata) that represents the information that describes this [Region](../../com.aspose.drawing/region).
### xor(RectangleF rect) {#xor-com.aspose.drawing.RectangleF-}
```
public void xor(RectangleF rect)
```


Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to `M:Region.Xor(drawing2d.GraphicsPath)` with this [Region](../../com.aspose.drawing/region). |

### xor(Rectangle rect) {#xor-com.aspose.drawing.Rectangle-}
```
public void xor(Rectangle rect)
```


Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to `M:Region.Xor(Rectangle)` with this [Region](../../com.aspose.drawing/region). |

### xor(GraphicsPath path) {#xor-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public void xor(GraphicsPath path)
```


Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to `M:Region.Xor(GraphicsPath)` with this [Region](../../com.aspose.drawing/region). |

### xor(Region region) {#xor-com.aspose.drawing.Region-}
```
public void xor(Region region)
```


Updates this [Region](../../com.aspose.drawing/region) to the union minus the intersection of itself with the specified [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | The [Region](../../com.aspose.drawing/region) to `M:Region.Xor(Region)` with this [Region](../../com.aspose.drawing/region). |

### exclude(RectangleF rect) {#exclude-com.aspose.drawing.RectangleF-}
```
public void exclude(RectangleF rect)
```


Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to exclude from this [Region](../../com.aspose.drawing/region). |

### exclude(Rectangle rect) {#exclude-com.aspose.drawing.Rectangle-}
```
public void exclude(Rectangle rect)
```


Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [Rectangle](../../com.aspose.drawing/rectangle) structure.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to exclude from this [Region](../../com.aspose.drawing/region). |

### exclude(GraphicsPath path) {#exclude-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public void exclude(GraphicsPath path)
```


Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to exclude from this [Region](../../com.aspose.drawing/region). |

### exclude(Region region) {#exclude-com.aspose.drawing.Region-}
```
public void exclude(Region region)
```


Updates this [Region](../../com.aspose.drawing/region) to contain only the portion of its interior that does not intersect with the specified [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | The [Region](../../com.aspose.drawing/region) to exclude from this [Region](../../com.aspose.drawing/region). |

### complement(RectangleF rect) {#complement-com.aspose.drawing.RectangleF-}
```
public void complement(RectangleF rect)
```


Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure that does not intersect with this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to complement this [Region](../../com.aspose.drawing/region). |

### complement(Rectangle rect) {#complement-com.aspose.drawing.Rectangle-}
```
public void complement(Rectangle rect)
```


Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [Rectangle](../../com.aspose.drawing/rectangle) structure that does not intersect with this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to complement this [Region](../../com.aspose.drawing/region). |

### complement(GraphicsPath path) {#complement-com.aspose.drawing.drawing2d.GraphicsPath-}
```
public void complement(GraphicsPath path)
```


Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) that does not intersect with this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| path | [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) | The [GraphicsPath](../../com.aspose.drawing.drawing2d/graphicspath) to complement this [Region](../../com.aspose.drawing/region). |

### complement(Region region) {#complement-com.aspose.drawing.Region-}
```
public void complement(Region region)
```


Updates this [Region](../../com.aspose.drawing/region) to contain the portion of the specified [Region](../../com.aspose.drawing/region) that does not intersect with this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| region | [Region](../../com.aspose.drawing/region) | The [Region](../../com.aspose.drawing/region) object to complement this [Region](../../com.aspose.drawing/region) object. |

### translate(float dx, float dy) {#translate-float-float-}
```
public void translate(float dx, float dy)
```


Offsets the coordinates of this [Region](../../com.aspose.drawing/region) by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | float | The amount to offset this [Region](../../com.aspose.drawing/region) horizontally. |
| dy | float | The amount to offset this [Region](../../com.aspose.drawing/region) vertically. |

### translate(int dx, int dy) {#translate-int-int-}
```
public void translate(int dx, int dy)
```


Offsets the coordinates of this [Region](../../com.aspose.drawing/region) by the specified amount.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dx | int | The amount to offset this [Region](../../com.aspose.drawing/region) horizontally |
| dy | int | The amount to offset this [Region](../../com.aspose.drawing/region) vertically. |

### transform(Matrix matrix) {#transform-com.aspose.drawing.drawing2d.Matrix-}
```
public void transform(Matrix matrix)
```


Transforms this [Region](../../com.aspose.drawing/region) by the specified [Matrix](../../com.aspose.drawing.drawing2d/matrix).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | The [Matrix](../../com.aspose.drawing.drawing2d/matrix) by which to transform this [Region](../../com.aspose.drawing/region). |

### getBounds(Graphics g) {#getBounds-com.aspose.drawing.Graphics-}
```
public RectangleF getBounds(Graphics g)
```


Gets a [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents a rectangle that bounds this [Region](../../com.aspose.drawing/region) on the drawing surface of a [Graphics](../../com.aspose.drawing/graphics) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Graphics](../../com.aspose.drawing/graphics) | The [Graphics](../../com.aspose.drawing/graphics) on which this [Region](../../com.aspose.drawing/region) is drawn. |

**Returns:**
[RectangleF](../../com.aspose.drawing/rectanglef) - A [RectangleF](../../com.aspose.drawing/rectanglef) structure that represents the bounding rectangle for this [Region](../../com.aspose.drawing/region) on the specified drawing surface.
### getRegionScans(Matrix matrix) {#getRegionScans-com.aspose.drawing.drawing2d.Matrix-}
```
public RectangleF[] getRegionScans(Matrix matrix)
```


Returns an array of [RectangleF](../../com.aspose.drawing/rectanglef) structures that approximate this [Region](../../com.aspose.drawing/region) after the specified matrix transformation is applied.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| matrix | [Matrix](../../com.aspose.drawing.drawing2d/matrix) | A [Matrix](../../com.aspose.drawing.drawing2d/matrix) that represents a geometric transformation to apply to the region. |

**Returns:**
com.aspose.drawing.RectangleF[] - An array of [RectangleF](../../com.aspose.drawing/rectanglef) structures that approximate this [Region](../../com.aspose.drawing/region) after the specified matrix transformation is applied.
### isEmpty(Graphics g) {#isEmpty-com.aspose.drawing.Graphics-}
```
public boolean isEmpty(Graphics g)
```


Tests whether this [Region](../../com.aspose.drawing/region) has an empty interior on the specified drawing surface.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a drawing surface. |

**Returns:**
boolean - true if the interior of this [Region](../../com.aspose.drawing/region) is empty when the transformation associated with `g` is applied; otherwise, false.
### isInfinite(Graphics g) {#isInfinite-com.aspose.drawing.Graphics-}
```
public boolean isInfinite(Graphics g)
```


Tests whether this [Region](../../com.aspose.drawing/region) has an infinite interior on the specified drawing surface.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a drawing surface. |

**Returns:**
boolean - true if the interior of this [Region](../../com.aspose.drawing/region) is infinite when the transformation associated with `g` is applied; otherwise, false.
### isVisible(float x, float y) {#isVisible-float-float-}
```
public boolean isVisible(float x, float y)
```


Tests whether the specified point is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the point to test. |
| y | float | The y-coordinate of the point to test. |

**Returns:**
boolean - true when the specified point is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(PointF point) {#isVisible-com.aspose.drawing.PointF-}
```
public boolean isVisible(PointF point)
```


Tests whether the specified [PointF](../../com.aspose.drawing/pointf) structure is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) structure to test. |

**Returns:**
boolean - true when `point` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(float x, float y, Graphics g) {#isVisible-float-float-com.aspose.drawing.Graphics-}
```
public boolean isVisible(float x, float y, Graphics g)
```


Tests whether the specified point is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the point to test. |
| y | float | The y-coordinate of the point to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when the specified point is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(PointF point, Graphics g) {#isVisible-com.aspose.drawing.PointF-com.aspose.drawing.Graphics-}
```
public boolean isVisible(PointF point, Graphics g)
```


Tests whether the specified [PointF](../../com.aspose.drawing/pointf) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [PointF](../../com.aspose.drawing/pointf) | The [PointF](../../com.aspose.drawing/pointf) structure to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when `point` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(float x, float y, float width, float height) {#isVisible-float-float-float-float-}
```
public boolean isVisible(float x, float y, float width, float height)
```


Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the upper-left corner of the rectangle to test. |
| y | float | The y-coordinate of the upper-left corner of the rectangle to test. |
| width | float | The width of the rectangle to test. |
| height | float | The height of the rectangle to test. |

**Returns:**
boolean - true when any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region) object; otherwise, false.
### isVisible(RectangleF rect) {#isVisible-com.aspose.drawing.RectangleF-}
```
public boolean isVisible(RectangleF rect)
```


Tests whether any portion of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to test. |

**Returns:**
boolean - true when any portion of `rect` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(float x, float y, float width, float height, Graphics g) {#isVisible-float-float-float-float-com.aspose.drawing.Graphics-}
```
public boolean isVisible(float x, float y, float width, float height, Graphics g)
```


Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | float | The x-coordinate of the upper-left corner of the rectangle to test. |
| y | float | The y-coordinate of the upper-left corner of the rectangle to test. |
| width | float | The width of the rectangle to test. |
| height | float | The height of the rectangle to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(RectangleF rect, Graphics g) {#isVisible-com.aspose.drawing.RectangleF-com.aspose.drawing.Graphics-}
```
public boolean isVisible(RectangleF rect, Graphics g)
```


Tests whether any portion of the specified [RectangleF](../../com.aspose.drawing/rectanglef) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [RectangleF](../../com.aspose.drawing/rectanglef) | The [RectangleF](../../com.aspose.drawing/rectanglef) structure to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when `rect` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(int x, int y, Graphics g) {#isVisible-int-int-com.aspose.drawing.Graphics-}
```
public boolean isVisible(int x, int y, Graphics g)
```


Tests whether the specified point is contained within this [Region](../../com.aspose.drawing/region) object when drawn using the specified [Graphics](../../com.aspose.drawing/graphics) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the point to test. |
| y | int | The y-coordinate of the point to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when the specified point is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(Point point) {#isVisible-com.aspose.drawing.Point-}
```
public boolean isVisible(Point point)
```


Tests whether the specified [Point](../../com.aspose.drawing/point) structure is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) structure to test. |

**Returns:**
boolean - true when `point` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(Point point, Graphics g) {#isVisible-com.aspose.drawing.Point-com.aspose.drawing.Graphics-}
```
public boolean isVisible(Point point, Graphics g)
```


Tests whether the specified [Point](../../com.aspose.drawing/point) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| point | [Point](../../com.aspose.drawing/point) | The [Point](../../com.aspose.drawing/point) structure to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when `point` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(int x, int y, int width, int height) {#isVisible-int-int-int-int-}
```
public boolean isVisible(int x, int y, int width, int height)
```


Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the upper-left corner of the rectangle to test. |
| y | int | The y-coordinate of the upper-left corner of the rectangle to test. |
| width | int | The width of the rectangle to test. |
| height | int | The height of the rectangle to test. |

**Returns:**
boolean - true when any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(Rectangle rect) {#isVisible-com.aspose.drawing.Rectangle-}
```
public boolean isVisible(Rectangle rect)
```


Tests whether any portion of the specified [Rectangle](../../com.aspose.drawing/rectangle) structure is contained within this [Region](../../com.aspose.drawing/region).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to test. |

**Returns:**
boolean - This method returns true when any portion of `rect` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(int x, int y, int width, int height, Graphics g) {#isVisible-int-int-int-int-com.aspose.drawing.Graphics-}
```
public boolean isVisible(int x, int y, int width, int height, Graphics g)
```


Tests whether any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| x | int | The x-coordinate of the upper-left corner of the rectangle to test. |
| y | int | The y-coordinate of the upper-left corner of the rectangle to test. |
| width | int | The width of the rectangle to test. |
| height | int | The height of the rectangle to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when any portion of the specified rectangle is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
### isVisible(Rectangle rect, Graphics g) {#isVisible-com.aspose.drawing.Rectangle-com.aspose.drawing.Graphics-}
```
public boolean isVisible(Rectangle rect, Graphics g)
```


Tests whether any portion of the specified [Rectangle](../../com.aspose.drawing/rectangle) structure is contained within this [Region](../../com.aspose.drawing/region) when drawn using the specified [Graphics](../../com.aspose.drawing/graphics).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rect | [Rectangle](../../com.aspose.drawing/rectangle) | The [Rectangle](../../com.aspose.drawing/rectangle) structure to test. |
| g | [Graphics](../../com.aspose.drawing/graphics) | A [Graphics](../../com.aspose.drawing/graphics) that represents a graphics context. |

**Returns:**
boolean - true when any portion of the `rect` is contained within this [Region](../../com.aspose.drawing/region); otherwise, false.
