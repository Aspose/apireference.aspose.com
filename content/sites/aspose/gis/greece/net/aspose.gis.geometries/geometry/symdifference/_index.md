---
title: Geometry.SymDifference
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Δημιουργεί μια συμμετρική διαφορά μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.
type: docs
weight: 380
url: /el/net/aspose.gis.geometries/geometry/symdifference/
---
## Geometry.SymDifference method

Δημιουργεί μια συμμετρική διαφορά μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.

```csharp
public IGeometry SymDifference(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία για τον υπολογισμό της συμμετρικής διαφοράς. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει μια συμμετρική διαφορά αυτής της γεωμετρίας και ένα όρισμα. Η γεωμετρία του αποτελέσματος περιέχει σύνολο σημείων που υπάρχει σε μία από τις γεωμετρίες αλλά δεν υπάρχει και στις δύο.

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


