---
title: NodeList Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Collections.NodeList class. The NodeList provides the abstraction of an ordered collection of nodes without defining or constraining how this collection is implemented
type: docs
weight: 1470
url: /net/aspose.svg.collections/nodelist/
---
## NodeList class

The NodeList provides the abstraction of an ordered collection of nodes, without defining or constraining how this collection is implemented.

```csharp
public abstract class NodeList : DOMObject, IEnumerable<Node>
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Item](../../aspose.svg.collections/nodelist/item/) { get; } | Method returns the indexth item in the collection. If index is greater than or equal to the number of nodes in the list, this returns null. |
| abstract [Length](../../aspose.svg.collections/nodelist/length/) { get; } | The number of nodes in the list. |

## Methods

| Name | Description |
| --- | --- |
| abstract [GetEnumerator](../../aspose.svg.collections/nodelist/getenumerator/)() | Returns an enumerator that iterates through the collection. |
| override [GetPlatformType](../../aspose.svg.collections/nodelist/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |

### See Also

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Node](../../aspose.svg.dom/node/)
* namespace [Aspose.Svg.Collections](../../aspose.svg.collections/)
* assembly [Aspose.SVG](../../)
