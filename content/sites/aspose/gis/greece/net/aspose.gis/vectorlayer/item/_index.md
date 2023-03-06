---
title: VectorLayer.Item
second_title: Αναφορά Aspose.GIS για .NET API
description: VectorLayer ιδιοκτησία. Λαμβάνει τοFeature στον καθορισμένο δείκτη.
type: docs
weight: 70
url: /el/net/aspose.gis/vectorlayer/item/
---
## VectorLayer indexer

Λαμβάνει το[`Feature`](../../feature/) στον καθορισμένο δείκτη.

```csharp
public virtual Feature this[int index] { get; }
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| index | Το ευρετήριο του χαρακτηριστικού. |

### Αξία περιουσίας

Το[`Feature`](../../feature/) .

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | πετιέται εάν ανοιχτεί το επίπεδο μόνο για εγγραφή. |
| ArgumentOutOfRangeException | Ο δείκτης είναι εκτός εύρους. |
| [GisException](../../gisexception/) | Σφάλμα κατά την ανάγνωση της δυνατότητας από το αρχείο. |
| IOException | Παρουσιάστηκε σφάλμα I/O. |

### Δείτε επίσης

* class [Feature](../../feature/)
* class [VectorLayer](../)
* χώρος ονομάτων [Aspose.Gis](../../vectorlayer/)
* συνέλευση [Aspose.GIS](../../../)


