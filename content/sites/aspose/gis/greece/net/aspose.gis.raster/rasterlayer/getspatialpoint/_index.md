---
title: RasterLayer.GetSpatialPoint
second_title: Αναφορά Aspose.GIS για .NET API
description: RasterLayer μέθοδος. Μετατρέπει την καθορισμένη στήλη και σειρά στη χωρική συντεταγμένη.
type: docs
weight: 150
url: /el/net/aspose.gis.raster/rasterlayer/getspatialpoint/
---
## RasterLayer.GetSpatialPoint method

Μετατρέπει την καθορισμένη στήλη και σειρά στη χωρική συντεταγμένη.

```csharp
public IPoint GetSpatialPoint(int cellX, int cellY)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| cellX | Int32 | Η τιμή για τη στήλη (συντεταγμένη x). Η αρίθμηση ξεκινά από το 0. |
| cellY | Int32 | Η τιμή για τη σειρά (συντεταγμένη y). Η αρίθμηση ξεκινά από το 0. |

### Επιστρεφόμενη Αξία

Επιστρέφει τη συντεταγμένη x της επάνω αριστερής γωνίας που δίνεται σε στήλη και γραμμή.

### Παρατηρήσεις

Εάν κάποια παράμετρος περάσει εκτός του εύρους της αντίστοιχης διάστασης του ράστερ, θα επιστρέψει συντεταγμένες εκτός του ράστερ υποθέτοντας ότι το πλέγμα του ράστερ είναι εφαρμόσιμο εκτός των ορίων του ράστερ.

### Δείτε επίσης

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [RasterLayer](../)
* χώρος ονομάτων [Aspose.Gis.Raster](../../rasterlayer/)
* συνέλευση [Aspose.GIS](../../../)


