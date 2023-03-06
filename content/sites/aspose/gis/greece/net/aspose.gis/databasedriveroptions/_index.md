---
title: Class DatabaseDriverOptions
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.DatabaseDriverOptions τάξη. Επιλογές για αDatabaseDriver .
type: docs
weight: 70
url: /el/net/aspose.gis/databasedriveroptions/
---
## DatabaseDriverOptions class

Επιλογές για α[`DatabaseDriver`](../databasedriver/) .

```csharp
public abstract class DatabaseDriverOptions : DriverOptions
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Καθορίζει εάν κλείνει ένα μη κλειστόLinearRing σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Καθορίζει εάν προσθέτουμε ένα νέο σημείο στη μέση σε κάθε τμήμα της γεωμετρίας. Προεπιλογές σε`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Καθορίζει εάν διαγράφονται κοντινά σημεία σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Καθορίζει την απόσταση για[`DeleteNearPoints`](../driveroptions/deletenearpoints/) . Προεπιλογές σε`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Μια ανοχή που χρησιμοποιείται για τη γραμμικοποίηση γεωμετριών καμπυλών. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../precisionmodel/) που θα εφαρμοστεί στο M συντεταγμένη όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Καθορίζει εάν διαγράφονται σημεία που βρίσκονται στο ίδιο τμήμα σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Καθορίζει την απόσταση για[`SimplifySegments`](../driveroptions/simplifysegments/) . Προεπιλογές σε`0` . |
| [SpatialReferenceSystemMode](../../aspose.gis/databasedriveroptions/spatialreferencesystemmode/) { get; set; } | Καθορίζει πώς θα πρέπει να χειρίζεται το SRS των άγνωστων γεωμετριών για τη βάση δεδομένων όταν προστίθενται στο επίπεδο. Η προεπιλεγμένη τιμή είναιThrowException . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Καθορίζει εάν οι γεωμετρίες θα πρέπει να επικυρώνονται όταν προστίθενται στο επίπεδο. Εάν οριστεί σε`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) καλείται για κάθε γεωμετρία όταν προστίθεται στο επίπεδο και εάν αποτύχει η επικύρωση ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) είναι`false` ),[`GisException`](../gisexception/) πετιέται. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Καθορίζει εάν επιτρέπεται ο μετασχηματισμός πολυγώνου ή πολυγώνου σε γραμμή γραμμής. Προεπιλογές σε`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../precisionmodel/) που θα εφαρμοστεί στις συντεταγμένες X και Y όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../precisionmodel/) που θα εφαρμοστεί στη συντεταγμένη Z όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../precisionmodel/exact/) . |

### Δείτε επίσης

* class [DriverOptions](../driveroptions/)
* χώρος ονομάτων [Aspose.Gis](../../aspose.gis/)
* συνέλευση [Aspose.GIS](../../)


