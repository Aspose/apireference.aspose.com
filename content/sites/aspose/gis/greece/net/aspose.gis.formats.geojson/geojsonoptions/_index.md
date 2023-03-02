---
title: Class GeoJsonOptions
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.GeoJson.GeoJsonOptions τάξη. Επιλογές ειδικές για το πρόγραμμα οδήγησης για τη μορφή GeoJSON.
type: docs
weight: 310
url: /el/net/aspose.gis.formats.geojson/geojsonoptions/
---
## GeoJsonOptions class

Επιλογές ειδικές για το πρόγραμμα οδήγησης για τη μορφή GeoJSON.

```csharp
public class GeoJsonOptions : DriverOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [GeoJsonOptions](geojsonoptions/)() | Δημιουργία νέας παρουσίας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [ArrayAsString](../../aspose.gis.formats.geojson/geojsonoptions/arrayasstring/) { get; set; } | Εάν θα εκτεθούν πίνακες JSon από συμβολοσειρές, ακέραιους ή πραγματικούς αριθμούς ως συμβολοσειρά. |
| [AttributesSkip](../../aspose.gis.formats.geojson/geojsonoptions/attributesskip/) { get; set; } | Το ελέγχει τη μετάφραση των χαρακτηριστικών: ναι - παράβλεψη όλων των χαρακτηριστικών |
| [AutoId](../../aspose.gis.formats.geojson/geojsonoptions/autoid/) { get; set; } | Αυτόματη δημιουργία ids |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Καθορίζει εάν κλείνει ένα μη κλειστόLinearRing σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Καθορίζει εάν προσθέτουμε ένα νέο σημείο στη μέση σε κάθε τμήμα της γεωμετρίας. Προεπιλογές σε`false` . |
| [DateAsString](../../aspose.gis.formats.geojson/geojsonoptions/dateasstring/) { get; set; } | Εάν θα εκτεθεί η ημερομηνία/ώρα/ημερομηνία-ώρα JSon ως συμβολοσειρά. |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Καθορίζει εάν διαγράφονται κοντινά σημεία σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Καθορίζει την απόσταση για[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Προεπιλογές σε`0` . |
| [Description](../../aspose.gis.formats.geojson/geojsonoptions/description/) { get; set; } | Περιγραφή σε επίπεδο συλλογής χαρακτηριστικών (για δημιουργία επιπέδου) |
| [GeometryAsCollection](../../aspose.gis.formats.geojson/geojsonoptions/geometryascollection/) { get; set; } | έλεγχος μετάφρασης των γεωμετριών: ναι - αναδίπλωση γεωμετριών με GeometryCollection type |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Μια ανοχή που χρησιμοποιείται για τη γραμμικοποίηση γεωμετριών καμπυλών. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στο M συντεταγμένη όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [Name](../../aspose.gis.formats.geojson/geojsonoptions/name/) { get; set; } | Όνομα σε επίπεδο συλλογής χαρακτηριστικών (για δημιουργία επιπέδου) |
| [NestedPropertiesSeparator](../../aspose.gis.formats.geojson/geojsonoptions/nestedpropertiesseparator/) { get; set; } | Λαμβάνει ή ορίζει μια συμβολοσειρά που χρησιμοποιείται για τον διαχωρισμό στοιχείων ένθετων χαρακτηριστικών. Η προεπιλογή είναι "_". |
| [ReadBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/readboundingboxes/) { get; set; } | Καθορίζει εάν τα Bounding Boxes ('bbox') πρέπει να διαβάζονται ως χαρακτηριστικά με όνομα 'bbox_0', 'bbox_1', κ.λπ. Η προεπιλεγμένη τιμή είναι`false` . Το[`NestedPropertiesSeparator`](./nestedpropertiesseparator/) Η συμβολοσειρά χρησιμοποιείται στα bbox_0, bbox_1,.. names. |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Καθορίζει εάν διαγράφονται σημεία που βρίσκονται στο ίδιο τμήμα σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Καθορίζει την απόσταση για[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Προεπιλογές σε`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Καθορίζει εάν οι γεωμετρίες θα πρέπει να επικυρώνονται όταν προστίθενται στο επίπεδο. Εάν οριστεί σε`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) καλείται για κάθε γεωμετρία όταν προστίθεται στο επίπεδο και εάν αποτύχει η επικύρωση ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) είναι`false` ),[`GisException`](../../aspose.gis/gisexception/) πετιέται. |
| [WriteBoundingBoxes](../../aspose.gis.formats.geojson/geojsonoptions/writeboundingboxes/) { get; set; } | Καθορίζει εάν τα αντικείμενα GeoJSON θα πρέπει να περιλαμβάνονται πληροφορίες σχετικά με το εύρος συντεταγμένων για τις Γεωμετρίες του. Εάν έχει οριστεί σε`true` , ένα μέλος "bbox" δημιουργείται για κάθε γεωμετρία (όχι null) όταν προστίθεται στο επίπεδο. Η προεπιλεγμένη τιμή είναι`false` . |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Καθορίζει εάν επιτρέπεται ο μετασχηματισμός πολυγώνου ή πολυγώνου σε γραμμή γραμμής. Προεπιλογές σε`false` . |
| [WriteUnsetAttribute](../../aspose.gis.formats.geojson/geojsonoptions/writeunsetattribute/) { get; set; } | Εάν θα γραφτούν μη καθορισμένα χαρακτηριστικά προσθέτοντας 'null' value |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στις συντεταγμένες X και Y όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στη συντεταγμένη Z όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Δείτε επίσης

* class [DriverOptions](../../aspose.gis/driveroptions/)
* χώρος ονομάτων [Aspose.Gis.Formats.GeoJson](../../aspose.gis.formats.geojson/)
* συνέλευση [Aspose.GIS](../../)


