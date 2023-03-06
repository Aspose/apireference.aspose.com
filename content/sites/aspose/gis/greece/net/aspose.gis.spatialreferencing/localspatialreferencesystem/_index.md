---
title: Class LocalSpatialReferenceSystem
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.LocalSpatialReferenceSystem τάξη. Τοπικές συντεταγμένες SRS που σχετίζονται με κάποιο αντικείμενο όχι τη γη.
type: docs
weight: 2180
url: /el/net/aspose.gis.spatialreferencing/localspatialreferencesystem/
---
## LocalSpatialReferenceSystem class

Τοπικές συντεταγμένες SRS που σχετίζονται με κάποιο αντικείμενο, όχι τη γη.

```csharp
public class LocalSpatialReferenceSystem : SpatialReferenceSystem
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Χρήση[`IsCompound`](../spatialreferencesystem/iscompound/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| override [AsLocal](../../aspose.gis.spatialreferencing/localspatialreferencesystem/aslocal/) { get; } | Επιστρέψτε αυτό. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/localspatialreferencesystem/dimensionscount/) { get; } | Αριθμός διαστάσεων σε αυτό το SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/geographicdatum/) { get; } | ΡίψειςInvalidOperationException αφού το Τοπικό SRS δεν έχει γεωγραφικό δεδομένο. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasgeographicdatum/) { get; } | Επιστρέφει`false` αφού το Τοπικό SRS δεν έχει γεωγραφικό δεδομένο. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/hasprimemeridian/) { get; } | Επιστρέφει`false` , αφού το τοπικό SRS δεν έχει πρώτο μεσημβρινό. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Επιστρέφει εάν αυτό το SRS είναι σύνθετο (μια ένωση δύο SRS). Οι ακόλουθοι συνδυασμοί SRS στην ένωση SRS θεωρούνται έγκυροι: Γεωγραφικό SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιGeographic . Προβαλλόμενο SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιProjected . Εάν ο συνδυασμός SRS διαφέρει, ο τύπος της ένωσης SRS θα είναιUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Επιστρέφει εάν αυτό το SRS είναι απλό (όχι ένωση δύο SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Ίδιο με[`Validate`](../spatialreferencesystem/validate/) , αλλά μην επιστρέψετε μήνυμα σφάλματος. |
| [LocalDatum](../../aspose.gis.spatialreferencing/localspatialreferencesystem/localdatum/) { get; } | Στοιχείο, που περιγράφει τη μέθοδο μετρήσεων. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/localspatialreferencesystem/primemeridian/) { get; } | ΡίψειςInvalidOperationException , αφού το τοπικό SRS δεν έχει πρώτο μεσημβρινό. |
| override [Type](../../aspose.gis.spatialreferencing/localspatialreferencesystem/type/) { get; } | ΕπιστροφήLocal . |
| [Unit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/unit/) { get; } | Μονάδα αυτού του SRS. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Επιστρέφει την αναπαράσταση αυτού του SRS ως συμβολοσειρά WKT. Το αποτέλεσμα WKT συμβολοσειρά θα ταιριάζει με την προδιαγραφή OGC 01-009, που συνήθως ονομάζεται "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getaxis/)(int) | Πάρτε[`Axis`](../axis/) που περιγράφει διάσταση. |
| override [GetUnit](../../aspose.gis.spatialreferencing/localspatialreferencesystem/getunit/)(int) | Πάρτε[`Unit`](./unit/)διάστασης. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/localspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Ανιχνεύει εάν αυτό το SRS είναι ισοδύναμο με άλλο SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/localspatialreferencesystem/validate/)(out string) | Προσδιορίστε εάν αυτό το SRS είναι έγκυρο. Βλέπω[`Validate`](../spatialreferencesystem/validate/) για περιγραφή εγκυρότητας. |

### Δείτε επίσης

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


