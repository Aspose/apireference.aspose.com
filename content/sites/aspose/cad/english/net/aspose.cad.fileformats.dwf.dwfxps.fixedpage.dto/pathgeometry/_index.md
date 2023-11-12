---
title: Class PathGeometry
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO.PathGeometry class. The path geometry. A PathGeometry element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element. Producers MUST NOT specify the path figures of a geometry with both the Figures attribute and a child PathFigure element
type: docs
weight: 9300
url: /net/aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathgeometry/
---
## PathGeometry class

The path geometry. A PathGeometry element contains a set of path figures specified either with the Figures attribute or with a child PathFigure element. Producers MUST NOT specify the path figures of a geometry with both the Figures attribute and a child PathFigure element.

```csharp
public class PathGeometry
```

## Constructors

| Name | Description |
| --- | --- |
| [PathGeometry](pathgeometry/)() | Initializes a new instance of the `PathGeometry` class. |

## Properties

| Name | Description |
| --- | --- |
| [Figures](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathgeometry/figures/) { get; set; } | Gets or sets the figures. Describes the geometry of the path. |
| [FillRule](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathgeometry/fillrule/) { get; set; } | Gets or sets the fill rule. Specifies how the intersecting areas of geometric shapes are combined to form a region. Valid values are EvenOdd and NonZero. |
| [PathFigure](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathgeometry/pathfigure/) { get; set; } | Gets or sets the path figure. Specifies a set of one or more segment elements defining a closed region. |
| [PathGeometryTransform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathgeometry/pathgeometrytransform/) { get; set; } | Gets or sets the path geometry transform. Specifies the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |
| [Transform](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/pathgeometry/transform/) { get; set; } | Gets or sets the transform. Specifies the local matrix transformation that is applied to all child and descendant elements of the path geometry before it is used for filling, clipping, or stroking. |

### See Also

* namespace [Aspose.CAD.FileFormats.Dwf.DwfXps.FixedPage.DTO](../../aspose.cad.fileformats.dwf.dwfxps.fixedpage.dto/)
* assembly [Aspose.CAD](../../)


