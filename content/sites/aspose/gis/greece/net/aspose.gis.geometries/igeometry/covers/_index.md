---
title: IGeometry.Covers
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία καλύπτει μια καθορισμένη γεωμετρία.
type: docs
weight: 150
url: /el/net/aspose.gis.geometries/igeometry/covers/
---
## IGeometry.Covers method

Καθορίζει εάν αυτή η γεωμετρία καλύπτει μια καθορισμένη γεωμετρία.

```csharp
public bool Covers(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία «καλύπτει χωρικά» μια άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν μια γεωμετρία καλύπτει μια άλλη ως προς τον πίνακα τομής DE-9IM. Μια γεωμετρία καλύπτει μια άλλη, εάν η γεωμετρία περιέχει κάθε σημείο μιας άλλης γεωμετρίας. Αυτή η μέθοδος είναι παρόμοια με[`SpatiallyContains`](../spatiallycontains/) , αλλά επιστρέφει`true` πιο συχνά, αφού δεν κάνει διάκριση μεταξύ εσωτερικών και οριακών σημείων. Έτσι, εάν η γεωμετρία Α βρίσκεται στο όριο της γεωμετρίας Β,[`SpatiallyContains`](../spatiallycontains/) επιστρέφει`false` , ενώ αυτή η μέθοδος επιστρέφει`true`. Αυτή η μέθοδος είναι ισοδύναμη με:

```csharp
this.Relate(other, "T*****FF*") || this.Relate(other, "*T****FF*") || this.Relate(other, "***T**FF*) || this.Relate(other, "***T*FF*");
```

### Δείτε επίσης

* method [SpatiallyContains](../spatiallycontains/)
* method [CoveredBy](../coveredby/)
* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


