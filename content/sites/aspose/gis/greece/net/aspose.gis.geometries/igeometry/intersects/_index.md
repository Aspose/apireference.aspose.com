---
title: IGeometry.Intersects
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία τέμνει μια καθορισμένη έκταση.
type: docs
weight: 270
url: /el/net/aspose.gis.geometries/igeometry/intersects/
---
## Intersects(Extent) {#intersects}

Καθορίζει εάν αυτή η γεωμετρία τέμνει μια καθορισμένη έκταση.

```csharp
public bool Intersects(Extent extent)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| extent | Extent | Η έκταση. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία τέμνει την έκταση?`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* method [Intersects](../../../aspose.gis/extent/intersects/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## Intersects(IGeometry) {#intersects_1}

Καθορίζει αν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία τέμνονται.

```csharp
public bool Intersects(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία «τέμνει χωρικά» μια άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος είναι ισοδύναμη με: Αυτή είναι η άρνηση του[`Disjoint`](../disjoint/) . Βλέπω[`Disjoint`](../disjoint/) για περισσότερες λεπτομέρειες.

```csharp
!this.Disjoint(other);
```

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


