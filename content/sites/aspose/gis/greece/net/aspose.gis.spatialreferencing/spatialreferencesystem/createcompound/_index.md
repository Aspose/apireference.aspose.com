---
title: SpatialReferenceSystem.CreateCompound
second_title: Αναφορά Aspose.GIS για .NET API
description: SpatialReferenceSystem μέθοδος. Δημιουργία ένωσης SRS.
type: docs
weight: 340
url: /el/net/aspose.gis.spatialreferencing/spatialreferencesystem/createcompound/
---
## SpatialReferenceSystem.CreateCompound method

Δημιουργία ένωσης SRS.

```csharp
public static CompoundSpatialReferenceSystem CreateCompound(string name, 
    SpatialReferenceSystem head, SpatialReferenceSystem tail, Identifier identifier = null)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| name | String | Όνομα νέου SRS. |
| head | SpatialReferenceSystem | Επικεφαλής SRS του νέου SRS. |
| tail | SpatialReferenceSystem | Ουρά SRS νέου SRS. |
| identifier | Identifier | Αναγνωριστικό, που θα προσαρτηθεί στο SRS. Η επισύναψη ενός αναγνωριστικού δεν θα τροποποιήσει άλλες παραμέτρους SRS. Εναπόκειται σε εσάς να διασφαλίσετε τη συνοχή του αναγνωριστικού και των παραμέτρων SRS. |

### Επιστρεφόμενη Αξία

Νέα ένωση SRS.

### Εξαιρέσεις

| εξαίρεση | κατάσταση |
| --- | --- |
| ArgumentNullException | Οποιοδήποτε επιχείρημα εκτός από*identifier* είναι`null` . |
| InvalidOperationException | *head* ή*tail* είναι τα ίδια σύνθετα SRS. |

### Δείτε επίσης

* class [CompoundSpatialReferenceSystem](../../compoundspatialreferencesystem/)
* class [Identifier](../../identifier/)
* class [SpatialReferenceSystem](../)
* χώρος ονομάτων [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* συνέλευση [Aspose.GIS](../../../)


