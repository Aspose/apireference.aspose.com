---
title: Class CompoundSpatialReferenceSystem
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.CompoundSpatialReferenceSystem τάξη. Η ένωση SRS ενώνει δύο υποκείμενα SRS κανένα από τα οποία δεν μπορεί να είναι σύνθετο.
type: docs
weight: 2060
url: /el/net/aspose.gis.spatialreferencing/compoundspatialreferencesystem/
---
## CompoundSpatialReferenceSystem class

Η ένωση SRS ενώνει δύο υποκείμενα SRS, κανένα από τα οποία δεν μπορεί να είναι σύνθετο.

```csharp
public class CompoundSpatialReferenceSystem : SpatialReferenceSystem
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| override [AsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/ascompound/) { get; } | Επιστρέψτε αυτό. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| override [AsGeographic](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asgeographic/) { get; } | Επιστροφή γεωγραφικής αναπαράστασης αυτού του SRS. Εάν αυτή η ένωση SRS αντιπροσωπεύει πράγματι ένα γεωγραφικό SRS, το αποτέλεσμα θα είναι τρισδιάστατο γεωγραφικό SRS (με γεωγραφικό μήκος, γεωγραφικό πλάτος, διαστάσεις ύψους). Διαφορετικά θα γίνει εξαίρεση. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| override [AsProjected](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/asprojected/) { get; } | Επιστρέψτε την προβλεπόμενη αναπαράσταση αυτού του SRS. Εάν αυτή η ένωση SRS αντιπροσωπεύει πράγματι ένα προβαλλόμενο SRS, το αποτέλεσμα θα είναι τρισδιάστατο προβαλλόμενο SRS (με X, Y, διαστάσεις ύψους). Διαφορετικά θα γίνει εξαίρεση. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Χρήση[`Type`](../spatialreferencesystem/type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| override [DimensionsCount](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/dimensionscount/) { get; } | Αριθμός διαστάσεων. Για το σύνθετο SRS αυτό είναι το άθροισμα του αριθμού των διαστάσεων του υποκείμενου SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| override [GeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/geographicdatum/) { get; } | Επιστρέψτε το γεωγραφικό δεδομένο αυτού του SRS. Εάν και τα δύο[`Head`](./head/) και[`Tail`](./tail/) έχουν γεωγραφικό δεδομένο - επιστροφή γεωγραφικό στοιχείο κεφαλής. |
| override [HasGeographicDatum](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasgeographicdatum/) { get; } | Το σύνθετο SRS έχει γεωγραφικό δεδομένο εάν κάποιο από τα υποκείμενα SRS έχει γεωγραφικό δεδομένο. |
| override [HasPrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/hasprimemeridian/) { get; } | Το σύνθετο SRS έχει πρώτο μεσημβρινό εάν κάποιο από τα υποκείμενα SRS έχει πρώτο μεσημβρινό. |
| [Head](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/head/) { get; } | Πρώτη υποκείμενη SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| override [IsCompound](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/iscompound/) { get; } | Επιστρέφει`true` . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Επιστρέφει εάν αυτό το SRS είναι απλό (όχι ένωση δύο SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Ίδιο με[`Validate`](../spatialreferencesystem/validate/) , αλλά μην επιστρέψετε μήνυμα σφάλματος. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| override [PrimeMeridian](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/primemeridian/) { get; } | Επιστρεφόμενος πρώτος μεσημβρινός αυτού του SRS. Εάν και τα δύο[`Head`](./head/) και[`Tail`](./tail/) έχουν πρώτο μεσημβρινό - επιστροφή κύριο μεσημβρινό της κεφαλής. |
| [Tail](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/tail/) { get; } | Δεύτερο υποκείμενο SRS. |
| override [Type](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/type/) { get; } | Τύπος αυτής της ένωσης SRS. Μπορεί να είναιGeographicif αυτό το Σύνθετο SRS είναι συνδυασμός γεωγραφικού και κάθετου SRS, ήProjected if αυτό το Compound SRS είναι συνδυασμός προβαλλόμενου και κάθετου SRS. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Επιστρέφει την αναπαράσταση αυτού του SRS ως συμβολοσειρά WKT. Το αποτέλεσμα WKT συμβολοσειρά θα ταιριάζει με την προδιαγραφή OGC 01-009, που συνήθως ονομάζεται "WKT1". |
| override [GetAxis](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getaxis/)(int) | Πάρτε[`Axis`](../axis/) που περιγράφει διάσταση. |
| override [GetUnit](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/getunit/)(int) | Πάρτε[`Unit`](../unit/)διάστασης. |
| override [IsEquivalent](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Ανιχνεύει εάν αυτό το SRS είναι ισοδύναμο με άλλο SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| override [Validate](../../aspose.gis.spatialreferencing/compoundspatialreferencesystem/validate/)(out string) | Προσδιορίστε εάν αυτό το SRS είναι έγκυρο. Βλέπω[`Validate`](../spatialreferencesystem/validate/) για περιγραφή εγκυρότητας. |

### Δείτε επίσης

* class [SpatialReferenceSystem](../spatialreferencesystem/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


