---
title: Class ConvexMesh
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.ConvexMesh class. The convex mesh. The definition of the convex_mesh element is identical to the mesh element with the exception that instead of a complete descriptionsource vertices polygons etc. it may simply point to another geometry to derive its shape. The latter case means that the convex hull of that geometry should be computed and is indicated by the optional convex_hull_of attribute
type: docs
weight: 7270
url: /net/aspose.cad.fileformats.collada.fileparser.elements/convexmesh/
---
## ConvexMesh class

The convex mesh. The definition of the convex_mesh element is identical to the mesh element with the exception that instead of a complete description(source, vertices, polygons etc.), it may simply point to another geometry to derive its shape. The latter case means that the convex hull of that geometry should be computed and is indicated by the optional "convex_hull_of" attribute.

```csharp
public class ConvexMesh : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [ConvexMesh](convexmesh/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [ConvexHullOf](../../aspose.cad.fileformats.collada.fileparser.elements/convexmesh/convexhullof/) { get; set; } | Gets or sets the convex hull of. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/convexmesh/extra/) { get; set; } | Gets or sets the extra. |
| [Items](../../aspose.cad.fileformats.collada.fileparser.elements/convexmesh/items/) { get; set; } | Gets or sets the items. |
| [Source](../../aspose.cad.fileformats.collada.fileparser.elements/convexmesh/source/) { get; set; } | Gets or sets the source. |
| [Vertices](../../aspose.cad.fileformats.collada.fileparser.elements/convexmesh/vertices/) { get; set; } | Gets or sets the vertices. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


