---
title: Struct VertexMaterialDelta
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes.VertexMaterialDelta struct. Defines a Vertex attribute with two material Colors and two Texture Coordinates
type: docs
weight: 10230
url: /net/aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/
---
## VertexMaterialDelta structure

Defines a Vertex attribute with two material Colors and two Texture Coordinates.

```csharp
public struct VertexMaterialDelta : IEquatable<VertexMaterialDelta>, IVertexMaterial
```

## Constructors

| Name | Description |
| --- | --- |
| [VertexMaterialDelta](vertexmaterialdelta/#constructor)(IVertexMaterial) |  |
| [VertexMaterialDelta](vertexmaterialdelta/#constructor_1)(ref Vector4, ref Vector4, ref Vector2, ref Vector2) |  |

## Properties

| Name | Description |
| --- | --- |
| static [Zero](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/zero/) { get; } |  |
| [MaxColors](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/maxcolors/) { get; } |  |
| [MaxTextCoords](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/maxtextcoords/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/add/)(ref VertexMaterialDelta) |  |
| override [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/equals/#equals_1)(object) |  |
| [Equals](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/equals/#equals)(VertexMaterialDelta) |  |
| [GetColor](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/getcolor/)(int) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/gethashcode/)() |  |
| [GetTexCoord](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/gettexcoord/)(int) |  |
| [Subtract](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/subtract/)(IVertexMaterial) |  |
| static [AreEqual](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/areequal/)(ref VertexMaterialDelta, ref VertexMaterialDelta) |  |
| [operator ==](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/op_equality/) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/op_implicit/) |  |
| [operator !=](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/op_inequality/) |  |

## Fields

| Name | Description |
| --- | --- |
| [Color0Delta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/color0delta/) |  |
| [Color1Delta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/color1delta/) |  |
| [TexCoord0Delta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/texcoord0delta/) |  |
| [TexCoord1Delta](../../aspose.cad.fileformats.glb.geometry.vertextypes/vertexmaterialdelta/texcoord1delta/) |  |

### See Also

* interface [IVertexMaterial](../ivertexmaterial/)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry.VertexTypes](../../aspose.cad.fileformats.glb.geometry.vertextypes/)
* assembly [Aspose.CAD](../../)


