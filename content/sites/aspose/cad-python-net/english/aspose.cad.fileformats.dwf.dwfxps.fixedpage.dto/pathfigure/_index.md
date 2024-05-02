---
title: PathFigure class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 130
url: /python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/
is_root: false
---

## PathFigure class

The path figure.
A PathFigure element is composed of a set of one or more line or curve segments.
The segment elements define the shape of the path figure.
The initial point of the first segment element is specified as the StartPoint attribute of the path figure.
The last point of each segment element is the first point of the following segment element.



The PathFigure type exposes the following members:

### Constructors
| Constructor | Description |
| :- | :- |
| [__init__](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/__init__/#) | Initializes a new instance of the [`PathFigure`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure) class. |


### Properties
| Property | Description |
| :- | :- |
| [items](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/items) | Gets or sets the segment elements.<br/>Segment elements are:<br/>• ArcSegment.<br/>• PolyBezierSegment.<br/>• PolyLineSegment.<br/>• PolyQuadraticBezierSegment. |
| [is_closed](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/is_closed) | Gets or sets a value indicating whether is closed.<br/>Specifies whether the path is closed.<br/>If set to true, the stroke is drawn "closed", that is,<br/>the last point in the last segment of the path figure is connected with<br/>the point specified in the StartPoint attribute,<br/>otherwise the stroke is drawn "open", and the last point is not connected to the start point.<br/>Only applicable if the path figure is used in a Path element that specifies a stroke. |
| [start_point](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/start_point) | Gets or sets the start point.<br/>Specifies the starting point for the first segment of the path figure. |
| [is_filled](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/is_filled) | Gets or sets a value indicating whether is filled.<br/>Specifies whether the path figure is used in computing the area<br/>of the containing path geometry.<br/>Can be true or false.<br/>When set to false, the path figure is considered only for stroking. |



### See Also
* module [`aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto`](..)
* class [`PathFigure`](/cad/python-net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure)
