---
title: Class Polylist
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Polylist class. The POLYLIST. The POLYLIST element provides the information needed to bind vertex attributes together and then organize those vertices into individual polygons. The polygons described in POLYLIST can contain arbitrary numbers of vertices. Unlike the polygons element the POLYLIST element cannot contain polygons with holes
type: docs
weight: 8000
url: /net/aspose.cad.fileformats.collada.fileparser.elements/polylist/
---
## Polylist class

The POLYLIST. The POLYLIST element provides the information needed to bind vertex attributes together and then organize those vertices into individual polygons. The polygons described in POLYLIST can contain arbitrary numbers of vertices. Unlike the polygons element, the POLYLIST element cannot contain polygons with holes.

```csharp
public class Polylist : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Polylist](polylist/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/count/) { get; set; } | Gets or sets the count. The count attribute indicates the number of polygon primitives. Required attribute. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/extra/) { get; set; } | Gets or sets the extra. The extra element may appear any number of times. |
| [Input](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/input/) { get; set; } | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [Material](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/material/) { get; set; } | Gets or sets the material. |
| [Name](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/name/) { get; set; } | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [Primitives](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/primitives/) { get; set; } | Gets or sets the primitives. The POLYLIST element may have zero or one primitives element. |
| [VerticesCount](../../aspose.cad.fileformats.collada.fileparser.elements/polylist/verticescount/) { get; set; } | Gets or sets the vertices count. The vertices count element contains a list of integers describing the number of sides for each polygon described by the POLYLIST element. The vertices count element may occur once. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


