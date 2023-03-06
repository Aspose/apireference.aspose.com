---
title: Geometry.GetDistanceTo
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Υπολογίζει την ελάχιστη απόσταση μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.
type: docs
weight: 240
url: /el/net/aspose.gis.geometries/geometry/getdistanceto/
---
## Geometry.GetDistanceTo method

Υπολογίζει την ελάχιστη απόσταση μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.

```csharp
public double GetDistanceTo(IGeometry other)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| other | IGeometry | Μια γεωμετρία προς εύρεση απόστασης. |

### Επιστρεφόμενη Αξία

Αν δεν είναι και οι δύο γεωμετρίες[`IsEmpty`](../isempty/) - μια απόσταση μεταξύ των πλησιέστερων σημείων των γεωμετριών. Εάν τουλάχιστον μία γεωμετρία είναι κενή, επιστρέφεται -1.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null`. |
| ArgumentException | [`SpatialReferenceSystem`](../../igeometry/spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


