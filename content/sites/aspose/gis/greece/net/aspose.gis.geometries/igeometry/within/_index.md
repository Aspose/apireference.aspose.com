---
title: IGeometry.Within
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός καθορισμένης έκτασης.
type: docs
weight: 380
url: /el/net/aspose.gis.geometries/igeometry/within/
---
## Within(Extent) {#within}

Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός καθορισμένης έκτασης.

```csharp
public bool Within(Extent extent)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| extent | Extent | Η έκταση. |

### Επιστρεφόμενη Αξία

`true` εάν αυτή η γεωμετρία είναι εντός της έκτασης?`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |

### Δείτε επίσης

* method [Contains](../../../aspose.gis/extent/contains/)
* class [Extent](../../../aspose.gis/extent/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)

---

## Within(IGeometry) {#within_1}

Καθορίζει εάν αυτή η γεωμετρία βρίσκεται εντός μιας καθορισμένης γεωμετρίας.

```csharp
public bool Within(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία βρίσκεται «χωρικά εντός» μιας άλλης γεωμετρίας.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν μια γεωμετρία βρίσκεται μέσα σε μια άλλη ως προς τον πίνακα τομής DE-9IM. Μια γεωμετρία βρίσκεται μέσα σε μια άλλη, εάν μια άλλη γεωμετρία περιέχει κάθε σημείο της γεωμετρίας και οι εσωτερικοί χώροι geometries τέμνονται. Αυτή η μέθοδος είναι ισοδύναμη με: Δείτε την προδιαγραφή απλών δυνατοτήτων του OpenGIS για περισσότερες λεπτομέρειες σχετικά με το DE-9IM και τη σχέση "χωρικά εντός".

```csharp
this.Relate(other, "T*F**F***");
```

### Δείτε επίσης

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


