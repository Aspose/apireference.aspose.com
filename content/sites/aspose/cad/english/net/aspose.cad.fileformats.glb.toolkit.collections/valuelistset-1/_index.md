---
title: Class ValueListSetT
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.ToolKit.Collections.ValueListSet1T class. Represents A specialised list that requires all elements to be unique
type: docs
weight: 11230
url: /net/aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/
---
## ValueListSet&lt;T&gt; class

Represents A specialised list that requires all elements to be unique.

```csharp
public class ValueListSet<T> : IReadOnlyList<T>
    where T : struct
```

| Parameter | Description |
| --- | --- |
| T | Any value type. |

## Constructors

| Name | Description |
| --- | --- |
| [ValueListSet](valuelistset/#constructor)() | The default constructor. |
| [ValueListSet](valuelistset/#constructor_1)(int, IEqualityComparer) |  |

## Properties

| Name | Description |
| --- | --- |
| [Comparer](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/comparer/) { get; } |  |
| [Count](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/count/) { get; } |  |
| [Indices](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/indices/) { get; } |  |
| [Item](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/item/) { get; } |  |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/add/)(ref T) |  |
| [ApplyTransform](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/applytransform/)(Func&lt;T, T&gt;) |  |
| [Clear](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/clear/)() |  |
| [Contains](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/contains/)(ref T) |  |
| [CopyTo](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/copyto/#copyto)(ValueListSet) |  |
| [CopyTo](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/copyto/#copyto_1)(T[], int) |  |
| [Exists](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/exists/)(int) |  |
| [GetEnumerator](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/getenumerator/)() |  |
| [IndexOf](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/indexof/)(ref T) |  |
| [Use](../../aspose.cad.fileformats.glb.toolkit.collections/valuelistset-1/use/)(ref T) |  |

## Remarks

- This collection is based on Dictionary - Replaces [`VertexList`](../vertexlist-1/) - Designed to work with lists of vertices. This collection is: - like a HashSet, in the sense that every element must be unique. - like a list, because elements can be accessed by index: [`Item`](./item/). - [`IndexOf`](./indexof/) and [`Use`](./use/) are fast as in a HashSet.

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.ToolKit.Collections](../../aspose.cad.fileformats.glb.toolkit.collections/)
* assembly [Aspose.CAD](../../)


