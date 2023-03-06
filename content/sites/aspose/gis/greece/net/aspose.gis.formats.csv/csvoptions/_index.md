---
title: Class CsvOptions
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.Csv.CsvOptions τάξη. Επιλογές ειδικές για το πρόγραμμα οδήγησης για μορφή CSV.
type: docs
weight: 200
url: /el/net/aspose.gis.formats.csv/csvoptions/
---
## CsvOptions class

Επιλογές ειδικές για το πρόγραμμα οδήγησης για μορφή CSV.

```csharp
public class CsvOptions : DriverOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [CsvOptions](csvoptions/)() | Δημιουργία νέας παρουσίας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Καθορίζει εάν κλείνει ένα μη κλειστόLinearRing σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [ColumnM](../../aspose.gis.formats.csv/csvoptions/columnm/) { get; set; } | Λαμβάνει ή ορίζει ένα όνομα στήλης που περιέχει την τιμή συντεταγμένων M. Η προεπιλογή είναι`null` . |
| [ColumnWkt](../../aspose.gis.formats.csv/csvoptions/columnwkt/) { get; set; } | Λαμβάνει ή ορίζει ένα όνομα στήλης που περιέχει Γνωστό κείμενο για την αναπαράσταση της γεωμετρίας. Η προεπιλογή είναι`null` . |
| [ColumnX](../../aspose.gis.formats.csv/csvoptions/columnx/) { get; set; } | Λαμβάνει ή ορίζει ένα όνομα στήλης που περιέχει την τιμή συντεταγμένων X. Η προεπιλογή είναι`null` . |
| [ColumnY](../../aspose.gis.formats.csv/csvoptions/columny/) { get; set; } | Λαμβάνει ή ορίζει ένα όνομα στήλης που περιέχει την τιμή συντεταγμένων Y. Η προεπιλογή είναι`null` . |
| [ColumnZ](../../aspose.gis.formats.csv/csvoptions/columnz/) { get; set; } | Λαμβάνει ή ορίζει ένα όνομα στήλης που περιέχει την τιμή συντεταγμένων Z. Η προεπιλογή είναι`null` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Καθορίζει εάν προσθέτουμε ένα νέο σημείο στη μέση σε κάθε τμήμα της γεωμετρίας. Προεπιλογές σε`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Καθορίζει εάν διαγράφονται κοντινά σημεία σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Καθορίζει την απόσταση για[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Προεπιλογές σε`0` . |
| [Delimiter](../../aspose.gis.formats.csv/csvoptions/delimiter/) { get; set; } | Λαμβάνει ή ορίζει έναν χαρακτήρα που χρησιμοποιείται ως οριοθέτης για να διαχωρίσει τιμές. Η προεπιλογή είναι ','. |
| [DoubleQuoteEscape](../../aspose.gis.formats.csv/csvoptions/doublequoteescape/) { get; set; } | Λαμβάνει ή ορίζει έναν χαρακτήρα που χρησιμοποιείται ως γράμμα διαφυγής για διπλά εισαγωγικά. Η προεπιλογή είναι """. |
| [HasAttributeNames](../../aspose.gis.formats.csv/csvoptions/hasattributenames/) { get; set; } | Καθορίζει εάν υπάρχει μια σειρά κεφαλίδας με ονόματα χαρακτηριστικών. Η προεπιλογή είναι`true` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Μια ανοχή που χρησιμοποιείται για τη γραμμικοποίηση γεωμετριών καμπυλών. |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στο M συντεταγμένη όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Καθορίζει εάν διαγράφονται σημεία που βρίσκονται στο ίδιο τμήμα σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Καθορίζει την απόσταση για[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Προεπιλογές σε`0` . |
| [StartLineNumber](../../aspose.gis.formats.csv/csvoptions/startlinenumber/) { get; set; } | Λαμβάνει ή ορίζει έναν αριθμό γραμμής με βάση το μηδέν που θα είναι πρώτος κατά την ανάγνωση των δεδομένων. Η προεπιλογή είναι 0. |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Καθορίζει εάν οι γεωμετρίες θα πρέπει να επικυρώνονται όταν προστίθενται στο επίπεδο. Εάν οριστεί σε`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) καλείται για κάθε γεωμετρία όταν προστίθεται στο επίπεδο και εάν αποτύχει η επικύρωση ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) είναι`false` ),[`GisException`](../../aspose.gis/gisexception/) πετιέται. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Καθορίζει εάν επιτρέπεται ο μετασχηματισμός πολυγώνου ή πολυγώνου σε γραμμή γραμμής. Προεπιλογές σε`false` . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στις συντεταγμένες X και Y όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στη συντεταγμένη Z όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Δείτε επίσης

* class [DriverOptions](../../aspose.gis/driveroptions/)
* χώρος ονομάτων [Aspose.Gis.Formats.Csv](../../aspose.gis.formats.csv/)
* συνέλευση [Aspose.GIS](../../)


