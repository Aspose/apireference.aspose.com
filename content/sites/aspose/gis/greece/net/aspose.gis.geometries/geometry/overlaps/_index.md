---
title: Geometry.Overlaps
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία επικαλύπτεται με μια καθορισμένη γεωμετρία.
type: docs
weight: 290
url: /el/net/aspose.gis.geometries/geometry/overlaps/
---
## Geometry.Overlaps method

Καθορίζει εάν αυτή η γεωμετρία επικαλύπτεται με μια καθορισμένη γεωμετρία.

```csharp
public bool Overlaps(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία «επικαλύπτεται χωρικά» μια άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν οι γεωμετρίες είναι αλληλοεπικαλυπτόμενες ως προς τον πίνακα τομής DE-9IM. Δύο γεωμετρίες επικαλύπτονται εάν έχουν μερικά αλλά όχι όλα τα εσωτερικά σημεία κοινά και η τομή των geometries έχει την ίδια διάσταση με τις ίδιες τις γεωμετρίες. Για δύοPoint γεωμετρίες ή δύοSurface γεωμετρίες this μέθοδος είναι ισοδύναμη με: Για δύοLine γεωμετρίες αυτή η μέθοδος είναι ισοδύναμη με: Για δύο γεωμετρίες με μη ίσες[`Dimension`](../../igeometry/dimension/) αυτή η μέθοδος επιστρέφει πάντα`false`. Ανατρέξτε στο OpenGIS Simple Features Specification για περισσότερες λεπτομέρειες σχετικά με τη σχέση DE-9IM και "χωρικές επικαλύψεις".

```csharp
this.Relate(other, "T*T***T**");
```

```csharp
this.Relate(other, "1*T***T**");
```

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


