---
title: IGeometry.CoveredBy
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία καλύπτεται από μια καθορισμένη γεωμετρία.
type: docs
weight: 140
url: /el/net/aspose.gis.geometries/igeometry/coveredby/
---
## IGeometry.CoveredBy method

Καθορίζει εάν αυτή η γεωμετρία καλύπτεται από μια καθορισμένη γεωμετρία.

```csharp
public bool CoveredBy(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true`αν αυτή η γεωμετρία «καλύπτεται χωρικά από» άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν μια γεωμετρία καλύπτεται από μια άλλη ως προς τον πίνακα τομής DE-9IM. Αυτή η μέθοδος είναι ισοδύναμη με:

```csharp
other.Covers(this);
```

### Δείτε επίσης

* method [SpatiallyContains](../spatiallycontains/)
* method [Covers](../covers/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


