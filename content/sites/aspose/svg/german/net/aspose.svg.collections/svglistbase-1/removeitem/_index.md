---
title: SVGListBase1.RemoveItem
second_title: Aspose.SVG für .NET-API-Referenz
description: SVGListBase methode. Entfernt ein vorhandenes Element aus der Liste.
type: docs
weight: 100
url: /de/net/aspose.svg.collections/svglistbase-1/removeitem/
---
## SVGListBase&lt;T&gt;.RemoveItem method

Entfernt ein vorhandenes Element aus der Liste.

```csharp
public T RemoveItem(ulong index)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| index | UInt64 | Der Index des Elements, das entfernt werden soll. Das erste Element ist die Nummer 0. |

### Rückgabewert

Das entfernte Element.

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Code[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Wird ausgelöst, wenn die Liste nicht geändert werden kann. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Code[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Wird ausgelöst, wenn die Indexnummer größer oder gleich numberOfItems ist. |

### Siehe auch

* class [SVGListBase&lt;T&gt;](../)
* namensraum [Aspose.Svg.Collections](../../svglistbase-1/)
* Montage [Aspose.SVG](../../../)


