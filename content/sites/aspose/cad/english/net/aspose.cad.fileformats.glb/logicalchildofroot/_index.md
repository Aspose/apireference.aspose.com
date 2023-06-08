---
title: Class LogicalChildOfRoot
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.LogicalChildOfRoot class. All gltf elements stored in ModelRoot must inherit from this class
type: docs
weight: 10470
url: /net/aspose.cad.fileformats.glb/logicalchildofroot/
---
## LogicalChildOfRoot class

All gltf elements stored in ModelRoot must inherit from this class.

```csharp
public abstract class LogicalChildOfRoot : ExtraProperties, IChildOf<GlbData>
```

## Properties

| Name | Description |
| --- | --- |
| [Extensions](../../aspose.cad.fileformats.glb/extraproperties/extensions/) { get; } | Gets a collection of [`JsonSerializable`](../../aspose.cad.fileformats.glb.io/jsonserializable/) instances. |
| [Extras](../../aspose.cad.fileformats.glb/extraproperties/extras/) { get; set; } | Gets or sets the extras content of this instance. |
| [LogicalIndex](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalindex/) { get; } | Gets the zero-based index of this object in the Logical resources of [`GlbImage`](../glbimage/). |
| [LogicalParent](../../aspose.cad.fileformats.glb/logicalchildofroot/logicalparent/) { get; } | Gets the [`GlbImage`](../glbimage/) instance that owns this object. |
| [Name](../../aspose.cad.fileformats.glb/logicalchildofroot/name/) { get; set; } | Gets or sets the display text name, or null. |

## Methods

| Name | Description |
| --- | --- |
| [GetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/getextension/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)() |  |
| [RemoveExtensions&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/removeextensions/)(T) |  |
| [SetExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/setextension/)(T) |  |
| [UseExtension&lt;T&gt;](../../aspose.cad.fileformats.glb/extraproperties/useextension/)() |  |
| static [RenameLogicalElements&lt;T&gt;](../../aspose.cad.fileformats.glb/logicalchildofroot/renamelogicalelements/)(IEnumerable&lt;T&gt;, string) | Renames all the unnamed and duplicate name items in the collection so all the items have a unique valid name. |

### See Also

* class [ExtraProperties](../extraproperties/)
* interface [IChildOf&lt;TParent&gt;](../../aspose.cad.fileformats.glb.collections/ichildof-1/)
* class [GlbData](../glbdata/)
* namespace [Aspose.CAD.FileFormats.GLB](../../aspose.cad.fileformats.glb/)
* assembly [Aspose.CAD](../../)


