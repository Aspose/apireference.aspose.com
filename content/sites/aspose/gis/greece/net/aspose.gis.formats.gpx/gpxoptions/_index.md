---
title: Class GpxOptions
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.Gpx.GpxOptions τάξη. Επιλογές ειδικές για το πρόγραμμα οδήγησης για μορφή GPX.
type: docs
weight: 370
url: /el/net/aspose.gis.formats.gpx/gpxoptions/
---
## GpxOptions class

Επιλογές ειδικές για το πρόγραμμα οδήγησης για μορφή GPX.

```csharp
public class GpxOptions : DriverOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [GpxOptions](gpxoptions/)() | Δημιουργία νέας παρουσίας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Καθορίζει εάν κλείνει ένα μη κλειστόLinearRing σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Καθορίζει εάν προσθέτουμε ένα νέο σημείο στη μέση σε κάθε τμήμα της γεωμετρίας. Προεπιλογές σε`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Καθορίζει εάν διαγράφονται κοντινά σημεία σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Καθορίζει την απόσταση για[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Προεπιλογές σε`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Μια ανοχή που χρησιμοποιείται για τη γραμμικοποίηση γεωμετριών καμπυλών. |
| [MAttribute](../../aspose.gis.formats.gpx/gpxoptions/mattribute/) { get; set; } | Καθορίζει ποιο χαρακτηριστικό GPX θα εξαχθεί ως συντεταγμένη "M" των σημείων διαδρομής, των σημείων διαδρομής και των σημείων διαδρομής. Η συμπεριφορά είναι ίδια με[`ZAttribute`](./zattribute/) , προεπιλογή σε`null` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στο M συντεταγμένη όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedAttributeSeparator](../../aspose.gis.formats.gpx/gpxoptions/nestedattributeseparator/) { get; } | Μια συμβολοσειρά για τον διαχωρισμό του ένθετου ονόματος χαρακτηριστικού και των ευρετηρίων του. Προεπιλογή για διπλή υπογράμμιση "__". |
| [ReadNestedAttributes](../../aspose.gis.formats.gpx/gpxoptions/readnestedattributes/) { get; set; } | Καθορίζει εάν τα σημεία GPX, όπως τα 'trkpt' και 'rtept', περιέχουν εσωτερικά χαρακτηριστικά και εάν πρέπει να διαβαστούν. Προεπιλογές σε`false` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Καθορίζει εάν διαγράφονται σημεία που βρίσκονται στο ίδιο τμήμα σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Καθορίζει την απόσταση για[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Προεπιλογές σε`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Καθορίζει εάν οι γεωμετρίες θα πρέπει να επικυρώνονται όταν προστίθενται στο επίπεδο. Εάν οριστεί σε`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) καλείται για κάθε γεωμετρία όταν προστίθεται στο επίπεδο και εάν αποτύχει η επικύρωση ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) είναι`false` ),[`GisException`](../../aspose.gis/gisexception/) πετιέται. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Καθορίζει εάν επιτρέπεται ο μετασχηματισμός πολυγώνου ή πολυγώνου σε γραμμή γραμμής. Προεπιλογές σε`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στις συντεταγμένες X και Y όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZAttribute](../../aspose.gis.formats.gpx/gpxoptions/zattribute/) { get; set; } | Καθορίζει ποιο χαρακτηριστικό GPX θα εξαχθεί ως συντεταγμένη "Z" των σημείων διαδρομής, των σημείων διαδρομής και των σημείων διαδρομής. Εάν`null` κανένα χαρακτηριστικό δεν θα εξαχθεί ως συντεταγμένη "Z". Προεπιλογές σε "ele". Οι πιθανές τιμές είναι ονόματα όλων των χαρακτηριστικών GPX XML που μπορούν να αναπαρασταθούν ως διπλά (π.χ. "speed", "magvar", "geoiheight" κ.λπ. ) |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στη συντεταγμένη Z όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Δείτε επίσης

* class [DriverOptions](../../aspose.gis/driveroptions/)
* χώρος ονομάτων [Aspose.Gis.Formats.Gpx](../../aspose.gis.formats.gpx/)
* συνέλευση [Aspose.GIS](../../)


