---
title: Class Skin
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Skin class. Joints and matrices defining a skin
type: docs
weight: 11150
url: /net/aspose.cad.fileformats.glb/skin/
---
## Skin class

Joints and matrices defining a skin.

```csharp
public sealed class Skin : LogicalChildOfRoot
```

## Properties

| Name | Description |
| --- | --- |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [JointsCount](../../aspose.cad.fileformats.glb/skin/jointscount/) { get; } | Gets the number of joints |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |
| [Skeleton](../../aspose.cad.fileformats.glb/skin/skeleton/) { get; set; } | Gets or sets the Skeleton [`Node`](../node/), which represents the root of a joints hierarchy. |
| [VisualParents](../../aspose.cad.fileformats.glb/skin/visualparents/) { get; } | Gets a collection of [`Node`](../node/) instances using this `Skin`. |

## Methods

| Name | Description |
| --- | --- |
| [BindJoints](../../aspose.cad.fileformats.glb/skin/bindjoints/#bindjoints_2)((Node Joint, Matrix4x4 InverseBindMatrix)[]) | Binds a bone armature of [`Node`](../node/) to the associated skinned mesh. |
| [BindJoints](../../aspose.cad.fileformats.glb/skin/bindjoints/#bindjoints)(params Node[]) |  |
| [BindJoints](../../aspose.cad.fileformats.glb/skin/bindjoints/#bindjoints_1)(Matrix4x4, params Node[]) | Binds a bone armature of [`Node`](../node/) to the associated skinned mesh. |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [GetInverseBindMatricesAccessor](../../aspose.cad.fileformats.glb/skin/getinversebindmatricesaccessor/)() |  |
| [GetJoint](../../aspose.cad.fileformats.glb/skin/getjoint/)(int) |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |

### See Also

* class [LogicalChildOfRoot](../logicalchildofroot/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


