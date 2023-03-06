---
title: Class GmlOptions
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.Gml.GmlOptions τάξη. Επιλογές ειδικές για το πρόγραμμα οδήγησης για μορφή GML.
type: docs
weight: 350
url: /el/net/aspose.gis.formats.gml/gmloptions/
---
## GmlOptions class

Επιλογές ειδικές για το πρόγραμμα οδήγησης για μορφή GML.

```csharp
public class GmlOptions : DriverOptions
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [GmlOptions](gmloptions/)() | Δημιουργία νέας παρουσίας. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CloseLinearRing](../../aspose.gis/driveroptions/closelinearring/) { get; set; } | Καθορίζει εάν κλείνει ένα μη κλειστόLinearRing σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [CreateMidpoints](../../aspose.gis/driveroptions/createmidpoints/) { get; set; } | Καθορίζει εάν προσθέτουμε ένα νέο σημείο στη μέση σε κάθε τμήμα της γεωμετρίας. Προεπιλογές σε`false` . |
| [DeleteNearPoints](../../aspose.gis/driveroptions/deletenearpoints/) { get; set; } | Καθορίζει εάν διαγράφονται κοντινά σημεία σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [DeleteNearPointsDistance](../../aspose.gis/driveroptions/deletenearpointsdistance/) { get; set; } | Καθορίζει την απόσταση για[`DeleteNearPoints`](../../aspose.gis/driveroptions/deletenearpoints/) . Προεπιλογές σε`0` . |
| [LinearizationTolerance](../../aspose.gis/driveroptions/linearizationtolerance/) { get; set; } | Μια ανοχή που χρησιμοποιείται για τη γραμμικοποίηση γεωμετριών καμπυλών. |
| [LoadSchemasFromInternet](../../aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/) { get; set; } | Καθορίζει εάν επιτρέπεται στο Aspose.GIS να φορτώνει σχήμα XML από το Internet. Εάν έχει οριστεί σε`false` τα σχήματα με απόλυτα URI που δεν ξεκινούν με 'file://' δεν θα φορτωθούν. Η προεπιλογή είναι`false` . |
| [MPrecisionModel](../../aspose.gis/driveroptions/mprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στο M συντεταγμένη όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [NestedPropertiesSeparator](../../aspose.gis.formats.gml/gmloptions/nestedpropertiesseparator/) { get; set; } | Λαμβάνει ή ορίζει μια συμβολοσειρά που χρησιμοποιείται για τον διαχωρισμό στοιχείων ένθετων χαρακτηριστικών. Η προεπιλογή είναι "_". |
| [RestoreSchema](../../aspose.gis.formats.gml/gmloptions/restoreschema/) { get; set; } | Καθορίζει εάν επιτρέπεται στο Aspose.GIS να αναλύει χαρακτηριστικά σε ένα αρχείο Gml στο οποίο λείπει ή δεν μπορεί να φορτωθεί ένα σχήμα XML. Εάν έχει οριστεί σε`true` , το πρόγραμμα ανάγνωσης Aspose.GIS δεν απαιτεί την παρουσία ενός σχήματος XML. Η προεπιλογή είναι`false` . |
| [SchemaLocation](../../aspose.gis.formats.gml/gmloptions/schemalocation/) { get; set; } | Λίστα ζευγών URI χωρισμένη στο διάστημα. Το πρώτο URI σε κάθε ζεύγος είναι ένα URI του χώρου ονομάτων, το δεύτερο URI είναι ένα σχήμα διαδρομής προς XML του χώρου ονομάτων. Εάν οριστεί σε`null` ,[`GmlDriver`](../gmldriver/) θα προσπαθήσει να διαβάσει το schemaLocation από το ριζικό στοιχείο του εγγράφου. Η προεπιλογή είναι`null` . |
| [SimplifySegments](../../aspose.gis/driveroptions/simplifysegments/) { get; set; } | Καθορίζει εάν διαγράφονται σημεία που βρίσκονται στο ίδιο τμήμα σε κάθε γεωμετρία. Προεπιλογές σε`false` . |
| [SimplifySegmentsDistance](../../aspose.gis/driveroptions/simplifysegmentsdistance/) { get; set; } | Καθορίζει την απόσταση για[`SimplifySegments`](../../aspose.gis/driveroptions/simplifysegments/) . Προεπιλογές σε`0` . |
| [ValidateGeometriesOnWrite](../../aspose.gis/driveroptions/validategeometriesonwrite/) { get; set; } | Καθορίζει εάν οι γεωμετρίες θα πρέπει να επικυρώνονται όταν προστίθενται στο επίπεδο. Εάν οριστεί σε`true` ,[`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) καλείται για κάθε γεωμετρία όταν προστίθεται στο επίπεδο και εάν αποτύχει η επικύρωση ([`IsValid`](../../aspose.gis.geometries/geometry/isvalid/) είναι`false` ),[`GisException`](../../aspose.gis/gisexception/) πετιέται. |
| [WritePolygonsAsLines](../../aspose.gis/driveroptions/writepolygonsaslines/) { get; set; } | Καθορίζει εάν επιτρέπεται ο μετασχηματισμός πολυγώνου ή πολυγώνου σε γραμμή γραμμής. Προεπιλογές σε`false` . |
| [XmlResolver](../../aspose.gis.formats.gml/gmloptions/xmlresolver/) { get; set; } | Α[`XmlResolver`](./xmlresolver/) χρησιμοποιείται για την επίλυση εξωτερικών πόρων. Η προεπιλογή είναιXmlUrlResolver . |
| [XYPrecisionModel](../../aspose.gis/driveroptions/xyprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στις συντεταγμένες X και Y όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |
| [ZPrecisionModel](../../aspose.gis/driveroptions/zprecisionmodel/) { get; set; } | Α[`PrecisionModel`](../../aspose.gis/precisionmodel/) που θα εφαρμοστεί στη συντεταγμένη Z όταν προστεθούν γεωμετρίες στο[`VectorLayer`](../../aspose.gis/vectorlayer/) ή όταν διαβάζονται από το[`VectorLayer`](../../aspose.gis/vectorlayer/) . Η προεπιλεγμένη τιμή είναι[`Exact`](../../aspose.gis/precisionmodel/exact/) . |

### Δείτε επίσης

* class [DriverOptions](../../aspose.gis/driveroptions/)
* χώρος ονομάτων [Aspose.Gis.Formats.Gml](../../aspose.gis.formats.gml/)
* συνέλευση [Aspose.GIS](../../)


