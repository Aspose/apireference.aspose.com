---
title: Interface IMediaList
second_title: Aspose.SVG für .NET-API-Referenz
description: Aspose.Svg.Dom.Css.IMediaList koppel. Die MediaListSchnittstelle bietet die Abstraktion einer geordneten Sammlung von Medien ohne zu definieren oder einzuschränken wie diese Sammlung implementiert wird. Eine leere Liste ist gleichbedeutend mit einer Liste die das Medium alle enthält.
type: docs
weight: 730
url: /de/net/aspose.svg.dom.css/imedialist/
---
## IMediaList interface

Die MediaList-Schnittstelle bietet die Abstraktion einer geordneten Sammlung von Medien, ohne zu definieren oder einzuschränken, wie diese Sammlung implementiert wird. Eine leere Liste ist gleichbedeutend mit einer Liste, die das Medium „alle“ enthält.

```csharp
public interface IMediaList : IEnumerable<string>
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Item](../../aspose.svg.dom.css/imedialist/item/) { get; } | Gibt den Index in der Liste zurück. Wenn der Index größer oder gleich der Anzahl der Medien in der Liste ist, wird null zurückgegeben. Der Medienindex. |
| [Length](../../aspose.svg.dom.css/imedialist/length/) { get; } | Die Anzahl der Medien in der Liste. Der Bereich gültiger Medien reicht von 0 bis einschließlich Länge 1. |
| [MediaText](../../aspose.svg.dom.css/imedialist/mediatext/) { get; } | Die parsbare Textdarstellung der Medienliste. Dies ist eine durch Kommas getrennte Liste von Medien. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [AppendMedium](../../aspose.svg.dom.css/imedialist/appendmedium/)(string) | Fügt das Medium newMedium am Ende der Liste hinzu. Wenn das neue Medium bereits verwendet wird, wird es zuerst entfernt. |
| [DeleteMedium](../../aspose.svg.dom.css/imedialist/deletemedium/)(string) | Löscht das durch oldMedium angegebene Medium aus der Liste. |

### Siehe auch

* namensraum [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* Montage [Aspose.SVG](../../)


