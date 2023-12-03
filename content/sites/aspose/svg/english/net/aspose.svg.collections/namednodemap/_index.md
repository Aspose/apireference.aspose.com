---
title: NamedNodeMap Class
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Collections.NamedNodeMap class. Represents collections of attributes that can be accessed by name
type: docs
weight: 3440
url: /net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

Represents collections of attributes that can be accessed by name.

```csharp
public class NamedNodeMap : DOMObject
```

## Properties

| Name | Description |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | Returns the index-th item in the map. If index is greater than or equal to the number of nodes in this map, this returns null. (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | The number of nodes in this map. |

## Methods

| Name | Description |
| --- | --- |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | Retrieves a node specified by name. |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | Retrieves a node specified by local name and namespace URI. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | This method is used to retrieve ECMAScript object Type. |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | Removes a node specified by name. |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | Removes a node specified by local name and namespace URI. |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | Adds a node using its nodeName attribute. If a node with that name is already present in this map, it is replaced by the new one. Replacing a node by itself has no effect. |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | Adds a node using its namespaceURI and localName. If a node with that namespace URI and that local name is already present in this map, it is replaced by the new one. Replacing a node by itself has no effect. |

### See Also

* class [DOMObject](../../aspose.svg.dom/domobject/)
* namespace [Aspose.Svg.Collections](../../aspose.svg.collections/)
* assembly [Aspose.SVG](../../)
