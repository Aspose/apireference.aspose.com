---
title: GeoGenerator.ProducePolygons
second_title: Αναφορά Aspose.GIS για .NET API
description: GeoGenerator μέθοδος. Δημιουργεί έναν νέο απαριθμητή IPolygon με δεδομένο αριθμό τυχαίων στοιχείων όλα σε μια δεδομένη έκταση.
type: docs
weight: 30
url: /el/net/aspose.gis.geotools/geogenerator/producepolygons/
---
## GeoGenerator.ProducePolygons method

Δημιουργεί έναν νέο απαριθμητή IPolygon με δεδομένο αριθμό τυχαίων στοιχείων, όλα σε μια δεδομένη έκταση.

```csharp
public static IEnumerable<IPolygon> ProducePolygons(Extent rect, PolygonGeneratorOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rect | Extent | Καθορισμένη περιοχή (βλ[`Εκταση`](../../../aspose.gis/extent/)) |
| options | PolygonGeneratorOptions | Επιλογές δημιουργίας πολυγώνου (βλ[`PolygonGeneratorOptions`](../../polygongeneratoroptions/)) |

### Επιστρεφόμενη Αξία

Πίνακας πολυγώνων (βλ. απαρίθμηση του[`IPolygon`](../../../aspose.gis.geometries/ipolygon/))

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο αριθμός των πολυγώνων πρέπει να είναι μεγαλύτερος από ένα. |
| NullReferenceException | Η έκταση πρέπει να έχει τιμή (όχι NULL) |
| ArgumentException | Το ελάχιστο και το μέγιστο μήκος πρέπει να είναι άνισα και μεγαλύτερα από 0 |
| ArgumentException | Το μέγιστο μήκος πρέπει να είναι μεγαλύτερο από το ελάχιστο |

### Δείτε επίσης

* interface [IPolygon](../../../aspose.gis.geometries/ipolygon/)
* class [Extent](../../../aspose.gis/extent/)
* class [PolygonGeneratorOptions](../../polygongeneratoroptions/)
* class [GeoGenerator](../)
* χώρος ονομάτων [Aspose.Gis.GeoTools](../../geogenerator/)
* συνέλευση [Aspose.GIS](../../../)


