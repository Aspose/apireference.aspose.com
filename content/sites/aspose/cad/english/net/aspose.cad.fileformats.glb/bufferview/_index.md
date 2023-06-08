---
title: Class BufferView
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.BufferView class. A view into a buffer generally representing a subset of the buffer
type: docs
weight: 9770
url: /net/aspose.cad.fileformats.glb/bufferview/
---
## BufferView class

A view into a buffer generally representing a subset of the buffer.

```csharp
public sealed class BufferView : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [ByteStride](../../aspose.cad.fileformats.glb/bufferview/bytestride/) { get; } | Gets the number of bytes between the beginnings of successive elements, or Zero. |
| [Content](../../aspose.cad.fileformats.glb/bufferview/content/) { get; } | Gets the actual bytes defined by this `BufferView` |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [IsDataBuffer](../../aspose.cad.fileformats.glb/bufferview/isdatabuffer/) { get; } | Gets a value indicating whether this `BufferView` defines a general purpose data buffer. |
| [IsIndexBuffer](../../aspose.cad.fileformats.glb/bufferview/isindexbuffer/) { get; } | Gets a value indicating whether this `BufferView` defines a GPU Ready Index Buffer. |
| [IsVertexBuffer](../../aspose.cad.fileformats.glb/bufferview/isvertexbuffer/) { get; } | Gets a value indicating whether this `BufferView` defines a GPU Ready Vertex Buffer. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |

## Methods

| Name | Description |
| --- | --- |
| [FindAccessors](../../aspose.cad.fileformats.glb/bufferview/findaccessors/)() | Finds all the accessors using this BufferView |
| [FindImages](../../aspose.cad.fileformats.glb/bufferview/findimages/)() |  |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [IsInterleaved](../../aspose.cad.fileformats.glb/bufferview/isinterleaved/)(IEnumerable&lt;Accessor&gt;) | Checks if *accessors* use this buffer in interleaved arrangement |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


