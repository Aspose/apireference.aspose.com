---
title: Class Tristrips
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Collada.FileParser.Elements.Tristrips class. The TRISTRIPS. The TRISTRIPS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from first second and third vertices.Each subsequent triangle is formed from the current vertex reusing the previous two vertices
type: docs
weight: 8370
url: /net/aspose.cad.fileformats.collada.fileparser.elements/tristrips/
---
## Tristrips class

The TRISTRIPS. The TRISTRIPS element provides the information needed to bind vertex attributes together and then organize those vertices into connected triangles. Each triangle described by the mesh has three vertices. The first triangle is formed from first, second, and third vertices.Each subsequent triangle is formed from the current vertex, reusing the previous two vertices.

```csharp
public class Tristrips : ColladaElement
```

## Constructors

| Name | Description |
| --- | --- |
| [Tristrips](tristrips/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.cad.fileformats.collada.fileparser.elements/tristrips/count/) { get; set; } | Gets or sets the count. The count attribute indicates the number of triangle strip primitives. Required attribute. |
| [Extra](../../aspose.cad.fileformats.collada.fileparser.elements/tristrips/extra/) { get; set; } | Gets or sets the extra. |
| [Input](../../aspose.cad.fileformats.collada.fileparser.elements/tristrips/input/) { get; set; } | Gets or sets the input. The input element may occur any number of times. This input is a local input with the offset and set attributes. |
| [Material](../../aspose.cad.fileformats.collada.fileparser.elements/tristrips/material/) { get; set; } | Gets or sets the material. The material attribute declares a symbol for a material. This symbol is bound to a material at the time of instantiation. If the material attribute is not specified then the lighting and shading results are application defined. Optional attribute. |
| [Name](../../aspose.cad.fileformats.collada.fileparser.elements/tristrips/name/) { get; set; } | Gets or sets the name. The name attribute is the text string name of this element. Optional attribute. |
| [Primitives](../../aspose.cad.fileformats.collada.fileparser.elements/tristrips/primitives/) { get; set; } | Gets or sets the primitives. The TRISTRIPS element may have any number of p elements. |

### See Also

* class [ColladaElement](../colladaelement/)
* namespace [Aspose.CAD.FileFormats.Collada.FileParser.Elements](../../aspose.cad.fileformats.collada.fileparser.elements/)
* assembly [Aspose.CAD](../../)


