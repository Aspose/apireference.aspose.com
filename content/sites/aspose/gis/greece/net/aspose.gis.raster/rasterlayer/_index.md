---
title: Class RasterLayer
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.Raster.RasterLayer τάξη. Αντιπροσωπεύει ένα επίπεδο ράστερ.
type: docs
weight: 1390
url: /el/net/aspose.gis.raster/rasterlayer/
---
## RasterLayer class

Αντιπροσωπεύει ένα επίπεδο ράστερ.

```csharp
public abstract class RasterLayer : IDisposable
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [BandCount](../../aspose.gis.raster/rasterlayer/bandcount/) { get; } | Λαμβάνει τον αριθμό των ζωνών στο επίπεδο ράστερ. |
| [Bounds](../../aspose.gis.raster/rasterlayer/bounds/) { get; } | Παίρνει τα όρια ράστερ. |
| abstract [CellSize](../../aspose.gis.raster/rasterlayer/cellsize/) { get; } | Λαμβάνει το μέγεθος κελιού ή pixel του ράστερ. |
| abstract [Driver](../../aspose.gis.raster/rasterlayer/driver/) { get; } | Λαμβάνει το[`Driver`](./driver/) που δημιούργησε αυτό το επίπεδο. |
| abstract [Height](../../aspose.gis.raster/rasterlayer/height/) { get; } | Λαμβάνει το ύψος του ράστερ σε pixel. Είναι επίσης γνωστό ως καταμέτρηση σειρών. |
| abstract [NoDataValues](../../aspose.gis.raster/rasterlayer/nodatavalues/) { get; } | Λαμβάνει τις τιμές που αντιπροσωπεύουν το φόντο ή "χωρίς δεδομένα" του ράστερ. |
| abstract [SpatialReferenceSystem](../../aspose.gis.raster/rasterlayer/spatialreferencesystem/) { get; } | Αποκτά ένα χωρικό σύστημα αναφοράς ράστερ. Μπορεί να`null` αν είναι άγνωστο. |
| abstract [UpperLeftX](../../aspose.gis.raster/rasterlayer/upperleftx/) { get; } | Λαμβάνει συντεταγμένη x της επάνω αριστερής γωνίας του ράστερ. |
| abstract [UpperLeftY](../../aspose.gis.raster/rasterlayer/upperlefty/) { get; } | Λαμβάνει τη συντεταγμένη y της επάνω αριστερής γωνίας του ράστερ. |
| abstract [Width](../../aspose.gis.raster/rasterlayer/width/) { get; } | Λαμβάνει το πλάτος του ράστερ σε pixel. Είναι επίσης γνωστό ως καταμέτρηση στηλών. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop_1)(double[]) | Περικόπτει το επίπεδο ράστερ χρησιμοποιώντας μια μάσκα ζώνης). |
| [Crop](../../aspose.gis.raster/rasterlayer/crop/#crop)(IGeometry, double[]) | Περικόπτει το επίπεδο ράστερ χρησιμοποιώντας μια φόρμα σχήματος (και μάσκα ζώνης). |
| [Dispose](../../aspose.gis.raster/rasterlayer/dispose/)() | Απελευθερώνει τους πόρους που χρησιμοποιούνται από το`RasterLayer` . |
| abstract [GetBand](../../aspose.gis.raster/rasterlayer/getband/)(int) | Λαμβάνει μια ζώνη βάσει του καθορισμένου ευρετηρίου. |
| virtual [GetExtent](../../aspose.gis.raster/rasterlayer/getextent/)() | Υπολογίζει μια χωρική έκταση αυτού του στρώματος. |
| [GetSpatialPoint](../../aspose.gis.raster/rasterlayer/getspatialpoint/)(int, int) | Μετατρέπει την καθορισμένη στήλη και σειρά στη χωρική συντεταγμένη. |
| [GetStatistics](../../aspose.gis.raster/rasterlayer/getstatistics/)(int, bool) | Υπολογισμός συνοπτικών στατιστικών που αποτελούνται από πλήθος, άθροισμα, μέσο όρο, ελάχ., μέγ. |
| [GetValues](../../aspose.gis.raster/rasterlayer/getvalues/)(int, int) | Διαβάζει τις τιμές στο καθορισμένο κελί. |
| [GetValuesDump](../../aspose.gis.raster/rasterlayer/getvaluesdump/)(RasterRect) | Διαβάζει τις τιμές στο καθορισμένο μπλοκ ως πίνακα 1 διαστάσεων. |
| [GetValuesOnExpression](../../aspose.gis.raster/rasterlayer/getvaluesonexpression/)(RasterRect, RasterReadExpression) | Διαβάζει και επεξεργάζεται τιμές ζώνης σε μια έκφραση. |
| override [ToString](../../aspose.gis.raster/rasterlayer/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [Warp](../../aspose.gis.raster/rasterlayer/warp/)(WarpOptions) | Παραμορφώνει το επίπεδο ράστερ σε άλλο. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Gis.Raster](../../aspose.gis.raster/)
* συνέλευση [Aspose.GIS](../../)


