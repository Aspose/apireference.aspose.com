---
title: Class GeocentricSpatialReferenceSystem
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.GeocentricSpatialReferenceSystem τάξη. Το γεωκεντρικό SRS είναι τρισδιάστατο καρτεσιανό SRS με αρχή στο κέντρο της γης.
type: docs
weight: 2090
url: /el/net/aspose.gis.spatialreferencing/geocentricspatialreferencesystem/
---
## GeocentricSpatialReferenceSystem class

Το γεωκεντρικό SRS είναι τρισδιάστατο καρτεσιανό SRS με αρχή στο κέντρο της γης.

```csharp
public class GeocentricSpatialReferenceSystem : SpatialReferenceSystem
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Χρήση[`IsCompound`](../spatialreferencesystem/iscompound/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| override [AsGeocentric](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/asgeocentric/) { get; } | Επιστρέψτε αυτό. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| [AxisesOrder](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/axisesorder/) { get; } | Σειρά αξόνων σε αυτό το SRS. Εάν αυτό το SRS δεν είναι έγκυρο και έχει λάθος κατευθύνσεις αξόνων,Invalid επιστρέφεται. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/dimensionscount/) { get; } | Επιστροφή 3, αφού το γεωκεντρικό SRS είναι πάντα τρισδιάστατο. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/geographicdatum/) { get; } | Επιστροφή γεωγραφικού δεδομένου αυτού του SRS. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasgeographicdatum/) { get; } | Επιστροφή`true` , αφού τα γεωκεντρικά SRS έχουν πάντα γεωγραφικό δεδομένο. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/hasprimemeridian/) { get; } | Επιστροφή`true` , αφού τα γεωκεντρικά SRS έχουν πάντα πρώτο μεσημβρινό. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Επιστρέφει εάν αυτό το SRS είναι σύνθετο (μια ένωση δύο SRS). Οι ακόλουθοι συνδυασμοί SRS στην ένωση SRS θεωρούνται έγκυροι: Γεωγραφικό SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιGeographic . Προβαλλόμενο SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιProjected . Εάν ο συνδυασμός SRS διαφέρει, ο τύπος της ένωσης SRS θα είναιUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Επιστρέφει εάν αυτό το SRS είναι απλό (όχι ένωση δύο SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Ίδιο με[`Validate`](../spatialreferencesystem/validate/) , αλλά μην επιστρέψετε μήνυμα σφάλματος. |
| [LinearUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/linearunit/) { get; } | Μονάδα, που χρησιμοποιείται σε αυτό το SRS. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/primemeridian/) { get; } | Πρώτος μεσημβρινός επιστροφής αυτού του SRS. |
| override [Type](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/type/) { get; } | ΕπιστροφήGeocentric . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Επιστρέφει την αναπαράσταση αυτού του SRS ως συμβολοσειρά WKT. Το αποτέλεσμα WKT συμβολοσειρά θα ταιριάζει με την προδιαγραφή OGC 01-009, που συνήθως ονομάζεται "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getaxis/)(int) | Πάρτε[`Axis`](../axis/) που περιγράφει διάσταση. |
| override [GetUnit](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/getunit/)(int) | Πάρτε[`Unit`](../unit/)διάστασης. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Ανιχνεύει εάν αυτό το SRS είναι ισοδύναμο με άλλο SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/geocentricspatialreferencesystem/validate/)(out string) | Προσδιορίστε εάν αυτό το SRS είναι έγκυρο. Βλέπω[`Validate`](../spatialreferencesystem/validate/) για περιγραφή εγκυρότητας. |

### Δείτε επίσης

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


