---
title: Class MapInfoTabOptions
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.MapInfoTab.MapInfoTabOptions τάξη. Επιλογές ειδικές για το πρόγραμμα οδήγησης για τη μορφή της καρτέλας MapInfo.
type: docs
weight: 610
url: /el/net/aspose.gis.formats.mapinfotab/mapinfotaboptions/
---
## MapInfoTabOptions class

Επιλογές ειδικές για το πρόγραμμα οδήγησης για τη μορφή της καρτέλας MapInfo.

```csharp
public class MapInfoTabOptions : DriverOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [MapInfoTabOptions](mapinfotaboptions/)() | Δημιουργία νέας παρουσίας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [BlockSize](../../aspose.gis.formats.mapinfotab/mapinfotaboptions/blocksize/) { get; set; } | Μέγεθος μπλοκ για αρχεία '*.map' (πολλαπλάσια των 512). Προεπιλογή στο 16384. Έγκυρες τιμές: 512 έως 32256. |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Καθορίζει εάν κλείνει ένα μη κλειστόLinearRing σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Καθορίζει εάν προσθέτουμε ένα νέο σημείο στη μέση σε κάθε τμήμα της γεωμετρίας. Προεπιλογές σε`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Καθορίζει εάν διαγράφονται κοντινά σημεία σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Καθορίζει την απόσταση για[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Προεπιλογές σε`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Μια ανοχή που χρησιμοποιείται για τη γραμμικοποίηση γεωμετριών καμπυλών. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στο M συντεταγμένη όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Καθορίζει εάν διαγράφονται σημεία που βρίσκονται στο ίδιο τμήμα σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Καθορίζει την απόσταση για[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Προεπιλογές σε`0` . |
| [TextStringAttribute](../../aspose.gis.formats.mapinfotab/mapinfotaboptions/textstringattribute/) { get; set; } | Καθορίζει το όνομα του χαρακτηριστικού που αντιπροσωπεύει κείμενο του γραφικού αντικειμένου "Κείμενο". |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Καθορίζει εάν οι γεωμετρίες θα πρέπει να επικυρώνονται όταν προστίθενται στο επίπεδο. Εάν οριστεί σε`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) καλείται για κάθε γεωμετρία όταν προστίθεται στο επίπεδο και εάν αποτύχει η επικύρωση ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) είναι`false` ),[`GisException`](../../aspose.gis/gisexception/) πετιέται. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Καθορίζει εάν επιτρέπεται ο μετασχηματισμός πολυγώνου ή πολυγώνου σε γραμμή γραμμής. Προεπιλογές σε`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στις συντεταγμένες X και Y όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στη συντεταγμένη Z όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Δείτε επίσης

* class [DriverOptions](../../aspose.gis/driveroptions/)
* χώρος ονομάτων [Aspose.Gis.Formats.MapInfoTab](../../aspose.gis.formats.mapinfotab/)
* συνέλευση [Aspose.GIS](../../)


