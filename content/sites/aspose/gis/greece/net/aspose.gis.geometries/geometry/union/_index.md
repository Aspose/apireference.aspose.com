---
title: Geometry.Union
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Ενώνει αυτήν τη γεωμετρία και μια καθορισμένη γεωμετρία.
type: docs
weight: 430
url: /el/net/aspose.gis.geometries/geometry/union/
---
## Geometry.Union method

Ενώνει αυτήν τη γεωμετρία και μια καθορισμένη γεωμετρία.

```csharp
public IGeometry Union(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία για να ενωθείτε. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει μια ένωση αυτής της γεωμετρίας και ενός ορίσματος. Η γεωμετρία του αποτελέσματος περιέχει σύνολο σημείων που υπάρχει σε αυτήν τη γεωμετρία ή σε ένα όρισμα.

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


