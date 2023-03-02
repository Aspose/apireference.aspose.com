---
title: IGeometry.Intersection
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Δημιουργεί μια τομή μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.
type: docs
weight: 260
url: /el/net/aspose.gis.geometries/igeometry/intersection/
---
## IGeometry.Intersection method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


