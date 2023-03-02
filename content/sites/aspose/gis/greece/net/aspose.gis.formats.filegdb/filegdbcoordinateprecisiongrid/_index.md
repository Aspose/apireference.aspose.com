---
title: Class FileGdbCoordinatePrecisionGrid
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Formats.FileGdb.FileGdbCoordinatePrecisionGrid τάξη. Ένα πλέγμα ακριβείας συντεταγμένων μέσα σε ένα επίπεδο FileGDB.
type: docs
weight: 250
url: /el/net/aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/
---
## FileGdbCoordinatePrecisionGrid class

Ένα πλέγμα ακριβείας συντεταγμένων μέσα σε ένα επίπεδο FileGDB.

```csharp
public sealed class FileGdbCoordinatePrecisionGrid
```

## Κατασκευαστές

| Ονομα | Περιγραφή |
| --- | --- |
| [FileGdbCoordinatePrecisionGrid](filegdbcoordinateprecisiongrid/)() | Ο προεπιλεγμένος κατασκευαστής. |

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [MOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/morigin/) { get; set; } | Λαμβάνει ή ορίζει την αρχή της συντεταγμένης M. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |
| [MScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/mscale/) { get; set; } | Λαμβάνει ή ορίζει την κλίμακα της συντεταγμένης M. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |
| [XOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xorigin/) { get; set; } | Λαμβάνει ή ορίζει την αρχή της συντεταγμένης X. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |
| [XYScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/xyscale/) { get; set; } | Λαμβάνει ή ορίζει την κλίμακα των συντεταγμένων X και Y. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |
| [YOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/yorigin/) { get; set; } | Λαμβάνει ή ορίζει την αρχή της συντεταγμένης Y. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |
| [ZOrigin](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zorigin/) { get; set; } | Λαμβάνει ή ορίζει την αρχή της συντεταγμένης Z. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |
| [ZScale](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/zscale/) { get; set; } | Λαμβάνει ή ορίζει την κλίμακα της συντεταγμένης Z. Εάν έχει οριστεί σε`null` χρησιμοποιείται η προεπιλογή. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [CreateFromRectangle](../../aspose.gis.formats.filegdb/filegdbcoordinateprecisiongrid/createfromrectangle/)(IPoint, IPoint) | Δημιουργεί νέο`FileGdbCoordinatePrecisionGrid` έτσι ώστε όλες οι τιμές μέσα σε ένα ορθογώνιο μπορούν να αναπαρασταθούν. |

### Παρατηρήσεις

Το πλέγμα ακριβείας συντεταγμένων ορίζει τον έγκυρο τομέα και την ανάλυση των συντεταγμένων στο επίπεδο FileGDB. Origin ορίζει τη διαδρομή για τον συντονισμό του πλέγματος ακριβείας στο διάστημα. Η κλίμακα καθορίζει την ανάλυση (όσο μεγαλύτερη είναι η κλίμακα , τόσο πιο ακριβείς τιμές γράφονται). Το πλέγμα ακριβείας καθορίζει το έγκυρο εύρος τιμών για τις συντεταγμένες: Κάθε συντεταγμένη στο[`VectorLayer`](../../aspose.gis/vectorlayer/)πρέπει να βρίσκονται εντός αυτού του εύρους. Οι συντεταγμένες που βρίσκονται εκτός του εύρους ενδέχεται να προκαλέσουν σφάλματα ανάγνωσης αργότερα και θα υποστούν λανθασμένη επεξεργασία από το ArcGIS. Εάν δεν καθορίσετε ιδιότητες (διατηρήστε τις`null` ) θα χρησιμοποιηθούν οι προεπιλεγμένες τιμές. Οι προεπιλεγμένες τιμές εξαρτώνται από[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) απο[`VectorLayer`](../../aspose.gis/vectorlayer/) . Για γεωγραφικό[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) οι προεπιλογές είναι: Για προβολή[`SpatialReferenceSystem`](../../aspose.gis.spatialreferencing/spatialreferencesystem/) οι προεπιλογές είναι: όπου`XYTolerance` ,`ZTolerance` και`MTolerance` είναι αξίες από[`FileGdbOptions`](../filegdboptions/) .

```csharp
XMin = XOrigin
YMin = YOrigin
ZMin = ZOrigin
MMin = MOrigin
XMax = XOrigin + 9e+15 / XYScale
YMax = YOrigin + 9e+15 / XYScale
ZMax = ZOrigin + 9e+15 / ZScale
MMax = MOrigin + 9e+15 / MScale
```

```csharp
XOrigin = -400
YOrigin = -400
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1e9
ZScale  = 1 / ZTolerance * 10
MScale  = 1 / MTolerance * 10
```

```csharp
XOrigin = -2147483647
YOrigin = -2147483647
ZOrigin = -1e5
MOrigin = -1e5
XYScale = 1 / XYTolerance * 10
ZScale  = 1 / ZTolerance  * 10
MScale  = 1 / MTolerance  * 10
```

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.Formats.FileGdb](../../aspose.gis.formats.filegdb/)
* συνέλευση [Aspose.GIS](../../)


