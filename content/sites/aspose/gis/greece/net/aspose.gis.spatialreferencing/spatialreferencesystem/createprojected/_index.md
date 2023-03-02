---
title: SpatialReferenceSystem.CreateProjected
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystem μέθοδος. Δημιουργία προβαλλόμενου SRS από προσαρμοσμένες παραμέτρους.
type: docs
weight: 380
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/createprojected/
---
## SpatialReferenceSystem.CreateProjected method

Δημιουργία προβαλλόμενου SRS από προσαρμοσμένες παραμέτρους.

```csharp
public static ProjectedSpatialReferenceSystem CreateProjected(
    ProjectedSpatialReferenceSystemParameters parameters, Identifier identifier = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| parameters | ProjectedSpatialReferenceSystemParameters | Παράμετροι για δημιουργία από. |
| identifier | Identifier | Αναγνωριστικό, που θα προσαρτηθεί στο SRS. Η επισύναψη ενός αναγνωριστικού δεν θα τροποποιήσει άλλες παραμέτρους SRS. Εναπόκειται σε εσάς να διασφαλίσετε τη συνοχή του αναγνωριστικού και των παραμέτρων SRS. |

### Επιστρεφόμενη Αξία

Νέο Προβαλλόμενο SRS.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| InvalidOperationException | Η βάση SRS στις παραμέτρους είναι`null` . Μέθοδος προβολής σε παραμέτρους είναι`null` . |

### Δείτε επίσης

* class [ProjectedSpatialReferenceSystem](../../projectedspatialreferencesystem/)
* class [ProjectedSpatialReferenceSystemParameters](../../projectedspatialreferencesystemparameters/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* συνέλευση [Aspose.GIS](../../../)


