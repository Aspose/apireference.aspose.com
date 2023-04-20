---
title: Class NamedNodeMap
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.Collections.NamedNodeMap klas. Stellt Sammlungen von Attributen dar auf die über den Namen zugegriffen werden kann.
type: docs
weight: 30
url: /de/net/aspose.svg.collections/namednodemap/
---
## NamedNodeMap class

Stellt Sammlungen von Attributen dar, auf die über den Namen zugegriffen werden kann.

```csharp
public class NamedNodeMap : DOMObject, IDisposable, IEnumerable<Attr>
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Item](../../aspose.svg.collections/namednodemap/item/) { get; } | Gibt das index-te Element in der Map zurück. Wenn der Index größer oder gleich der Anzahl der Knoten in dieser Karte ist, wird null zurückgegeben. (2 indexers) |
| [Length](../../aspose.svg.collections/namednodemap/length/) { get; } | Die Anzahl der Knoten in dieser Karte. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [GetEnumerator](../../aspose.svg.collections/namednodemap/getenumerator/)() | Gibt einen Enumerator zurück, der die Sammlung durchläuft. |
| [GetNamedItem](../../aspose.svg.collections/namednodemap/getnameditem/)(string) | Ruft einen namentlich angegebenen Knoten ab. |
| [GetNamedItemNS](../../aspose.svg.collections/namednodemap/getnameditemns/)(string, string) | Ruft einen Knoten ab, der durch lokalen Namen und Namensraum-URI angegeben ist. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Diese Methode wird zum Abrufen des ECMAScript-Objekts verwendetType . |
| [RemoveNamedItem](../../aspose.svg.collections/namednodemap/removenameditem/)(string) | Entfernt einen namentlich angegebenen Knoten. |
| [RemoveNamedItemNS](../../aspose.svg.collections/namednodemap/removenameditemns/)(string, string) | Entfernt einen Knoten, der durch lokalen Namen und Namespace-URI angegeben ist. |
| [SetNamedItem](../../aspose.svg.collections/namednodemap/setnameditem/)(Attr) | Fügt einen Knoten mit seinem nodeName-Attribut hinzu. Wenn ein Knoten mit diesem Namen bereits in dieser Map vorhanden ist, wird er durch den neuen ersetzt. Das Ersetzen eines Knotens durch sich selbst hat keine Auswirkung. |
| [SetNamedItemNS](../../aspose.svg.collections/namednodemap/setnameditemns/)(Attr) | Fügt einen Knoten mit seinem NamespaceURI und localName hinzu. Wenn ein Knoten mit diesem Namensraum-URI und diesem lokalen Namen bereits in dieser Zuordnung vorhanden ist, wird er durch den neuen ersetzt. Das Ersetzen eines Knotens durch sich selbst hat keine Auswirkung. |

### Siehe auch

* class [DOMObject](../../aspose.svg.dom/domobject/)
* class [Attr](../../aspose.svg.dom/attr/)
* namensraum [Aspose.Svg.Collections](../../aspose.svg.collections/)
* Montage [Aspose.SVG](../../)


