---
title: GeoGenerator.ProduceLines
second_title: Αναφορά Aspose.GIS για .NET API
description: GeoGenerator μέθοδος. Δημιουργεί έναν νέο απαριθμητή ILineString με δεδομένο αριθμό τυχαίων στοιχείων όλα σε μια δεδομένη έκταση.
type: docs
weight: 10
url: /el/net/aspose.gis.geotools/geogenerator/producelines/
---
## GeoGenerator.ProduceLines method

Δημιουργεί έναν νέο απαριθμητή ILineString με δεδομένο αριθμό τυχαίων στοιχείων, όλα σε μια δεδομένη έκταση.

```csharp
public static IEnumerable<ILineString> ProduceLines(Extent rect, LineGeneratorOptions options)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| rect | Extent | Καθορισμένη περιοχή (βλ[`Εκταση`](../../../aspose.gis/extent/)) |
| options | LineGeneratorOptions | Επιλογές δημιουργίας γραμμής (βλ[`LineGeneratorOptions`](../../linegeneratoroptions/)) |

### Επιστρεφόμενη Αξία

Πίνακας γραμμών (βλ. απαρίθμηση του[`ILineString`](../../../aspose.gis.geometries/ilinestring/))

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentOutOfRangeException | Ο αριθμός των γραμμών πρέπει να είναι μεγαλύτερος από μία. |
| NullReferenceException | Η έκταση πρέπει να έχει τιμή (όχι NULL) |

### Δείτε επίσης

* interface [ILineString](../../../aspose.gis.geometries/ilinestring/)
* class [Extent](../../../aspose.gis/extent/)
* class [LineGeneratorOptions](../../linegeneratoroptions/)
* class [GeoGenerator](../)
* χώρος ονομάτων [Aspose.Gis.GeoTools](../../geogenerator/)
* συνέλευση [Aspose.GIS](../../../)


