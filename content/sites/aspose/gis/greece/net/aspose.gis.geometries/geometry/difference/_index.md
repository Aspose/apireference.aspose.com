---
title: Geometry.Difference
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Αφαιρεί μια καθορισμένη γεωμετρία από αυτήν τη γεωμετρία.
type: docs
weight: 180
url: /el/net/aspose.gis.geometries/geometry/difference/
---
## Geometry.Difference method

Αφαιρεί μια καθορισμένη γεωμετρία από αυτήν τη γεωμετρία.

```csharp
public IGeometry Difference(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία για αφαίρεση. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει μια διαφορά αυτής της γεωμετρίας και ένα όρισμα. Η γεωμετρία του αποτελέσματος περιέχει σύνολο σημείων που υπάρχει σε αυτήν τη γεωμετρία αλλά δεν υπάρχει σε ένα όρισμα.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | *other* είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


