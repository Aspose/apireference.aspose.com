---
title: Class Accessor
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Accessor class. A typed view into a buffer view that contains raw binary data
type: docs
weight: 9530
url: /net/aspose.cad.fileformats.glb/accessor/
---
## Accessor class

A typed view into a buffer view that contains raw binary data.

```csharp
public sealed class Accessor : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [ByteLength](../../aspose.cad.fileformats.glb/accessor/bytelength/) { get; } | Gets the number of bytes, starting at [`ByteOffset`](./byteoffset/) use by this `Accessor` |
| [ByteOffset](../../aspose.cad.fileformats.glb/accessor/byteoffset/) { get; } | Gets the starting byte offset within [`SourceBufferView`](./sourcebufferview/). |
| [Count](../../aspose.cad.fileformats.glb/accessor/count/) { get; } | Gets the number of items. |
| [Dimensions](../../aspose.cad.fileformats.glb/accessor/dimensions/) { get; } | Gets the [`DimensionType`](../dimensiontype/) of an item. |
| [Encoding](../../aspose.cad.fileformats.glb/accessor/encoding/) { get; } | Gets the [`EncodingType`](../encodingtype/) of an item. |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [Format](../../aspose.cad.fileformats.glb/accessor/format/) { get; } |  |
| [IsSparse](../../aspose.cad.fileformats.glb/accessor/issparse/) { get; } | Gets a value indicating whether this `Accessor` has a sparse structure. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Normalized](../../aspose.cad.fileformats.glb/accessor/normalized/) { get; } | Gets a value indicating whether the items values are normalized. |
| [SourceBufferView](../../aspose.cad.fileformats.glb/accessor/sourcebufferview/) { get; } | Gets the [`BufferView`](../bufferview/) buffer that contains the items as an encoded byte array. |

## Methods

| Name | Description |
| --- | --- |
| [AsColorArray](../../aspose.cad.fileformats.glb/accessor/ascolorarray/)(float) |  |
| [AsIndicesArray](../../aspose.cad.fileformats.glb/accessor/asindicesarray/)() |  |
| [AsMatrix2x2Array](../../aspose.cad.fileformats.glb/accessor/asmatrix2x2array/)() |  |
| [AsMatrix3x3Array](../../aspose.cad.fileformats.glb/accessor/asmatrix3x3array/)() |  |
| [AsMatrix4x3Array](../../aspose.cad.fileformats.glb/accessor/asmatrix4x3array/)() |  |
| [AsMatrix4x4Array](../../aspose.cad.fileformats.glb/accessor/asmatrix4x4array/)() |  |
| [AsMultiArray](../../aspose.cad.fileformats.glb/accessor/asmultiarray/)(int) |  |
| [AsQuaternionArray](../../aspose.cad.fileformats.glb/accessor/asquaternionarray/)() |  |
| [AsScalarArray](../../aspose.cad.fileformats.glb/accessor/asscalararray/)() |  |
| [AsVector2Array](../../aspose.cad.fileformats.glb/accessor/asvector2array/)() |  |
| [AsVector3Array](../../aspose.cad.fileformats.glb/accessor/asvector3array/)() |  |
| [AsVector4Array](../../aspose.cad.fileformats.glb/accessor/asvector4array/)() |  |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetData](../../aspose.cad.fileformats.glb/accessor/setdata/)(BufferView, int, int, DimensionType, EncodingType, bool) | Associates this `Accessor` with a [`BufferView`](../bufferview/) |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [SetIndexData](../../aspose.cad.fileformats.glb/accessor/setindexdata/#setindexdata_1)(MemoryAccessor) |  |
| [SetIndexData](../../aspose.cad.fileformats.glb/accessor/setindexdata/#setindexdata)(BufferView, int, int, IndexEncodingType) | Associates this `Accessor` with a [`BufferView`](../bufferview/) |
| [SetVertexData](../../aspose.cad.fileformats.glb/accessor/setvertexdata/#setvertexdata_1)(MemoryAccessor) |  |
| [SetVertexData](../../aspose.cad.fileformats.glb/accessor/setvertexdata/#setvertexdata)(BufferView, int, int, DimensionType, EncodingType, bool) | Associates this `Accessor` with a [`BufferView`](../bufferview/) |
| [TryGetVertexBytes](../../aspose.cad.fileformats.glb/accessor/trygetvertexbytes/)(int) |  |
| [UpdateBounds](../../aspose.cad.fileformats.glb/accessor/updatebounds/)() |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


