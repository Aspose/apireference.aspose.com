---
title: Geometry.Crosses
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία διασταυρώνονται.
type: docs
weight: 170
url: /el/net/aspose.gis.geometries/geometry/crosses/
---
## Geometry.Crosses method

Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία διασταυρώνονται.

```csharp
public bool Crosses(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία «διασταυρώνεται χωρικά» μια άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν οι γεωμετρίες είναι σταυροί ως προς τον πίνακα τομής DE-9IM. Δύο γεωμετρίες διασταυρώνονται αν έχουν κοινά μερικά αλλά όχι όλα τα εσωτερικά σημεία και η διάσταση της τομής είναι μικρότερη από τη διάσταση τουλάχιστον ενός από τα γεωμετρίες. Δηλαδή: δύο[`LineString`](../../linestring/) s σταυρό, εάν σχηματίζουν ένα γράμμα 'Χ', ένα LineString και a[`Polygon`](../../polygon/) διασταυρώνεται εάν το LineString διέρχεται από το εσωτερικό ενός πολυγώνου. Δείτε το OpenGIS Simple Features Specification για περισσότερες λεπτομέρειες σχετικά με το DE-9IM και τη σχέση "χωρικών διασταυρώσεων".

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


