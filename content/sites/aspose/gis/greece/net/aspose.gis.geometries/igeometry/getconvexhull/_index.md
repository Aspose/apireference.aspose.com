---
title: IGeometry.GetConvexHull
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Υπολογίζει το κυρτό κύτος αυτής της γεωμετρίας.
type: docs
weight: 220
url: /el/net/aspose.gis.geometries/igeometry/getconvexhull/
---
## IGeometry.GetConvexHull method

Υπολογίζει το κυρτό κύτος αυτής της γεωμετρίας.

```csharp
public IGeometry GetConvexHull()
```

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει ένα κυρτό κύτος αυτής της γεωμετρίας. Αν αυτή η γεωμετρία δεν έχει σημεία τότε το αποτέλεσμα είναι[`Null`](../../geometry/null/) . Εάν αυτή η γεωμετρία έχει μόνο ένα σημείο, τότε το αποτέλεσμα είναι αυτό το σημείο. Εάν αυτή η γεωμετρία έχει μόνο δύο σημεία, τότε το αποτέλεσμα είναι[`ILineString`](../../ilinestring/) με τα σημεία. Αν αυτή η γεωμετρία έχει τρία ή περισσότερα σημεία τότε το αποτέλεσμα είναι[`ILinearRing`](../../ilinearring/) που αντιπροσωπεύει ένα κυρτό κύτος γύρω από όλα τα σημεία γεωμετρίας.

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


