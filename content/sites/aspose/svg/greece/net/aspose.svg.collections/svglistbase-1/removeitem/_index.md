---
title: SVGListBase1.RemoveItem
second_title: Aspose.SVG για Αναφορά API .NET
description: SVGListBase μέθοδος. Αφαιρεί ένα υπάρχον στοιχείο από τη λίστα.
type: docs
weight: 100
url: /el/net/aspose.svg.collections/svglistbase-1/removeitem/
---
## SVGListBase&lt;T&gt;.RemoveItem method

Αφαιρεί ένα υπάρχον στοιχείο από τη λίστα.

```csharp
public T RemoveItem(ulong index)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| index | UInt64 | Το ευρετήριο του στοιχείου που πρόκειται να αφαιρεθεί. Το πρώτο στοιχείο είναι ο αριθμός 0. |

### Επιστρεφόμενη Αξία

Το στοιχείο που αφαιρέθηκε.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| [DOMException](../../../aspose.svg.dom/domexception/) | Κώδικας[`NO_MODIFICATION_ALLOWED_ERR`](../../../aspose.svg.dom/domexception/no_modification_allowed_err/). Αυξάνεται όταν η λίστα δεν μπορεί να τροποποιηθεί. |
| [DOMException](../../../aspose.svg.dom/domexception/) | Κώδικας[`INDEX_SIZE_ERR`](../../../aspose.svg.dom/domexception/index_size_err/). Αυξάνεται εάν ο αριθμός ευρετηρίου είναι μεγαλύτερος ή ίσος με το numberOfItems. |

### Δείτε επίσης

* class [SVGListBase&lt;T&gt;](../)
* χώρος ονομάτων [Aspose.Svg.Collections](../../svglistbase-1/)
* συνέλευση [Aspose.SVG](../../../)


