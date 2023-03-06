---
title: Geometry.GetBuffer
second_title: Αναφορά Aspose.GIS για .NET API
description: Geometry μέθοδος. Υπολογίζει μια περιοχή προσωρινής αποθήκευσης γύρω από αυτήν τη γεωμετρία.
type: docs
weight: 210
url: /el/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

Υπολογίζει μια περιοχή προσωρινής αποθήκευσης γύρω από αυτήν τη γεωμετρία.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| distance | Double | Το πλάτος της περιοχής προσωρινής αποθήκευσης. |
| quadrantSegments | Int32 | Αριθμός τμημάτων που χρησιμοποιούνται για την προσέγγιση 90 μοιρών καμπυλότητας. Όσο μεγαλύτερος είναι αυτός ο αριθμός τόσο καλύτερη προσέγγιση των καμπυλών παράγεται. Η προεπιλογή είναι 30. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει όλα τα σημεία που βρίσκονται σε μια καθορισμένη απόσταση από αυτή τη γεωμετρία. Ο τύπος του αποτελέσματος είναι είτε[`Null`](../null/) ,[`IPolygon`](../../ipolygon/) ή[`IMultiPolygon`](../../imultipolygon/) .

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentOutOfRangeException | Τα τμήματα τεταρτημορίου είναι μικρότερα ή ίσα με 0. |

### Δείτε επίσης

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../geometry/)
* συνέλευση [Aspose.GIS](../../../)


