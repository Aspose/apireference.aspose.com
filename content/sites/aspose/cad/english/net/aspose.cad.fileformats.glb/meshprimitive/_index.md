---
title: Class MeshPrimitive
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.MeshPrimitive class. Geometry to be rendered with the given material
type: docs
weight: 10770
url: /net/aspose.cad.fileformats.glb/meshprimitive/
---
## MeshPrimitive class

Geometry to be rendered with the given material.

```csharp
public sealed class MeshPrimitive : ExtraProperties, IChildOf<Mesh>
```

## Properties

| Name | Description |
| --- | --- |
| [DrawPrimitiveType](../../aspose.cad.fileformats.glb/meshprimitive/drawprimitivetype/) { get; set; } |  |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [IndexAccessor](../../aspose.cad.fileformats.glb/meshprimitive/indexaccessor/) { get; set; } |  |
| [LogicalIndex](../../aspose.cad.fileformats.glb/meshprimitive/logicalindex/) { get; } | Gets the zero-based index of this `MeshPrimitive` at [`Primitives`](../mesh/primitives/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/meshprimitive/logicalparent/) { get; } | Gets the [`Mesh`](../mesh/) instance that owns this `MeshPrimitive` instance. |
| [Material](../../aspose.cad.fileformats.glb/meshprimitive/material/) { get; set; } | Gets or sets the [`Material`](./material/) instance, or null. |
| [MorphTargetsCount](../../aspose.cad.fileformats.glb/meshprimitive/morphtargetscount/) { get; } |  |
| [VertexAccessors](../../aspose.cad.fileformats.glb/meshprimitive/vertexaccessors/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [GetBufferViews](../../aspose.cad.fileformats.glb/meshprimitive/getbufferviews/)(bool, bool, bool) |  |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [GetIndexAccessor](../../aspose.cad.fileformats.glb/meshprimitive/getindexaccessor/)() |  |
| [GetIndices](../../aspose.cad.fileformats.glb/meshprimitive/getindices/)() | Gets the raw list of indices of this primitive. |
| [GetLineIndices](../../aspose.cad.fileformats.glb/meshprimitive/getlineindices/)() | Decodes the raw indices and returns a list of indexed lines. |
| [GetMorphTargetAccessors](../../aspose.cad.fileformats.glb/meshprimitive/getmorphtargetaccessors/)(int) |  |
| [GetPointIndices](../../aspose.cad.fileformats.glb/meshprimitive/getpointindices/)() | Decodes the raw indices and returns a list of indexed points. |
| [GetTriangleIndices](../../aspose.cad.fileformats.glb/meshprimitive/gettriangleindices/)() | Decodes the raw indices and returns a list of indexed triangles. |
| [GetVertexAccessor](../../aspose.cad.fileformats.glb/meshprimitive/getvertexaccessor/)(string) |  |
| [GetVertexAccessorsByBuffer](../../aspose.cad.fileformats.glb/meshprimitive/getvertexaccessorsbybuffer/)(BufferView) |  |
| [GetVertices](../../aspose.cad.fileformats.glb/meshprimitive/getvertices/)(string) |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [SetIndexAccessor](../../aspose.cad.fileformats.glb/meshprimitive/setindexaccessor/)(Accessor) |  |
| [SetMorphTargetAccessors](../../aspose.cad.fileformats.glb/meshprimitive/setmorphtargetaccessors/)(int, IReadOnlyDictionary&lt;string, Accessor&gt;) |  |
| [SetVertexAccessor](../../aspose.cad.fileformats.glb/meshprimitive/setvertexaccessor/)(string, Accessor) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [ExtraProperties](../extraproperties/)
* interface [IChildOf&lt;TParent&gt;](../../aspose.cad.fileformats.glb.collections/ichildof-1/)
* class [Mesh](../mesh/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


