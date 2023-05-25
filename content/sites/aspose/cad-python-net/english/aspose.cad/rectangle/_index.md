---
title: Rectangle class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 480
url: /aspose.cad/rectangle/
is_root: false
---

## Rectangle class

Stores a set of four integers that represent the location and size of a rectangle.



The Rectangle type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad/rectangle/__init__/#int-int-int-int) | Initializes a new instance of the [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure with the specified location and size. |
| [__init__](/cad/python-net/aspose.cad/rectangle/__init__/#aspose.cad.Point-aspose.cad.Size) | Initializes a new instance of the [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure with the specified location and size. |
| [__init__](/cad/python-net/aspose.cad/rectangle/__init__/#) | Constructs a new instance of Rectangle |


### Properties
| Property | Description |
| :- | :- |
| [empty](/cad/python-net/aspose.cad/rectangle/empty) | Gets a new instance of the [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure that has [`Rectangle.x`](/cad/python-net/aspose.cad/rectangle#x), [`Rectangle.y`](/cad/python-net/aspose.cad/rectangle#y), [`Rectangle.width`](/cad/python-net/aspose.cad/rectangle#width) and [`Rectangle.height`](/cad/python-net/aspose.cad/rectangle#height) values set to zero. |
| [location](/cad/python-net/aspose.cad/rectangle/location) | Gets or sets the coordinates of the upper-left corner of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [size](/cad/python-net/aspose.cad/rectangle/size) | Gets or sets the size of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle). |
| [x](/cad/python-net/aspose.cad/rectangle/x) | Gets or sets the x-coordinate of the upper-left corner of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [y](/cad/python-net/aspose.cad/rectangle/y) | Gets or sets the y-coordinate of the upper-left corner of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [width](/cad/python-net/aspose.cad/rectangle/width) | Gets or sets the width of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [height](/cad/python-net/aspose.cad/rectangle/height) | Gets or sets the height of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [left](/cad/python-net/aspose.cad/rectangle/left) | Gets or sets the x-coordinate of the left edge of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [top](/cad/python-net/aspose.cad/rectangle/top) | Gets or sets the y-coordinate of the top edge of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [right](/cad/python-net/aspose.cad/rectangle/right) | Gets or sets the x-coordinate that is the sum of [`Rectangle.x`](/cad/python-net/aspose.cad/rectangle#x) and [`Rectangle.width`](/cad/python-net/aspose.cad/rectangle#width) property values of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [bottom](/cad/python-net/aspose.cad/rectangle/bottom) | Gets or sets the y-coordinate that is the sum of the [`Rectangle.y`](/cad/python-net/aspose.cad/rectangle#y) and [`Rectangle.height`](/cad/python-net/aspose.cad/rectangle#height) property values of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [is_empty](/cad/python-net/aspose.cad/rectangle/is_empty) | Gets a value indicating whether all numeric properties of this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) have values of zero. |


### Methods
| Method | Description |
| :- | :- |
| [inflate](/cad/python-net/aspose.cad/rectangle/inflate/#aspose.cad.Rectangle-int-int) | Creates and returns an inflated copy of the specified [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. The copy is inflated by the specified amount. The original [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure remains unmodified. |
| [inflate](/cad/python-net/aspose.cad/rectangle/inflate/#int-int) | Inflates this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) by the specified amount. |
| [inflate](/cad/python-net/aspose.cad/rectangle/inflate/#aspose.cad.Size) | Inflates this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) by the specified amount. |
| [intersect](/cad/python-net/aspose.cad/rectangle/intersect/#aspose.cad.Rectangle-aspose.cad.Rectangle) | Returns a third [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure that represents the intersection of two other [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structures. If there is no intersection, an empty [`Rectangle`](/cad/python-net/aspose.cad/rectangle) is returned. |
| [intersect](/cad/python-net/aspose.cad/rectangle/intersect/#aspose.cad.Rectangle) | Replaces this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) with the intersection of itself and the specified [`Rectangle`](/cad/python-net/aspose.cad/rectangle). |
| [contains](/cad/python-net/aspose.cad/rectangle/contains/#int-int) | Determines if the specified point is contained within this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [contains](/cad/python-net/aspose.cad/rectangle/contains/#aspose.cad.Point) | Determines if the specified point is contained within this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [contains](/cad/python-net/aspose.cad/rectangle/contains/#aspose.cad.Rectangle) | Determines if the rectangular region represented by `rect` is entirely contained within this [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure. |
| [offset](/cad/python-net/aspose.cad/rectangle/offset/#aspose.cad.Point) | Adjusts the location of this rectangle by the specified amount. |
| [offset](/cad/python-net/aspose.cad/rectangle/offset/#int-int) | Adjusts the location of this rectangle by the specified amount. |
| [from_points](/cad/python-net/aspose.cad/rectangle/from_points/#aspose.cad.Point-aspose.cad.Point) | Creates a new [`Rectangle`](/cad/python-net/aspose.cad/rectangle) from two points specified. Two verticales of the created [`Rectangle`](/cad/python-net/aspose.cad/rectangle) will be equal to the passed `point1` and `point2`. These would be typically the opposite vertices. |
| [ceiling](/cad/python-net/aspose.cad/rectangle/ceiling/#aspose.cad.RectangleF) | Converts the specified [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) structure to a [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure by rounding the [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) values to the next higher integer values. |
| [truncate](/cad/python-net/aspose.cad/rectangle/truncate/#aspose.cad.RectangleF) | Converts the specified [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) to a [`Rectangle`](/cad/python-net/aspose.cad/rectangle) by truncating the [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) values. |
| [round](/cad/python-net/aspose.cad/rectangle/round/#aspose.cad.RectangleF) | Converts the specified [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) to a [`Rectangle`](/cad/python-net/aspose.cad/rectangle) by rounding the [`RectangleF`](/cad/python-net/aspose.cad/rectanglef) values to the nearest integer values. |
| [union](/cad/python-net/aspose.cad/rectangle/union/#aspose.cad.Rectangle-aspose.cad.Rectangle) | Gets a [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure that contains the union of two [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structures. |
| [from_left_top_right_bottom](/cad/python-net/aspose.cad/rectangle/from_left_top_right_bottom/#int-int-int-int) | Creates a [`Rectangle`](/cad/python-net/aspose.cad/rectangle) structure with the specified edge locations. |
| [intersects_with](/cad/python-net/aspose.cad/rectangle/intersects_with/#aspose.cad.Rectangle) | Determines if this rectangle intersects with `rect`. |
| [normalize](/cad/python-net/aspose.cad/rectangle/normalize/#) | Normalizes the rectangle by making it's width and height positive, left less than right and top less than bottom. |



### See Also
* module [`aspose.cad`](..)
* class [`Rectangle`](/cad/python-net/aspose.cad/rectangle)
* class [`RectangleF`](/cad/python-net/aspose.cad/rectanglef)
