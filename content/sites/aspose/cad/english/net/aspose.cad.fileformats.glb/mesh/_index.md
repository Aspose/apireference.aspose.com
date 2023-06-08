---
title: Class Mesh
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Mesh class. A set of primitives to be rendered. Its global transform is defined by a node that references it
type: docs
weight: 10750
url: /net/aspose.cad.fileformats.glb/mesh/
---
## Mesh class

A set of primitives to be rendered. Its global transform is defined by a node that references it.

```csharp
public sealed class Mesh : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [AllPrimitivesHaveJoints](../../aspose.cad.fileformats.glb/mesh/allprimitiveshavejoints/) { get; } |  |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [MorphWeights](../../aspose.cad.fileformats.glb/mesh/morphweights/) { get; } |  |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Primitives](../../aspose.cad.fileformats.glb/mesh/primitives/) { get; } |  |
| [VisualParents](../../aspose.cad.fileformats.glb/mesh/visualparents/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [CreatePrimitive](../../aspose.cad.fileformats.glb/mesh/createprimitive/)() | Creates a new [`MeshPrimitive`](../meshprimitive/) instance and adds it to the current `Mesh`. |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [GetMorphWeights](../../aspose.cad.fileformats.glb/mesh/getmorphweights/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [SetMorphWeights](../../aspose.cad.fileformats.glb/mesh/setmorphweights/#setmorphweights_1)(IReadOnlyList&lt;float&gt;) |  |
| [SetMorphWeights](../../aspose.cad.fileformats.glb/mesh/setmorphweights/#setmorphweights)(SparseWeight8) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


