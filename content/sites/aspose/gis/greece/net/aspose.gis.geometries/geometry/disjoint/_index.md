---
title: Geometry.Disjoint
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Προσδιορίζει εάν αυτή η γεωμετρία δεν χωρίζει από μια καθορισμένη γεωμετρία.
type: docs
weight: 190
url: /el/net/aspose.gis.geometries/geometry/disjoint/
---
## Geometry.Disjoint method

Προσδιορίζει εάν αυτή η γεωμετρία δεν χωρίζει από μια καθορισμένη γεωμετρία.

```csharp
public bool Disjoint(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία είναι «χωρικά ασύνδετη» από μια άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν οι γεωμετρίες είναι ασύνδετες ως προς τον πίνακα τομής DE-9IM. Βασικά, ελέγχει ότι δύο γεωμετρίες δεν έχουν κοινά σημεία. Αυτή η μέθοδος είναι ισοδύναμη με: Ανατρέξτε στο OpenGIS Simple Features Specification για περισσότερες λεπτομέρειες σχετικά με το DE-9IM.

```csharp
this.Relate(other, "FF*FF****");
```

### Δείτε επίσης

* method [Intersects](../../igeometry/intersects/)
* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


