---
title: Class SpatialReferenceSystem
second_title: Αναφορά Aspose.GIS για .NET API
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystem τάξη. Το χωρικό σύστημα αναφοράς χαρτογραφεί συντεταγμένες σε μέρη στη Γη. Υπάρχουν διάφοροι τύποι SRS βλ.Type . Επιπλέον εάν είναι τύπος SRSGeographic ή Projected το SRS μπορεί να είναι σύνθετο ή απλό βλIsCompound .
type: docs
weight: 2250
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/
---
## SpatialReferenceSystem class

Το χωρικό σύστημα αναφοράς χαρτογραφεί συντεταγμένες σε μέρη στη Γη. Υπάρχουν διάφοροι τύποι SRS, βλ.[`Type`](./type/) . Επιπλέον, εάν είναι τύπος SRSGeographic ή Projected το SRS μπορεί να είναι σύνθετο ή απλό, βλ[`IsCompound`](./iscompound/) .

```csharp
public abstract class SpatialReferenceSystem : IdentifiableObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [AsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/ascompound/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`CompoundSpatialReferenceSystem`](../compoundspatialreferencesystem/) . Χρήση[`IsCompound`](./iscompound/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeocentric/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) . Χρήση[`Type`](./type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/asgeographic/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) . Χρήση[`Type`](./type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/aslocal/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) . Χρήση[`Type`](./type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/asprojected/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) . Χρήση[`Type`](./type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| virtual [AsVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/asvertical/) { get; } | Επιστρέφει αυτό το SRS που έχει μετατραπεί σε[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) . Χρήση[`Type`](./type/) για να μάθετε αν είναι δυνατή η μετατροπή. |
| abstract [DimensionsCount](../../aspose.gis.spatialreferencing/spatialreferencesystem/dimensionscount/) { get; } | Επιστρέφει τον αριθμό των διαστάσεων σε αυτό το SRS. |
| [EpsgCode](../../aspose.gis.spatialreferencing/identifiableobject/epsgcode/) { get; } | Εάν αυτό το αναγνωριστικό αντικειμένων είναι αναγνωριστικό EPSG - επιστρέψτε τον κωδικό του. Διαφορετικά - επιστροφή -1. |
| abstract [GeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/geographicdatum/) { get; } | Επιστρέφει το γεωγραφικό δεδομένο αυτού του SRS. |
| abstract [HasGeographicDatum](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasgeographicdatum/) { get; } | Καθορίζει εάν αυτό το SRS έχει γεωγραφικό δεδομένο. Αυτό ισχύει για κάθε γεωγραφικό, προβαλλόμενο και γεωκεντρικό SRS. |
| abstract [HasPrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/hasprimemeridian/) { get; } | Επιστρέφει εάν αυτό το SRS έχει πρώτο μεσημβρινό. Αυτό ισχύει για κάθε γεωγραφικό, προβαλλόμενο και γεωκεντρικό SRS. |
| [Identifier](../../aspose.gis.spatialreferencing/identifiableobject/identifier/) { get; } | Αναγνωριστικό αυτού του αναγνωρίσιμου αντικειμένου. |
| virtual [IsCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) { get; } | Επιστρέφει εάν αυτό το SRS είναι σύνθετο (μια ένωση δύο SRS). Οι ακόλουθοι συνδυασμοί SRS στην ένωση SRS θεωρούνται έγκυροι: Γεωγραφικό SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιGeographic . Προβαλλόμενο SRS + Κατακόρυφο SRS, σε αυτήν την περίπτωση ο τύπος ένωσης SRS θα είναιProjected . Εάν ο συνδυασμός SRS διαφέρει, ο τύπος της ένωσης SRS θα είναιUnknown . |
| [IsSingle](../../aspose.gis.spatialreferencing/spatialreferencesystem/issingle/) { get; } | Επιστρέφει εάν αυτό το SRS είναι απλό (όχι ένωση δύο SRS). |
| [IsValid](../../aspose.gis.spatialreferencing/spatialreferencesystem/isvalid/) { get; } | Ίδιο με[`Validate`](./validate/) , αλλά μην επιστρέψετε μήνυμα σφάλματος. |
| [Name](../../aspose.gis.spatialreferencing/identifiableobject/name/) { get; } | Όνομα αυτού του αντικειμένου. |
| abstract [PrimeMeridian](../../aspose.gis.spatialreferencing/spatialreferencesystem/primemeridian/) { get; } | Επιστρέφει τον πρώτο μεσημβρινό αυτού του SRS. |
| abstract [Type](../../aspose.gis.spatialreferencing/spatialreferencesystem/type/) { get; } | Παίρνει τον τύπο αυτού του SRS, βλ[`SpatialReferenceSystemType`](../spatialreferencesystemtype/) . |
| static [Etrs89](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89/) { get; } | ETRS 89 (EPSG:4258) χωρικό σύστημα αναφοράς. |
| static [Etrs89LambertAzimuthalEqualArea](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertazimuthalequalarea/) { get; } | ETRS 89 / ETRS Lambert Azimuthal Equal Area (EPSG:3035) χωρικό σύστημα αναφοράς. |
| static [Etrs89LambertConformalConic](../../aspose.gis.spatialreferencing/spatialreferencesystem/etrs89lambertconformalconic/) { get; } | ETRS 89 / Lambert Conformal Conic (EPSG:3034) χωρικό σύστημα αναφοράς. |
| static [Nad83](../../aspose.gis.spatialreferencing/spatialreferencesystem/nad83/) { get; } | NAD 83 (EPSG:4269) χωρικό σύστημα αναφοράς. |
| static [Osgb36](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36/) { get; } | OSGB 36 (EPSG:4277) χωρικό σύστημα αναφοράς. |
| static [Osgb36BritishNationalGrid](../../aspose.gis.spatialreferencing/spatialreferencesystem/osgb36britishnationalgrid/) { get; } | OSGB 36 / Βρετανικό Εθνικό Πλέγμα (EPSG:27700) χωρικό σύστημα αναφοράς. |
| static [WebMercator](../../aspose.gis.spatialreferencing/spatialreferencesystem/webmercator/) { get; } | Web Mercator (EPSG:3857) χωρικό σύστημα αναφοράς. |
| static [Wgs72](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs72/) { get; } | WGS 72 (EPSG:4322) χωρικό σύστημα αναφοράς. |
| static [Wgs84](../../aspose.gis.spatialreferencing/spatialreferencesystem/wgs84/) { get; } | WGS 84 (EPSG:4326) χωρικό σύστημα αναφοράς. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [CreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromepsg/)(int) | Δημιουργήστε ένα χωρικό σύστημα αναφοράς με βάση τον καθορισμένο κωδικό EPSG. |
| static [CreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/createfromwkt/)(string) | Δημιουργεί ένα νέο`SpatialReferenceSystem` με βάση τη συμβολοσειρά WKT (Γνωστό Κείμενο). |
| [CreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/createtransformationto/)(SpatialReferenceSystem) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| [ExportToWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/exporttowkt/)() | Επιστρέφει την αναπαράσταση αυτού του SRS ως συμβολοσειρά WKT. Το αποτέλεσμα WKT συμβολοσειρά θα ταιριάζει με την προδιαγραφή OGC 01-009, που συνήθως ονομάζεται "WKT1". |
| abstract [GetAxis](../../aspose.gis.spatialreferencing/spatialreferencesystem/getaxis/)(int) | Πάρτε[`Axis`](../axis/) που περιγράφει διάσταση. |
| abstract [GetUnit](../../aspose.gis.spatialreferencing/spatialreferencesystem/getunit/)(int) | Πάρτε[`Unit`](../unit/)διάστασης. |
| virtual [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem) | Ανιχνεύει εάν αυτό το SRS είναι ισοδύναμο με άλλο SRS. . |
| override [ToString](../../aspose.gis.spatialreferencing/identifiableobject/tostring/)() | Επιστρέφει μια συμβολοσειρά που αντιπροσωπεύει το τρέχον αντικείμενο. |
| [TryCreateTransformationTo](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatetransformationto/)(SpatialReferenceSystem, out SpatialReferenceSystemTransformation) | Δημιουργεί μετασχηματισμό από αυτό`SpatialReferenceSystem` σε άλλο`SpatialReferenceSystem` . |
| abstract [Validate](../../aspose.gis.spatialreferencing/spatialreferencesystem/validate/)(out string) | Προσδιορίστε εάν αυτό το SRS είναι έγκυρο. |
| static [CreateCompound](../../aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/)(string, SpatialReferenceSystem, SpatialReferenceSystem, Identifier) | Δημιουργία ένωσης SRS. |
| static [CreateGeocentric](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeocentric/)(GeocentricSpatialReferenceSystemParameters, Identifier) | Δημιουργία γεωκεντρικού SRS από προσαρμοσμένες παραμέτρους. |
| static [CreateGeographic](../../aspose.gis.spatialreferencing/spatialreferencesystem/creategeographic/)(GeographicSpatialReferenceSystemParameters, Identifier) | Δημιουργία γεωγραφικού SRS από προσαρμοσμένες παραμέτρους. |
| static [CreateLocal](../../aspose.gis.spatialreferencing/spatialreferencesystem/createlocal/)(string, LocalDatum, Unit, ICollection&lt;Axis&gt;, Identifier) | Δημιουργία τοπικού SRS. |
| static [CreateProjected](../../aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/)(ProjectedSpatialReferenceSystemParameters, Identifier) | Δημιουργία προβαλλόμενου SRS από προσαρμοσμένες παραμέτρους. |
| static [CreateVertical](../../aspose.gis.spatialreferencing/spatialreferencesystem/createvertical/)(string, VerticalDatum, Unit, Axis, Identifier) | Δημιουργία κάθετου SRS. |
| static [IsEquivalent](../../aspose.gis.spatialreferencing/spatialreferencesystem/isequivalent/)(SpatialReferenceSystem, SpatialReferenceSystem) | Καθορίζει εάν δύο SRS είναι ισοδύναμα. Ίδιες συντεταγμένες ισοδύναμου SRS ταιριάζουν με το ίδιο μέρος στη Γη. Ορισμένες παράμετροι ισοδύναμου SRS μπορεί να είναι διαφορετικές, για παράδειγμα[`Name`](../identifiableobject/name/) . |
| static [TryCreateFromEpsg](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromepsg/)(int, out SpatialReferenceSystem) | Δημιουργήστε ένα χωρικό σύστημα αναφοράς με βάση τον καθορισμένο κωδικό EPSG. |
| static [TryCreateFromWkt](../../aspose.gis.spatialreferencing/spatialreferencesystem/trycreatefromwkt/)(string, out SpatialReferenceSystem) | Δημιουργεί ένα νέο`SpatialReferenceSystem` με βάση τη συμβολοσειρά WKT (Γνωστό Κείμενο). |

### Δείτε επίσης

* class [IdentifiableObject](../identifiableobject/)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* συνέλευση [Aspose.GIS](../../)


