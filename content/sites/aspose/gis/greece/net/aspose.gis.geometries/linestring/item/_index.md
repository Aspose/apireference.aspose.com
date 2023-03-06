---
title: LineString.Item
second_title: Αναφορά Aspose.GIS για .NET API
description: LineString ιδιοκτησία. Λαμβάνει ή ορίζει τοIPoint στον καθορισμένο δείκτη.
type: docs
weight: 80
url: /el/net/aspose.gis.geometries/linestring/item/
---
## LineString indexer

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
* class [LineString](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../linestring/)
* συνέλευση [Aspose.GIS](../../../)


