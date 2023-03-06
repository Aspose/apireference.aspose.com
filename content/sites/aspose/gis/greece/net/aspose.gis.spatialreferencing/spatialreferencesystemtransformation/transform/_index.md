---
title: SpatialReferenceSystemTransformation.Transform
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystemTransformation μέθοδος. Μετασχηματίζει τη γεωμετρία από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου.
type: docs
weight: 40
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystemtransformation/transform/
---
## SpatialReferenceSystemTransformation.Transform method

Μετασχηματίζει τη γεωμετρία από σύστημα χωρικής αναφοράς πηγής σε σύστημα χωρικής αναφοράς στόχου.

```csharp
public Geometry Transform(IGeometry geometry)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| geometry | IGeometry | Γεωμετρία για μεταμόρφωση. |

### Επιστρεφόμενη Αξία

Νέα γεωμετρία στο σύστημα χωρικής αναφοράς στόχου.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Γεωμετρία είναι`null` . |
| ArgumentException | Γεωμετρίες[`SpatialReferenceSystem`](../../../aspose.gis.geometries/igeometry/spatialreferencesystem/) δεν είναι`null` και δεν ισοδυναμεί με [`Source`](../source/) |
| [TransformationException](../../transformationexception/) | Ο μετασχηματισμός απέτυχε. |

### Δείτε επίσης

* class [Geometry](../../../aspose.gis.geometries/geometry/)
* interface [IGeometry](../../../aspose.gis.geometries/igeometry/)
* class [SpatialReferenceSystemTransformation](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystemtransformation/)
* συνέλευση [Aspose.GIS](../../../)


