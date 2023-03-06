---
title: CircularString.Item
second_title: Αναφορά Aspose.GIS για .NET API
description: CircularString ιδιοκτησία. Λαμβάνει ή ορίζει τοIPoint στον καθορισμένο δείκτη.
type: docs
weight: 90
url: /el/net/aspose.gis.geometries/circularstring/item/
---
## CircularString indexer

Λαμβάνει ή ορίζει το[`IPoint`](../../ipoint/) στον καθορισμένο δείκτη.

```csharp
public IPoint this[int index] { get; set; }
```

| Παράμετρος | Περιγραφή |
| --- | --- |
| index | Ο δείκτης. |

### Αξία περιουσίας

Το[`IPoint`](../../ipoint/) .

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο δείκτης είναι εκτός εύρους. |
| ArgumentNullException | Η τιμή είναι`null`. |
| ArgumentException | Το σημείο είναι κενό. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) αυτής της γεωμετρίας και[`SpatialReferenceSystem`](../spatialreferencesystem/) του επιχειρήματος δεν είναι και τα δύο`null` και δεν είναι ίσα μεταξύ τους. |

### Δείτε επίσης

* interface [IPoint](../../ipoint/)
* class [CircularString](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../circularstring/)
* συνέλευση [Aspose.GIS](../../../)


