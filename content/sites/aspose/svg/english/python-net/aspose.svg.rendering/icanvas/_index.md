---
title: ICanvas class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 60
url: /python-net/aspose.svg.rendering/icanvas/
is_root: false
---

## ICanvas class

Represents a canvas for drawing 2D graphics.



The ICanvas type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [context](/svg/python-net/aspose.svg.rendering/icanvas/context) | Gets the canvas context associated with the canvas. |


### Methods
| Method | Description |
| :- | :- |
| [arc](/svg/python-net/aspose.svg.rendering/icanvas/arc/#float-float-float-float-float) | Adds an arc to the current path. |
| [arc](/svg/python-net/aspose.svg.rendering/icanvas/arc/#float-float-float-float-float-bool) | Adds an arc to the current path. |
| [clip](/svg/python-net/aspose.svg.rendering/icanvas/clip/#aspose.svg.drawing.FillRule) | Sets the current clipping path using the specified fill rule. |
| [clip](/svg/python-net/aspose.svg.rendering/icanvas/clip/#aspose.svg.rendering.IPath-aspose.svg.drawing.FillRule) | Sets the current clipping path using the specified path and fill rule. |
| [ellipse](/svg/python-net/aspose.svg.rendering/icanvas/ellipse/#float-float-float-float-float-float-float) | Adds an ellipse to the current path. |
| [ellipse](/svg/python-net/aspose.svg.rendering/icanvas/ellipse/#float-float-float-float-float-float-float-bool) | Adds an ellipse to the current path. |
| [fill](/svg/python-net/aspose.svg.rendering/icanvas/fill/#aspose.svg.drawing.FillRule) | Fills the current path with the specified fill rule. |
| [fill](/svg/python-net/aspose.svg.rendering/icanvas/fill/#aspose.svg.rendering.IPath-aspose.svg.drawing.FillRule) | Fills the specified path with the specified fill rule. |
| [is_point_in_path](/svg/python-net/aspose.svg.rendering/icanvas/is_point_in_path/#float-float-aspose.svg.drawing.FillRule) | Determines whether the specified point is inside the current path using the specified fill rule. |
| [is_point_in_path](/svg/python-net/aspose.svg.rendering/icanvas/is_point_in_path/#aspose.svg.rendering.IPath-float-float-aspose.svg.drawing.FillRule) | Determines whether the specified point is inside the specified path using the specified fill rule. |
| [is_point_in_stroke](/svg/python-net/aspose.svg.rendering/icanvas/is_point_in_stroke/#float-float) | Determines whether the specified point is inside the current stroked path. |
| [is_point_in_stroke](/svg/python-net/aspose.svg.rendering/icanvas/is_point_in_stroke/#aspose.svg.rendering.IPath-float-float) | Determines whether the specified point is inside the specified stroked path. |
| [stroke](/svg/python-net/aspose.svg.rendering/icanvas/stroke/#) | Strokes the current path. |
| [stroke](/svg/python-net/aspose.svg.rendering/icanvas/stroke/#aspose.svg.rendering.IPath) | Strokes the specified path. |
| [arc_to](/svg/python-net/aspose.svg.rendering/icanvas/arc_to/#float-float-float-float-float) | Adds an arc to the current path, connecting the previous point to the start point of the arc with a straight line. |
| [begin_path](/svg/python-net/aspose.svg.rendering/icanvas/begin_path/#) | Begins a new subpath, discarding the current path if any. |
| [bezier_curve_to](/svg/python-net/aspose.svg.rendering/icanvas/bezier_curve_to/#float-float-float-float-float-float) | Adds a cubic Bézier curve to the current path. |
| [clear_rect](/svg/python-net/aspose.svg.rendering/icanvas/clear_rect/#float-float-float-float) | Clears the specified rectangular area to transparent. |
| [close_path](/svg/python-net/aspose.svg.rendering/icanvas/close_path/#) | Closes the current subpath by drawing a straight line from the current point to the starting point of the subpath. |
| [draw_image](/svg/python-net/aspose.svg.rendering/icanvas/draw_image/#bytes-aspose.svg.drawing.WebImageFormat-aspose.pydrawing.RectangleF) | Draws an image on the canvas. |
| [fill_rect](/svg/python-net/aspose.svg.rendering/icanvas/fill_rect/#float-float-float-float) | Fills the specified rectangular area with the current fill style. |
| [fill_text](/svg/python-net/aspose.svg.rendering/icanvas/fill_text/#str-float-float) | Fills the specified text at the specified position. |
| [get_path_rect](/svg/python-net/aspose.svg.rendering/icanvas/get_path_rect/#) | Gets the bounding rectangle of the current path. |
| [line_to](/svg/python-net/aspose.svg.rendering/icanvas/line_to/#float-float) | Adds a line segment to the current path. |
| [measure_text](/svg/python-net/aspose.svg.rendering/icanvas/measure_text/#str) | Measures the width of the specified text using the current font properties. |
| [move_to](/svg/python-net/aspose.svg.rendering/icanvas/move_to/#float-float) | Moves the starting point of a new subpath to the specified point. |
| [quadratic_curve_to](/svg/python-net/aspose.svg.rendering/icanvas/quadratic_curve_to/#float-float-float-float) | Adds a quadratic Bézier curve to the current path. |
| [rect](/svg/python-net/aspose.svg.rendering/icanvas/rect/#float-float-float-float) | Adds a rectangle to the current path. |
| [restore_context](/svg/python-net/aspose.svg.rendering/icanvas/restore_context/#) | Restores the most recently saved canvas state by popping the top entry from the drawing state stack. |
| [save_context](/svg/python-net/aspose.svg.rendering/icanvas/save_context/#) | Saves the entire state of the canvas by pushing the current state onto a stack. |
| [stroke_rect](/svg/python-net/aspose.svg.rendering/icanvas/stroke_rect/#float-float-float-float) | Strokes the specified rectangular area. |
| [stroke_text](/svg/python-net/aspose.svg.rendering/icanvas/stroke_text/#str-float-float) | Strokes the specified text at the specified position. |



### See Also
* module [`aspose.svg.rendering`](..)
