---
title: Interface IElementTraversal
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.Dom.Traversal.IElementTraversal koppel. Die ElementTraversalSchnittstelle ist ein Satz von schreibgeschützten Attributen die es einem Autor ermöglichen einfach zwischen Elementen in einem Dokument zu navigieren. In konformen Implementierungen von Element Traversal müssen alle Objekte die Element implementieren auch die ElementTraversalSchnittstelle implementieren.
type: docs
weight: 1230
url: /de/net/aspose.svg.dom.traversal/ielementtraversal/
---
## IElementTraversal interface

Die ElementTraversal-Schnittstelle ist ein Satz von schreibgeschützten Attributen, die es einem Autor ermöglichen, einfach zwischen Elementen in einem Dokument zu navigieren. In konformen Implementierungen von Element Traversal müssen alle Objekte, die Element implementieren, auch die ElementTraversal-Schnittstelle implementieren.

```csharp
public interface IElementTraversal
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ChildElementCount](../../aspose.svg.dom.traversal/ielementtraversal/childelementcount/) { get; } | Gibt die aktuelle Anzahl der Elementknoten zurück, die Kinder dieses Elements sind. 0, wenn dieses Element keine untergeordneten Knoten hat, die vom nodeType 1. sind |
| [FirstElementChild](../../aspose.svg.dom.traversal/ielementtraversal/firstelementchild/) { get; } | Gibt den ersten untergeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine untergeordneten Elemente hat. |
| [LastElementChild](../../aspose.svg.dom.traversal/ielementtraversal/lastelementchild/) { get; } | Gibt den letzten untergeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine untergeordneten Elemente hat. |
| [NextElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/nextelementsibling/) { get; } | Gibt den nächsten gleichgeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine untergeordneten Elementknoten hat, die im Dokumentbaum nach diesem Knoten kommen. |
| [PreviousElementSibling](../../aspose.svg.dom.traversal/ielementtraversal/previouselementsibling/) { get; } | Gibt den vorherigen gleichgeordneten Elementknoten dieses Elements zurück. null, wenn dieses Element keine Element-Geschwisterknoten hat, die vor diesem im Dokumentbaum stehen. |

### Siehe auch

* namensraum [Aspose.Svg.Dom.Traversal](../../aspose.svg.dom.traversal/)
* Montage [Aspose.SVG](../../)


