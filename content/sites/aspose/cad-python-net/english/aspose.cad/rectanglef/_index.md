---
title: RectangleF class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 490
url: /aspose.cad/rectanglef/
is_root: false
---

## RectangleF class

Stores a set of four floating-point numbers that represent the location and size of a rectangle.



The RectangleF type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad/rectanglef/__init__/#float-float-float-float) | Initializes a new instance of the [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure with the specified location and size. |
| [__init__](/cad/python-net/aspose.cad/rectanglef/__init__/#aspose.cad.PointF-aspose.cad.SizeF) | Initializes a new instance of the [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure with the specified location and size. |
| [__init__](/cad/python-net/aspose.cad/rectanglef/__init__/#) | Constructs a new instance of RectangleF |


### Properties
| Property | Description |
| :- | :- |
| [empty](/cad/python-net/aspose.cad/rectanglef/empty) | Gets a new instance of the [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure that has [`RectangleF.x`](/cad/python-net/aspose.cad/rectanglef#x), [`RectangleF.y`](/cad/python-net/aspose.cad/rectanglef#y), [`RectangleF.width`](/cad/python-net/aspose.cad/rectanglef#width) and [`RectangleF.height`](/cad/python-net/aspose.cad/rectanglef#height) values set to zero. |
| [location](/cad/python-net/aspose.cad/rectanglef/location) | Gets or sets the coordinates of the upper-left corner of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [size](/cad/python-net/aspose.cad/rectanglef/size) | Gets or sets the size of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef). |
| [x](/cad/python-net/aspose.cad/rectanglef/x) | Gets or sets the x-coordinate of the upper-left corner of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [y](/cad/python-net/aspose.cad/rectanglef/y) | Gets or sets the y-coordinate of the upper-left corner of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [width](/cad/python-net/aspose.cad/rectanglef/width) | Gets or sets the width of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [height](/cad/python-net/aspose.cad/rectanglef/height) | Gets or sets the height of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [left](/cad/python-net/aspose.cad/rectanglef/left) | Gets or sets the x-coordinate of the left edge of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [top](/cad/python-net/aspose.cad/rectanglef/top) | Gets or sets the y-coordinate of the top edge of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [right](/cad/python-net/aspose.cad/rectanglef/right) | Gets or sets the x-coordinate that is the sum of [`RectangleF.x`](/cad/python-net/aspose.cad/rectanglef#x) and [`RectangleF.width`](/cad/python-net/aspose.cad/rectanglef#width) of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [bottom](/cad/python-net/aspose.cad/rectanglef/bottom) | Gets or sets the y-coordinate that is the sum of [`RectangleF.y`](/cad/python-net/aspose.cad/rectanglef#y) and [`RectangleF.height`](/cad/python-net/aspose.cad/rectanglef#height) of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [is_empty](/cad/python-net/aspose.cad/rectanglef/is_empty) | Gets a value indicating whether the [`RectangleF.width`](/cad/python-net/aspose.cad/rectanglef#width) or [`RectangleF.height`](/cad/python-net/aspose.cad/rectanglef#height) property of this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) has a value of zero. |


### Methods
| Method | Description |
| :- | :- |
| [inflate](/cad/python-net/aspose.cad/rectanglef/inflate/#aspose.cad.RectangleF-float-float) | Creates and returns an inflated copy of the specified [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. The copy is inflated by the specified amount. The original rectangle remains unmodified. |
| [inflate](/cad/python-net/aspose.cad/rectanglef/inflate/#float-float) | Inflates this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure by the specified amount. |
| [inflate](/cad/python-net/aspose.cad/rectanglef/inflate/#aspose.cad.SizeF) | Inflates this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) by the specified amount. |
| [intersect](/cad/python-net/aspose.cad/rectanglef/intersect/#aspose.cad.RectangleF-aspose.cad.RectangleF) | Returns a [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure that represents the intersection of two rectangles. If there is no intersection, and empty [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) is returned. |
| [intersect](/cad/python-net/aspose.cad/rectanglef/intersect/#aspose.cad.RectangleF) | Replaces this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure with the intersection of itself and the specified [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [contains](/cad/python-net/aspose.cad/rectanglef/contains/#float-float) | Determines if the specified point is contained within this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [contains](/cad/python-net/aspose.cad/rectanglef/contains/#aspose.cad.PointF) | Determines if the specified point is contained within this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [contains](/cad/python-net/aspose.cad/rectanglef/contains/#aspose.cad.RectangleF) | Determines if the rectangular region represented by `rect` is entirely contained within this [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure. |
| [offset](/cad/python-net/aspose.cad/rectanglef/offset/#aspose.cad.PointF) | Adjusts the location of this rectangle by the specified amount. |
| [offset](/cad/python-net/aspose.cad/rectanglef/offset/#float-float) | Adjusts the location of this rectangle by the specified amount. |
| [from_points](/cad/python-net/aspose.cad/rectanglef/from_points/#aspose.cad.PointF-aspose.cad.PointF) | Creates a new [`Rectangle`](/cad/python-net/aspose.cad/rectangle) from two points specified. Two verticles of the created [`Rectangle`](/cad/python-net/aspose.cad/rectangle) will be equal to the passed `point1` and `point2`. These would be typically the opposite vertices. |
| [union](/cad/python-net/aspose.cad/rectanglef/union/#aspose.cad.RectangleF-aspose.cad.RectangleF) | Creates the smallest possible third rectangle that can contain both of two rectangles that form a union. |
| [from_left_top_right_bottom](/cad/python-net/aspose.cad/rectanglef/from_left_top_right_bottom/#float-float-float-float) | Creates a [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure with upper-left corner and lower-right corner at the specified locations. |
| [normalize](/cad/python-net/aspose.cad/rectanglef/normalize/#) | Normalizes the rectangle by making it's width and height positive, left less than right and top less than bottom. |
| [intersects_with](/cad/python-net/aspose.cad/rectanglef/intersects_with/#aspose.cad.RectangleF) | Determines if this rectangle intersects with `rect`. |



### See Also
* module [`aspose.cad`](..)
* class [`Rectangle`](/cad/python-net/aspose.cad/rectangle)
* class [`RectangleF`](/cad/python-net/aspose.cad/rectanglef)
