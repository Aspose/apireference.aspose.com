---
title: Extent.GetTransformed
second_title: Αναφορά Aspose.GIS για .NET API
description: Extent μέθοδος. Επιστρέφει νέα έκταση σε καθορισμένοSpatialReferenceSystem που περιέχει αυτή την έκταση.
type: docs
weight: 150
url: /el/net/aspose.gis/extent/gettransformed/
---
## Extent.GetTransformed method

Επιστρέφει νέα έκταση σε καθορισμένο[`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) που περιέχει αυτή την έκταση.

```csharp
public Extent GetTransformed(SpatialReferenceSystem targetSrs)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| targetSrs | SpatialReferenceSystem | [`SpatialReferenceSystem`](../../../aspose.gis.spatialreferencing/spatialreferencesystem/) να μεταμορφωθεί σε. |

### Επιστρεφόμενη Αξία

Το αποτέλεσμα του μετασχηματισμού σε αυτόν τον βαθμό στο καθορισμένο SRS.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Επιχείρημα είναι`null` . |
| NotSupportedException | Η μετατροπή στο παρεχόμενο SRS δεν υποστηρίζεται. |
| [TransformationException](../../../aspose.gis.spatialreferencing/transformationexception/) | Ο μετασχηματισμός απέτυχε. |
| InvalidOperationException | [`SpatialReferenceSystem`](../spatialreferencesystem/) αυτής της έκτασης είναι`null` . |

### Δείτε επίσης

* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Extent](../)
* χώρος ονομάτων [Aspose.Gis](../../extent/)
* συνέλευση [Aspose.GIS](../../../)


