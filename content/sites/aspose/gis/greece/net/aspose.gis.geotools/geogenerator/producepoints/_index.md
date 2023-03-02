---
title: GeoGenerator.ProducePoints
second_title: Αναφορά Aspose.GIS για .NET API
description: GeoGenerator μέθοδος. Δημιουργεί μια σειρά σημείων που ανήκουν στην καθορισμένη περιοχή.
type: docs
weight: 20
url: /el/net/aspose.gis.geotools/geogenerator/producepoints/
---
## GeoGenerator.ProducePoints method

Δημιουργεί μια σειρά σημείων που ανήκουν στην καθορισμένη περιοχή.

```csharp
public static IEnumerable<IGeometry> ProducePoints(Extent rect, PointGeneratorOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rect | Extent | Καθορισμένη περιοχή (βλ[`Εκταση`](../../../aspose.gis/extent/)). |
| options | PointGeneratorOptions | Επιλογές δημιουργίας σημείων (βλ[`PointGeneratorOptions`](../../pointgeneratoroptions/)). |

### Επιστρεφόμενη Αξία

Πίνακας σημείων (βλ. απαρίθμηση του[`IGeometry`](../../../aspose.gis.geometries/igeometry/)).

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο αριθμός των πόντων πρέπει να είναι μεγαλύτερος από έναν. |
| NullReferenceException | Η έκταση πρέπει να έχει τιμή (όχι NULL). |

### Δείτε επίσης

* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [Extent](../../../aspose.gis/extent/)
* class [PointGeneratorOptions](../../pointgeneratoroptions/)
* class [GeoGenerator](../)
* χώρος ονομάτων [Aspose.Gis.GeoTools](../../geogenerator/)
* συνέλευση [Aspose.GIS](../../../)


