---
title: Class GeographicSpatialReferenceSystem
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.GeographicSpatialReferenceSystem τάξη. Ένα γεωγραφικό SRS είναι ένα SRS που βασίζεται στο γεωγραφικό μήκος και γεωγραφικό πλάτος. Ένα γεωγραφικό SRS μπορεί να είναι δισδιάστατο ή τρισδιάστατο. Εάν το γεωγραφικό SRS είναι τρισδιάστατο τότε είναι στην πραγματικότητα ένα σύνθετο SRS δισδιάστατου SRS και κάθετου SRS.
type: docs
weight: 2130
url: /el/net/aspose.gis.spatialreferencing/geographicspatialreferencesystem/
---
## GeographicSpatialReferenceSystem class

Ένα γεωγραφικό SRS είναι ένα SRS που βασίζεται στο γεωγραφικό μήκος και γεωγραφικό πλάτος. Ένα γεωγραφικό SRS μπορεί να είναι δισδιάστατο ή τρισδιάστατο. Εάν το γεωγραφικό SRS είναι τρισδιάστατο, τότε είναι στην πραγματικότητα ένα σύνθετο SRS δισδιάστατου SRS και κάθετου SRS.

```csharp
public abstract class GeographicSpatialReferenceSystem : SpatialReferenceSystem
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [AngularUnit](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/angularunit/) { get; } | Μονάδα, που χρησιμοποιείται για γωνιακές διαστάσεις, σε αυτό το SRS. |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Χρήση[`IsCompound`](../spatialreferencesystem/iscompound/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| [AsGeographic](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/asgeographic/) { get; } | Επιστρέφει αυτό. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| abstract [AxisesOrder](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/axisesorder/) { get; } | Σειρά αξόνων σε αυτό το SRS. Εάν αυτό το SRS δεν είναι έγκυρο και έχει λάθος κατευθύνσεις αξόνων,Invalid επιστρέφεται. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/dimensionscount/) { get; } | Επιστρέφει τον αριθμό των διαστάσεων σε αυτό το SRS. Για γεωγραφικά SRS, αυτό μπορεί να είναι: δύο - εάν αυτό είναι ενιαίο γεωγραφικό SRS. τρία - εάν αυτό είναι σύνθετο SRS, το οποίο αποτελείται από μονό, δισδιάστατο, γεωγραφικό SRS και κάθετο SRS, που προσθέτει τρίτη διάσταση. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Επιστρέφει το γεωγραφικό δεδομένο αυτού του SRS. |
| [HasGeographicDatum](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasgeographicdatum/) { get; } | Επιστρέφει`true` , δεδομένου ότι τα γεωγραφικά SRS έχουν πάντα πρώτους μεσημβρινούς. |
| [HasPrimeMeridian](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/hasprimemeridian/) { get; } | Επιστρέφει`true` , δεδομένου ότι τα γεωγραφικά SRS έχουν πάντα πρώτους μεσημβρινούς. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Επιστρέφει εάν αυτό το SRS είναι σύνθετο (μια ένωση δύο SRS). Οι ακόλουθοι συνδυασμοί SRS στην ένωση SRS θεωρούνται έγκυροι: Γεωγραφικό SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιGeographic . Προβαλλόμενο SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιProjected . Εάν ο συνδυασμός SRS διαφέρει, ο τύπος της ένωσης SRS θα είναιUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Επιστρέφει εάν αυτό το SRS είναι απλό (όχι ένωση δύο SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Ίδιο με[`Validate`](../spatialreferencesystem/validate/) , αλλά μην επιστρέψετε μήνυμα σφάλματος. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Επιστρέφει τον πρώτο μεσημβρινό αυτού του SRS. |
| [Type](../../aspose.gis.spatialreferencing/geographicspatialreferencesystem/type/) { get; } | ΕπιστρέφειGeographic . |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Επιστρέφει την αναπαράσταση αυτού του SRS ως συμβολοσειρά WKT. Το αποτέλεσμα WKT συμβολοσειρά θα ταιριάζει με την προδιαγραφή OGC 01-009, που συνήθως ονομάζεται "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Πάρτε[`Axis`](../axis/) που περιγράφει διάσταση. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Πάρτε[`Unit`](../unit/)διάστασης. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Ανιχνεύει εάν αυτό το SRS είναι ισοδύναμο με άλλο SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Προσδιορίστε εάν αυτό το SRS είναι έγκυρο. |

### Δείτε επίσης

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


