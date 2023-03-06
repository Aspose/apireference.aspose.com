---
title: IGeometry.GetDistanceTo
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Υπολογίζει την ελάχιστη απόσταση μεταξύ αυτής της γεωμετρίας και μιας καθορισμένης γεωμετρίας.
type: docs
weight: 230
url: /el/net/aspose.gis.geometries/igeometry/getdistanceto/
---
## IGeometry.GetDistanceTo method

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
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) των γεωμετριών δεν είναι ισοδύναμες. Μπορείτε να χρησιμοποιήσετε[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) προκειμένου να μετατραπούν οι γεωμετρίες στο ίδιο σύστημα αναφοράς spatial . |

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


