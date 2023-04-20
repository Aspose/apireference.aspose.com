---
title: SVGListBase1.RemoveItem
second_title: Aspose.SVG voor .NET API-referentie
description: SVGListBase methode. Verwijdert een bestaand item uit de lijst.
type: docs
weight: 100
url: /nl/net/aspose.svg.collections/svglistbase-1/removeitem/
---
## SVGListBase&lt;T&gt;.RemoveItem method

Verwijdert een bestaand item uit de lijst.

```csharp
public T RemoveItem(ulong index)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | UInt64 | De index van het item dat moet worden verwijderd. Het eerste item is nummer 0. |

### Winstwaarde

Het verwijderde artikel.

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Code[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Verhoogd wanneer de lijst niet kan worden gewijzigd. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Code[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Wordt verhoogd als het indexnummer groter is dan of gelijk is aan numberOfItems. |

### Zie ook

* class [SVGListBase&lt;T&gt;](../)
* naamruimte [Aspose.Svg.Collections](../../svglistbase-1/)
* montage [Aspose.SVG](../../../)


