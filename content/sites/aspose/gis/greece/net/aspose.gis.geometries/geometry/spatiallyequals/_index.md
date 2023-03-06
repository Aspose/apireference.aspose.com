---
title: Geometry.SpatiallyEquals
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία χωρικά ίση με μια καθορισμένη γεωμετρία.
type: docs
weight: 370
url: /el/net/aspose.gis.geometries/geometry/spatiallyequals/
---
## Geometry.SpatiallyEquals method

Καθορίζει εάν αυτή η γεωμετρία χωρικά ίση με μια καθορισμένη γεωμετρία.

```csharp
public bool SpatiallyEquals(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία «ισούται χωρικά» με καθορισμένη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει την ισότητα ως προς τον πίνακα τομής DE-9IM. Δεν εξαρτάται από τη σειρά των στοιχείων (π.χ. σειρά εσωτερικών δακτυλίων σε πολύγωνο), τις τιμές Z και M. Βασικά, ελέγχει ότι δύο γεωμετρίες καταλαμβάνουν τον ίδιο "χώρο" όταν προβάλλονται σε δισδιάστατο χώρο. Αυτή η μέθοδος είναι ισοδύναμη με: Ανατρέξτε στο OpenGIS Simple Features Specification για περισσότερες λεπτομέρειες σχετικά με το DE-9IM.

```csharp
this.Relate(other, "T*F**FFF*");
```

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


