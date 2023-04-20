---
title: SVGListBase1.RemoveItem
second_title: Aspose.SVG för .NET API Referens
description: SVGListBase metod. Tar bort ett befintligt objekt från listan.
type: docs
weight: 100
url: /sv/net/aspose.svg.collections/svglistbase-1/removeitem/
---
## SVGListBase&lt;T&gt;.RemoveItem method

Tar bort ett befintligt objekt från listan.

```csharp
public T RemoveItem(ulong index)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| index | UInt64 | Indexet för objektet som ska tas bort. Den första posten är nummer 0. |

### Returvärde

Det borttagna objektet.

### Undantag

| undantag | skick |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Koda[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Ökas när listan inte kan ändras. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Koda[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Höjs om indexnumret är större än eller lika med numberOfItems. |

### Se även

* class [SVGListBase&lt;T&gt;](../)
* namnutrymme [Aspose.Svg.Collections](../../svglistbase-1/)
* hopsättning [Aspose.SVG](../../../)


