---
title: Geometry.Intersection
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Δημιουργεί μια τομή μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.
type: docs
weight: 270
url: /el/net/aspose.gis.geometries/geometry/intersection/
---
## Geometry.Intersection method

Δημιουργεί μια τομή μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.

```csharp
public IGeometry Intersection(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία για τον υπολογισμό της τομής. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει μια τομή αυτής της γεωμετρίας και ένα όρισμα. Το σύνολο της γεωμετρίας αποτελέσματος περιέχει σημείο που υπάρχει τόσο σε αυτήν τη γεωμετρία όσο και σε ένα όρισμα.

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


