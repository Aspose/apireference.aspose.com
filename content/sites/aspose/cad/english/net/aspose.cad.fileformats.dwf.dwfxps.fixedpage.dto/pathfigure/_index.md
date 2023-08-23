---
title: Class PathFigure
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.PathFigure class. The path figure. A PathFigure element is composed of a set of one or more line or curve segments. The segment elements define the shape of the path figure. The initial point of the first segment element is specified as the StartPoint attribute of the path figure. The last point of each segment element is the first point of the following segment element
type: docs
weight: 9270
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/
---
## PathFigure class

The path figure. A PathFigure element is composed of a set of one or more line or curve segments. The segment elements define the shape of the path figure. The initial point of the first segment element is specified as the StartPoint attribute of the path figure. The last point of each segment element is the first point of the following segment element.

```csharp
public class PathFigure
```

## Constructors

| Name | Description |
| --- | --- |
| [PathFigure](pathfigure/)() | Initializes a new instance of the `PathFigure` class. |

## Properties

| Name | Description |
| --- | --- |
| [IsClosed](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/isclosed/) { get; set; } | Gets or sets a value indicating whether is closed. Specifies whether the path is closed. If set to true, the stroke is drawn "closed", that is, the last point in the last segment of the path figure is connected with the point specified in the StartPoint attribute, otherwise the stroke is drawn "open", and the last point is not connected to the start point. Only applicable if the path figure is used in a Path element that specifies a stroke. |
| [IsFilled](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/isfilled/) { get; set; } | Gets or sets a value indicating whether is filled. Specifies whether the path figure is used in computing the area of the containing path geometry. Can be true or false. When set to false, the path figure is considered only for stroking. |
| [Items](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/items/) { get; set; } | Gets or sets the segment elements. Segment elements are: • ArcSegment. • PolyBezierSegment. • PolyLineSegment. • PolyQuadraticBezierSegment. |
| [StartPoint](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathfigure/startpoint/) { get; set; } | Gets or sets the start point. Specifies the starting point for the first segment of the path figure. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


