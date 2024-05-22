---
title: IPath class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 110
url: /python-net/aspose.svg.rendering/ipath/
is_root: false
---

## IPath class

Represents a path for defining shapes or outlines.



The IPath type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [fill_mode](/svg/python-net/aspose.svg.rendering/ipath/fill_mode) | Gets or sets the fill rule for the path. See [`FillRule`](/svg/python-net/aspose.svg.drawing/fillrule). |
| [is_empty](/svg/python-net/aspose.svg.rendering/ipath/is_empty) | Gets a value indicating whether the path is empty. |
| [native_object](/svg/python-net/aspose.svg.rendering/ipath/native_object) | Gets the native representation of the path object. |


### Methods
| Method | Description |
| :- | :- |
| [arc](/svg/python-net/aspose.svg.rendering/ipath/arc/#float-float-float-float-float) | Adds a circular arc to the path. |
| [arc](/svg/python-net/aspose.svg.rendering/ipath/arc/#float-float-float-float-float-bool) | Adds a circular arc to the path. |
| [ellipse](/svg/python-net/aspose.svg.rendering/ipath/ellipse/#float-float-float-float-float-float-float) | Adds an elliptical arc to the path. |
| [ellipse](/svg/python-net/aspose.svg.rendering/ipath/ellipse/#float-float-float-float-float-float-float-bool) | Adds an elliptical arc to the path. |
| [add_path](/svg/python-net/aspose.svg.rendering/ipath/add_path/#aspose.svg.rendering.IPath-aspose.svg.drawing.IMatrix) | Adds the specified path to the current path, applying the given transformation. |
| [clear](/svg/python-net/aspose.svg.rendering/ipath/clear/#) | Clears the contents of the path. |
| [close](/svg/python-net/aspose.svg.rendering/ipath/close/#) | Closes the current subpath by connecting the current point to the starting point. |
| [move_to](/svg/python-net/aspose.svg.rendering/ipath/move_to/#float-float) | Moves the current point to the specified coordinates. |
| [line_to](/svg/python-net/aspose.svg.rendering/ipath/line_to/#float-float) | Adds a straight line segment from the current point to the specified coordinates. |
| [transform](/svg/python-net/aspose.svg.rendering/ipath/transform/#aspose.svg.drawing.IMatrix) | Applies the specified transformation to the path. |
| [quadratic_curve_to](/svg/python-net/aspose.svg.rendering/ipath/quadratic_curve_to/#float-float-float-float) | Adds a quadratic Bézier curve segment to the path. |
| [bezier_curve_to](/svg/python-net/aspose.svg.rendering/ipath/bezier_curve_to/#float-float-float-float-float-float) | Adds a cubic Bézier curve segment to the path. |
| [arc_to](/svg/python-net/aspose.svg.rendering/ipath/arc_to/#float-float-float-float-float) | Adds an arc segment to the path. |
| [rect](/svg/python-net/aspose.svg.rendering/ipath/rect/#float-float-float-float) | Adds a rectangle to the path. |



### See Also
* module [`aspose.svg.rendering`](..)
* class [`FillRule`](/svg/python-net/aspose.svg.drawing/fillrule)
