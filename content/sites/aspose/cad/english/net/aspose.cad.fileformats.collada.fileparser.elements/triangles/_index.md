---
title: Class Triangles
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Triangles class. The triangles. The triangles element provides the information needed to bind vertex attributes together and then organize those vertices into individual triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from the first second and third vertices. The second triangle is formed from the fourth fifth and sixth vertices and so on
type: docs
weight: 8350
url: /net/aspose.cad.fileformats.collada.fileparser.elements/triangles/
---
## Triangles class

The triangles. The triangles element provides the information needed to bind vertex attributes together and then organize those vertices into individual triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from the first, second, and third vertices. The second triangle is formed from the fourth, fifth, and sixth vertices, and so on.

```csharp
public class Triangles : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Triangles](triangles/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.collada.fileparser.elements/triangles/count/) { get; set; } | Gets or sets the count. The count attribute indicates the number of triangle primitives. Required attribute. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/triangles/extra/) { get; set; } | Gets or sets the extra. |
| [Input](../../aspose.cad.fileformats.collada.fileparser.elements/triangles/input/) { get; set; } | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [Material](../../aspose.cad.fileformats.collada.fileparser.elements/triangles/material/) { get; set; } | Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. Optional attribute. If the material attribute is not specified then the lighting and shading results are application defined. |
| [Name](../../aspose.cad.fileformats.collada.fileparser.elements/triangles/name/) { get; set; } | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [Primitives](../../aspose.cad.fileformats.collada.fileparser.elements/triangles/primitives/) { get; set; } | Gets or sets the primitives. The triangles element may have zero or one primitives element. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


