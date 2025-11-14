---
title: HTMLCollection Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Collections.HTMLCollection class. The HTMLCollection represents a generic collection of Element
type: docs
weight: 2010
url: /net/aspose.svg.collections/htmlcollection/
---
## HTMLCollection class

The `HTMLCollection` represents a generic collection of [`Element`](../../aspose.svg.dom/element/).

```csharp
public abstract class HTMLCollection : DOMObject, IEnumerable<Element>
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Item](../../aspose.svg.collections/htmlcollection/item/) { get; } | Returns the index-th item in the collection. If index is greater than or equal to the number of nodes in the list, this returns null. |
| abstract [Length](../../aspose.svg.collections/htmlcollection/length/) { get; } | The number of nodes in the list. |

## Methods

| Name | Description |
| --- | --- |
| abstract [GetEnumerator](../../aspose.svg.collections/htmlcollection/getenumerator/)() | Gets the enumerator. |
| override [GetPlatformType](../../aspose.svg.collections/htmlcollection/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [NamedItem](../../aspose.svg.collections/htmlcollection/nameditem/)(*string*) | Returns the item in the collection matched specified name. |

### See Also

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Element](../../aspose.svg.dom/element/)
* namespace [Aspose.Svg.Collections](../../aspose.svg.collections/)
* assembly [Aspose.SVG](../../)
