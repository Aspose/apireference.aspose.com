---
title: Class Linestrips
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Linestrips class. The LINESTRIPS. The linEStrips element provides the information needed to bind vertex attributes together and then organize those vertices into connected linestrips. Each linestrip described by the mesh has an arbitrary number of vertices. Each line segment within the linestrip is formed from the current vertex and the preceding vertex
type: docs
weight: 7840
url: /net/aspose.cad.fileformats.collada.fileparser.elements/linestrips/
---
## Linestrips class

The LINESTRIPS. The linEStrips element provides the information needed to bind vertex attributes together and then organize those vertices into connected line-strips. Each line-strip described by the mesh has an arbitrary number of vertices. Each line segment within the line-strip is formed from the current vertex and the preceding vertex.

```csharp
public class Linestrips : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Linestrips](linestrips/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.collada.fileparser.elements/linestrips/count/) { get; set; } | Gets or sets the count. The count attribute indicates the number of LINESTRIP primitives. Required attribute. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/linestrips/extra/) { get; set; } | Gets or sets the extra. |
| [Input](../../aspose.cad.fileformats.collada.fileparser.elements/linestrips/input/) { get; set; } | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [Material](../../aspose.cad.fileformats.collada.fileparser.elements/linestrips/material/) { get; set; } | Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute. |
| [Name](../../aspose.cad.fileformats.collada.fileparser.elements/linestrips/name/) { get; set; } | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [Primitives](../../aspose.cad.fileformats.collada.fileparser.elements/linestrips/primitives/) { get; set; } | Gets or sets the primitives. The LINESTRIPS element may have any number of primitives elements. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


