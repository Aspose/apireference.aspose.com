---
title: SVGListBaseT Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Collections.SVGListBase1T class. This interface defines a base list of all SVG lists
type: docs
weight: 4110
url: /net/aspose.svg.collections/svglistbase-1/
---
## SVGListBase&lt;T&gt; class

This interface defines a base list of all SVG lists.

```csharp
public abstract class SVGListBase<T> : SVGValueType, IEnumerable<T>
```

| Parameter | Description |
| --- | --- |
| T | Type of item stored in list. |

## Properties

| Name | Description |
| --- | --- |
| [Item](../../aspose.svg.collections/svglistbase-1/item/) { get; set; } | Returns the indexth item in the list. |
| [Length](../../aspose.svg.collections/svglistbase-1/length/) { get; } | The number of items in the list. |
| [NumberOfItems](../../aspose.svg.collections/svglistbase-1/numberofitems/) { get; } | The number of items in the list. |

## Methods

| Name | Description |
| --- | --- |
| [AppendItem](../../aspose.svg.collections/svglistbase-1/appenditem/)(T) | Inserts a new item at the end of the list. |
| [Clear](../../aspose.svg.collections/svglistbase-1/clear/)() | Clears all existing current items from the list, with the result being an empty list. |
| [Dispose](../../aspose.svg.datatypes/svgvaluetype/dispose/)() | Releases unmanaged and - optionally - managed resources. |
| [GetEnumerator](../../aspose.svg.collections/svglistbase-1/getenumerator/)() | Gets the enumerator. |
| [GetItem](../../aspose.svg.collections/svglistbase-1/getitem/)(ulong) | Returns the specified item from the list. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [Initialize](../../aspose.svg.collections/svglistbase-1/initialize/)(T) | Clears all existing current items from the list and re-initializes the list to hold the single item specified by the parameter. |
| [InsertItemBefore](../../aspose.svg.collections/svglistbase-1/insertitembefore/)(T, ulong) | Inserts a new item into the list at the specified position. The first item is number 0. |
| [RemoveItem](../../aspose.svg.collections/svglistbase-1/removeitem/)(ulong) | Removes an existing item from the list. |
| [ReplaceItem](../../aspose.svg.collections/svglistbase-1/replaceitem/)(T, ulong) | Replaces an existing item in the list with a new item. |

### See Also

* class [SVGValueType](../../aspose.svg.datatypes/svgvaluetype/)
* namespace [Aspose.Svg.Collections](../../aspose.svg.collections/)
* assembly [Aspose.SVG](../../)
