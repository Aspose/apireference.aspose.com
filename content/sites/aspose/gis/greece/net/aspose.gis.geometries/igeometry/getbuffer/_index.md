---
title: IGeometry.GetBuffer
second_title: Αναφορά Aspose.GIS για .NET API
description: IGeometry μέθοδος. Υπολογίζει μια περιοχή προσωρινής αποθήκευσης γύρω από αυτήν τη γεωμετρία.
type: docs
weight: 200
url: /el/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Υπολογίζει μια περιοχή προσωρινής αποθήκευσης γύρω από αυτήν τη γεωμετρία.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| distance | Double | Το πλάτος της περιοχής προσωρινής αποθήκευσης (σε μονάδες χωρικής αναφοράς). |
| quadrantSegments | Int32 | Αριθμός τμημάτων που χρησιμοποιούνται για την προσέγγιση 90 μοιρών καμπυλότητας. Όσο μεγαλύτερος είναι αυτός ο αριθμός τόσο καλύτερη προσέγγιση των καμπυλών παράγεται. Η προεπιλογή είναι 30. |

### Επιστρεφόμενη Αξία

Μια γεωμετρία που αντιπροσωπεύει όλα τα σημεία που βρίσκονται σε μια καθορισμένη απόσταση από αυτή τη γεωμετρία. Ο τύπος του αποτελέσματος είναι είτε[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) ή[`IMultiPolygon`](../../imultipolygon/) .

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Αυτή η γεωμετρία δεν είναι έγκυρη με τέτοιο τρόπο ώστε η λειτουργία να μην μπορεί να ολοκληρωθεί. |
| ArgumentOutOfRangeException | Τα τμήματα τεταρτημορίου είναι μικρότερα ή ίσα με 0. |

### Δείτε επίσης

* interface [IGeometry](../)
* χώρος ονομάτων [Aspose.Gis.Geometries](../../igeometry/)
* συνέλευση [Aspose.GIS](../../../)


