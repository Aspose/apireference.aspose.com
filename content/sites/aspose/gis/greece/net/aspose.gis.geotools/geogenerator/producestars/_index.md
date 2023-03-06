---
title: GeoGenerator.ProduceStars
second_title: Αναφορά Aspose.GIS για .NET API
description: GeoGenerator μέθοδος. Δημιουργεί μια σειρά από αστέρια όλα σε μια δεδομένη έκταση.
type: docs
weight: 40
url: /el/net/aspose.gis.geotools/geogenerator/producestars/
---
## GeoGenerator.ProduceStars method

Δημιουργεί μια σειρά από αστέρια, όλα σε μια δεδομένη έκταση.

```csharp
public static IEnumerable<IPolygon> ProduceStars(Extent rect, StarGeneratorOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rect | Extent | Καθορισμένη περιοχή (βλ[`Εκταση`](../../../aspose.gis/extent/)) |
| options | StarGeneratorOptions | Επιλογές δημιουργίας πολυγώνου (βλ[`StarGeneratorOptions`](../../stargeneratoroptions/)) |

### Επιστρεφόμενη Αξία

Συστοιχία αστεριών (βλ. απαρίθμηση των[`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο αριθμός των αστεριών πρέπει να είναι μεγαλύτερος από ένα. |
| NullReferenceException | Η έκταση πρέπει να έχει τιμή (όχι NULL) |
| ArgumentException | Το ελάχιστο και το μέγιστο μήκη πρέπει να είναι άνισα και μεγαλύτερα από 3 |
| ArgumentException | Το μέγιστο μήκος πρέπει να είναι μεγαλύτερο από το ελάχιστο |

### Δείτε επίσης

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [StarGeneratorOptions](../../stargeneratoroptions/)
* class [GeoGenerator](../)
* χώρος ονομάτων [Aspose.Gis.GeoTools](../../geogenerator/)
* συνέλευση [Aspose.GIS](../../../)


