---
title: SVGListBase1.ReplaceItem
second_title: Aspose.SVG för .NET API Referens
description: SVGListBase metod. Ersätter ett befintligt objekt i listan med ett nytt objekt.
type: docs
weight: 110
url: /sv/net/aspose.svg.collections/svglistbase-1/replaceitem/
---
## SVGListBase&lt;T&gt;.ReplaceItem method

Ersätter ett befintligt objekt i listan med ett nytt objekt.

```csharp
public T ReplaceItem(T newItem, ulong index)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| newItem | T | Objektet som ska infogas i listan. |
| index | UInt64 | Indexet för den artikel som ska ersättas. Den första posten är nummer 0. |

### Returvärde

Det infogade objektet.

### Undantag

| undantag | skick |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Koda[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Ökas när listan inte kan ändras. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Koda[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Höjs om indexnumret är större än eller lika med numberOfItems. |

### Se även

* class [SVGListBase&lt;T&gt;](../)
* namnutrymme [Aspose.Svg.Collections](../../svglistbase-1/)
* hopsättning [Aspose.SVG](../../../)


