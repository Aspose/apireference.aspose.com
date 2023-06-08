---
title: Interface IVertexMaterial
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.IVertexMaterial interface. Represents the interface that must be implemented by a material vertex fragment
type: docs
weight: 10090
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/
---
## IVertexMaterial interface

Represents the interface that must be implemented by a material vertex fragment.

```csharp
public interface IVertexMaterial
```

## Properties

| Name | Description |
| --- | --- |
| [MaxColors](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/maxcolors/) { get; } | Gets the number of color attributes available in this vertex |
| [MaxTextCoords](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/maxtextcoords/) { get; } | Gets the number of texture coordinate attributes available in this vertex |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/add/)(ref VertexMaterialDelta) |  |
| [GetColor](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/getcolor/)(int) | Gets a color attribute. |
| [GetTexCoord](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/gettexcoord/)(int) | Gets a UV texture coordinate attribute. |
| [SetColor](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/setcolor/)(int, Vector4) | Sets a color attribute. |
| [SetTexCoord](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/settexcoord/)(int, Vector2) | Sets a UV texture coordinate attribute. |
| [Subtract](../../aspose.cad.fileformats.glb.geometry.vertextypes/ivertexmaterial/subtract/)(IVertexMaterial) | calculates the difference between this vertex and *baseValue* |

## Remarks

Implemented by:

[`VertexEmpty`](../vertexempty/)

[`VertexColor1`](../vertexcolor1/)

[`VertexColor2`](../vertexcolor2/)

[`VertexTexture1`](../vertextexture1/)

[`VertexTexture2`](../vertextexture2/)

[`VertexColor1Texture1`](../vertexcolor1texture1/)

[`VertexColor1Texture2`](../vertexcolor1texture2/)

[`VertexColor2Texture1`](../vertexcolor2texture1/)

[`VertexColor2Texture2`](../vertexcolor2texture2/)

And also by other custom vertex material fragment types.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


