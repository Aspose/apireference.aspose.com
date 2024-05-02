---
title: Accessor class
second_title: Aspose.CAD for Python via .NET API References
description: 
type: docs
weight: 10
url: /python-net/aspose.cad.fileformats.glb/accessor/
is_root: false
---

## Accessor class



**Inheritance:** [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) → 
[`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot) → 
[`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties) → 
[`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)



The Accessor type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [extensions](/cad/python-net/aspose.cad.fileformats.glb/accessor/extensions) | Gets a collection of [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable) instances. |
| [extras](/cad/python-net/aspose.cad.fileformats.glb/accessor/extras) | Gets or sets the extras content of this instance. |
| [name](/cad/python-net/aspose.cad.fileformats.glb/accessor/name) | Gets or sets the display text name, or null.<br/><br/>**⚠️ DO NOT USE AS AN OBJECT ID ⚠️**  see remarks. |
| [logical_parent](/cad/python-net/aspose.cad.fileformats.glb/accessor/logical_parent) | Gets the [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata) instance that owns this object. |
| [logical_index](/cad/python-net/aspose.cad.fileformats.glb/accessor/logical_index) | Gets the zero-based index of this object in the Logical resources of [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata). |
| [source_buffer_view](/cad/python-net/aspose.cad.fileformats.glb/accessor/source_buffer_view) | Gets the [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) buffer that contains the items as an encoded byte array. |
| [count](/cad/python-net/aspose.cad.fileformats.glb/accessor/count) | Gets the number of items. |
| [byte_offset](/cad/python-net/aspose.cad.fileformats.glb/accessor/byte_offset) | Gets the starting byte offset within [`Accessor.source_buffer_view`](/cad/python-net/aspose.cad.fileformats.glb/accessor#source_buffer_view). |
| [byte_length](/cad/python-net/aspose.cad.fileformats.glb/accessor/byte_length) | Gets the number of bytes, starting at [`Accessor.byte_offset`](/cad/python-net/aspose.cad.fileformats.glb/accessor#byte_offset) use by this [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) |
| [dimensions](/cad/python-net/aspose.cad.fileformats.glb/accessor/dimensions) | Gets the [`DimensionType`](/cad/python-net/aspose.cad.fileformats.glb/dimensiontype) of an item. |
| [encoding](/cad/python-net/aspose.cad.fileformats.glb/accessor/encoding) | Gets the [`EncodingType`](/cad/python-net/aspose.cad.fileformats.glb/encodingtype) of an item. |
| [normalized](/cad/python-net/aspose.cad.fileformats.glb/accessor/normalized) | Gets a value indicating whether the items values are normalized. |
| [is_sparse](/cad/python-net/aspose.cad.fileformats.glb/accessor/is_sparse) | Gets a value indicating whether this [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) has a sparse structure. |
| [format](/cad/python-net/aspose.cad.fileformats.glb/accessor/format) |  |


### Methods
| Method | Description |
| :- | :- |
| [set_index_data](/cad/python-net/aspose.cad.fileformats.glb/accessor/set_index_data/#aspose.cad.fileformats.glb.memory.MemoryAccessor) |  |
| [set_index_data](/cad/python-net/aspose.cad.fileformats.glb/accessor/set_index_data/#aspose.cad.fileformats.glb.BufferView-int-int-aspose.cad.fileformats.glb.IndexEncodingType) | Associates this [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) with a [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) |
| [set_vertex_data](/cad/python-net/aspose.cad.fileformats.glb/accessor/set_vertex_data/#aspose.cad.fileformats.glb.memory.MemoryAccessor) |  |
| [set_vertex_data](/cad/python-net/aspose.cad.fileformats.glb/accessor/set_vertex_data/#aspose.cad.fileformats.glb.BufferView-int-int-aspose.cad.fileformats.glb.DimensionType-aspose.cad.fileformats.glb.EncodingType-bool) | Associates this [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor) with a [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview) |
| [update_bounds](/cad/python-net/aspose.cad.fileformats.glb/accessor/update_bounds/#) |  |
| [set_data](/cad/python-net/aspose.cad.fileformats.glb/accessor/set_data/#aspose.cad.fileformats.glb.BufferView-int-int-aspose.cad.fileformats.glb.DimensionType-aspose.cad.fileformats.glb.EncodingType-Nullable<bool>) |  |
| [as_indices_array](/cad/python-net/aspose.cad.fileformats.glb/accessor/as_indices_array/#) |  |
| [as_scalar_array](/cad/python-net/aspose.cad.fileformats.glb/accessor/as_scalar_array/#) |  |
| [as_multi_array](/cad/python-net/aspose.cad.fileformats.glb/accessor/as_multi_array/#int) |  |



### See Also
* module [`aspose.cad.fileformats.glb`](..)
* class [`Accessor`](/cad/python-net/aspose.cad.fileformats.glb/accessor)
* class [`BufferView`](/cad/python-net/aspose.cad.fileformats.glb/bufferview)
* class [`DimensionType`](/cad/python-net/aspose.cad.fileformats.glb/dimensiontype)
* class [`EncodingType`](/cad/python-net/aspose.cad.fileformats.glb/encodingtype)
* class [`ExtraProperties`](/cad/python-net/aspose.cad.fileformats.glb/extraproperties)
* class [`GlbData`](/cad/python-net/aspose.cad.fileformats.glb/glbdata)
* class [`JsonSerializable`](/cad/python-net/aspose.cad.fileformats.glb.io/jsonserializable)
* class [`LogicalChildOfRoot`](/cad/python-net/aspose.cad.fileformats.glb/logicalchildofroot)
