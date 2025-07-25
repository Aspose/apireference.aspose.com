---
title: Class OutlineCollection
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.OutlineCollection class. Represents document outline hierarchy
type: docs
weight: 8140
url: /net/aspose.pdf/outlinecollection/
---
## OutlineCollection class

Represents document outline hierarchy.

```csharp
public sealed class OutlineCollection : Outlines
```

## Properties

| Name | Description |
| --- | --- |
| override [Count](../../aspose.pdf/outlinecollection/count/) { get; } | Count of collection items. Please dont confuse with VisibleCount: VisibleCount gets number of visible outline item on all levels. |
| [First](../../aspose.pdf/outlinecollection/first/) { get; } | Gets an outline item representing the first top-level item in the outline. |
| override [IsReadOnly](../../aspose.pdf/outlinecollection/isreadonly/) { get; } | Gets a value indicating whether the collection is read-only. |
| [IsSynchronized](../../aspose.pdf/outlinecollection/issynchronized/) { get; } | Gets a value indicating whether access to this collection is synchronized (thread safe). |
| [Item](../../aspose.pdf/outlinecollection/item/) { get; } | Gets outline item from collection by index. |
| [Last](../../aspose.pdf/outlinecollection/last/) { get; } | Gets an outline item representing the last top-level item in the outline. |
| [SyncRoot](../../aspose.pdf/outlinecollection/syncroot/) { get; } | Gets an object that can be used to synchronize access to this collection. |
| override [VisibleCount](../../aspose.pdf/outlinecollection/visiblecount/) { get; } | Count is the sum of the number of visible descendent outline items at all levels. Note: please don't confuse with Count which is number if items in collection. |

## Methods

| Name | Description |
| --- | --- |
| override [Add](../../aspose.pdf/outlinecollection/add/)(OutlineItemCollection) | Adds outline item to collection. |
| override [Clear](../../aspose.pdf/outlinecollection/clear/)() | Clears all items from the collection. |
| override [Contains](../../aspose.pdf/outlinecollection/contains/)(OutlineItemCollection) | Checks does collection contains given item. |
| override [CopyTo](../../aspose.pdf/outlinecollection/copyto/)(OutlineItemCollection[], int) | Copies the outline items to an System.Array, starting at a particular System.Array index. |
| [Delete](../../aspose.pdf/outlinecollection/delete/#delete)() | Deletes all outline items from the document outline. |
| [Delete](../../aspose.pdf/outlinecollection/delete/#delete_1)(string) | Deletes the outline item with specified title from the document outline. |
| override [GetEnumerator](../../aspose.pdf/outlinecollection/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| [Remove](../../aspose.pdf/outlinecollection/remove/#remove_1)(int) | Remove item by index. |
| override [Remove](../../aspose.pdf/outlinecollection/remove/#remove)(OutlineItemCollection) | Always throws NotImplementedException |

### See Also

* class [Outlines](../outlines/)
* namespace [Aspose.Pdf](../../aspose.pdf/)
* assembly [Aspose.PDF](../../)


