---
title: Class Trifans
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Trifans class. The TRIFANS. The TRIFANS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from first second and third vertices. Each subsequent triangle is formed from the current vertex reusing the first and the previous vertices
type: docs
weight: 8360
url: /net/aspose.cad.fileformats.collada.fileparser.elements/trifans/
---
## Trifans class

The TRIFANS. The TRIFANS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from first, second, and third vertices. Each subsequent triangle is formed from the current vertex, reusing the first and the previous vertices.

```csharp
public class Trifans : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Trifans](trifans/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.collada.fileparser.elements/trifans/count/) { get; set; } | Gets or sets the count. The count attribute indicates the number of triangle fan primitives. Required attribute. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/trifans/extra/) { get; set; } | Gets or sets the extra. |
| [Input](../../aspose.cad.fileformats.collada.fileparser.elements/trifans/input/) { get; set; } | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes |
| [Material](../../aspose.cad.fileformats.collada.fileparser.elements/trifans/material/) { get; set; } | Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute |
| [Name](../../aspose.cad.fileformats.collada.fileparser.elements/trifans/name/) { get; set; } | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [Primitives](../../aspose.cad.fileformats.collada.fileparser.elements/trifans/primitives/) { get; set; } | Gets or sets the primitives. The TRIFANS element may have any number of primitives elements. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


