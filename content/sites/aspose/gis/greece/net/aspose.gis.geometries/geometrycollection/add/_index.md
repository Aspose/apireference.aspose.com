---
title: GeometryCollection.Add
second_title: Αναφορά Aspose.GIS για .NET API
description: GeometryCollection μέθοδος. Προσθέτει την καθορισμένη γεωμετρία στη συλλογή.
type: docs
weight: 110
url: /el/net/aspose.gis.geometries/geometrycollection/add/
---
## GeometryCollection.Add method

Προσθέτει την καθορισμένη γεωμετρία στη συλλογή.

```csharp
public void Add(IGeometry geometry)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| geometry | IGeometry | Η γεωμετρία για προσθήκη. |

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Το επιχείρημα είναι`null`. |
| ArgumentException | Η συλλογή δεν δέχεται γεωμετρίες αυτού του τύπου. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) αυτής της γεωμετρίας και[`SpatialReferenceSystem`](../spatialreferencesystem/) του ορίσματος είναι και τα δύο not `null` και δεν είναι ίσα μεταξύ τους. |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [GeometryCollection](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometrycollection/)
* συνέλευση [Aspose.GIS](../../../)


