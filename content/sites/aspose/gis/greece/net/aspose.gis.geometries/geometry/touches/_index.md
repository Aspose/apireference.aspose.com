---
title: Geometry.Touches
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία αγγίζουν.
type: docs
weight: 420
url: /el/net/aspose.gis.geometries/geometry/touches/
---
## Geometry.Touches method

Καθορίζει εάν αυτή η γεωμετρία και μια καθορισμένη γεωμετρία αγγίζουν.

```csharp
public bool Touches(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία. |

### Επιστρεφόμενη Αξία

`true` αν αυτή η γεωμετρία «αγγίζει χωρικά» μια άλλη γεωμετρία.`false` διαφορετικά.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | Μία από τις γεωμετρίες δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Παρατηρήσεις

Αυτή η μέθοδος ελέγχει εάν οι γεωμετρίες αγγίζουν η μία την άλλη ως προς τον πίνακα τομής DE-9IM. Δύο γεωμετρίες ακουμπούν η μία την άλλη εάν έχουν τουλάχιστον ένα κοινό οριακό σημείο, αλλά όχι εσωτερικά σημεία. Δηλαδή: δύο[`LineString`](../../linestring/)αγγίζουν το ένα το άλλο εάν μοιράζονται ένα τελικό σημείο, αλλά δεν μοιράζονται ένα τμήμα, δύο πολύγωνα αγγίζουν το ένα το άλλο εάν μοιράζονται μέρος του εξωτερικού ή του εσωτερικού δακτυλίου, αλλά το εσωτερικό τους δεν επικαλύπτεται. Αυτή η μέθοδος είναι ισοδύναμη με: Ανατρέξτε στο OpenGIS Simple Features Specification για περισσότερες λεπτομέρειες σχετικά με το DE-9IM και τη σχέση "χωρικής επαφής".

```csharp
this.Relate(other, "FT*******") || this.Relate(other, "F**T*****") || this.Relate(other, "F***T****");
```

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


